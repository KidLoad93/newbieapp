

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap.css" rel="stylesheet">
   <script src="js/bootstrap.js"></script>
   <script src="../js/bootstrap.js"></script>
   <script src="../js/myscript.js"></script>
    </head>
    <body>

        <section class="container" id="search">
        <!-- Header -->
       <%@include file="../components/header.jsp" %>
      
        <!-- Modal 2-->

       
            <div class="panel panel-default">
 
                <!-- Default panel contents -->
  <div class="panel-heading">Student information</div>

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
          <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal" data-title="Update Product" 
                  data-id="<%="SE03407"%>"
                  data-name="<%="ANH Toan"%>"  data-age="<%=21%>" 
                   data-sex="<%=0%>" data-home="<%="Nam Dinh"%>"  >
              Update
          </button>
         
</div>    
      </td>
      </tr>
      
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Update Student</h4>
      </div>
      <div class="modal-body">
          <form action="updateProduct.jsp" method="POST" name="myform" onsubmit="return validateform()">
       <p><span class="label label-warning">Student ID</span>
              <p><span class="label label-info">Student Name</span>
           <input name="txtId" id="id" type="text" ></p>
        <input name="txtName" id="name" type="text" ></p>
       <p><span class="label label-primary">Age</span>
           <input name="txtAge" id="age" type="text" value=""></p>
       <p><span class="label label-danger">Gender</span>
           <input type="radio" name="sex" id="male" >Male
           <input type="radio" name="sex" id="famle" >Female
</p>
   
  
       <p><span class="label label-default">Hometown</span>
           <input name="txtHome" id="home" type="text" ></p>
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <input type="submit" class="btn btn-primary" id="btnSave"  value="Save Changes"></input>
       </form> 
      </div>
    </div>
  </div>
</div>
  </table >
</div>
       
        <!-- Button trigger modal -->
        </section>
         
    </body>
</html>
