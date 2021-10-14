<%-- 
    Document   : trainerList
    Created on : Feb 13, 2021, 5:26:36 PM
    Author     : Akaros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel ="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainer List</title>
    </head>
    <body>
  <br/>
  <div class="container">
            <h1 style="font-size: 250%"><a href="${pageContext.request.contextPath}/trainer/create/">Create a new Trainer</a></h1>
            <p style="font-weight: bold ;color:white; ">
                ${message}
            </p>

            <table border="1" >

                <thead>
                    <tr>

                        <th>Id</th>
                        <th>Last Name</th>
                        <th>First Name</th>
                        <th>Subject</th>
                        <th>Update</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <c:forEach items="${listofTrainers}" var = "trainers">
                    <tr>
                        <td>${trainers.trainerid}</td>
                        <td>${trainers.trlast}</td>
                        <td>${trainers.trfirst}</td>
                        <td>${trainers.trsubject}</td>
                        <td>      
                            <a href="${pageContext.request.contextPath}/trainer/update/${trainers.trainerid}">Update</a>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/trainer/delete/${trainers.trainerid}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
