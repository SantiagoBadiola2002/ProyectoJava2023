package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.exceptions.PaqueteSinActividad;
import logica.exceptions.PaqueteYaComprado;
import persistencia.exceptions.CorreoElectronicoExistenteException;
import persistencia.exceptions.NicknameExistenteException;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author natil
 */
public class DatosDePrueba {

    private IControlador control;

    public DatosDePrueba() {
    }

    ;    

    public void cargarDatosDePrueba() {
        //Usuarios y Proveedores:
        Fabrica fabrica = Fabrica.getInstance();
        IControlador control = fabrica.getIControlador();
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

        try {
            control.AltaDeUsuarioTurista("lachiqui", "Rosa Marıa", "Martınez", "contra", "mirtha.legrand.ok@hotmail.com.ar", fecha.parse("23/2/1927"), "argentina");
            control.AltaDeUsuarioTurista("isabelita", "Elizabeth", "Windsor", "contra", "isabelita@thecrown.co.uk", fecha.parse("21/04/1926"), "inglesa");
            control.AltaDeUsuarioTurista("anibal", "Anıbal", "Lecter", "contra", "anibal@fing.edu.uy", fecha.parse("31/12/1937"), "lituana");
            control.AltaDeUsuarioTurista("waston", "Emma", "Waston", "contra", "e.waston@gmail.com", fecha.parse("15/4/1990"), "inglesa");
            control.AltaDeUsuarioTurista("elelvis", "Elvis", "Lacio", "contra", "suavemente@hotmail.com", fecha.parse("30/07/1971"), "estadounidense");
            control.AltaDeUsuarioTurista("eleven11", "Eleven", "Once", "contra", "eleven11@gmail.com", fecha.parse("19/02/2004"), "espanola");
            control.AltaDeUsuarioTurista("bobesponja", "Bob", "Esponja", "contra", "bobesponja@nickelodeon.com", fecha.parse("01/05/1999"), "japonesa");
            control.AltaDeUsuarioTurista("tony", "Antonio", "Pacheco", "contra", "eltony@manya.org.uy", fecha.parse("11/04/1976"), "uruguaya");
            control.AltaDeUsuarioTurista("chino", "Alvaro", "Recoba", "contra", "chino@trico.org.uy", fecha.parse("17/03/1976"), "uruguaya");
            control.AltaDeUsuarioTurista("mastropiero", "Johann Sebastian", "Mastropiero", "contra", "johann.sebastian@gmail.com", fecha.parse("07/02/1922"), "austrıaca");
            control.AltaDeUsuarioProveedor("washington", "Washington", "Rocha", "contra", "washington@turismorocha.gub.uy", fecha.parse("14/09/1970"), "Hola! me llamo Washington y soy el encargado del portal de turismo del departamento de Rocha - Uruguay", "http://turismorocha.gub.uy/");
            control.AltaDeUsuarioProveedor("eldiez", "Pablo", "Bengoechea", "contra", "eldiez@socfomturriv.org.uy", fecha.parse("27/06/1965"), "Pablo es el presidente de la Sociedad de Fomento Turıstico de Rivera (conocida como Socfomturriv)", "http://wwww.socfomturriv.org.uy");
            control.AltaDeUsuarioProveedor("meche", "Mercedes", "Venn", "contra", "meche@colonia.gub.uy", fecha.parse("31/12/1990"), "Departamento de Turismo del Departamento de Colonia", "https://colonia.gub.uy/turismo/");

            control.marcarUsuarioComoFavorita("lachiqui", "isabelita");
            control.marcarUsuarioComoFavorita("lachiqui", "mastropiero");
            control.marcarUsuarioComoFavorita("lachiqui", "washington");
            control.marcarUsuarioComoFavorita("lachiqui", "eldiez");
            control.marcarUsuarioComoFavorita("lachiqui", "meche");

            control.marcarUsuarioComoFavorita("isabelita", "lachiqui");

            control.marcarUsuarioComoFavorita("anibal", "waston");
            control.marcarUsuarioComoFavorita("anibal", "eleven11");
            control.marcarUsuarioComoFavorita("anibal", "bobesponja");
            control.marcarUsuarioComoFavorita("anibal", "meche");

            control.marcarUsuarioComoFavorita("waston", "isabelita");
            control.marcarUsuarioComoFavorita("waston", "washington");

            control.marcarUsuarioComoFavorita("elelvis", "bobesponja");
            control.marcarUsuarioComoFavorita("elelvis", "tony");
            control.marcarUsuarioComoFavorita("elelvis", "washington");

            control.marcarUsuarioComoFavorita("eleven11", "lachiqui");
            control.marcarUsuarioComoFavorita("eleven11", "waston");
            control.marcarUsuarioComoFavorita("eleven11", "mastropiero");

            control.marcarUsuarioComoFavorita("bobesponja", "anibal");
            control.marcarUsuarioComoFavorita("bobesponja", "eleven11");

            control.marcarUsuarioComoFavorita("chino", "elelvis");
            control.marcarUsuarioComoFavorita("chino", "mastropiero");
            control.marcarUsuarioComoFavorita("chino", "washington");
            control.marcarUsuarioComoFavorita("chino", "meche");

            control.marcarUsuarioComoFavorita("tony", "chino");
            control.marcarUsuarioComoFavorita("tony", "eldiez");

            control.marcarUsuarioComoFavorita("washington", "waston");
            control.marcarUsuarioComoFavorita("washington", "mastropiero");

            control.marcarUsuarioComoFavorita("eldiez", "tony");

            control.marcarUsuarioComoFavorita("meche", "waston");
            control.marcarUsuarioComoFavorita("meche", "lachiqui");
            control.marcarUsuarioComoFavorita("meche", "isabelita");
            control.marcarUsuarioComoFavorita("meche", "eleven11");

            control.AltaDeImagenPerfil("2e3s66tw.jpeg", "lachiqui");
            control.AltaDeImagenPerfil("ycy8mbrn.png", "isabelita");
            control.AltaDeImagenPerfil("y2u3tybh.png", "anibal");
            control.AltaDeImagenPerfil("2p9ed8et.jpg", "waston");
            control.AltaDeImagenPerfil("mtwppxxz.jpeg", "elelvis");
            control.AltaDeImagenPerfil("3ztpasya.jpg", "eleven11");
            control.AltaDeImagenPerfil("43zymcch.jpg", "bobesponja");
            control.AltaDeImagenPerfil("mr3a38w4.jpg", "tony");
            control.AltaDeImagenPerfil("2b556k7t.jpg", "chino");
            control.AltaDeImagenPerfil("3mbeyawm.png", "mastropiero");
            control.AltaDeImagenPerfil("3whe8372.jpg", "washington");
            control.AltaDeImagenPerfil("mu4jeas3.jpeg", "eldiez");
            control.AltaDeImagenPerfil("4hs4v9c5.jpeg", "meche");

        } catch (ParseException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CorreoElectronicoExistenteException ex) {
            JOptionPane.showMessageDialog(null, "El correo ya está en uso por otro usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NicknameExistenteException ex) {
            JOptionPane.showMessageDialog(null, "El nickname ya está en uso por otro usuario", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (PreexistingEntityException ex) {
            // Manejo de la excepción PreexistingEntityException
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        //Departamentos
        try {
            control.AltaDeDepartamento("Canelones", "Division Turismo de la Intendencia", "https://www.imcanelones.gub.uy/es");
            control.AltaDeDepartamento("Maldonado", "Division Turismo de la Intendencia", "https://www.maldonado.gub.uy/");
            control.AltaDeDepartamento("Rocha", "La Organizacion de Gestion del Destino (OGD) Rocha es un ambito de articulacion publico – privada en el sector turıstico que integran la Corporacion Rochense de Turismo y la Intendencia de Rocha a traves de su Direccion de Turismo.", "www.turismorocha.gub.uy");
            control.AltaDeDepartamento("Treinta y Tres", "Division Turismo de la Intendencia", "https://treintaytres.gub.uy/");
            control.AltaDeDepartamento("Cerro Largo", "Division Turismo de la Intendencia", "https://www.gub.uy/intendenciacerro-largo/");
            control.AltaDeDepartamento("Rivera", "Promociona e implementa proyectos e iniciativas sostenibles de interes turıstico con la participaci´on institucional publica – privada en bien del desarrollo socioecon´omico de la comunidad.", "www.rivera.gub.uy/social/turismo/");
            control.AltaDeDepartamento("Artigas", "Division Turismo de la Intendencia", "http://www.artigas.gub.uy");
            control.AltaDeDepartamento("Salto", "Division Turismo de la Intendencia", "https://www.salto.gub.uy");
            control.AltaDeDepartamento("Paysandu", "Division Turismo de la Intendencia", "https://www.paysandu.gub.uy");
            control.AltaDeDepartamento("Rıo Negro", "Division Turismo de la Intendencia", "https://www.rionegro.gub.uy");
            control.AltaDeDepartamento("Soriano", "Division Turismo de la Intendencia", "https://www.soriano.gub.uy");
            control.AltaDeDepartamento("Colonia", "La propuesta del Departamento de Colonia divide en cuatro actos su espectaculo anual. Cada acto tiene su magia. Desde su naturaleza y playas hasta sus tradiciones y el patrimonio mundial. Todo el a˜no se disfruta.", "https://colonia.gub.uy/turismo/");
            control.AltaDeDepartamento("San Jose", "Division Turismo de la Intendencia", "https://sanjose.gub.uy");
            control.AltaDeDepartamento("Flores", "Division Turismo de la Intendencia", "https://flores.gub.uy");
            control.AltaDeDepartamento("Florida", "Division Turismo de la Intendencia", "http://www.florida.gub.uy");
            control.AltaDeDepartamento("Lavalleja", "Division Turismo de la Intendencia", "http://www.lavalleja.gub.uy");
            control.AltaDeDepartamento("Durazno", "Division Turismo de la Intendencia", "https://durazno.uy");
            control.AltaDeDepartamento("Tacuarembo", "Division Turismo de la Intendencia", "https://tacuarembo.gub.uy");
            control.AltaDeDepartamento("Montevideo", "Division Turismo de la Intendencia", "https://montevideo.gub.uy/areastematicas/turismo");
        } catch (Exception ex) {
            try {
                throw new Exception("Ha ocurrido un error");
            } catch (Exception ex1) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        try {
            //Categorias
            control.AltaCategoria("Aventura y Deporte");
            control.AltaCategoria("Campo y Naturaleza");
            control.AltaCategoria("Cultura y Patrimonio");
            control.AltaCategoria("Gastronomia");
            control.AltaCategoria("Turismo Playas");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar Categoria: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        //Actividades Turisticas y Salidas Turisticas
        try {

            ArrayList<String> lcat1 = new ArrayList();
            lcat1.add("Gastronomia");

            ArrayList<String> lcat2 = new ArrayList();
            lcat2.add("Cultura y Patrimonio");
            lcat2.add("Gastronomia");

            ArrayList<String> lcat3 = new ArrayList();
            lcat3.add("Cultura y Patrimonio");

            ArrayList<String> lcat4 = new ArrayList();
            lcat4.add("Gastronomia");

            ArrayList<String> lcat5 = new ArrayList();
            lcat5.add("Campo y Naturaleza");
            lcat5.add("Gastronomia");

            ArrayList<String> lcat6 = new ArrayList();
            lcat6.add("Campo y Naturaleza");

            ArrayList<String> lcat7 = new ArrayList();
            lcat7.add("Cultura y Patrimonio");

            ArrayList<String> lcat8 = new ArrayList();
            lcat8.add("Cultura y Patrimonio");

            ArrayList<String> lcat9 = new ArrayList();
            lcat9.add("Aventura y Deporte");
            lcat9.add("Turismo Playas");

            ArrayList<String> lcat10 = new ArrayList();
            lcat10.add("Cultura y Patrimonio");

            control.guardarActividad("Degusta", "Festival gastronomico de productos locales en Rocha", 3, 800, "Rocha", fecha.parse("20/7/2022"), "washington", "Rocha", lcat1);
            control.cambiarEstadoActividad("Degusta", TipoEstado.confirmada);
            control.guardarActividad("Teatro con Sabores", "En el mes aniversario del Club Deportivo Uni´on de Rocha te invitamos a una merienda deliciosa.", 3, 500, "Rocha", fecha.parse("21/7/2022"), "washington", "Rocha", lcat2);
            control.cambiarEstadoActividad("Teatro con Sabores", TipoEstado.confirmada);
            control.guardarActividad("Tour por Colonia del Sacramento", "Con guia especializado y en varios idiomas. Varios circuitos posibles.", 2, 400, "Colonia del Sacramento Colonia", fecha.parse("1/8/2022"), "meche", "Colonia", lcat3);
            control.cambiarEstadoActividad("Tour por Colonia del Sacramento", TipoEstado.confirmada);
            control.guardarActividad("Almuerzo en el Real de San Carlos", "Restaurante en la renovada Plaza de Toros con menu internacional", 2, 800, "Colonia del Sacramento", fecha.parse("1/8/2022"), "meche", "Colonia", lcat4);
            control.cambiarEstadoActividad("Almuerzo en el Real de San Carlos", TipoEstado.confirmada);
            control.guardarActividad("Almuerzo en Valle del Lunarejo", "Almuerzo en la Posada con ticket fijo. Menu que incluye bebida y postre casero.", 2, 300, "Tranqueras", fecha.parse("1/8/2022"), "eldiez", "Rivera", lcat5);
            control.cambiarEstadoActividad("Almuerzo en Valle del Lunarejo", TipoEstado.confirmada);
            control.guardarActividad("Cabalgata en Valle del Lunarejo", "Cabalgata por el ´area protegida. Varios recorridos para elegir.", 2, 150, "Tranqueras", fecha.parse("1/8/2022"), "eldiez", "Rivera", lcat6);
            control.cambiarEstadoActividad("Cabalgata en Valle del Lunarejo", TipoEstado.confirmada);

            //estado agregado
            control.guardarActividad("Bus turıstico Colonia", "Recorrida por los principales atractivos de la ciudad", 3, 600, "Colonia del Sacramento", fecha.parse("1/9/2022"), "meche", "Colonia", lcat7);

            control.guardarActividad("Colonia Premium Tour", "Visita lugares exclusivos y relevantes", 4, 2600, "Colonia del Sacramento", fecha.parse("3/9/2022"), "meche", "Colonia", lcat8);
            control.cambiarEstadoActividad("Colonia Premium Tour", TipoEstado.rechazada);

            //estado agregado
            control.guardarActividad("Deportes nauticos sin uso de motor", "kitsurf - windsurf - kayakismo - canotaje en Rocha", 3, 1200, "Rocha", fecha.parse("3/9/2022"), "washington", "Rocha", lcat9);

            control.guardarActividad("Descubre Rivera", "Rivera es un departamento de extraordinaria riqueza natural patrimonial y cultural con una ubicacion geografica privilegiada", 2, 650, "Rivera", fecha.parse("16/9/2022"), "eldiez", "Rivera", lcat10);
            control.cambiarEstadoActividad("Descubre Rivera", TipoEstado.rechazada);
       
            control.marcarActividadComoFavorita("lachiqui", "Degusta");
            control.marcarActividadComoFavorita("lachiqui", "Tour por Colonia del Sacramento");
            control.marcarActividadComoFavorita("isabelita", "Tour por Colonia del Sacramento");
            control.marcarActividadComoFavorita("isabelita", "Almuerzo en el Real de San Carlos");
            control.marcarActividadComoFavorita("anibal", "Almuerzo en el Real de San Carlos");
            control.marcarActividadComoFavorita("anibal", "Almuerzo en Valle del Lunarejo");
            control.marcarActividadComoFavorita("anibal", "Cabalgata en Valle del Lunarejo");
            control.marcarActividadComoFavorita("waston", "Degusta");
            control.marcarActividadComoFavorita("waston", "Teatro con Sabores");
            control.marcarActividadComoFavorita("waston", "Tour por Colonia del Sacramento");
            control.marcarActividadComoFavorita("waston", "Almuerzo en el Real de San Carlos");
            control.marcarActividadComoFavorita("elelvis", "Cabalgata en Valle del Lunarejo");
            control.marcarActividadComoFavorita("eleven11", "Degusta");
            control.marcarActividadComoFavorita("eleven11", "Teatro con Sabores");
            control.marcarActividadComoFavorita("bobesponja", "Tour por Colonia del Sacramento");
            control.marcarActividadComoFavorita("bobesponja", "Almuerzo en el Real de San Carlos");
            control.marcarActividadComoFavorita("tony", "Teatro con Sabores");
            
            
            
            
            control.AltaDeImagenActividad("bdehz9bb.jpg", "Degusta", "https://www.youtube.com/embed/dV3nhvjDSaw?si=IYxfsSVtShOBdrpD&amp;controls=0");
            control.AltaDeImagenActividad("58fnr5j7.jpg", "Teatro con Sabores", "https://www.youtube.com/embed/dV3nhvjDSaw?si=IYxfsSVtShOBdrpD&amp;controls=0");
            control.AltaDeImagenActividad("3rp2vvjf.jpg", "Tour por Colonia del Sacramento", "https://www.youtube.com/embed/JmMf48DWO4w?si=8qiwAkOrHOV8zEEC&amp;controls=0");
            control.AltaDeImagenActividad("2yeu66vb.jpg", "Almuerzo en el Real de San Carlos", "https://www.youtube.com/embed/JmMf48DWO4w?si=8qiwAkOrHOV8zEEC&amp;controls=0");
            control.AltaDeImagenActividad("4yrs8y2c.jpg", "Almuerzo en Valle del Lunarejo", "https://www.youtube.com/embed/dlUb22YfXDg?si=Zc0ZeCds1EZenY_0&amp;controls=0");
            control.AltaDeImagenActividad("2vjd382t.jpg", "Cabalgata en Valle del Lunarejo", "https://www.youtube.com/embed/dlUb22YfXDg?si=Zc0ZeCds1EZenY_0&amp;controls=0");
            control.AltaDeImagenActividad("bdzyrm93.jpg", "Bus turıstico Colonia", "https://www.youtube.com/embed/JmMf48DWO4w?si=8qiwAkOrHOV8zEEC&amp;controls=0");
            control.AltaDeImagenActividad("284kr973.jpg", "Colonia Premium Tour", "https://www.youtube.com/embed/JmMf48DWO4w?si=8qiwAkOrHOV8zEEC&amp;controls=0");
            control.AltaDeImagenActividad("yck2a92h.jpg", "Deportes nauticos sin uso de motor", "https://www.youtube.com/embed/dV3nhvjDSaw?si=IYxfsSVtShOBdrpD&amp;controls=0");
            control.AltaDeImagenActividad("y4vbc4xc.jpeg", "Descubre Rivera", "https://www.youtube.com/embed/dlUb22YfXDg?si=Zc0ZeCds1EZenY_0&amp;controls=0");
        } catch (PreexistingEntityException ex) {
            JOptionPane.showMessageDialog(null, "El nombre ya está en uso por otra actividad", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar Actividad: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        SimpleDateFormat fechahora = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            control.AltaSalidaTuristica("Degusta Agosto", 20, fecha.parse("21/07/2022"), fechahora.parse("20/08/2022 17:00"), "Sociedad Agropecuaria de Rocha", "Degusta");
            control.AltaSalidaTuristica("Degusta Setiembre", 20, fecha.parse("22/07/2022"), fechahora.parse("03/09/2022 17:00"), "Sociedad Agropecuaria de Rocha", "Degusta");
            control.AltaSalidaTuristica("Teatro con Sabores 1", 30, fecha.parse("23/07/2022"), fechahora.parse("04/09/2022 18:00"), "Club Deportivo Union", "Teatro con Sabores");
            control.AltaSalidaTuristica("Teatro con Sabores 2", 30, fecha.parse("23/07/2022"), fechahora.parse("11/09/2022 18:00"), "Club Deportivo Union", "Teatro con Sabores");
            control.AltaSalidaTuristica("Tour Colonia del Sacramento 11-09", 5, fecha.parse("05/08/2022"), fechahora.parse("11/09/2022 10:00"), "Encuentro en la base del Faro", "Tour por Colonia del Sacramento");
            control.AltaSalidaTuristica("Tour Colonia del Sacramento 18-09", 5, fecha.parse("05/08/2022"), fechahora.parse("18/09/2022 10:00"), "Encuentro en la base del Faro", "Tour por Colonia del Sacramento");
            control.AltaSalidaTuristica("Almuerzo 1", 5, fecha.parse("04/08/2022"), fechahora.parse("18/09/2022 12:00"), "Restaurante de la Plaza de Toros", "Almuerzo en el Real de San Carlos");
            control.AltaSalidaTuristica("Almuerzo 2", 5, fecha.parse("04/08/2022"), fechahora.parse("25/09/2022 12:00"), "Restaurante de la Plaza de Toros", "Almuerzo en el Real de San Carlos");
            control.AltaSalidaTuristica("Almuerzo 3", 4, fecha.parse("15/08/2022"), fechahora.parse("10/09/2022 12:00"), "Posada Del Lunarejo", "Almuerzo en Valle del Lunarejo");
            control.AltaSalidaTuristica("Almuerzo 4", 4, fecha.parse("15/08/2022"), fechahora.parse("11/09/2022 12:00"), "Posada Del Lunarejo", "Almuerzo en Valle del Lunarejo");
            control.AltaSalidaTuristica("Cabalgata 1", 4, fecha.parse("15/08/2022"), fechahora.parse("10/09/2022 16:00"), "Posada del Lunarejo", "Cabalgata en Valle del Lunarejo");
            control.AltaSalidaTuristica("Cabalgata 2", 4, fecha.parse("15/08/2022"), fechahora.parse("11/09/2022 16:00"), "Posada del Lunarejo", "Cabalgata en Valle del Lunarejo");
            control.AltaSalidaTuristica("Degusta Octubre", 20, fecha.parse("22/09/2022"), fechahora.parse("30/10/2022 17:00"), "Sociedad Agropecuaria de Rocha", "Degusta");
            control.AltaSalidaTuristica("Degusta Noviembre", 20, fecha.parse("02/10/2022"), fechahora.parse("05/11/2022 17:00"), "Sociedad Agropecuaria de Rocha", "Degusta");
            control.AltaSalidaTuristica("Teatro con Sabores 3", 30, fecha.parse("25/08/2022"), fechahora.parse("11/11/2022 18:00"), "Club Deportivo Union", "Teatro con Sabores");
            control.AltaSalidaTuristica("Tour Colonia del Sacramento 30-10", 10, fecha.parse("07/09/2022"), fechahora.parse("30/10/2022 10:00"), "Encuentro en la base del Faro", "Tour por Colonia del Sacramento");
            control.AltaSalidaTuristica("Cabalgata Extrema", 4, fecha.parse("15/09/2022"), fechahora.parse("30/10/2022 16:00"), "Posada del Lunarejo", "Cabalgata en Valle del Lunarejo");
            control.AltaSalidaTuristica("Almuerzo en el Real 1", 10, fecha.parse("10/10/2022"), fechahora.parse("30/10/2022 12:00"), "Restaurante de la Plaza de Toros", "Almuerzo en el Real de San Carlos");
            
            control.AltaSalidaTuristica("Degusta Diciembre", 20, fecha.parse("07/11/2022"), fechahora.parse("02/12/2022 17:00"), "Sociedad Agropecuaria de Rocha", "Degusta");
            control.AltaSalidaTuristica("Teatro con Sabores 4", 30, fecha.parse("07/11/2022"), fechahora.parse("03/12/2022 18:30"), "Club Deportivo Union", "Teatro con Sabores");
            
            
            control.AltaDeImagenActividad("4jwed4jx.jpg", "Degusta Agosto", "");
            control.AltaDeImagenActividad("2maxmx6c.jpeg", "Degusta Setiembre", "");
            control.AltaDeImagenActividad("2zturssk.jpg", "Teatro con Sabores 1", "");
            control.AltaDeImagenActividad("5d5vm953.jpg", "Teatro con Sabores 2", "");
            control.AltaDeImagenActividad("5n7ud8e7.jpg", "Tour Colonia del Sacramento 11-09", "");
            control.AltaDeImagenActividad("583b3mbs.jpg", "Tour Colonia del Sacramento 18-09", "");
            control.AltaDeImagenActividad("mryhyr5f.jpg", "Degusta Octubre", "");
            control.AltaDeImagenActividad("yzz6b7et.jpeg", "Degusta Noviembre", "");
            control.AltaDeImagenActividad("mv7etjx2.jpg", "Tour Colonia del Sacramento 30-10", "");
            control.AltaDeImagenActividad("3vwzthcr.jpg", "Cabalgata Extrema", "");
            control.AltaDeImagenActividad("sinImagen.png", "Almuerzo 1", "");
            control.AltaDeImagenActividad("sinImagen.png", "Almuerzo 2", "");
            control.AltaDeImagenActividad("sinImagen.png", "Almuerzo 3", "");
            control.AltaDeImagenActividad("sinImagen.png", "Almuerzo 4", "");
            control.AltaDeImagenActividad("2p9he77w.jpg", "Cabalgata 1", "");
            control.AltaDeImagenActividad("sinImagen.png", "Cabalgata 2", "");
            control.AltaDeImagenActividad("sinImagen.png", "Teatro con Sabores 3", "");
            control.AltaDeImagenActividad("sinImagen.png", "Almuerzo en el Real 1", "");
            
            control.AltaDeImagenActividad("sinImagen.png", "Degusta Diciembre", "");
            control.AltaDeImagenActividad("yzz6b7et.jpeg", "Teatro con Sabores 4", "");

        } catch (PreexistingEntityException ex) {
            JOptionPane.showMessageDialog(null, "El nombre ya está en uso por otra salida", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar Salida Turistica: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        //crear paquetes
        try {
            control.crearPaqueteActividadTuristica("Disfrutar Rocha", "Actividades para hacer en familia y disfrutar arte y gastronomıa", 60, fecha.parse("10/08/2022"), 20);
            control.crearPaqueteActividadTuristica("Un dıa en Colonia", "Paseos por el casco historico y se puede terminar con Almuerzo en la Plaza de Toros", 45, fecha.parse("01/08/2022"), 15);
            control.crearPaqueteActividadTuristica("Valle Del Lunarejo", "Visite un area protegida con un paisaje natural hermoso", 60, fecha.parse("15/09/2022"), 15);
            control.crearPaqueteActividadTuristica("Rocha de Fiesta", "Para cerrar el anio a lo grande en nuestro departamento mas oceanico", 45, fecha.parse("7/11/2022"), 30);
        
        
        } catch (PreexistingEntityException ex) {
            JOptionPane.showMessageDialog(null, "El nombre ya está en uso por otro paquete", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear paquete." + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        //asignar Actividad turistica a paquete
        try {
            control.asignarActividadPaquete("Disfrutar Rocha", "Degusta");
            control.asignarActividadPaquete("Disfrutar Rocha", "Teatro con Sabores");
            control.asignarActividadPaquete("Un dıa en Colonia", "Tour por Colonia del Sacramento");
            control.asignarActividadPaquete("Un dıa en Colonia", "Almuerzo en el Real de San Carlos");
            control.asignarActividadPaquete("Valle Del Lunarejo", "Almuerzo en Valle del Lunarejo");
            control.asignarActividadPaquete("Valle Del Lunarejo", "Cabalgata en Valle del Lunarejo");
            control.asignarActividadPaquete("Rocha de Fiesta", "Degusta");
            
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "El paquete con ese nombre no existe", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al asignar actividad al paquete. " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        //compra
        try {

            control.CompraDePaquete("lachiqui", "Disfrutar Rocha", 2, fecha.parse("15/8/2022"));
            control.CompraDePaquete("lachiqui", "Un dıa en Colonia", 5, fecha.parse("20/8/2022"));
            control.CompraDePaquete("waston", "Un dıa en Colonia", 1, fecha.parse("15/9/2022"));
            control.CompraDePaquete("elelvis", "Disfrutar Rocha", 10, fecha.parse("1/9/2022"));
            control.CompraDePaquete("elelvis", "Un dıa en Colonia", 2, fecha.parse("18/9/2022"));
            control.CompraDePaquete("mastropiero", "Un dıa en Colonia", 6, fecha.parse("2/9/2022"));

        } catch (ParseException | PaqueteSinActividad | PaqueteYaComprado e) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, e);
        }

        //inscripcion
        try {

            control.InscripcionASalidaTuristica("Degusta Agosto", "lachiqui", 3, 2400, fecha.parse("15/8/2022"), TipoPago.general);
            control.InscripcionASalidaTuristica("Degusta Agosto", "elelvis", 5, 4000, fecha.parse("16/8/2022"), TipoPago.general);
            control.InscripcionASalidaTuristica("Tour Colonia del Sacramento 18-09", "lachiqui", 3, 1200, fecha.parse("18/8/2022"), TipoPago.general);
            control.InscripcionASalidaTuristica("Tour Colonia del Sacramento 18-09", "isabelita", 1, 400, fecha.parse("19/8/2022"), TipoPago.general);
            control.InscripcionASalidaTuristica("Almuerzo 2", "mastropiero", 2, 1600, fecha.parse("19/8/2022"), TipoPago.general);
            control.InscripcionASalidaTuristica("Teatro con Sabores 1", "chino", 1, 500, fecha.parse("19/8/2022"), TipoPago.general);
            control.InscripcionASalidaTuristica("Teatro con Sabores 2", "chino", 10, 5000, fecha.parse("20/8/2022"), TipoPago.general);
            control.InscripcionASalidaTuristica("Teatro con Sabores 2", "bobesponja", 2, 1000, fecha.parse("20/8/2022"), TipoPago.general);
            control.InscripcionASalidaTuristica("Teatro con Sabores 2", "anibal", 1, 500, fecha.parse("21/8/2022"), TipoPago.general);
            control.InscripcionASalidaTuristica("Degusta Setiembre", "tony", 11, 8800, fecha.parse("21/8/2022"), TipoPago.general);
            
            control.InscripcionASalidaTuristica("Degusta Noviembre", "lachiqui", 2, 1280, fecha.parse("03/10/2022"), TipoPago.paquete);
            control.InscripcionASalidaTuristica("Teatro con Sabores 3", "lachiqui", 2, 800, fecha.parse("03/10/2022"), TipoPago.paquete);
            control.InscripcionASalidaTuristica("Teatro con Sabores 3", "lachiqui", 2, 800, fecha.parse("03/10/2022"), TipoPago.paquete);
            control.InscripcionASalidaTuristica("Degusta Setiembre", "elelvis", 5, 3200, fecha.parse("02/09/2022"), TipoPago.paquete);
            control.InscripcionASalidaTuristica("Teatro con Sabores 1", "elelvis", 5, 2000, fecha.parse("02/09/2022"), TipoPago.paquete);
            control.InscripcionASalidaTuristica("Tour Colonia del Sacramento 11-09", "lachiqui", 5, 1700, fecha.parse("03/09/2022"), TipoPago.paquete);
            control.InscripcionASalidaTuristica("Almuerzo 1", "lachiqui", 5, 4000, fecha.parse("03/09/2022"), TipoPago.general);
            
            control.InscripcionASalidaTuristica("Tour Colonia del Sacramento 18-09", "waston", 1, 340, fecha.parse("05/09/2022"), TipoPago.paquete);
            
            control.InscripcionASalidaTuristica("Almuerzo 2", "waston", 1, 800, fecha.parse("05/09/2022"), TipoPago.general);
            
            control.InscripcionASalidaTuristica("Tour Colonia del Sacramento 30-10", "elelvis", 2, 680, fecha.parse("02/10/2022"), TipoPago.paquete);
            
            control.InscripcionASalidaTuristica("Almuerzo en el Real 1", "elelvis", 2, 1600, fecha.parse("11/10/2022"), TipoPago.general);
        
            control.InscripcionASalidaTuristica("Tour Colonia del Sacramento 30-10", "mastropiero", 4, 1360, fecha.parse("12/10/2022"), TipoPago.paquete);
        
            control.InscripcionASalidaTuristica("Almuerzo en el Real 1", "mastropiero", 4, 3200, fecha.parse("12/10/2022"), TipoPago.general);
            
        } catch (ParseException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}//fin
