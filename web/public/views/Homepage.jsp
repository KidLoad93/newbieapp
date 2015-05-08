
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="public/css/bootstrap.css" rel="stylesheet">
   <script src="js/bootstrap.js"></script>
  
    </head>
    <body>

        <section class="container" id="search">
        <!-- Header -->
      <nav class="navbar navbar-inverse">
  <div class="container-fluid">
   
    <div class="navbar-header">
      
      <a class="navbar-brand" href="#">NewbieApp</a>

    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Add Student</a></li>
       
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-danger">Go!</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">ToanLM <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Log out</a></li>
            <li class="divider"></li>
            <li><a href="#">Change password</a></li>
            
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
      
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
