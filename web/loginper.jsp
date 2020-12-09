<%-- 
    Document   : loginper
    Created on : 9/12/2020, 10:22:57 AM
    Author     : monol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script
      src="https://kit.fontawesome.com/64d58efce2.js"
      crossorigin="anonymous"
    ></script>
    <link rel="stylesheet" href="css/styles2.css" />
    <title>Inicia Sesión o Registrate Personal</title>
  </head>
  <body>
    <div class="container">
      <div class="forms-container">
        <div class="signin-signup">
          <form action="#" class="sign-in-form">
            <h2 class="title">Inica Sesión Personal</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input type="text" placeholder="Username" />
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input type="password" placeholder="Password" />
            </div>
            <input type="submit" value="Entrar" class="btn solid" />
          </form>
          <form action="#" class="sign-up-form">
            <h2 class="title">Registrarse Personal</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input type="text" placeholder="Username" />
            </div>
            <div class="input-field">
              <i class="fas fa-envelope"></i>
              <input type="email" placeholder="Email" />
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input type="password" placeholder="Password" />
            </div>
            <input type="submit" class="btn" value="Registrarse" />
          </form>
        </div>
      </div>

      <div class="panels-container">
        <div class="panel left-panel">
          <div class="content">
            <h3>¿Aún no registrar a la persona?</h3>
            <p>
              No te preocupes aquí puedes registar al Personal
            </p>
            <button class="btn transparent" id="sign-up-btn">
              Registrarse
            </button>
            <button  class="btn2" onclick="history.back();">
            Regresar página principal
            </button> 
            
          </div>
          <img src="img/log.svg" class="image" alt="" />
  
        </div>
       
        <div class="panel right-panel">
          <div class="content">
            <h3>¿Ya eres parte del Personal?</h3>
            <p>
              Ser parte de nuestra comunidad te brindara información interesante e importante
            </p>
            <button class="btn transparent" id="sign-in-btn">
              Entrar
            </button>
            <button  class="btn2" onclick="history.back();">
              Regresar página principal
             </button>
          </div>
          <img src="img/register.svg" class="image"/>
        </div>
      </div>
    </div>

    <script src="js/app.js"></script>
  </body>
</html>
