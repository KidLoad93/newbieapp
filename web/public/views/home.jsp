<%-- 
    Document   : home.jsp
    Created on : May 8, 2015, 3:09:27 PM
    Author     : trongbui
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NewbieApp</title>
    </head>
    <body>
        <c:forEach items="${students}" var="student">
            <a href="students/${student.id}">${student.name}</a>
        </c:forEach>
    </body>
</html>
