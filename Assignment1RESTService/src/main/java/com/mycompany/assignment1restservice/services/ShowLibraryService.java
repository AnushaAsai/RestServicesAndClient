/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1restservice.services;


import java.math.BigDecimal;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import services.ShowCRUD_Service;
import services.Shows;

/**
 *
 * @author Aunsha Asaithambi
 */
@Path("shows")
@Produces("text/json")
public class ShowLibraryService {
    
    @Path("all")
    @GET
    public Response getAllShows(){
        ShowCRUD_Service service = new ShowCRUD_Service();
        services.ShowCRUD port = service.getShowCRUDPort();
        List<Shows> allShows =port.viewShow();
        return Response.ok(allShows).build();
    }
    
    @Path("all/{showid}")
    @GET
    public Response getAllShows(@PathParam("showid") int showId){
        ShowCRUD_Service service = new ShowCRUD_Service();
        services.ShowCRUD port = service.getShowCRUDPort();
        Shows show =port.findShow(BigDecimal.valueOf(showId));
        return Response.ok(show).build();
    }
    
}
