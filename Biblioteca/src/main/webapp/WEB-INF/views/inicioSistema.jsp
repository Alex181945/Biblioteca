<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Biblioteca</title>
<meta name="description" content="Place your description here">
<meta name="keywords" content="put, your, keyword, here">
<meta name="author" content="Templates.com - website templates provider">
<link rel="stylesheet" href="<c:url value= "resources/css/reset.css"/>" type="text css" media="all">
<link rel="stylesheet" href="<c:url value= "resources/css/style.css"/>" type="text/css" media="all">
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
         <h1><a href="biblioteca">Biblioteca Online</a></h1>
         <nav>
            <ul>
               <li class="current"><a href="biblioteca" class="m1">Incio</a></li>
               <li><a href="libro" class="m2">Disponibilidad de Libros</a></li>
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
            <li><span><a href="repUsuario">Reportes</a></span></li>
         </ul>
       
         <h2>Noticias <span>ITGAM</span></h2>
         <ul class="news">
            <li></strong>
               <h4><a href="#">Quejas y Sugerencias</a></h4>
              Mandanos un correo con tus dudas, observaciones sugerencias o quejas con respecto a la Biblioteca Nacional de Ciencia y Tecnologia, en un lapso no mayor a 24 horas tendras una repuesta. </li>
            <li><strong></strong>
               <h4><a href="#">Normatividad SCT</a></h4>
               Donacion de la Secretaria de Comunicaciones y Transportes para la infraestructura del transporte. </li>
            <li><strong>
               <h4><a href="#">Biblioteconomia, Documentacion, Archivistica.</a></h4>
              Esta coleccion esta especializada en Biblioteconomia, Documentacion, Archivistica y Museologia, asi como en materias estrechamente relacionadas con estas disciplinas, como la Historia del libro o las Nuevas Tecnologias de la Informacion. </li>
         </ul>
      </aside>
      <!-- content -->
      <section id="content">
         <div id="banner">
            <h2>Profesional <span>Online ITGAM <span>Since 2015</span></span></h2>
         </div><div class="ic">More Website Templates at TemplateMonster.com!</div>
         <div class="inside">
            <h2>Reciente <span>Articulo</span></h2>
            <ul class="list">
               <li><span><img src="resources/image/icon1.png"></span>
                  <h4>Catalogo General</h4>
                  <p>En el catalogo general se pueden consultar las referencias bibliograficas de todos los documentos conservados en la Biblioteca: libros, manuscritos, prensa, material grafico, partituras, audiovisuales y registros sonoros. </p>
               </li>
               <li><span><img src="resources/image/icon2.png"></span>
                  <h4>Colecciones</h4>
                  <p> Sus colecciones incluyen todo tipo de materiales y las principales vias de enriquecimiento de sus fondos son las adquisiciones: compra, deposito legal, donativo y canje.</p>
               </li>
               <li class="last"><span><img src="resources/image/icon3.png"></span>
                  <h4>Ediciones Propias</h4>
                  <p>
Aqui encontrara usted una seleccion de textos digitalizados pertenecientes al Servicio de publicaciones de la Obra Social Bancaja. La mayoria de lo textos se encuentran en formato PDF y para acceder a ellos basta con pulsar sobre el icono correspondiente.</p>
               </li>
            </ul>
            <h2>Como consultar <span>los fondos de esta sala</span></h2>
            <p><span class="txt1">Consultar</span> Para la consulta de estos fondos es necesario el carne de investigador o lector. Para el prestamo domiciliario, es preciso disponer del carne de Documentacion Bibliotecaria.
 			<p><span class="txt1">Fondos en libre acceso:</span>Toda la coleccion esta en las estanterias de la sala y son de libre acceso.
            <div class="img-box"><img src="resources/image/1page-img.jpg"><p><span class="txt1">Prestamo domiciliario: </span> Puede llevarse en prestamo domiciliario 3 ejemplares durante 10 dias, y puede renovar el prestamo 2 veces por otros 10 dias cada renovacion. Las renovaciones se pueden solicitar presencialmente o por telefono. Tambien es posible hacer reservas de ejemplares que esten prestados a otros usuarios. </p>
            
         </div>
      </section>
   </div>
</div>
<!-- footer -->
<footer>
   <div class="container">
      <div class="inside">
         <div class="wrapper">
            <div class="fleft">Visitas<span>10,154</span></div>
            <p class="w3-link"> <a 
            href="http://w3layouts.com/"> Hecho en Mexico, INSTITUTO TECNOLOGICO DE LA GUSTAVO A. MADERO (ITGAM) Copyright © 1995-2015 eBay Inc. Todos los derechos reservados. Condiciones de uso, Privacidad, Cookies y AdChoice.</a></p>
         </div>
      </div>
   </div>
</footer>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>
