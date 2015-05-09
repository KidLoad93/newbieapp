<!DOCTYPE html>
<html>


    <head>
        <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400|Raleway:400,300' rel='stylesheet' type='text/css'>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Newbie App</title>
        <link href="/newbie/public/css/mystyle.css" rel="stylesheet">
        <script src="/newbie/public/js/bootstrap.js"></script>
        <script src="/newbie/public/js/myscript.js"></script>

    </head>
    <body >

        <div class="body">   </div>  
        <div class="grad"></div>
        <div class="header">
            <div>Newbie<span>App</span></div>
        </div>
        <br>
        <div class="wel">
            "World most advanced Student Management System"
        </div>
        <div class="login">
            <form action="/newbie/login" method="POST">          
                <input type="text"  name="txtName" placeholder="Username" />
                <input type="password" name="txtPass" placeholder="Password" />
                <input type="submit" value="Login" name="Login">
            </form>
        </div>
        <div class="wel" >
            <font color="red"><%=request.getAttribute("error")%></font>
        </div>
    </body>



</html>
