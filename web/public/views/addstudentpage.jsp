
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/newbie/public/css/bootstrap.css" rel="stylesheet">
   <script src="/newbie/public/js/bootstrap.js"></script>
   <script src="/newbie/public/js/mystyle.js"></script>
  
    </head>
    <body>
<%
String errID = (String)request.getAttribute("errID");
String errName = (String)request.getAttribute("errName");
String errAge = (String)request.getAttribute("errAge");
String errHometown = (String)request.getAttribute("errHometown");
%>
<%=errID%>
<%=errName%>
<%=errAge%>
<%=errHometown%>
         <section class="container" id="add">
         <!-- header -->
       <%@include file="../components/header.jsp" %>
<!-- endhere -->
        <div class="panel panel-success col-lg-9">
  <div class="panel-heading">
    <h2 class="panel-title">Fill all field to add new student!</h2>
  </div>
  <div class="panel-body">
    <form name="myform" action="/newbie/students/add" method="POST" onsubmit="return validateform()">
        
      
        <p><span class="label label-warning">Student ID</span>
           
           <input name="txtId" id="id" type="text" ></p>
    <p><span class="label label-info">Student Name</span>
           
           <input name="txtName" id="name" type="text" ></p>
       <p><span class="label label-primary">Age</span>
           <input name="txtAge" id="age" type="text" value=""></p>
       <p><span class="label label-danger">Gender</span>
           <input type="radio" name="sex" value ="1" checked = "CHECKED">Male
           <input type="radio" name="sex" value="0">Female
</p>
   
  
       <p><span class="label label-default">Hometown</span>
           <input name="txtHome" id="home" type="text" ></p>
       
      
       <div class="panel-footer">
        <button type="button" class="btn btn-default" >Back</button>
        <input type="submit" name="btnSave"  class="btn btn-primary"  value="Save"/>
        </div>
       </form> 
  </div>
</div>
         </section>
         
    </body>
</html>
