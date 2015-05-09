<%-- 
    Document   : updateStudent
    Created on : May 8, 2015, 8:00:46 PM
    Author     : Toan
--%>

<%@page import="com.newbie.web.dal.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <body>
        <%
            
          
      StudentDAO sto=new StudentDAO();
     
          
     
        sto.Update(request.getParameter("txtNa"), request.getParameter("txtAge"), request.getParameter("sex"), request.getParameter("txtHome") );
        response.sendRedirect("searchproduct.jsp?where=update");
        %>
        <section class="container" id="update">
                    

                     
        </section>
    </body>
</html>
