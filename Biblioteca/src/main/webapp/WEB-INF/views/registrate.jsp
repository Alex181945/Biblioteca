<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Biblioteca ITGAM</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='http://fonts.googleapis.com/css?family=Quattrocento+Sans' rel='stylesheet' type='text/css'>
<link href="resources/css/stylelibrary.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<div class="btm_border">
<div class="h_bg">
<div class="wrap">
	<div class="header">
		<div class="logo">
			<h1><a href=""><img src="resources/image/logo.png" alt=""></a></h1>
		</div>
		<div class="social-icons">
			<ul>
			     <li><a class="facebook" href="https://es-la.facebook.com/" target="_blank"> </a></li>
			     <li><a class="twitter" href="https://twitter.com/?lang=es" target="_blank"></a></li>
			     <li><a class="googleplus" href="https://accounts.google.com/ServiceLogin?service=oz&passive=1209600&continue=https://plus.google.com/?gpsrc%3Dgplp0#identifier" target="_blank"></a></li>
			     <li><a class="pinterest" href="https://es.pinterest.com/" target="_blank"></a></li>
			     <li><a class="dribbble" href="https://dribbble.com/" target="_blank"></a></li>
			     <li><a class="vimeo" href="https://vimeo.com/" target="_blank"></a></li>
		   </ul>
		</div>	
		<div class="clear"></div>
	</div>
	<div class='h_btm'>
		<div class='cssmenu'>
			<ul>
			    <li class='last'><a href='http://localhost:8080/power/'><span>Inicio</span></a></li>
			    <li><a href='nosotros'><span>Nosotros</span></a></li>
			    <li class='has-sub'><a href='servicios'><span>Servicios</span></a></li>
			    <li class='active'><a href='registrate'><span>Registrate</span></a></li>
			 	<div class="clear"></div>
			 </ul>
	</div>
	<div class="search">
    	<form>
    		<input type="text" value="">
    		<input type="submit" value="">
    	</form>
	</div>
	<div class="clear"></div>
