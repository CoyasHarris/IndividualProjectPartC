<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel ="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
        <title>Home Page</title>
    </head>
    
    <body>
        <div class="form">
    <h1>${welcomeMessage}
        <br/>
   <a href="${pageContext.request.contextPath}/trainer">Play with our Trainers.</a>
   </h1>
   </div>
   </body>
</html>
