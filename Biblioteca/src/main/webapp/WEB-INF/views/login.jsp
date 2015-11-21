<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca ITGAM</title>
<link rel="stylesheet" href="resources/css/login.css">
<link rel="stylesheet" href="resources/css/alertify.core.css">
<link rel="stylesheet" href="resources/css/alertify.default.css">
<link rel="stylesheet" href="resources/css/alertify.bootstrap.css">
<link rel="icon" type="image/x-icon" href="resources/images/bank.ico" />
<script type="text/javascript" src="resources/js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="resources/js/notificacion-error.js"></script>
<script type="text/javascript" src="resources/js/alertify.js"></script>
<script type="text/javascript" src="resources/js/alertify.min.js"></script>
</head>
<body>

<div class="container">

  <div id="login-form">

    <h3>Iniciar Sesión</h3>

    <fieldset>

      <form action="itgam/login" method="post" >
      
      	
      	<input name="cUsuario" type="text" required value="Usuario" onBlur="if(this.value=='')this.value='Usuario'" onFocus="if(this.value=='Usuario')this.value=''">
      	<input name="cPassword" type="password" required value="Password" onBlur="if(this.value=='')this.value='Password'" onFocus="if(this.value=='Password')this.value=''">
        
        <input type="submit" value="Ingresar" onclick="error();">
        

        <footer class="clearfix">

          <p><span class="info">?</span><a href="http://localhost:8080/cachorros/">Registrate aquí</a></p>

        </footer>

      </form>

    </fieldset>

  </div> <!-- end login-form -->

</div>
</body>
</html>