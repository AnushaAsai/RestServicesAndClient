<%-- 
    Document   : ViewShows
    Created on : Mar 26, 2020, 3:19:58 PM
    Author     : Aunsha Asaithambi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>Home Page</title>
        <style>
            html,
            body {
                height: 100;
                margin: 0 auto;
                background-color: #D3E6D4;
                color: #1E1E1E;
            }    
            .container{
                border-radius: 25px;
                background-color:#FEFEFE;
                background-color: rgba(255,255,255,0.5);
                padding-bottom: 20px;
            }
        </style>

    </head>
    <body>
        <form action="ShowsServlet" method="POST">
            <h1 align="center" >Streaming Service - Admin Dashboard </h1>
            <div class="container">
                <h3>List of all shows</h3>
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th scope="col">Title</th>
                            <th scope="col">Description</th>
                            <th scope="col">Cast</th>
                            <th scope="col">Director</th>
                            <th scope="col">Year of release</th>
                            <th scope="col">Delete</th>
                            <th scope="col">Update</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="show" items="${shows}">
                            <tr>
                                <th scope="row">${show.title}</th>
                                <td>${show.description}</td>
                                <td>${show.cast}</td>
                                <td>${show.director}</td>
                                <td>${show.yearOfRelease}</td>
                                <td><button class="btn btn-success" type="submit" name="deleteid" value=${show.id} class="btn">Delete</button></td>
                                <td><button class="btn btn-success" type="submit" name="updateid" value=${show.id} class="btn">Update</button></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <button class="btn btn-success" type="submit" name="addShowJsp" value="Add Show" class="btn">Add New Show</button>
            </div>
        </form>
    </body>
</html>
