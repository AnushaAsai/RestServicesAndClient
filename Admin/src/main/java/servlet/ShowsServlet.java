/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.xml.ws.soap.SOAPFaultException;
import services.Category;
import services.CategoryCRUD;
import services.CategoryCRUD_Service;
import services.ShowCRUD_Service;
import services.Shows;
import services.Type;
import services.TypeCRUD;
import services.TypeCRUD_Service;

/**
 *
 * @author Aunsha Asaithambi
 */
@WebServlet(name = "ShowsServlet", urlPatterns = {"/ShowsServlet"})
@MultipartConfig
public class ShowsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        this.loadShows(request);
        RequestDispatcher dispacher = request.getRequestDispatcher("/ViewShows.jsp");
        dispacher.forward(request, response);
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TypeCRUD_Service typeService = new TypeCRUD_Service();
        services.TypeCRUD typePort = typeService.getTypeCRUDPort();
        CategoryCRUD_Service categoryService = new CategoryCRUD_Service();
        services.CategoryCRUD categoryPort = categoryService.getCategoryCRUDPort();

        String addAShow = request.getParameter("add");
        String deleteAShow = request.getParameter("deleteid");
        String updateDisplayPage = request.getParameter("updateid");
        String updateAShow = request.getParameter("updateShow");
        String addShowJspPage = request.getParameter("addShowJsp");
        String backToViewAll = request.getParameter("viewAllShow");
        Boolean validation = true;

        HttpSession session = request.getSession();

        ShowCRUD_Service service = new ShowCRUD_Service();
        services.ShowCRUD port = service.getShowCRUDPort();

        if (addAShow != null || updateAShow != null) {
            String title = request.getParameter("title");
            String desc = request.getParameter("desc");
            String cast = request.getParameter("cast");
            String director = request.getParameter("director");
            String year = request.getParameter("year");
            String typeid = request.getParameter("show-type");
            String categoryid = request.getParameter("show-category");
            String prevImg = request.getParameter("prevImg");
            Part part = request.getPart("thumbnail");

            Shows s = new Shows();

            if (title.isEmpty()) {
                request.setAttribute("titleError", "Please enter a title.");
                validation = false;
            }
            if (desc.isEmpty()) {
                request.setAttribute("descError", "Please enter description for the show.");
                validation = false;
            }
            if (cast.isEmpty()) {
                request.setAttribute("castError", "Please enter cast for the show.");
                validation = false;
            }
            if (director.isEmpty()) {
                request.setAttribute("directorError", "Please enter director for the show.");
                validation = false;
            }
            if (year != null && !year.isEmpty()) {
                s.setYearOfRelease(year);
            } else {
                request.setAttribute("yearError", "Please select year of release for the show.");
                validation = false;
            }
            if (typeid != null && !typeid.isEmpty()) {
                Type type = typePort.findType(BigDecimal.valueOf(Integer.parseInt(typeid)));
                s.setTypeid(type);
            } else {
                request.setAttribute("typeIdError", "Please select type for the show.");
                validation = false;
            }
            if (categoryid != null && !categoryid.isEmpty()) {
                Category category = categoryPort.findCategory(BigDecimal.valueOf(Integer.parseInt(categoryid)));
                s.setCategoryid(category);
            } else {
                request.setAttribute("categoryIdError", "Please select category for the show.");
                validation = false;
            }
            if (part.getSize() != 0 || prevImg != null) {
                if (prevImg != null) {
                    s.setThumbnail(Base64.getDecoder().decode(prevImg));
                } else if (part.getSize() != 0) {
                    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                    InputStream filecontent = part.getInputStream();
                    byte[] buffer = new byte[(int) part.getSize()];
                    int read = 0;
                    while ((read = filecontent.read(buffer)) != -1) {
                        bytes.write(buffer, 0, read);
                    }
                    s.setThumbnail(buffer);
                }
                byte[] imageData = s.getThumbnail();
                String base64Image = Base64.getEncoder().encodeToString(imageData);
                request.setAttribute("uploadedImg", base64Image);
            } else {
                request.setAttribute("imageError", "Please upload a thumbnail for the show.");
                validation = false;
            }
            s.setTitle(title);
            s.setDescription(desc);
            s.setCast(cast);
            s.setDirector(director);
            if (!validation) {
                request.setAttribute("show", s);
                if (addAShow != null) {
                    request.setAttribute("disableUpdateBtn", "true");
                } else {
                    request.setAttribute("disableUpdateBtn", "false");
                }
                this.loadTypeCategoryFields(request);
                RequestDispatcher dispacher = request.getRequestDispatcher("/AddShow.jsp");
                dispacher.forward(request, response);
            } else {
                try {
                    if (addAShow != null) {
                        request.setAttribute("disableUpdateBtn", "true");
                        port.addShow(s);
                    } else {
                        int showId = (int) session.getAttribute("showId");
                        s.setId(BigDecimal.valueOf(showId));
                        request.setAttribute("disableUpdateBtn", "false");
                        port.updateShow(s);
                    }
                    this.loadShows(request);
                    RequestDispatcher dispacher = request.getRequestDispatcher("/ViewShows.jsp");
                    dispacher.forward(request, response);
                } catch (SOAPFaultException ex) {
                    request.setAttribute("show", s);
                    this.loadTypeCategoryFields(request);
                    request.setAttribute("handlerError", "Sorry! Cannot add a show with the name 'Disney' in any field.");
                    RequestDispatcher dispacher = request.getRequestDispatcher("/AddShow.jsp");
                    dispacher.forward(request, response);
                }

            }
        }

        if (deleteAShow != null) {
            int showId = Integer.parseInt(deleteAShow);
            port.deleteShow(BigDecimal.valueOf(showId));
            this.loadShows(request);
            RequestDispatcher dispacher = request.getRequestDispatcher("/ViewShows.jsp");
            dispacher.forward(request, response);
        }

        if (updateDisplayPage != null) {
            int showId = Integer.parseInt(updateDisplayPage);
            Shows show = port.findShow(BigDecimal.valueOf(showId));
            byte[] imageData = show.getThumbnail();
            String base64Image = Base64.getEncoder().encodeToString(imageData);
            request.setAttribute("uploadedImg", base64Image);
            session.setAttribute("showId", showId);
            request.setAttribute("show", show);
            this.loadTypeCategoryFields(request);
            request.setAttribute("disableUpdateBtn", "false");
            RequestDispatcher dispacher = request.getRequestDispatcher("/AddShow.jsp");
            dispacher.forward(request, response);
        }

        if (addShowJspPage != null) {
            this.loadTypeCategoryFields(request);
            request.setAttribute("disableUpdateBtn", "true");
            RequestDispatcher dispacher = request.getRequestDispatcher("/AddShow.jsp");
            dispacher.forward(request, response);
        }

        if (backToViewAll != null) {
            this.loadShows(request);
            RequestDispatcher dispacher = request.getRequestDispatcher("/ViewShows.jsp");
            dispacher.forward(request, response);
        }

        processRequest(request, response);
    }

    private void loadShows(HttpServletRequest request) {
        ShowCRUD_Service service = new ShowCRUD_Service();
        services.ShowCRUD port = service.getShowCRUDPort();
        List<Shows> shows = port.viewShow();
        request.setAttribute("shows", shows);
    }

    private void loadTypeCategoryFields(HttpServletRequest request) {
        TypeCRUD_Service typeService = new TypeCRUD_Service();
        services.TypeCRUD typePort = typeService.getTypeCRUDPort();
        CategoryCRUD_Service categoryService = new CategoryCRUD_Service();
        services.CategoryCRUD categoryPort = categoryService.getCategoryCRUDPort();

        List<Type> typeList = typePort.viewType();
        request.setAttribute("type", typeList);
        List<Category> categoryList = categoryPort.viewCategory();
        request.setAttribute("category", categoryList);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