</div>
</div>
</div>
</div>
<!--main-->
<div class="main_btm">
<div class="wrap">
<div class="main">
	<div class="contact">
		<div class="section group">				
				<div class="col span_1_of_2">
					<div class="contact_info">
			    	 	<h2>Encuentranos aqui</h2>
			    	 		<div class="map">
					   			<iframe width="100%" height="175" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d1880.9256714343808!2d-99.06142442327881!3d19.461975123586427!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x30b9a0b2b63fb2e7!2sInstituto+Tecnologico+de+Gustavo+A.+Madero!5e0!3m2!1ses-419!2smx!4v1447919714523"></iframe><br><small><a href="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d1880.9256714343808!2d-99.06142442327881!3d19.461975123586427!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x30b9a0b2b63fb2e7!2sInstituto+Tecnologico+de+Gustavo+A.+Madero!5e0!3m2!1ses-419!2smx!4v1447919714523" style="color: #575757;text-align:left;font-size:13px">Mapa Largo</a></small>
					   		</div>
      				</div>
      			<div class="company_address">
				     	<h2>Dirección de Biblioteca </h2>
						<p>Calle 608 y Av. 412 No. 300 Unidad San Juan de Aragon,</p>
						<p>Delegación Gustavo A. Madero</p>
						<p>Distrito Federal</p>
						<p>C.P. 07470</p>
				   		<p>Phone:(55) 26-51-62-75 </p>
				   		<p>Fax: (000) 000 00 00 0</p>
				 	 	<p>Email: <span>Mocosoft@gmail.com</span></p>
				   		<p>Follow on: <span>Facebook</span>, <span>Twitter</span></p>
				   </div>
				   <div class="clear"></div>
				</div>				
				<div class="col span_2_of_4">
				  <div class="contact-form">
				  	<h2 class="style">Registrate</h2>
					       <form method="post" action="registrate/usuario">
					    	<div>
						    	<span><label>Nombre</label></span>
						    	<span><input name="cNombre" type="text" class="textbox" placeholder="Alejandro" required></span>
						    </div>
						    <div>
						    	<span><label>Apellidos</label></span>
						    	<span><input name="cApellidos" type="text" class="textbox" placeholder="Ortega" required></span>
						    </div>
						    <div>
						     	<span><label>Calle</label></span>
						    	<span><input name="cCalle" type="text" class="textbox" placeholder="San Cochinita" required></span>
						    </div>
						    <div>
						    	<span><label>Numero Exterior</label></span>
						    	<span><input name="cNumExterior" type="text" class="textbox" placeholder="62" required></span>
						    </div>
						    <div>
						     	<span><label>Numero Interior</label></span>
						    	<span><input name="cNumInterior" type="text" class="textbox" placeholder="Dep. 5A"></span>
						    </div>
						    <div>
						     	<span><label>Colonia</label></span>
						    	<span><input name="cColonia" type="text" class="textbox" placeholder="Amador" required></span>
						    </div>
						    <div>
						     	<span><label>Codigo Postal</label></span>
						    	<span><input name="cCP" type="text" class="textbox" placeholder="07870" required></span>
						    </div>
						    <div>
						     	<span>Estado<label></label></span>
						    	<span><input name="cEstado" type="text" class="textbox" placeholder="Distrito Federal" required></span>
						    </div>
						    <div>
						     	<span><label>Email</label></span>
						    	<span><input name="cEmail" type="text" class="textbox" placeholder="micorreo@mocosoft.com" required></span>
						    </div>
						    <div>
						     	<span><label>Fecha de Nacimiento</label></span>
						    	<span><input name="dtFechaNac" type="date" class="textbox" required></span>
						    </div>
						    <div>
						     	<span><label>Sexo</label></span>
						    	<span><input name="lSexo" type="radio" class="textbox" required value="true"
						    	${ctUsuario.lSexo ? 'checked':''}>Masculino 
						    	<input name="lSexo" type="radio" class="textbox" required value="false"
								${not ctUsuario.lSexo ? 'checked':''}>Femenino</span>
						    </div>
						    <div>
						     	<span><label>Usuario</label></span>
						    	<span><input name="cUsuario" type="text" class="textbox" placeholder="pepito123" required></span>
						    </div>
						    <div>
						     	<span><label>Password</label></span>
						    	<span><input name="cPassword" type="password" class="textbox" placeholder="*********" required></span>
						    </div>
						   <div>
						   		<span><input type="submit" value="Enviar"></span>
						  </div>
					    </form>
				    </div>
  				</div>		
  			<div class="clear"></div>
		  </div>
	</div>
</div>
</div>
</div>
<!--footer-->
<div class="footer-bg">	
<div class="wrap">
<div class="footer">
  <div class="box1">
	<h4 class="btm">What We Do</h4>
	<p>The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. ions from the 1914 below for those  by H. Rackham</p>
	<p>The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those The standard chunk of Lorem Ipsum used since the 1500s is reproduced reproduced</p>
  </div>
   <div class="box1">
	<h4 class="btm">Categories</h4>
	<nav>
		<ul>
			<li><a href="">The standard chunk of Lorem Ipsum used since </a></li>
			<li><a href="">Duis a augue ac libero euismod viverra sitth</a></li>
			<p>500 Lorem Ipsum Dolor Sit,</p>
			<p>22-56-2-9 Sit Amet, Lorem,</p>
			<p>USA</p>
			<p>Phone:(00) 222 666 444</p>
			<p>Fax: (000) 000 00 00 0</p>
			<p>Email: <span>info(at)mycompany.com</span></p>
			<p>Follow on: <span>Facebook</span>, <span>Twitter</span></p>
			</ul>
			</nav>
		</div>
	</div>
	<div class="clear"></div>			
</div>
</div>
<!--footer1-->
	<div class="box1"></div>
		
		<div class="box1_address"></div>
<div class="ftr-bg">
	<div class="wrap">
		<div class="footer">
		<div class="copy">
			<p class="w3-link">© All Rights Reserved | Design by&nbsp; <a href="http://w3layouts.com/"> W3Layouts</a></p>
		</div>
		<div class="clear"></div>	
	</div>
	</div>
</div>
</body>
</html>