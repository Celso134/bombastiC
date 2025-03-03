package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <script\n");
      out.write("      src=\"https://kit.fontawesome.com/64d58efce2.js\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles2.css\" />\n");
      out.write("    <title>Inicia Sesión o Registrate</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"forms-container\">\n");
      out.write("        <div class=\"signin-signup\">\n");
      out.write("          <form action=\"#\" class=\"sign-in-form\">\n");
      out.write("            <h2 class=\"title\">Inicia Sesión</h2>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-user\"></i>\n");
      out.write("              <input type=\"text\" placeholder=\"Username\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-lock\"></i>\n");
      out.write("              <input type=\"password\" placeholder=\"Password\" />\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Entrar\" class=\"btn solid\" />\n");
      out.write("          </form>\n");
      out.write("          <form action=\"#\" class=\"sign-up-form\">\n");
      out.write("            <h2 class=\"title\">Registrarse</h2>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-user\"></i>\n");
      out.write("              <input type=\"text\" placeholder=\"Username\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-envelope\"></i>\n");
      out.write("              <input type=\"email\" placeholder=\"Email\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"fas fa-lock\"></i>\n");
      out.write("              <input type=\"password\" placeholder=\"Password\" />\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" class=\"btn\" value=\"Registrarse\" />\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"panels-container\">\n");
      out.write("        <div class=\"panel left-panel\">\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>¿Eres nuevo?</h3>\n");
      out.write("            <p>\n");
      out.write("              No te preocupes aquí te puedes registrar sin problemas\n");
      out.write("            </p>\n");
      out.write("            <button class=\"btn transparent\" id=\"sign-up-btn\">\n");
      out.write("              Registrarse\n");
      out.write("            </button>\n");
      out.write("            <button  class=\"btn2\" onclick=\"history.back();\">\n");
      out.write("            Regresar página principal\n");
      out.write("            </button> \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <img src=\"img/log.svg\" class=\"image\" alt=\"\" />\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div class=\"panel right-panel\">\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>¿Ya eres parte de la comunidad?</h3>\n");
      out.write("            <p>\n");
      out.write("              Ser parte de nuestra comunidad te brindara información interesante e importante\n");
      out.write("            </p>\n");
      out.write("            <button class=\"btn transparent\" id=\"sign-in-btn\">\n");
      out.write("              Entrar\n");
      out.write("            </button>\n");
      out.write("            <button  class=\"btn2\" onclick=\"history.back();\">\n");
      out.write("              Regresar página principal\n");
      out.write("             </button>\n");
      out.write("          </div>\n");
      out.write("          <img src=\"img/register.svg\" class=\"image\"/>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"js/app.js\"></script>\n");
      out.write("  </body>\n");
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
