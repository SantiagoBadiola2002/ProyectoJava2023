package Servlets;


import WebServices.DtUsuario;
import WebServices.ListaString;

import WebServices.WebServices;
import WebServices.WebServicesService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

//    Fabrica fabrica = Fabrica.getInstance();
//    IControlador control = fabrica.getIControlador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
// este doget de usuarios solo devuelve una lista de string de los usuarios concatenados

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //llamado a wsdl
        WebServicesService service = new WebServicesService();
        WebServices port = service.getWebServicesPort();
        List<String> listaUsuarios = port.listaUsuarios().getLista();

        int startIndex = Integer.parseInt(request.getParameter("startIndex"));
        int endIndex = Math.min(startIndex + 40, listaUsuarios.size()); // Envía 40 usuarios a la vez
        String usuariosSubset = String.join(",", listaUsuarios.subList(startIndex, endIndex));
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(usuariosSubset);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuarioConsultado = request.getParameter("nickname");
        String usuario = request.getParameter("usuario");
        String marcarUsuario = request.getParameter("marcarUsuario"); //MARCAR ACTIVIDAD COMO FAVORITA
        String DesmarcarUsuario = request.getParameter("DesmarcarUsuario");
        //llamado a wsdl
        WebServicesService service = new WebServicesService();
        WebServices port = service.getWebServicesPort();

        if (marcarUsuario == null) {
            marcarUsuario = "NULL";
        }
        if (DesmarcarUsuario == null) {
            DesmarcarUsuario = "NULL";
        }

        if (marcarUsuario.equals("marcarUsuario")) {

            port.marcarUsuarioComoFavorita(usuario, usuarioConsultado);
            //control.marcarUsuarioComoFavorita(usuario, usuarioConsultado);

            DtUsuario restUsu = port.traerDTUsuario(usuario);
            //DTUsuario restUsu = control.traerDTUsuario(usuario);

            request.getSession().setAttribute("usu", restUsu);
            String errorMessage = "Usuario agregado como favorito";
            String alertScript = "<script type='text/javascript'>alert('" + errorMessage + "'); window.location.href = 'perfilUsuario.jsp';</script>";
            response.getWriter().write(alertScript);
        }
        if (DesmarcarUsuario.equals("DesmarcarUsuario")) {

            port.desMarcarUsuarioFavorito(usuario, usuarioConsultado);
            DtUsuario restUsu = port.traerDTUsuario(usuario);
            request.getSession().setAttribute("usu", restUsu);
            String errorMessage = "Usuario eliminado como favorito";
            String alertScript = "<script type='text/javascript'>alert('" + errorMessage + "'); window.location.href = 'perfilUsuario.jsp';</script>";
            response.getWriter().write(alertScript);

        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
