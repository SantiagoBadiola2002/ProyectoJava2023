/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-11-18 20:36:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class consultaActividadTuristica_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");

            String usuario = (String) request.getSession().getAttribute("usuario");
            String tipoUsuario = (String) request.getSession().getAttribute("tipoUsuario");
        
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link href=\"styles.css\" src=\"styles.css\">\n");
      out.write("        <title>Turismo.uy - Consulta de Actividad Turistica</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body onload=\"cargarDatos()\">\n");
      out.write("        <header>\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <h1>Turismo.uy - Consulta de Actividad Turistica</h1>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"search\">\n");
      out.write("                <div id=\"search\">\n");
      out.write("                    <form action=\"SvBuscar\" method=\"GET\">\n");
      out.write("                        <input type=\"text\" name=\"consulta\" placeholder=\"Buscar actividades o paquetes\">\n");
      out.write("                        <button type=\"submit\">Buscar</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"login\">\n");
      out.write("                <a href=\"logedUser.jsp\" src=\"logedUser.jsp\">Volver al inicio</a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <aside>\n");
      out.write("            <h2>Mi perfil</h2>\n");
      out.write("            <ul>\n");
      out.write("                ");

                    if (tipoUsuario != null) {
                        if (tipoUsuario.equals("proveedor")) {
                
      out.write("\n");
      out.write("                <li><a href=\"consultaUsuario.jsp\">Consulta de Usuario</a></li> <!--Visitante, Proveedor, Turista -->\n");
      out.write("                <li><a href=\"SvModificarUsuario?usuario=");
      out.print( usuario);
      out.write("&tipoUsuario=");
      out.print( tipoUsuario);
      out.write("\">Modificar mis datos</a></li>\n");
      out.write("                <li><a href=\"altaActividadTuristica.jsp?usuario=");
      out.print( usuario);
      out.write("&tipoUsuario=");
      out.print( tipoUsuario);
      out.write("\">Alta Actividad Turistica</a></li> <!-- Proveedor -->\n");
      out.write("                <li><a href=\"consultaActividadTuristica.jsp\">Consulta de Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->\n");
      out.write("                <li><a href=\"altaSalidaTuristica.jsp\">Alta de Salida Turistica</a></li> <!-- Proveedor -->\n");
      out.write("                <li><a href=\"consultaSalidaTuristica.jsp\">Consulta Salida Turistica</a></li> <!--Visitante, Proveedor, Turista -->\n");
      out.write("                <li><a href=\"consultaPaqueteActividadesTuristicas.jsp\">Consulta Paquete Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
 } else if (tipoUsuario.equals("turista")) {

                
      out.write("\n");
      out.write("                <li><a href=\"consultaUsuario.jsp\">Consulta de Usuario</a></li> <!--Visitante, Proveedor, Turista -->\n");
      out.write("                <li><a href=\"SvModificarUsuario?usuario=");
      out.print( usuario);
      out.write("&tipoUsuario=");
      out.print( tipoUsuario);
      out.write("\">Modificar mis datos</a></li> <!-- Proveedor, Turista --> <!-- Proveedor, Turista -->\n");
      out.write("                <li><a href=\"consultaActividadTuristica.jsp\">Consulta de Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->\n");
      out.write("                <li><a href=\"consultaSalidaTuristica.jsp\">Consulta Salida Turistica</a></li> <!--Visitante, Proveedor, Turista -->\n");
      out.write("                <li><a href=\"inscripcionSalida.jsp\">Inscripcion a Salida Turistica</a></li> <!-- Turista -->\n");
      out.write("                <li><a href=\"consultaPaqueteActividadesTuristicas.jsp\">Consulta Paquete Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->\n");
      out.write("                <li><a href=\"compraPaquete.jsp?usuario=");
      out.print( usuario);
      out.write("&tipoUsuario=");
      out.print( tipoUsuario);
      out.write("\">Comprar Paquete</a></li>  <!-- Turista -->\n");
      out.write("                <li><a href=\"inscripcionSalida.jsp\">Inscripcion Salida Turistica</a></li> <!-- Turista -->\n");
      out.write("                    ");

                        }
                    } else {

                    
      out.write("\n");
      out.write("                <li> <a href = \"consultaUsuario.jsp\"> Consulta de Usuario</a> </li> \n");
      out.write("                <li> <a href = \"consultaActividadTuristica.jsp\" > Consulta de Actividad Turistica</a > </li>\n");
      out.write("                <li> <a href = \"consultaSalidaTuristica.jsp\" > Consulta de Salida Turistica</a > </li>\n");
      out.write("                <li> <a href = \"consultaPaqueteActividadesTuristicas.jsp\" > Consulta de Paquete de Actividades Turisticas</a > </li>\n");
      out.write("                    ");
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </aside>\n");
      out.write("\n");
      out.write("        ");

            String filtro = "";
        
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <form id=\"consultaForm\" action=\"SvActividad\" class=\"desplegable-menu\" method=\"GET\">\n");
      out.write("                <input type=\"hidden\" name=\"tipoUsuario\" id=\"tipoUsuario\" value=\"");
      out.print( tipoUsuario);
      out.write("\"> \n");
      out.write("                <input type=\"hidden\" name=\"usuario\" id=\"usuario\" value=\"");
      out.print( usuario);
      out.write("\"> \n");
      out.write("\n");
      out.write("                <label for=\"departamento\">Departamento:</label>\n");
      out.write("                <select id=\"departamento\" name=\"departamento\"></select>\n");
      out.write("                <button type=\"button\" onclick=\"filtrarPorDepartamento()\">Filtrar por Departamento</button>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label for=\"categoria\">Categoria:</label>\n");
      out.write("                <select id=\"categoria\" name=\"categoria\"></select>\n");
      out.write("                <button type=\"button\" onclick=\"filtrarPorCategoria()\">Filtrar por Categoria</button>\n");
      out.write("\n");
      out.write("                <label for=\"actividad\">Actividades:</label>\n");
      out.write("                <select id=\"actividad\" name=\"actividad\"> \n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <button type=\"submit\">Consultar</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function cargarDepartamentos() {\n");
      out.write("                fetch(\"SvDepartamento\")\n");
      out.write("                        .then(response => response.text())\n");
      out.write("                        .then(data => {\n");
      out.write("                            const departamentos = data.split(\",\");\n");
      out.write("                            const select = document.getElementById(\"departamento\");\n");
      out.write("                            departamentos.forEach(departamento => {\n");
      out.write("                                const option = document.createElement(\"option\");\n");
      out.write("                                option.value = departamento;\n");
      out.write("                                option.text = departamento;\n");
      out.write("                                select.appendChild(option);\n");
      out.write("                            });\n");
      out.write("                        })\n");
      out.write("                        .catch(error => console.error(\"Error al cargar departamentos: \" + error));\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function cargarCategorias() {\n");
      out.write("                fetch(\"SvCategoria\")\n");
      out.write("                        .then(response => response.text())\n");
      out.write("                        .then(data => {\n");
      out.write("                            const categorias = data.split(\",\");\n");
      out.write("                            const select = document.getElementById(\"categoria\");\n");
      out.write("                            categorias.forEach(categoria => {\n");
      out.write("                                const option = document.createElement(\"option\");\n");
      out.write("                                option.value = categoria;\n");
      out.write("                                option.text = categoria;\n");
      out.write("                                select.appendChild(option);\n");
      out.write("                            });\n");
      out.write("                            // Permite múltiples selecciones\n");
      out.write("                        })\n");
      out.write("                        .catch(error => console.error(\"Error al cargar categorías: \" + error));\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function filtrarPorDepartamento() {\n");
      out.write("                const filtro = \"FiltroDepartamento\";\n");
      out.write("                const departamentoSeleccionado = document.getElementById(\"departamento\").value;\n");
      out.write("\n");
      out.write("                // Construir la URL con el valor seleccionado del departamento\n");
      out.write("                const url = \"SvActividad?filtro=\" + filtro + \"&departamento=\" + encodeURIComponent(departamentoSeleccionado);\n");
      out.write("\n");
      out.write("                fetch(url)\n");
      out.write("                        .then(response => response.text())\n");
      out.write("                        .then(data => {\n");
      out.write("                            const select = document.getElementById(\"actividad\");\n");
      out.write("                            select.innerHTML = ''; // Limpia las opciones anteriores\n");
      out.write("\n");
      out.write("                            const actividades = data.split(\",\");\n");
      out.write("                            actividades.forEach(actividad => {\n");
      out.write("                                const option = document.createElement(\"option\");\n");
      out.write("                                option.value = actividad;\n");
      out.write("                                option.text = actividad;\n");
      out.write("                                select.appendChild(option);\n");
      out.write("                            });\n");
      out.write("                        })\n");
      out.write("                        .catch(error => console.error(\"Error al filtrar por departamento: \" + error));\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function filtrarPorCategoria() {\n");
      out.write("                const filtro = \"FiltroCategoria\";\n");
      out.write("                const categoriaSeleccionada = document.getElementById(\"categoria\").value;\n");
      out.write("\n");
      out.write("                // Construir la URL con el valor seleccionado de la categoría\n");
      out.write("                const url = \"SvActividad?filtro=\" + filtro + \"&categoria=\" + encodeURIComponent(categoriaSeleccionada);\n");
      out.write("\n");
      out.write("                fetch(url)\n");
      out.write("                        .then(response => response.text())\n");
      out.write("                        .then(data => {\n");
      out.write("                            const select = document.getElementById(\"actividad\");\n");
      out.write("                            select.innerHTML = ''; // Limpia las opciones anteriores\n");
      out.write("\n");
      out.write("                            const actividades = data.split(\",\");\n");
      out.write("                            actividades.forEach(actividad => {\n");
      out.write("                                const option = document.createElement(\"option\");\n");
      out.write("                                option.value = actividad;\n");
      out.write("                                option.text = actividad;\n");
      out.write("                                select.appendChild(option);\n");
      out.write("                            });\n");
      out.write("                        })\n");
      out.write("                        .catch(error => console.error(\"Error al filtrar por categoría: \" + error));\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function cargarDatos() {\n");
      out.write("                cargarDepartamentos();\n");
      out.write("                cargarCategorias();\n");
      out.write("\n");
      out.write("                const consultaForm = document.getElementById(\"consultaForm\");\n");
      out.write("\n");
      out.write("                consultaForm.addEventListener(\"submit\", function (event) {\n");
      out.write("                    const actividadSeleccionada = document.getElementById(\"actividad\").value;\n");
      out.write("                    if (actividadSeleccionada === \"No hay actividades disponibles para esta categoria\" || actividadSeleccionada === \"No hay actividades disponibles para este departamento\" || actividadSeleccionada === \"\" || actividadSeleccionada === null) {\n");
      out.write("                        event.preventDefault(); // Prevenir el envío del formulario\n");
      out.write("                        alert(\"Por favor, selecciona una actividad válida.\"); // Mostrar mensaje de error\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <p>Creado por Juan Martin Pilon - Carlos Santana - Natalia Lopez - Santiago Badiola</p>\n");
      out.write("            <p>&copy; 2023 Turismo.uy</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
