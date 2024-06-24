/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-11-21 04:57:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link href=\"styles.css\" src=\"styles.css\"\">\n");
      out.write("        <title>Turismo.uy - Reserva de Paquetes Turísticos</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function redirigirSiEsMovil() {\n");
      out.write("                if (window.innerWidth <= 800) {\n");
      out.write("                    window.location.href = 'loginMovil.jsp';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            document.addEventListener(\"DOMContentLoaded\", redirigirSiEsMovil);\n");
      out.write("            window.addEventListener(\"resize\", redirigirSiEsMovil);\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            List<String> listaCategorias = (List<String>) request.getSession().getAttribute("listaCategorias");

            List<String> listaDepartamentos = (List<String>) request.getSession().getAttribute("listaDepartamentos");
        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <h1>Turismo.uy</h1>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"search\">\n");
      out.write("                <div id=\"search\">\n");
      out.write("                    <form action=\"SvBuscar\" method=\"GET\">\n");
      out.write("                        <input type=\"text\" name=\"consulta\" placeholder=\"Buscar actividades o paquetes\">\n");
      out.write("                        <button type=\"submit\">Buscar</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"login\">\n");
      out.write("                <a href=\"login.jsp\">Iniciar Sesión</a> | <a href=\"altaUsuario.jsp\">Alta Usuario</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <aside>\n");
      out.write("            <h2>Mis acciones</h2>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"consultaUsuario.jsp\">Consulta de Usuario</a></li>\n");
      out.write("                <li><a href=\"consultaActividadTuristica.jsp\">Consulta de Actividad Turistica</a></li>\n");
      out.write("                <li><a href=\"consultaSalidaTuristica.jsp\">Consulta de Salida Turistica</a></li>\n");
      out.write("                <li><a href=\"consultaPaqueteActividadesTuristicas.jsp\">Consulta de Paquete de Actividades Turisticas</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <h2>Departamentos</h2>\n");
      out.write("            <ul>\n");
      out.write("                <ul id=\"miContenedor\">\n");
      out.write("                    ");

                        if (listaDepartamentos != null && !listaDepartamentos.isEmpty()) {
                            for (String d : listaDepartamentos) {
                                out.println("<li> <a href='#' id='departamento-" + d + "'>" + d + "</a></li>");
                            }
                        } else {
                            out.println("<li>No hay departamentos con actividades confirmadas.</li>");
                        }
                    
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <h2>Categorías</h2>\n");
      out.write("            <ul id=\"miContenedor2\">\n");
      out.write("                ");

                    if (listaCategorias != null && !listaCategorias.isEmpty()) {
                        for (String c : listaCategorias) {
                            out.println("<li> <a href='#' id='categoria-" + c + "'>" + c + "</a></li>");
                        }
                    } else {
                        out.println("<li>No hay categorias con actividades confirmadas.</li>");
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </aside>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("\n");
      out.write("            <section id=\"actividadesContainer\" class=\"asd\" >\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <p>Creado por Juan Martin Pilon - Carlos Santana - Natalia Lopez - Santiago Badiola</p>\n");
      out.write("            <p>&copy; 2023 Turismo.uy</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("            // Obtener la referencia al contenedor de actividades\n");
      out.write("            var actividadesContainer = document.getElementById(\"actividadesContainer\");\n");
      out.write("\n");
      out.write("            // Obtener todos los enlaces de departamentos y categorías\n");
      out.write("            var contenedor = document.getElementById(\"miContenedor\");\n");
      out.write("\n");
      out.write("            // Obtener los enlaces solo dentro del contenedor específico\n");
      out.write("            var links = contenedor.querySelectorAll('ul li a');\n");
      out.write("\n");
      out.write("            // Iterar sobre los enlaces y agregar un controlador de eventos para el clic\n");
      out.write("            links.forEach(function (link) {\n");
      out.write("                link.addEventListener(\"click\", function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("\n");
      out.write("                    // Obtener el id del departamento o categoría seleccionada\n");
      out.write("\n");
      out.write("                    var id = link.id;\n");
      out.write("                    console.log(\"Elemento clickeado: \" + id);\n");
      out.write("\n");
      out.write("                    // Realizar una solicitud al servidor para obtener las actividades del departamento o categoría seleccionada\n");
      out.write("                    var xhr = new XMLHttpRequest();\n");
      out.write("                    var url;\n");
      out.write("\n");
      out.write("                    // Verificar si es un enlace de departamento o categoría y construir la URL correspondiente\n");
      out.write("                    if (id.startsWith(\"departamento-\")) {\n");
      out.write("                        var departamentoId = id.split(\"-\")[1];\n");
      out.write("                        url = \"SvObtenerActividades?departamentoId=\" + departamentoId;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    console.log(\"URL de solicitud: \" + url);\n");
      out.write("                    xhr.open(\"GET\", url, true);\n");
      out.write("                    xhr.onreadystatechange = function () {\n");
      out.write("                        if (xhr.readyState === 4 && xhr.status === 200) {\n");
      out.write("                            // Manejar la respuesta del servidor y mostrar las actividades en el contenedor\n");
      out.write("                            actividadesContainer.innerHTML = xhr.responseText;\n");
      out.write("                        }\n");
      out.write("                    };\n");
      out.write("                    xhr.send();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("            // Obtener la referencia al contenedor de actividades\n");
      out.write("            var actividadesContainer = document.getElementById(\"actividadesContainer\");\n");
      out.write("\n");
      out.write("            // Obtener todos los enlaces de departamentos y categorías\n");
      out.write("            var contenedor = document.getElementById(\"miContenedor2\");\n");
      out.write("\n");
      out.write("            // Obtener los enlaces solo dentro del contenedor específico\n");
      out.write("            var links = contenedor.querySelectorAll('ul li a');\n");
      out.write("\n");
      out.write("            // Iterar sobre los enlaces y agregar un controlador de eventos para el clic\n");
      out.write("            links.forEach(function (link) {\n");
      out.write("                link.addEventListener(\"click\", function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("\n");
      out.write("                    // Obtener el id del departamento o categoría seleccionada\n");
      out.write("\n");
      out.write("                    var id = link.id;\n");
      out.write("                    console.log(\"Elemento clickeado: \" + id);\n");
      out.write("\n");
      out.write("                    // Realizar una solicitud al servidor para obtener las actividades del departamento o categoría seleccionada\n");
      out.write("                    var xhr = new XMLHttpRequest();\n");
      out.write("                    var url;\n");
      out.write("\n");
      out.write("                    // Verificar si es un enlace de departamento o categoría y construir la URL correspondiente\n");
      out.write("                    if (id.startsWith(\"categoria-\")) {\n");
      out.write("                        var categoriaId = id.split(\"-\")[1];\n");
      out.write("                        url = \"SvObtenerActividadesCategoria?categoriaId=\" + categoriaId;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    console.log(\"URL de solicitud: \" + url);\n");
      out.write("                    xhr.open(\"GET\", url, true);\n");
      out.write("                    xhr.onreadystatechange = function () {\n");
      out.write("                        if (xhr.readyState === 4 && xhr.status === 200) {\n");
      out.write("                            // Manejar la respuesta del servidor y mostrar las actividades en el contenedor\n");
      out.write("                            actividadesContainer.innerHTML = xhr.responseText;\n");
      out.write("                        }\n");
      out.write("                    };\n");
      out.write("                    xhr.send();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
