package persistencia;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Actividad;
import logica.Categoria;
import logica.Compra;
import logica.DTActividad;
import logica.DTSalidaTuristica;
import logica.DTTurista;
import logica.DTUsuario;
import logica.Departamento;
import logica.Inscripcion;
import logica.Turista;
import logica.Proveedor;
import logica.Usuario;
import logica.ImagenPerfil;
import logica.SalidaTuristica;
import logica.Paquete;
import logica.imagenActividad;
import persistencia.exceptions.CorreoElectronicoExistenteException;
import persistencia.exceptions.NicknameExistenteException;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

public class ControladoraPersistencia {

    //creo las controladoras de persistencia de cada clase
    PaqueteJpaController paqueteJpa = new PaqueteJpaController();
    ActividadJpaController actividadJpa = new ActividadJpaController();
    SalidaTuristicaJpaController salidaTuristicaJpa = new SalidaTuristicaJpaController();
    DepartamentoJpaController departamentoJpa = new DepartamentoJpaController();
    TuristaJpaController turistaJpa = new TuristaJpaController();
    ProveedorJpaController proveedorJpa = new ProveedorJpaController();
    CategoriaJpaController categoriaJpa = new CategoriaJpaController();
    InscripcionJpaController inscripcionJpa = new InscripcionJpaController();
    ImagenPerfilJpaController imagenPerfilJpa = new ImagenPerfilJpaController();
    imagenActividadJpaController imagenActividadJpa = new imagenActividadJpaController();
    CompraJpaController compraJpa = new CompraJpaController();

    //Consultas
    public void editarCompra(Compra compraTurista) throws Exception {


            compraJpa.edit(compraTurista);

        
        

    }

    public Compra traerCompraDelTurista(String nombreTurista, String nombrePaquete) {
        List<Compra> todasLasCompras = compraJpa.findCompraEntities();

        for (Compra compra : todasLasCompras) {
            if (compra.getTurista().getNombre().equals(nombreTurista) && compra.getPaquete().getNombre().equals(nombrePaquete)) {
                return compra; // Encontraste la compra deseada
            }
        }

        // Manejar el caso en que no se encontró ninguna compra
        return null;
    }

    public imagenActividad buscarImagenActividad(String nombreActividad) {
        return imagenActividadJpa.findImagenPerfilByNombreActividad(nombreActividad);
    }

    public SalidaTuristica consultaSalida(String nombreSalida) {
        return salidaTuristicaJpa.findSalidaTuristica(nombreSalida);
    }

    public Actividad consultaActividad(String nombreActividad) {
        return actividadJpa.findActividad(nombreActividad);
    }

    ;
    
    public ArrayList<String> listaSalActividadTuristica(String actividad) {
        ArrayList<String> salidasDeActividad = new ArrayList();
        Actividad a = actividadJpa.findActividad(actividad);

        for (SalidaTuristica st : a.getListaSalidaTuristica()) {
            salidasDeActividad.add(st.getNombre());
        }
        return salidasDeActividad;
    }

    ;
    
