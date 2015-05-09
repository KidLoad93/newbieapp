
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/newbie/public/css/bootstrap.css" rel="stylesheet">
   <script src="/newbie/public/js/bootstrap.js"></script>
   <script src="/newbie/public/js/myscript.js"></script>
    </head>
    <body>

         <section class="container" id="change">
         <!-- header -->
      <%@include file="../components/header.jsp" %>
<!-- endhere -->
        
      <form class="form-signin col-lg-4" action = "/newbie/users/changepass" method = "post">
          
        <h2 class="form-signin-heading">Change password</h2>
        <h2 class="form-signin-heading"> <font color="green"><%=request.getAttribute("message")%></font></h2>
        <input type="password" id="inputPassword" class="form-control" placeholder="Old password" name="oldPassword" required> 
        <br>
        <input type="password" id="inputPassword" class="form-control" placeholder="New password" name="newPassword" required> 
        <br>
        <input type="password" id="inputPassword" class="form-control" placeholder="Confirm Password" name="confirmPassword" required>
          <br>
          <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnSave" value="">Save</button>
      </form>
         </section>
         
    </body>
</html>
