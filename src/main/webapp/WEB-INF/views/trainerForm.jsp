<%-- 
    Document   : trainerForm
    Created on : Feb 13, 2021, 7:22:53 PM
    Author     : Akaros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
 <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel ="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>

        <title>Create Trainer</title>
    </head>
    
    <body >
        <div class="form">
        <c:if test="${trainerid==null}">
            <c:url value="/trainer/create" var="link"/>
        </c:if>
        <c:if test="${trainerid!=null}">
            <c:url  value="/trainer/update" var="link"/>
        </c:if>
        <form:form action="${link}" method="POST" modelAttribute="daskalos" >
           
            <form:hidden  path="trainerid"/>

            <br/>
            
            <label for="trlast">Last Name :</label>
            <form:input id="trlast"  path="trlast" />
            <form:errors path = "trlast"/>
            
            <br/>
            <label for="trfirst">First Name :</label>
            <form:input id="trfirst"  path="trfirst" />
            <form:errors path = "trfirst"/>
             <br/>
             <label for="trsubject">Subject :  </label>
            <form:input id="trsubject"  path="trsubject" />
            <form:errors path = "trsubject"/>
            <br/>
            <input type="submit" value="Submit"/>
        </form:form> 
        </div> 
    </body>
</html>
