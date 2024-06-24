
<%@page import="java.util.ArrayList"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%      String usuario = (String) request.getSession().getAttribute("usuario");
            //DTUsuario usu = (DTUsuario) request.getSession().getAttribute("usu");
            String tipoUsuario = (String) request.getSession().getAttribute("tipoUsuario");
        %>
        <meta charset="UTF-8">
        <title>Turismo.uy - Inscripción a Salida Turistica</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    </head>
    <body onload="cargarDatos()">
        <header>
            <div id="logo">
                <h1>Turismo.uy - Inscripcion a Salida Turistica  </h1>
            </div>
            <div id="search">
                <div id="search">
                    <form action="SvBuscar" method="GET">
                        <input type="text" name="consulta" placeholder="Buscar actividades o paquetes">
                        <button type="submit">Buscar</button>
                    </form>
                </div>
            </div>
            <div id="login">
                <a href="logedUser.jsp">Volver al inicio</a>
            </div>
        </header>

        <aside>
            <h2>Mi perfil</h2>
            <ul>
                <%
                    if (tipoUsuario.equals("proveedor")) {
                %>
                <li><a href="consultaUsuario.jsp">Consulta de Usuario</a></li> <!--Visitante, Proveedor, Turista -->
                <li><a href="SvModificarUsuario?usuario=<%= usuario%>&tipoUsuario=<%= tipoUsuario%>">Modificar mis datos</a></li>
                <li><a href="altaActividadTuristica.jsp?usuario=<%= usuario%>&tipoUsuario=<%= tipoUsuario%>">Alta Actividad Turistica</a></li> <!-- Proveedor -->
                <li><a href="consultaActividadTuristica.jsp">Consulta de Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->
                <li><a href="altaSalidaTuristica.jsp">Alta de Salida Turistica</a></li> <!-- Proveedor -->
                <li><a href="consultaSalidaTuristica.jsp">Consulta Salida Turistica</a></li> <!--Visitante, Proveedor, Turista -->
                <li><a href="consultaPaqueteActividadesTuristicas.jsp">Consulta Paquete Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->





                <% } else if (tipoUsuario.equals("turista")) {

                %>
                <li><a href="consultaUsuario.jsp">Consulta de Usuario</a></li> <!--Visitante, Proveedor, Turista -->
                <li><a href="SvModificarUsuario?usuario=<%= usuario%>&tipoUsuario=<%= tipoUsuario%>">Modificar mis datos</a></li> <!-- Proveedor, Turista --> <!-- Proveedor, Turista -->
                <li><a href="consultaActividadTuristica.jsp">Consulta de Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->
                <li><a href="consultaSalidaTuristica.jsp">Consulta Salida Turistica</a></li> <!--Visitante, Proveedor, Turista -->
                <li><a href="inscripcionSalida.jsp">Inscripcion a Salida Turistica</a></li> <!-- Turista -->
                <li><a href="consultaPaqueteActividadesTuristicas.jsp">Consulta Paquete Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->
                <li><a href="compraPaquete.jsp?usuario=<%= usuario%>&tipoUsuario=<%= tipoUsuario%>">Comprar Paquete</a></li>  <!-- Turista -->
                <li><a href="inscripcionSalida.jsp">Inscripcion Salida Turistica</a></li> <!-- Turista -->
                    <%
                    } else {
                        System.out.println(tipoUsuario);
                    %>
                <li> <a href = "consultaUsuario.jsp"> Consulta de Usuario</a> </li> 
                <li> <a href = "consultaActividadTuristica.jsp" > Consulta de Actividad Turistica</a > </li>
                <li> <a href = "consultaSalidaTuristica.jsp" > Consulta de Salida Turistica</a > </li>
                <li> <a href = "consultaPaqueteActividadesTuristicas.jsp" > Consulta de Paquete de Actividades Turisticas</a > </li>
                    <%
                        }
                    %>


            </ul>
        </aside>

        <%
            String filtro = "";

        %>

        <main>
            <form action="SvPaquetesDeSalida" method="POST">
                <input type="hidden" name="usuarioV" id="usuarioV" value="<%= usuario%>"> 



                <label for="departamento">Departamento:</label>
                <select id="departamento" name="departamento"></select>
                <button type="button" onclick="filtrarPorDepartamento()">Filtrar por Departamento</button>


                <label for="categoria">Categoria:</label>
                <select id="categoria" name="categoria"></select>
                <button type="button" onclick="filtrarPorCategoria()">Filtrar por Categoria</button>


                <label for="actividad">Actividades:</label>
                <select id="actividad" name="actividad"></select>
                <button type="button" onclick="verDetalles()">Ver Detalles Actividad</button>


                <label for="actividadSalida">Salidas:</label>
                <select id="actividadSalida" name="actividadSalida"></select>
                <button type="button" onclick="cargarSalidasDeActividad()">Cargar Salidas de la Actividad</button>


                <button type="button" onclick="verDetallesSalida()">Ver Detalles Salida</button> 


                <label for="cantTuristas">Nº Turistas:</label>
                <input type="number" id="cantTuristas" name="cantTuristas" min="1">

                <label for="paquetes">Paquetes:</label>
                <select id="paquetes" name="paquetes"></select>
                <button type="button" onclick="cargarPaquetes()">Obtener paquetes</button>

                <label for="formaPago">Forma de pago:</label>
                <select name="formaPago" id="formaPago">
                    <option value="general">General</option>
                    <option value="por_paquete">Por Paquete</option>
                </select>

                <button type="submit">Inscribirse</button>
            </form>


        </main>

        <script>

            function cargarDepartamentos() {
                fetch("SvDepartamento")
                        .then(response => response.text())
                        .then(data => {
                            const departamentos = data.split(",");
                            const select = document.getElementById("departamento");
                            departamentos.forEach(departamento => {
                                const option = document.createElement("option");
                                option.value = departamento;
                                option.text = departamento;
                                select.appendChild(option);
                            });
                        })
                        .catch(error => console.error("Error al cargar departamentos: " + error));
            }

            function cargarCategorias() {
                fetch("SvCategoria")
                        .then(response => response.text())
                        .then(data => {
                            const categorias = data.split(",");
                            const select = document.getElementById("categoria");
                            categorias.forEach(categoria => {
                                const option = document.createElement("option");
                                option.value = categoria;
                                option.text = categoria;
                                select.appendChild(option);
                            });
                            // Permite múltiples selecciones
                        })
                        .catch(error => console.error("Error al cargar categorías: " + error));
            }



            function filtrarPorDepartamento() {
                const filtro = "FiltroDepartamento";
                const departamentoSeleccionado = document.getElementById("departamento").value;

                // Construir la URL con el valor seleccionado del departamento
                const url = "SvActividad?filtro=" + filtro + "&departamento=" + encodeURIComponent(departamentoSeleccionado);

                fetch(url)
                        .then(response => response.text())
                        .then(data => {
                            const select = document.getElementById("actividad");
                            select.innerHTML = ''; // Limpia las opciones anteriores

                            const actividades = data.split(",");
                            actividades.forEach(actividad => {
                                const option = document.createElement("option");
                                option.value = actividad;
                                option.text = actividad;
                                select.appendChild(option);
                            });
                        })
                        .catch(error => console.error("Error al filtrar por departamento: " + error));
            }


            function filtrarPorCategoria() {
                const filtro = "FiltroCategoria";
                const categoriaSeleccionada = document.getElementById("categoria").value;

                // Construir la URL con el valor seleccionado de la categoría
                const url = "SvActividad?filtro=" + filtro + "&categoria=" + encodeURIComponent(categoriaSeleccionada);

                fetch(url)
                        .then(response => response.text())
                        .then(data => {
                            const select = document.getElementById("actividad");
                            select.innerHTML = ''; // Limpia las opciones anteriores

                            const actividades = data.split(",");
                            actividades.forEach(actividad => {
                                const option = document.createElement("option");
                                option.value = actividad;
                                option.text = actividad;
                                select.appendChild(option);
                            });
                        })
                        .catch(error => console.error("Error al filtrar por categoría: " + error));
            }

            function verDetalles() {
                // Obtén el valor seleccionado en el campo de selección
                var actividadSeleccionada = document.getElementById("actividad").value;

                // Abre una nueva pestaña con la URL del servidor y pasa la variable actividad como parámetro
                var url = "SvActividad?actividad=" + actividadSeleccionada;
                window.open(url, "_blank");
            }

            function cargarSalidasDeActividad() {
                //  const filtro = "FiltroSalidasPorNomActividad";
                const actividadSeleccionada = document.getElementById("actividad").value;
                 if (actividadSeleccionada === "No hay actividades disponibles para esta categoria" || actividadSeleccionada === "No hay actividades disponibles para este departamento" || actividadSeleccionada === "" || actividadSeleccionada === null) {
                        event.preventDefault(); // Prevenir el envío del formulario
                        alert("Por favor, seleccione una actividad válida."); // Mostrar mensaje de error
                    } else {
                const url = "SvInscripcion?actividad=" + encodeURIComponent(actividadSeleccionada);

                fetch(url)
                        .then(response => response.text()) // Espera datos de texto
                        .then(data => {
                            const select = document.getElementById("actividadSalida");

                            select.innerHTML = ''; // Limpia las opciones anteriores

                            const actividadSalidas = data.split(",");
                            actividadSalidas.forEach(actividadSalida => {
                                if (actividadSalida) { // Evita opciones vacías
                                    const option = document.createElement("option");
                                    option.value = actividadSalida;
                                    option.text = actividadSalida;
                                    select.appendChild(option);
                                }
                            });
                        })
                        .catch(error => console.error("Error al cargar las salidas: " + error));
            }}

            function verDetallesSalida() {
                const filtro = "FiltroSalidas";
                var salidaSeleccionada = document.getElementById("actividadSalida").value;

                var url = "SvSalida?actividadSalida=" + salidaSeleccionada + "&filtro=" + filtro;
                window.open(url, '_blank');
            }

            function cargarPaquetes() {
                const actividadSeleccionada = document.getElementById("actividadSalida").value;
                const usuarioSeleccionado = document.getElementById("usuarioV").value;
                console.log(usuarioSeleccionado);
                const url = "SvPaquetesDeSalida?actividadSalida=" + encodeURIComponent(actividadSeleccionada) + "&usuario=" + encodeURIComponent(usuarioSeleccionado);

                fetch(url)
                        .then(response => response.text())
                        .then(data => {
                            const select = document.getElementById("paquetes");
                            select.innerHTML = ''; // Limpia las opciones anteriores

                            const nombresPaquetesFiltrados = data.split(",");
                            nombresPaquetesFiltrados.forEach(paquete => {
                                if (paquete) { // Evita opciones vacías
                                    const option = document.createElement("option");
                                    option.value = paquete;
                                    option.text = paquete;
                                    select.appendChild(option);
                                }
                            });

                            if (paquetesSelect === null) {
                                // Si está vacío, habilita la opción "General" y deshabilita la opción "Por Paquete"
                                formaPagoSelect.querySelector("option[value='general']").disabled = false;
                                formaPagoSelect.querySelector("option[value='por_paquete']").disabled = true;
                            } else {
                                // Si no está vacío, habilita ambas opciones
                                formaPagoSelect.querySelector("option[value='general']").disabled = false;
                                formaPagoSelect.querySelector("option[value='por_paquete']").disabled = false;
                            }
                        })
                        .catch(error => console.error("Error al cargar los paquetes: " + error));
            }

            function cargarDatos() {
                cargarDepartamentos();
                cargarCategorias();
            }
        </script>


        <footer>
            <p>Creado por Juan Martin Pilon - Carlos Santana - Natalia Lopez - Santiago Badiola</p>
            <p>&copy; 2023 Turismo.uy</p>
        </footer>
    </body>
</html>
