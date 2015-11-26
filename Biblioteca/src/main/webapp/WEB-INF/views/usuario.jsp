<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Usuario</title>
<meta name="description" content="Place your description here">
<meta name="keywords" content="put, your, keyword, here">
<meta name="author" content="Templates.com - website templates provider">
<link rel="stylesheet" href="<c:url value= "resources/css/reset.css"/>" type="text css" media="all">
<link rel="stylesheet" href="<c:url value= "resources/css/style.css"/>" type="text/css" media="all">
<link rel="stylesheet" href="<c:url value= "resources/css/button.css"/>" type="text/css" media="all">
<script type="text/javascript" src="resources/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="resources/js/cufon-yui.js"></script>
<script type="text/javascript" src="resources/js/cufon-replace.js"></script>
<script type="text/javascript" src="resources/js/Myriad_Pro_300.font.js"></script>
<script type="text/javascript" src="resources/js/Myriad_Pro_400.font.js"></script>
<script type="text/javascript" src="resources/js/script.js"></script>
<!--[if lt IE 7]>$
     <link rel="stylesheet" href="css/ie/ie6.css" type="text/css" media="screen">
     <script type="text/javascript" src="js/ie_png.js"></script>
     <script type="text/javascript">
        ie_png.fix('.png, footer, header nav ul li a, .nav-bg, .list li img');
     </script>
<![endif]-->
<!--[if lt IE 9]>
  	<script type="text/javascript" src="js/html5.js"></script>
  <![endif]-->
</head>
<body id="page1">
<div class="wrap">
   <!-- header -->
   <header>
      <div class="container">
         <h1><a href="index.html">Biblioteca Online</a></h1>
         <nav>
            <ul>
               <li class="current"><a href="index.html" class="m1">Incio</a></li>
               <li><a href="about-us.html" class="m2">Disponibilidad de Libros</a></li>
               <li><a href="articles.html" class="m3">Usuarios Registrados</a></li>
               <li><a href="contact-us.html" class="m4">Herramientas Administrativas</a></li>
            </ul>
         </nav>
         <form action="" id="search-form">
            <fieldset>
            <div class="rowElem">
               <input type="text">
               <a href="#" onClick="document.getElementById('search-form').submit()">Search</a></div>
            </fieldset>
         </form>
      </div>
   </header>
   <div class="container">
      <!-- aside -->
      <aside>
         <h3>Categorias</h3>
         <ul class="categories">
            <li><span><a href="#">Usuarios</a></span></li>
            <li><span><a href="#">Catalogos</a></span></li>
            <li><span><a href="#">Editoriales</a></span></li>
            <li><span><a href="#">Reportes</a></span></li>
         </ul>
         <form action="" id="newsletter-form">
            <fieldset>
            <div class="rowElem">
               <h2>Newsletter</h2>
               <input type="email" value="Enter Your Email Here" onFocus="if(this.value=='Enter Your Email Here'){this.value=''}" onBlur="if(this.value==''){this.value='Enter Your Email Here'}" >
               <div class="clear"><a href="#" class="fleft">Unsubscribe</a><a href="#" class="fright" onClick="document.getElementById('newsletter-form').submit()">Submit</a></div>
            </div>
            </fieldset>
         </form>
         <h2>Fresh <span>News</span></h2>
         <ul class="news">
            <li><strong>June 30, 2010</strong>
               <h4><a href="#">Sed ut perspiciatis unde</a></h4>
               Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque. </li>
            <li><strong>June 14, 2010</strong>
               <h4><a href="#">Neque porro quisquam est</a></h4>
               Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit consequuntur magni. </li>
            <li><strong>May 29, 2010</strong>
               <h4><a href="#">Minima veniam, quis nostrum</a></h4>
               Uis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae. </li>
         </ul>
      </aside>
      <!-- content -->
      <section id="content">
         <div id="banner">
            <h2>Professional <span>Online Education <span>Since 1992</span></span></h2>
         </div><div class="ic">More Website Templates at TemplateMonster.com!</div>
         <div class="inside">
            <h2>Catalogo <span>de Libros</span></h2>
            <table>
            <thead>
               <tr>
               		<td width="4%"><h4 align = "center">No.</h4></td>
               		<td width="30%"><h4 align = "center">Titulo</h4></td>
               		<td width="13%"><h4 align = "center">Editorial</h4></td>
               		<td width="13%"><h4 align = "center">Autor</h4></td>
               		<td width="13%"><h4 align = "center">Area de Conocimiento</h4></td>
               		<td width="13%"><h4 align = "center">Disponible</h4></td>
               		<td width="30%"><h4 align = "center">Descripcion</h4></td>
               		<th width="13%"></th>
               </tr>
               </thead>
               <tbody>
               <c:forEach items="${lista_ctUsuario}" var ="ctUsuario">
               <tr>
               		<td><p align = "center"><span class="txt1"><c:out value="${ctUsuario.iUsuario}"></c:out></span></p></td>
               		<td><p align = "justify"><span><c:out value="${ctUsuario.cNombre}"></c:out></span></p></td>
               		<td><p align = "center"><span><c:out value="${ctUsuario.cApellidos}"></c:out></span></p></td>
               		<td><p align = "justify"><span><c:out value="${ctUsuario.cCalle}"></c:out></span></p></td>
               		<td><p align = "center"><span><c:out value="${ctUsuario.cNumExterior}"></c:out></span></p></td>
               		<td><p align = "center"><span><c:out value="${ctUsuario.cNumInterior}"></c:out></span></p></td>
               		<td><p align = "justify"><span><c:out value="${ctUsuario.cObs}"></c:out></span></p></td>
               		
               		<td><nobr>

								<button class="myButton"
									onclick="edit_ctLibro('${ctLibro.iLibro}');">
									<i class="fa fa-pencil"></i> Editar
								</button>

								<a class="pure-button pure-button-primary"
									onclick="return confirm('¿Desea Eliminar el usuario  selecionado?');"
									href="ctLibro/remove/${ctLibro.iLibro}"> 
									<i class="fa fa-times"></i>Eliminar
								</a>

							</nobr></td>
							
               </tr>
               </c:forEach>
               </tbody>
            </table>
         </div>
      </section>
   </div>
</div>
<!-- footer -->
<footer>
   <div class="container">
      <div class="inside">
         <div class="wrapper">
            <div class="fleft">24/7 Customer Service <span>8.800.146.56.7</span></div>
            <div class="aligncenter"><a rel="nofollow" href="http://www.templatemonster.com" class="new_window">Website template</a> designed by TemplateMonster.com<br>
               <a href="http://www.templates.com/product/3d-models/" class="new_window">3D Models</a> provided by Templates.com</div>
         </div>
      </div>
   </div>
</footer>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>