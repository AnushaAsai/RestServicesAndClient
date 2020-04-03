<%-- 
    Document   : AddShow
    Created on : Mar 25, 2020, 11:07:17 PM
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
        <title>Add/Update Shows</title>
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
                padding: 50px;
            }

        </style>
        <script>
            window.onload = function () {
                var disableUpdateBtn = ${disableUpdateBtn}
                if (disableUpdateBtn === true) {
                    document.getElementById("updatebtn").disabled = true;
                    document.getElementById("operation").innerHTML = "Add a Show";
                } else {
                    document.getElementById("addbtn").disabled = true;
                    document.getElementById("operation").innerHTML = "Update a Show";
                }
                var max = new Date().getFullYear(),
                        min = max - 30;
                select = document.getElementById('selectElementId');

                for (var i = min; i <= max; i++) {
                    var opt = document.createElement('option');
                    opt.value = i;
                    opt.innerHTML = i;
                    select.appendChild(opt);
                }

            };

        </script>
    </head>
    <body>
        <h2 align="center" id="operation"></h2>
        <div class="container">
            <form action="ShowsServlet" method="POST" enctype="multipart/form-data">
                <c:if test="${not empty handlerError}">
                    <div class="row">
                        <medium class="text-danger">
                            ${handlerError}
                        </medium>      
                    </div>
                </c:if>
                <div class="row">
                    <div class="form-group">
                        <label for="Title">Title</label>
                        <input type="text" name="title" class="form-control" value="${show.title}">
                        <c:if test="${not empty titleError}">
                            <medium class="text-danger">
                                ${titleError}
                            </medium>      
                        </c:if>
                    </div>
                    <!--  col-md-6   -->
                    <div class="form-group">
                        <label for="description">Description</label>
                        <textarea class="form-control" name="desc" rows="3">${show.description}</textarea>
                        <c:if test="${not empty descError}">
                            <medium class="text-danger">
                                ${descError}
                            </medium>      
                        </c:if>
                    </div>

                    <!--  col-md-6   -->
                </div>


                <div class="row">
                    <div class="form-group">
                        <label for="Cast">Cast</label>
                        <input type="text" class="form-control" name="cast" value="${show.cast}" >
                        <c:if test="${not empty castError}">
                            <medium class="text-danger">
                                ${castError}
                            </medium>      
                        </c:if>
                    </div>
                    <!--  col-md-6   -->

                    <div class="form-group">
                        <label for="director">Director</label>
                        <input type="text" class="form-control" name="director" value="${show.director}">
                        <c:if test="${not empty directorError}">
                            <medium class="text-danger">
                                ${directorError}
                            </medium>      
                        </c:if>
                    </div>
                    <!--  col-md-6   -->
                </div>
                <!--  row   -->


                <div class="row">
                    <div class="form-group">
                        <label for="email">Year of release</label>
                        <select id="selectElementId" name="year">
                            <c:if test="${empty show.yearOfRelease}">
                                <option value="" disabled selected>Choose your option</option> 
                            </c:if>
                            <c:if test="${not empty show.yearOfRelease}">
                                <option value="${show.yearOfRelease}" selected>${show.yearOfRelease}</option>
                            </c:if>
                        </select>
<!--                        <input type="text" class="form-control" name="year" value="${show.yearOfRelease}" >-->
                    </div>
                    <c:if test="${not empty yearError}">
                        <medium class="text-danger">
                            ${yearError}
                        </medium>      
                    </c:if>
                    <!--  col-md-6   -->
                    <div class="form-group">
                        <label for="thumbnail">Please upload a thumbnail</label>
                        <div class="btn">
                            <span>Choose file</span>
                            <input type="file" accept="image/*" name="thumbnail">
                        </div>
                        <c:if test="${not empty imageError}">
                            <medium class="text-danger">
                                ${imageError}
                            </medium>      
                        </c:if>
                    </div>
                    <!--  col-md-6   -->

                    <c:if test="${not empty uploadedImg}">
                        <div class="form-group">
                            <p><input type="checkbox" class="form-check-input" value="${uploadedImg}" name="prevImg" checked>Use previously uploaded image:</p>          
                            <img src="data:image/jpg;base64,${uploadedImg}" class="img-thumbnail" width="304" height="236"> 
                        </div>
                    </c:if>
                </div>
                <!--  row   -->

                <div class="row">
                    <label for="show-type">What type of show is this?</label>
                    <div class="radio">
                        <c:if test="${not empty show.typeid}">
                            <label>
                                <input type="radio" name="show-type" value=${show.typeid.id} checked>${show.typeid.type}
                            </label>
                        </c:if>
                        <c:forEach var="type" items="${type}">
                            <c:if test="${type.id != show.typeid.id}">
                                <label>
                                    <input type="radio" name="show-type" value=${type.id}>${type.type}
                                </label>
                            </c:if>
                        </c:forEach>
                        <c:if test="${not empty typeIdError}">
                            <medium class="text-danger">
                                ${typeIdError}
                            </medium>      
                        </c:if>
                    </div>
                    <label for="show-category">What category does it belong to?</label>
                    <select name="show-category" class="mdb-select md-form">
                        <c:if test="${empty show.categoryid}">
                            <option value="" disabled selected>Choose your option</option> 
                        </c:if>
                        <c:if test="${not empty show.categoryid}">
                            <option value="${show.categoryid.id}" selected>${show.categoryid.categoryName}</option>
                        </c:if>
                        <c:forEach var="category" items="${category}">
                            <c:if test="${category.id !=show.categoryid.id}">
                                <option value=${category.id}>${category.categoryName}</option>
                            </c:if>
                        </c:forEach>      
                    </select>
                    <c:if test="${not empty categoryIdError}">
                        <medium class="text-danger">
                            ${categoryIdError}
                        </medium>      
                    </c:if>
                </div>
                <button id="addbtn" type="submit" name="add" value="Add Show" class="btn btn-success">Add Show</button>
                <button id="updatebtn" type="submit" name="updateShow" value="Update Show" class="btn btn-success">Update Show</button>
                <button type="submit" name="viewAllShow" value="View Show" class="btn btn-success">Back to shows list</button>
            </form>
        </div>
    </body>
</html>
