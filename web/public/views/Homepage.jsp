

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap.css" rel="stylesheet">
   <script src="js/bootstrap.js"></script>
  
    </head>
    <body>

        <section class="container" id="search">
        <!-- Header -->
       <%@include file="../components/header.jsp" %>
      
        <!-- Modal 2-->

       
            <div class="panel panel-default">
 
                <!-- Default panel contents -->
  <div class="panel-heading">Search result</div>

  <!-- Table -->
  <table class="table table-hover table-striped">
      <tr>
      <td>ID</td>
      <td>Name</td>
      <td>Sex</td>
      <td>Age</td>
      <td>Hometown</td>
      </tr>
   
  <tr>
      <td>
          <button type="button" class="btn btn-info" >
                  
           SE03407        
</button>
     
      
   
      <td>Toan</td>
      <td>Male</td>
      <td>21</td>
      <td>Nam Dinh</td>
      
      <td>
      <div class="btn-group" role="group" >
          <button type="button" class="btn btn-default" >Delete</button>
          <button type="button" class="btn btn-default" >Update</button>
         
</div>    
      </td>
      </tr>
      
<!-- Modal -->

  </table >
</div>
       
        <!-- Button trigger modal -->
        </section>
         
    </body>
</html>