    public ArrayList<Departamento> listaDepartamentos() {
        ArrayList<Departamento> departamentos = new ArrayList();
        try {
            List<Departamento> departamento = departamentoJpa.findDepartamentoEntities();
            for (int i = 0; i < departamento.size(); i++) {
                departamentos.add(departamento.get(i));
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departamentos;
    }

    public ArrayList<String> listaDeptos() {
        ArrayList<String> nicks = new ArrayList();

        try {
            List<Departamento> deptos = departamentoJpa.findDepartamentoEntities();
            for (Departamento d : deptos) {
                nicks.add(d.getNombre());
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nicks;
    }
    //////////////////////

    public ArrayList<String> listaActividades() {
        ArrayList<String> nombre = new ArrayList<String>();

        try {
            List<Actividad> actividades = actividadJpa.findActividadEntities();
            for (int i = 0; i < actividades.size(); i++) {
                nombre.add(actividades.get(i).getNombre());
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
    }
    ////////////////////

    public ArrayList<String> listaPaquetes() {
        ArrayList<String> nombrep = new ArrayList<String>();

        try {
            List<Paquete> paquetes = paqueteJpa.findPaqueteEntities();
            for (int i = 0; i < paquetes.size(); i++) {
                nombrep.add(paquetes.get(i).getNombre());
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombrep;
    }
    /////////////////////////

    public ArrayList<String> listaActividadesTuristicas(String nombreDepartamento) {
        ArrayList<String> listaActividadesTuristicas = new ArrayList();
        //List<String> actividad = actividadJpa.findByDepartamento(departamento);
        List<Actividad> listaActividades = actividadJpa.findActividadEntities();

        for (Actividad a : listaActividades) {
            if (a.getDepartamento().getNombre().equals(nombreDepartamento)) {
                listaActividadesTuristicas.add(a.getNombre());
            }
        }
        return listaActividadesTuristicas;
    }

    public Usuario consultaUsuario(String nickname) {
        Usuario usuario = null;
        boolean esProveedor = true;
        try {
            usuario = turistaJpa.findTurista(nickname);
            if (usuario != null) {
                esProveedor = !esProveedor;
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (esProveedor) {
            try {
                usuario = proveedorJpa.findProveedor(nickname);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuario;
    }

    public List<Paquete> consultaPaquete() {
        return paqueteJpa.findPaqueteEntities();
    }

    ;
    public ArrayList<String> listaUsuarios() {
        ArrayList<String> nicknames = new ArrayList<String>();
        try {
            List<Turista> turistas = turistaJpa.findTuristaEntities();
            for (int i = 0; i < turistas.size(); i++) {
                nicknames.add(turistas.get(i).getNickname());
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            List<Proveedor> proveedores = proveedorJpa.findProveedorEntities();
            for (int i = 0; i < proveedores.size(); i++) {
                nicknames.add(proveedores.get(i).getNickname());
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nicknames;
    }
    
        public ArrayList<String> listaUsuariosCorreo() {
        ArrayList<String> correos = new ArrayList<String>();
        try {
            List<Turista> turistas = turistaJpa.findTuristaEntities();
            for (int i = 0; i < turistas.size(); i++) {
                correos.add(turistas.get(i).getCorreo());
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            List<Proveedor> proveedores = proveedorJpa.findProveedorEntities();
            for (int i = 0; i < proveedores.size(); i++) {
                correos.add(proveedores.get(i).getCorreo());
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return correos;
    }

    public ArrayList<String> listaProveedores() {
        ArrayList<String> nicknames = new ArrayList<String>();

        try {
            List<Proveedor> proveedores = proveedorJpa.findProveedorEntities();
            for (int i = 0; i < proveedores.size(); i++) {
                nicknames.add(proveedores.get(i).getNickname());
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nicknames;
    }

    public ArrayList<DTUsuario> traerProveedores() {

        ArrayList<DTUsuario> listaDTUsuario = new ArrayList();
        try {
            List<Proveedor> proveedores = proveedorJpa.findProveedorEntities();
            for (Proveedor p : proveedores) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fnac = sdf.format(p.getfNacimiento());
                DTUsuario dtusuario = new DTUsuario(p.getNickname(), p.getNombre(), p.getApellido(), p.getCorreo(), fnac, p.getContrasenia());
                listaDTUsuario.add(dtusuario);
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDTUsuario;

    }

    public ArrayList<DTUsuario> traerUsuarios() {

        ArrayList<DTUsuario> listaDTUsuario = new ArrayList();

        try {
            List<Turista> turistas = turistaJpa.findTuristaEntities();
            for (Turista t : turistas) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fnac = sdf.format(t.getfNacimiento());
                DTUsuario dtusuario = new DTUsuario(t.getNickname(), t.getNombre(), t.getApellido(), t.getCorreo(), fnac, t.getContrasenia());
                listaDTUsuario.add(dtusuario);
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            List<Proveedor> proveedores = proveedorJpa.findProveedorEntities();
            for (Proveedor p : proveedores) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fnac = sdf.format(p.getfNacimiento());
                DTUsuario dtusuario = new DTUsuario(p.getNickname(), p.getNombre(), p.getApellido(), p.getCorreo(), fnac, p.getContrasenia());
                listaDTUsuario.add(dtusuario);
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDTUsuario;

    }

 



//Guardar Departamento
    public void guardarDepartamento(Departamento depto) throws PreexistingEntityException, Exception {
        try {
            //crear Departamento en BD
            departamentoJpa.create(depto);
        } catch (PreexistingEntityException ex) {
            throw new PreexistingEntityException("Nombre ya esta en uso por otro departamento");
        }
    }

    public void guardarActividad(Actividad actividad) throws PreexistingEntityException {
        try {
            actividadJpa.create(actividad);
        } catch (PreexistingEntityException ex) {
            throw new PreexistingEntityException("Nickname ya en uso por un usuario");
        }
    }

    //public void guardarActividad(string nombreProveedor,string nombreDep,string nombreActividad,string descripcionActividad,string duracionActividad,string costoActividad,string nombreCuidad,int dia,int mes,int anio);
    public void guardarTurista(Turista turista) throws NicknameExistenteException, PreexistingEntityException, CorreoElectronicoExistenteException{
        try {
            turistaJpa.create(turista);
        } catch (NicknameExistenteException ex) {
            throw new NicknameExistenteException("Nickname ya en uso por un usuario");
        } catch (CorreoElectronicoExistenteException e) {
            throw new CorreoElectronicoExistenteException("Correo electrónico ya en uso por un usuario ");
        }
    }

    public void guardarProveedor(Proveedor proveedor) throws NicknameExistenteException, PreexistingEntityException, CorreoElectronicoExistenteException {

        try {
            proveedorJpa.create(proveedor);
        } catch (NicknameExistenteException ex) {
            throw new NicknameExistenteException("Nickname ya en uso por un usuario");
        } catch (CorreoElectronicoExistenteException e) {
            throw new CorreoElectronicoExistenteException("Correo electrónico ya en uso por un usuario ");
        }

    }

    public void guardarInscripcion(Inscripcion insc) {
        try {
            insc.setTurista(turistaJpa.findTurista(insc.getTurista().getNickname()));
            insc.setSalida(salidaTuristicaJpa.findSalidaTuristica(insc.getSalida().getNombre()));
            inscripcionJpa.create(insc);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<String> llenarCmboBoxDepPersis() {
        return departamentoJpa.obtenerNombresDepartamentos();
    }

    public void guardarSalidaTuristica(SalidaTuristica salidaTuristica, Actividad actividad) throws PreexistingEntityException {
        try {
            salidaTuristicaJpa.create(salidaTuristica);
            actividadJpa.edit(actividad);
        } catch (PreexistingEntityException e) {
            throw new PreexistingEntityException("Ya existe una salida con ese nombre");
        }catch (Exception e) {
            throw new PreexistingEntityException("Ya existe una salida con ese nombre de exception");
        }
    }

    public void guardarPaqueteActividadTuristica(Paquete paquete) throws PreexistingEntityException, Exception {
        try {
            paqueteJpa.create(paquete);
        } catch (PreexistingEntityException ex) {
            throw new PreexistingEntityException("Nombre ya esta en uso por otro paquete");
        }
    }

    public Turista traerTurista(String nickname) {
        return turistaJpa.findTurista(nickname);
    }

    public Proveedor traerProveedor(String nickname) {
        return proveedorJpa.findProveedor(nickname);
    }

    public Departamento traerDepartamento(String nickname) {
        return departamentoJpa.findDepartamento(nickname);
    }

    public void modificarProveedor(Proveedor p) {
        try {
            proveedorJpa.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarTurista(Turista t) {
        try {
            turistaJpa.edit(t);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarImagenPerfil(ImagenPerfil imagenPerfil) throws PreexistingEntityException {
        try {
            imagenPerfilJpa.edit(imagenPerfil);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public List<String> findSalidasTuristicasDepartamentoPersis(String departamentoSeleccionado) {
//        return actividadJpa.findByDepartamento(departamentoSeleccionado);
//    }

    public ArrayList<DTActividad> encontraActividadDepartamentoPersis(String departamentoSeleccionado) {

        ArrayList<DTActividad> listaDTActividad = new ArrayList();

        try {
            List<Actividad> actividades = actividadJpa.findActividadEntities();
            for (Actividad a : actividades) {
                if (a.getDepartamento().getNombre().equals(departamentoSeleccionado)) {
                    DTActividad dtactividad = new DTActividad(a.getNombre(), a.getDescripcion(), a.getDuracion(),
                            a.getCosto(), a.getCiudad(), a.getfAlta(), a.getEstado(), a.getDepartamento().getNombre(), a.getProveedor().getNickname());
                    listaDTActividad.add(dtactividad);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDTActividad;

    }

    public void asignarActividadPaquetePersis(String paqueteSeleccionado, String actividadSeleccionada) throws NonexistentEntityException, Exception {
        Paquete paquete = paqueteJpa.findPaquete(paqueteSeleccionado);
        Actividad actividad = actividadJpa.findActividad(actividadSeleccionada);

        paquete.getListaActividades().add(actividad);
        try {
            paqueteJpa.edit(paquete);

        } catch (NonexistentEntityException ex) {
            throw new NonexistentEntityException("El paquete con ese nombre no existe");
        }
    }

    public ArrayList<Turista> listaTuristas() {
        ArrayList<Turista> turista = new ArrayList();
        try {
            List<Turista> turistas = turistaJpa.findTuristaEntities();
            for (Turista t : turistas) {
                turista.add(t);
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return turista;
    }

    public ArrayList<DTTurista> traerUsuariosTurista() {
        ArrayList<DTTurista> listaDTTurista = new ArrayList();

        try {
            List<Turista> turistas = turistaJpa.findTuristaEntities();
            for (Turista t : turistas) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fnac = sdf.format(t.getfNacimiento());
                DTTurista dtTurista = new DTTurista(t.getNickname(), t.getNombre(), t.getApellido(), t.getCorreo(), fnac, t.getContrasenia(), t.getNacionalidad());
                listaDTTurista.add(dtTurista);
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDTTurista;
    }

    //Me devuelve una lista de inscripciones que tiene una Salida Turistica con nombre nombreSalidaTuristica
    public ArrayList<Inscripcion> listarInscripcionesDeSalidaTuristica(String nombreSalidaTuristica) {

        List<Inscripcion> listaInscripciones = inscripcionJpa.findInscripcionEntities();
        ArrayList<Inscripcion> listarInscripcionesDeSalidaTuristica = new ArrayList();

        if (listaInscripciones != null) {
            for (Inscripcion insc : listaInscripciones) {
                if (insc.getSalida().getNombre().equals(nombreSalidaTuristica)) {
                    listarInscripcionesDeSalidaTuristica.add(insc);
                }
            }
        }//else {listaInscripciones = null;}    

        return listarInscripcionesDeSalidaTuristica;
    }

    public ArrayList<DTSalidaTuristica> encontraSalidasTuristicasDeActividadPersis(String actividadSeleccionado) {

        ArrayList<DTSalidaTuristica> listaDTSalidaTuristica = new ArrayList();
        Actividad a = actividadJpa.findActividad(actividadSeleccionado);

        for (SalidaTuristica sT : a.getListaSalidaTuristica()) {

            DTSalidaTuristica dtSalida = new DTSalidaTuristica(sT.getNombre(), sT.getCantMax(), sT.getfAlta(), sT.getfSalida(), sT.getLugar(), sT.getActividad().getNombre());
            listaDTSalidaTuristica.add(dtSalida);

        }

        return listaDTSalidaTuristica;
    }

    public Paquete traerPaquete(String nombrePaquete) {
        return paqueteJpa.findPaquete(nombrePaquete);
    }

    public List<SalidaTuristica> traerSalidasTuristicas() {
        return salidaTuristicaJpa.findSalidaTuristicaEntities();
    }

    public List<Actividad> traerActividades() {
        return actividadJpa.findActividadEntities();
    }

    public void guardarImagenPerfil(ImagenPerfil imagenPerfil) throws PreexistingEntityException {
        try {
            imagenPerfilJpa.create(imagenPerfil);
        } catch (PreexistingEntityException e) {
            throw new PreexistingEntityException("Nombre de la imagen ya en uso por otro usuario");
        }

    }

    public void guardarImagenActividad(imagenActividad imagenActividad) throws PreexistingEntityException {
        try {
            imagenActividadJpa.create(imagenActividad);
        } catch (PreexistingEntityException e) {
            throw new PreexistingEntityException("Nombre de la imagen ya en uso por otra actividad");
        }

    }

    public ImagenPerfil buscarImagen(String nickname) {
        return imagenPerfilJpa.findImagenPerfilByNickname(nickname);
    }

    public void guardarCategoria(Categoria cat) throws PreexistingEntityException, Exception {
        try {
            //crear Departamento en BD
            categoriaJpa.create(cat);
        } catch (PreexistingEntityException ex) {
            throw new PreexistingEntityException("Nombre ya esta en uso por otra categoria");
        }

    }

    public ArrayList<String> traerCategoria() {
        ArrayList<String> listaCategorias = new ArrayList<String>();
        try {
            List<Categoria> categorias = categoriaJpa.findCategoriaEntities();
            for (Categoria c : categorias) {
                listaCategorias.add(c.getNombre());
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaCategorias;
    }

    public Categoria traerCategoria(String nombre) {
        return categoriaJpa.findCategoria(nombre);
    }

    public void asignarCategoriaActividad(String nombre, String nombreActividad) {
        Categoria categoria = categoriaJpa.findCategoria(nombre);
        Actividad actividad = actividadJpa.findActividad(nombreActividad);

        //categoria.getListaActividad().add(actividad);
        actividad.getListaCategoria().add(categoria);

        try {
            actividadJpa.edit(actividad);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificarActividad(Actividad a) {
        try {
            actividadJpa.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void modificarSalida(SalidaTuristica s) {
        try {
            salidaTuristicaJpa.edit(s);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Departamento> traerDepartamentos() {
        return departamentoJpa.findDepartamentoEntities();
    }

    public void guardarCompra(Compra c) {
        compraJpa.create(c);
    }

    public List<Compra> listarCompras() {
        return compraJpa.findCompraEntities();
    }

    public ArrayList<String> listaActividadesTuristicasPorCategoria(String categoria) {
        ArrayList<String> listaActividadesTuristicas = new ArrayList();
        List<Actividad> listaActividades = actividadJpa.findActividadEntities();

        for (Actividad actividad : listaActividades) {
            List<Categoria> categorias = actividad.getListaCategoria();

            for (Categoria cat : categorias) {
                if (cat.getNombre().equals(categoria)) {
                    listaActividadesTuristicas.add(actividad.getNombre());
                    break;
                }
            }
        }
        return listaActividadesTuristicas;
    }
    
    public void marcarActividadComoFavorita(Turista turista) throws Exception{   
        turistaJpa.edit(turista);
    }
    
    public void DesMarcarActividad(Turista turista) throws Exception{   
        turistaJpa.edit(turista);
    }
    
    public void marcarUsuarioComoFavorito(Usuario usuario) throws Exception{
        Usuario usuario2 = usuario;
        List<String> listaUsuariosFavoritos = usuario.getListaUsuariosFavoritas();
        
       if(usuario instanceof Turista ){
           Turista turista = turistaJpa.findTurista(usuario.getNickname());
           turista.setListaUsuariosFavoritas((usuario.getListaUsuariosFavoritas()));
           turistaJpa.edit(turista);
       } else {
           Proveedor proveedor = proveedorJpa.findProveedor(usuario.getNickname());
           proveedor.setListaUsuariosFavoritas(usuario.getListaUsuariosFavoritas());
           proveedorJpa.edit(proveedor);
       }
    }
    
//    public void DesmarcarUsuarioComoFavorito(Usuario usuario){
//        Usuario usuario2 = usuario;
//        List<String> listaUsuariosFavoritos = usuario.getListaUsuariosFavoritas();
//        
//       if(usuario instanceof Turista ){
//           Turista turista = turistaJpa.findTurista(usuario.getNickname());
//           turista.setListaUsuariosFavoritas((usuario.getListaUsuariosFavoritas()));
//           turistaJpa.edit(turista);
//       } else {
//           Proveedor proveedor = proveedorJpa.findProveedor(usuario.getNickname());
//           proveedor.setListaUsuariosFavoritas(usuario.getListaUsuariosFavoritas());
//           proveedorJpa.edit(proveedor);
//       }
//    }

    public Compra traerCompra(Long id) {
        return compraJpa.findCompra(id);
    }


}//fin
