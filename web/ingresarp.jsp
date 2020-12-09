<%-- 
    Document   : ingresarp
    Created on : 9/12/2020, 10:18:31 AM
    Author     : monol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proyectos</title>
    <link rel="stylesheet" href="css/styles4.css">
    <link href='https://cdn.jsdelivr.net/npm/boxicons@2.0.5/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
    <header class="hero">
        <nav class="nav__hero">
            <div class="container nav__container">
                <div class="logo">
                    <img src="img/escudo.png" class="escudo" >
                    
                </div>
                <div class="links">
                    <a href="index.html" class="link">Inicio</a>
                    <a href="ingresarp.html" class="link">Proyectos</a>
                    <a href="somos.html" class="link">¿Quienes somos?</a>
                    <a href="perfil.html" class="link">Perfil</a>
                    <a href="#" class="link link--active">Cerrar Sesión</a>
                </div>
            </div>
        </nav>


        <section class="container hero__main">
            <div class='ingresar_art_cont b bc'>
                <div class="ingresar_art_form">
                    <h2 class="txt_negro">Ingresa todos los datos del proyecto</h2>
                    <form name='ingresarProyecto' id="formulario" action="registrarProyecto" method="post" enctype="multipart/form-data">
                            <br>
                            <input type='text' class='input_text' name='id' placeholder='id' ondrop='return false'>
                            <br>
                            <br>
                            <input type='text' class='input_text' name='titulo' placeholder='Titulo del proyecto' ondrop='return false'>
                            <br>
                            <br>
                            <p><textarea class="input_text areatext_format" name='titulo' placeholder="Resumen del proyecto(Abstract)"></textarea></p>
                            <br>
                            <br>
                            <p><textarea class="input_text areatext_format" name='intro' placeholder="Palabras clave"></textarea></p>
                            <br>
                            <br>
                            <p><textarea class="input_text areatext_format" name='glosario' placeholder="Introducción"></textarea></p>
                            <br>
                            <br>
                            <p><textarea class="input_text areatext_format" name='proposito' placeholder="Métodos llevados acabo en la elaboración del proyecto"></textarea>
                            <br>
                            <br>
                            <p><textarea class="input_text areatext_format" name='impacto' placeholder="Resultados"></textarea></p>
                            <br>
                            <br>
                            <p><textarea class="input_text areatext_format" name='objetivos' placeholder="Conclusión"></textarea></p>
                            <br>
                            <br>
                            <p><input type="file" name="archivo" size="50"/></p>
                            <br>
                            <br>
                            
                            <div class="div_tira_botones2">
                                <button class="btn2" href="index.html">Cancelar</button>
                                <button class="btn2" type="submit">Ver</button>
                            </div>
                        </form>  
                </div>
            </div>
      
        </section>
    </header>

    <footer class="footer">
        <div class="contact">
            <div class="item__contact">
                <h3 class="contact__title">Está página es una obra intelectual protegida por la Ley Federal del Derecho de Autor, pueden ser reproducida con fines no lucrativos, siempre y cuando no se mutile, se cite  la fuente completa y su dirección electrónica; su uso para otros fines, requiere la autorización del autor de está página.</h3>
            </div>
        </div>
    </footer>
</body>
</html>
