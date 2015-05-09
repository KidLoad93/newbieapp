
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap.css" rel="stylesheet">
   <script src="js/bootstrap.js"></script>
  
    </head>
    <body>

         <section class="container" id="add">
         <!-- header -->
      <%@include file="../components/header.jsp" %>
<!-- endhere -->
     
      <form class="form-signin col-lg-4">
        <h2 class="form-signin-heading">Change password</h2>
        
        <input type="password" id="inputPassword" class="form-control" placeholder="Old password" required> 
        
        <br>
          
        <input type="password" id="inputPassword" class="form-control" placeholder="New password" required> 
        <br>
        <input type="password" id="inputPassword" class="form-control" placeholder="Confirm Password" required>
          <br>
       
        <button class="btn btn-lg btn-primary btn-block" type="submit">Save</button>
      </form>
         </section>
         
    </body>
</html>
