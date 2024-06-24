package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import logica.exceptions.ConstraseniasDistintas;
import logica.exceptions.ImagenPorNicknameNoExite;
import logica.exceptions.NoExisteCompra;
import logica.exceptions.PaqueteSinActividad;
import logica.exceptions.PaqueteYaComprado;
import persistencia.exceptions.CorreoElectronicoExistenteException;
import persistencia.exceptions.NicknameExistenteException;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

public interface IControlador {

    public abstract DTImagenActividad buscarImagenPorActividad(String nombreActividad);

    public abstract void ModificarImagenPerfil(String imagenNombre, String nicknameUsuario) throws PreexistingEntityException;

    public abstract void AltaDeImagenPerfil(String imagenNombre, String nicknameUsuario) throws PreexistingEntityException;

    public abstract DTImagenPerfil buscarImagenPorNickname(String nickname) throws ImagenPorNicknameNoExite;

    public abstract void AltaDeImagenActividad(String imagenNombre, String nombreActividad, String UrlVideo) throws PreexistingEntityException;

    public abstract void AltaDeUsuarioTurista(String nickname, String nombre, String apellido, String contrasenia, String correo, Date fNacimiento, String nacionalidad) throws NicknameExistenteException, PreexistingEntityException, CorreoElectronicoExistenteException;

    public abstract void AltaDeUsuarioProveedor(String nickname, String nombre, String apellido, String contrasenia, String correo, Date fNacimiento, String descripcion, String link) throws NicknameExistenteException, PreexistingEntityException, CorreoElectronicoExistenteException;

    public abstract void AltaCategoria(String nombre) throws PreexistingEntityException, Exception;

    public abstract Usuario ConsultaDeUsuario(String nickname); //Devuelve el usuario 

    public abstract ArrayList<String> listaUsuarios();  //devuelve una lista de todos los usuarios sin discriminar su tipo LISTO

    public abstract ArrayList listaProveedores(); //devuelve una lista de todos los proveedores

    public abstract ArrayList listaDepartamentos(); //devuelve una lista de todos los departamentos

    public abstract ArrayList listaDeptos();//lista que contiene solo los nombres de los departamentos

    public abstract List listaPaquetes();

    public abstract ArrayList listaActividades();

    public abstract void ModificarDatosDeUsuarioProveedor(String nickname, String nombre, String apellido, String correo, Date fecha, String descripcion, String url);

    public abstract void ModificarDatosDeUsuarioTurista(String nickname, String nombre, String apellido, String correo, Date fecha, String nacionalidad);//Nati

    public abstract void AltaDeActividadTuristica(String nombre, TipoEstado estado, String descripcion, int duracion, float costo, String ciudad, Date fAlta, ArrayList<SalidaTuristica> listaSalidaTuristica, ArrayList<Paquete> listaPaquete, ArrayList<Categoria> listaCategoria);

    public abstract ArrayList listaActividadesTuristicas(String departamento);

    public abstract ArrayList listaActividadesTuristicasPorCategoria(String categoria);

    public abstract ArrayList<DTSalidaTuristica> encontraSalidasTuristicasDeActividad(String actividadSeleccionado);

    public abstract ArrayList listaSalActividadTuristica(String actividad);

    public abstract List<DTPaquete> traerListaDTPaquetes();

    public abstract DTSalidaTuristica ConsultaSalidaTuristica(String nombreSalida);

    public abstract void crearPaqueteActividadTuristica(String nombreDePaquete, String descripcionDePaquete, int validezDePaquete, Date altaDePaquete, int descuentoDePaquete) throws PreexistingEntityException, Exception;

    public abstract void AltaDeDepartamento(String nombre, String descripcion, String url) throws PreexistingEntityException, Exception;

    public abstract List<String> llenarCmboBoxDep();

    public abstract void AltaSalidaTuristica(String nombre, int cantMax, Date fAlta, Date fSalida, String lugar, String nombreActividad) throws PreexistingEntityException;

    public abstract void guardarActividad(String nombreActividad, String descripcionActividad, int duracionActividad, float costoActividad, String nombreCuidad, Date fecha, String nombreProveedor, String nombreDepartamento, List<String> listaCategorias) throws PreexistingEntityException;

    public ArrayList<DTUsuario> traerUsuarioMod();

    public ArrayList<DTTurista> traerUsuarioTurista();

    public DTTurista traerDTTurista(String nickname);

    public DTProveedor traerDTProveedor(String nickname);

    public abstract void asignarActividadPaquete(String paqueteSeleccionado, String actividadSeleccionada) throws NonexistentEntityException, Exception;
//public abstract List findSalidasTuristicasDepartamento(String departamentoSeleccionado);//trae lista de strings con los nombres de las actividades asociadas a un depto att:carlangas

    public abstract ArrayList<DTActividad> encontraActividadDepartamento(String departamentoSeleccionado);//trae dtactividad asociados a un depto

    public abstract void InscripcionASalidaTuristica(String nombreSalidaSeleccionada, String nicknameTurista, int cantTurista, float costo, Date fecha, TipoPago tipoPago);

