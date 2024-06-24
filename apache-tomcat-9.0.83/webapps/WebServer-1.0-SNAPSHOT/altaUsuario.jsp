<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <html>
        <head>
            <meta charset="UTF-8">
            <link href="styles.css" src="styles.css"">
            <title>Turismo.uy - Reserva de Paquetes Turisticos</title>
            <link rel="stylesheet" type="text/css" href="styles.css">
            <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        </head>
        <body>

            <header>
                <div id="logo">
                    <h1>Turismo.uy - Alta de Usuario</h1>
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
                    <a href="index.jsp" src="index.jsp">Volver al inicio</a>
                </div>
            </header>

            <main>
                <script>
                    function mostrarCampos() {
                        var tipoUsuario = document.getElementById("tipoUsuario").value;
                        var camposTurista = document.getElementById("camposTurista");
                        var camposProveedor = document.getElementById("camposProveedor");

                        if (tipoUsuario === "turista") {
                            camposTurista.style.display = "block";
                            camposProveedor.style.display = "none";
                        } else if (tipoUsuario === "proveedor") {
                            camposTurista.style.display = "none";
                            camposProveedor.style.display = "block";
                        }

                        // Cambiar el valor del atributo action del formulario
                        var formulario = document.getElementById("formularioRegistro");
                        if (tipoUsuario === "turista") {
                            formulario.action = "SvTurista";
                        } else if (tipoUsuario === "proveedor") {
                            formulario.action = "SvProveedor"; // Cambia "SvProveedor" al servlet correspondiente para proveedores
                        }
                    }

                    // Esta funciï¿½n se ejecutarï¿½ cuando se cargue la pï¿½gina
                    window.onload = function () {
                        // Llamamos a mostrarCampos() para asegurarnos de que el formulario tenga la acciï¿½n correcta al cargar la pï¿½gina
                        mostrarCampos();
                    };
                </script>


                <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
                <% if (errorMessage != null) {%>
                <div class="error-message">
                    <%= errorMessage%>
                </div>
                <% }%>

                <form id="formularioRegistro" action=SvTurista method="post" enctype="multipart/form-data">
                    <label for="nickname">Nickname:</label>
                    <input placeholder="JuanitoKpo777" type="text" id="nickname" name="nickname" required>
                    <span class="red-text accent-4" id="resultNickname"></span>

                    <label for="nombre">Nombre:</label>
                    <input placeholder="Juan" type="text" id="nombre" name="nombre" required>

                    <label for="apellido">Apellido:</label>
                    <input placeholder="Sito" type="text" id="apellido" name="apellido" required>

                    <label for="contrasenia">Contrasenia:</label>
                    <input type="password" id="contrasenia" name="contrasenia" required>

                    <label for="confirmacion">Confirmar Contrasenia:</label>
                    <input type="password" id="confirmacion" name="confirmacion" required>
                    
                    <div id="mensaje-validacion"></div>
                    
                    <label for="correo">Correo Electrónico:</label>
                    <input placeholder="juanitopotter777@sucio.com" type="email" id="correo" name="correo" required>
                    <span class="red-text accent-4" id="resultCorreo"></span>

                    <label for="fechaNacimiento">Fecha de Nacimiento:</label>
                    <input type="date" id="fechaNacimiento" name="fechaNacimiento" required>

                    <label for="imagen">Imagen (opcional):</label>
                    <input type="file" name="file" id="file">

                    <label for="tipoUsuario">Tipo de Usuario:</label>

                    <select id="tipoUsuario" name="tipoUsuario" required onchange="mostrarCampos()">
                        <option value="turista">Turista</option>
                        <option value="proveedor">Proveedor</option>
                    </select>

                    <!-- Turista -->
                    <div id="camposTurista" style="display:none;">
                        <label for="nacionalidad">Nacionalidad:</label>
                        <input placeholder="Chile" type="text" id="nacionalidad" name="nacionalidad">
                    </div>

                    <!-- Proveedor -->
                    <div id="camposProveedor" style="display:none;">
                        <label for="descripcion">Descripcion general:</label>
                        <textarea placeholder="Escribe aquï¿½ tu descripciï¿½n..." id="descripcion" name="descripcion" rows="4"></textarea>

                        <label for="sitioWeb">Link a Sitio Web:</label>
                        <input type="url" id="sitioWeb" name="sitioWeb">
                    </div>

                    <button type="submit">Registrar</button>
                </form>
            </main>

            <footer>
                <p>Creado por Juan Martin Pilon - Carlos Santana - Natalia Lopez - Santiago Badiola</p>
                <p>&copy; 2023 Turismo.uy</p>
            </footer>


        </body>

        <script>
            $(document).ready(function () {
                $('#nickname').on('input', function () {
                    var nickname = $('#nickname').val();
                    $.ajax({
                        type: 'POST',
                        data: {nickname: nickname},
                        url: 'SvValidarNickname',
                        success: function (resultNickname) {
                            $('#resultNickname').html(resultNickname);
                        }

                    });

                });

            });

            $(document).ready(function () {
                $('#correo').on('input', function () {
                    var correo = $('#correo').val();
                    $.ajax({
                        type: 'POST',
                        data: {correo: correo},
                        url: 'SvValidarCorreo',
                        success: function (resultCorreo) {
                            $('#resultCorreo').html(resultCorreo);
                        }

                    });

                });

            });

 document.addEventListener('DOMContentLoaded', function () {
    var contrasenia = document.getElementById('contrasenia');
    var confirmacion = document.getElementById('confirmacion');
    var mensajeValidacion = document.getElementById('mensaje-validacion');

    contrasenia.addEventListener('input', validarContrasenias);
    confirmacion.addEventListener('input', validarContrasenias);

    function validarContrasenias() {
      var contraseniaValor = contrasenia.value;
      var confirmacionValor = confirmacion.value;

      if (contraseniaValor === confirmacionValor) {
        mensajeValidacion.textContent = 'Las contraseñas coinciden.';
        mensajeValidacion.style.color = 'green';
      } else {
        mensajeValidacion.textContent = 'Las contraseñas no coinciden.';
        mensajeValidacion.style.color = 'red';
      }
    }
  });

        </script>        


    </html>
