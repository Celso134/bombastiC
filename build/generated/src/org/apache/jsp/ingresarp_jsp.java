package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ingresarp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Proyectos</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles4.css\">\n");
      out.write("    <link href='https://cdn.jsdelivr.net/npm/boxicons@2.0.5/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"hero\">\n");
      out.write("        <nav class=\"nav__hero\">\n");
      out.write("            <div class=\"container nav__container\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img src=\"img/escudo.png\" class=\"escudo\" >\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"links\">\n");
      out.write("                    <a href=\"index.html\" class=\"link\">Inicio</a>\n");
      out.write("                    <a href=\"ingresarp.html\" class=\"link\">Proyectos</a>\n");
      out.write("                    <a href=\"somos.html\" class=\"link\">¿Quienes somos?</a>\n");
      out.write("                    <a href=\"perfil.html\" class=\"link\">Perfil</a>\n");
      out.write("                    <a href=\"#\" class=\"link link--active\">Cerrar Sesión</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"container hero__main\">\n");
      out.write("            <div class='ingresar_art_cont b bc'>\n");
      out.write("                <div class=\"ingresar_art_form\">\n");
      out.write("                    <h2 class=\"txt_negro\">Ingresa todos los datos del proyecto</h2>\n");
      out.write("                    <form name='ingresarProyecto' id=\"formulario\" action=\"registrarProyecto\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                            <br>\n");
      out.write("                            <input type='text' class='input_text' name='titulo' placeholder='Titulo del proyecto' ondrop='return false'>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <p><textarea class=\"input_text areatext_format\" name='titulo' placeholder=\"Resumen del proyecto(Abstract)\"></textarea></p>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <p><textarea class=\"input_text areatext_format\" name='intro' placeholder=\"Palabras clave\"></textarea></p>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <p><textarea class=\"input_text areatext_format\" name='glosario' placeholder=\"Introducción\"></textarea></p>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <p><textarea class=\"input_text areatext_format\" name='proposito' placeholder=\"Métodos llevados acabo en la elaboración del proyecto\"></textarea>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <p><textarea class=\"input_text areatext_format\" name='impacto' placeholder=\"Resultados\"></textarea></p>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <p><textarea class=\"input_text areatext_format\" name='objetivos' placeholder=\"Conclusión\"></textarea></p>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <p><input type=\"file\" name=\"archivo\" size=\"50\"/></p>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                            <div class=\"div_tira_botones2\">\n");
      out.write("                                <button class=\"btn2\" href=\"index.html\">Cancelar</button>\n");
      out.write("                                <button class=\"btn2\" type=\"submit\">Ver</button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("        </section>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"contact\">\n");
      out.write("            <div class=\"item__contact\">\n");
      out.write("                <h3 class=\"contact__title\">Está página es una obra intelectual protegida por la Ley Federal del Derecho de Autor, pueden ser reproducida con fines no lucrativos, siempre y cuando no se mutile, se cite  la fuente completa y su dirección electrónica; su uso para otros fines, requiere la autorización del autor de está página.</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