    public abstract boolean salidaTuristicaLlena(String salida, int cantAInscribir);

    public abstract boolean turistaYaInscriptoSalidaTuristica(String salida, String turistaAlta);

    public abstract DTSalidaTuristica traerDTSalidaTuristica(String nombreSalida);

    public abstract ArrayList<DTSalidaTuristica> traerInscSalidasDeTurista(String nickname);

    public abstract ArrayList<DTActividad> traerInscActividadesDeTurista(String nickname);

    public abstract ArrayList<String> listaPaquetesDeActividad(String nombreActividad);

    public abstract ArrayList<DTSalidaTuristica> traerSalidasDelProveedor(String nickname);

    public abstract ArrayList<DTActividad> traerActividadesDelProveedor(String nickname);

    public abstract ArrayList<String> traerCategorias();

    public abstract void ValidarContrasenias(String contrasenia, String confirmarContrasenia) throws ConstraseniasDistintas;

    public abstract ArrayList<String> listaActividadesDelPaquete(String nombrePaquete);

    public abstract ArrayList<String> traerCategoriasPaquete(String paquete);

    public abstract DTPaquete traerDTPaquete(String nombrePaquete);

    public abstract DTActividad traerDTActividad(String nombreActividad);

    public abstract String traerDepartamentoSalida(String nombreActividad);

    public abstract ArrayList<String> traerCategoriasActividad(String actividad);

    public abstract void cambiarEstadoActividad(String nombreActividad, TipoEstado tipoEstado);

    public abstract ArrayList<String> listaActividadesPorEstado(TipoEstado estado);

    public abstract void CompraDePaquete(String nickname, String nombrePaquete, int cantTurista, Date fechaCompra) throws PaqueteSinActividad, PaqueteYaComprado;

    public abstract ArrayList<String> listaPaquetesSinCompra();

    public abstract ArrayList<String> listaActividadesTuristicasConfirmadas(String departamentoSeleccionado);

    public abstract ArrayList<DTActividad> listaActividadesProveedorConfirmadas(String nicknameProveedor);

    public abstract ArrayList<DTActividad> listaActividadesProveedorTodas(String nicknameProveedor);

    public abstract ArrayList<String> listaPaquetesComprados(String nicknameTurista);

    public abstract ArrayList<DTActividad> listaActividadesConfirmadasDepartamento(String nombreDepartamento);

    public abstract void cargarDatosDePrueba();

    public abstract DTCategoria traerCategoria(String categoria);

    public abstract DTCompra traerCompraDelTurista(String nombreTurista, String nombrePaquete);

    public void nuevaCantTurista(Long id, int nuevaCantTurista) throws NoExisteCompra;

    public abstract DTImagenActividad traerDTImagenActividad(String nombreActividad);

    public abstract DTUsuario traerDTUsuario(String nickname);//listo

    public abstract String devolverTipoUsuario(String nickname);//listo

    public abstract ArrayList listaDTDepartamentos();

    public abstract ArrayList<DTActividad> listaActividadesConfirmadas();

    public abstract ArrayList<DTPaquete> listaPaquetesCompradosVigentes(String nicknameTurista);

    public abstract ArrayList<String> listaActividadesTuristicasPorCategoriaConfirmadas(String categoria);

    public abstract boolean actividadSinSalidaVigente(String nombreActividad);

    public abstract void marcarActividadComoFavorita(String nicknameUsuario, String nombreActividad);

    public abstract ArrayList<String> traerActividadesFavoritasDelTurista(String nicknameTurista);

    public abstract void DesMarcarActividad(String usuario, String nombreActividad);

    public abstract void marcarUsuarioComoFavorita(String nicknameUsuario, String nicknameUsuarioFavorito); //listo

    public abstract void DesMarcarUsuarioFavorito(String nickname, String nicknameUsuarioFavorito);
//public abstract ArrayList<String> traerUsuariosFavoritosDelUsuario(String nicknameUsuario);

    public abstract void generarPDFInscripcionSalida(String nickname, String nombreSalida);

    public abstract boolean validarNickname(String nickname); //listo

    public abstract boolean validarCorreo(String correo);//listo

    public abstract void subirImagenActividad(byte[] imagen, String nombreArchivo, String actividad, String UrlVideo);

    public abstract byte[] traerImagenActividad(String nombreActividad);

    public abstract void subirImagenPerfil(byte[] imagen, String nombreArchivo, String nickname);

    public abstract byte[] traerImagenPerfil(String nickname);

    public abstract void modificarImagenPerfil(byte[] imagen, String nombreArchivo, String nickname);

    public abstract ArrayList<DTInscripcion> traerDTInscSalidasDeTurista(String nickname);

    public abstract void sumarVisitaActividad(String nombreActividad);

    public abstract void sumarVisitaSalida(String nombreSalida);

    public abstract ArrayList<DTActividad> listaActividadesConVisitas();

    public abstract ArrayList<DTSalidaTuristica> listaSalidasConVisitas();

    public abstract List<Object> obtenerTopNMasVisitadas(ArrayList<DTSalidaTuristica> salidas, ArrayList<DTActividad> actividades);

}
