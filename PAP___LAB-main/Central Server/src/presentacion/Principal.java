package presentacion;

//import logica.Fabrica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import logica.IControlador;

//import logica.IControlador;
//import logica.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author natil
 */
public class Principal extends javax.swing.JFrame {
    private IControlador control;
  
    boolean datosyacargados =false;
    public Principal(IControlador icu ) {
        control = icu;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JDesktopPane();
        ImageIcon icon = new ImageIcon(getClass().getResource("/presentacion/mano.png"));
        Image image =icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

        };
        barraMenuPrincipal = new javax.swing.JMenuBar();
        menuAltas = new javax.swing.JMenu();
        Usuario = new javax.swing.JMenu();
        altaUsuarioTurista = new javax.swing.JMenuItem();
        altaUsuarioProveedor = new javax.swing.JMenuItem();
        altaActividadTuristica = new javax.swing.JMenuItem();
        altaSalidaTuristica = new javax.swing.JMenuItem();
        altaInscripcionSalidaTuristica = new javax.swing.JMenuItem();
        altaCrearPaquete = new javax.swing.JMenuItem();
        altaAgregarActividadPaquete = new javax.swing.JMenuItem();
        altaDepartamento = new javax.swing.JMenuItem();
        altaCategoria = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        consUsuario = new javax.swing.JMenuItem();
        consActividadTuristica = new javax.swing.JMenuItem();
        consSalidaTuristica = new javax.swing.JMenuItem();
        consPaquete = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenu();
        modUsuario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        cargarDatos = new javax.swing.JMenu();
        mitemDatosPrueba = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" turismo.uy Grupo 4");

        contenedorPrincipal.setName(""); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 873, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        contenedorPrincipal.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        menuAltas.setText("Altas");

        Usuario.setText("Usuario");

        altaUsuarioTurista.setText("Turista");
        altaUsuarioTurista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaUsuarioTuristaActionPerformed(evt);
            }
        });
        Usuario.add(altaUsuarioTurista);

        altaUsuarioProveedor.setText("Proveedor");
        altaUsuarioProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaUsuarioProveedorActionPerformed(evt);
            }
        });
        Usuario.add(altaUsuarioProveedor);

        menuAltas.add(Usuario);

        altaActividadTuristica.setText("Actividad Turistica");
        altaActividadTuristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActividadTuristicaActionPerformed(evt);
            }
        });
        menuAltas.add(altaActividadTuristica);

        altaSalidaTuristica.setText("Salida Turistica");
        altaSalidaTuristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaSalidaTuristicaActionPerformed(evt);
            }
        });
        menuAltas.add(altaSalidaTuristica);

        altaInscripcionSalidaTuristica.setText("Inscripcion Salida Turistica");
        altaInscripcionSalidaTuristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaInscripcionSalidaTuristicaActionPerformed(evt);
            }
        });
        menuAltas.add(altaInscripcionSalidaTuristica);

        altaCrearPaquete.setText("Crear Paquete");
        altaCrearPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaCrearPaqueteActionPerformed(evt);
            }
        });
        menuAltas.add(altaCrearPaquete);

        altaAgregarActividadPaquete.setText("Agregar Actividad Paquete");
        altaAgregarActividadPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaAgregarActividadPaqueteActionPerformed(evt);
            }
        });
        menuAltas.add(altaAgregarActividadPaquete);

        altaDepartamento.setText("Departamento");
        altaDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaDepartamentoActionPerformed(evt);
            }
        });
        menuAltas.add(altaDepartamento);

        altaCategoria.setText("Categoria");
        altaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaCategoriaActionPerformed(evt);
            }
        });
        menuAltas.add(altaCategoria);

        barraMenuPrincipal.add(menuAltas);

        menuConsultas.setText("Consultas");
        menuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasActionPerformed(evt);
            }
        });

        consUsuario.setText("Usuario");
        consUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consUsuarioActionPerformed(evt);
            }
        });
        menuConsultas.add(consUsuario);

        consActividadTuristica.setText("Actividad Turistica");
        consActividadTuristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consActividadTuristicaActionPerformed(evt);
            }
        });
        menuConsultas.add(consActividadTuristica);

        consSalidaTuristica.setText("Salida Tursitica");
        consSalidaTuristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consSalidaTuristicaActionPerformed(evt);
            }
        });
        menuConsultas.add(consSalidaTuristica);

        consPaquete.setText("Paquete");
        consPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consPaqueteActionPerformed(evt);
            }
        });
        menuConsultas.add(consPaquete);

        jMenuItem2.setText("Ver Top 10 Actividades y Salidas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuConsultas.add(jMenuItem2);

        barraMenuPrincipal.add(menuConsultas);

        menuModificar.setText("Modificar");

        modUsuario.setText("Usuario");
        modUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modUsuarioActionPerformed(evt);
            }
        });
        menuModificar.add(modUsuario);

        jMenuItem1.setText("Aceptar/Rechazar Actividad Turistica");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuModificar.add(jMenuItem1);

        barraMenuPrincipal.add(menuModificar);

        cargarDatos.setText("Cargar Datos");

        mitemDatosPrueba.setText("Datos de prueba");
        mitemDatosPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemDatosPruebaActionPerformed(evt);
            }
        });
        cargarDatos.add(mitemDatosPrueba);

        barraMenuPrincipal.add(cargarDatos);

        setJMenuBar(barraMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaDepartamentoActionPerformed
        AltaDepartamento verAltaDepartamento = new AltaDepartamento(control);
        contenedorPrincipal.add(verAltaDepartamento);
        verAltaDepartamento.show();
    }//GEN-LAST:event_altaDepartamentoActionPerformed

    private void altaAgregarActividadPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaAgregarActividadPaqueteActionPerformed
        AgregarActividadTuristicaPaquete verAgregarActividadPaquete = new AgregarActividadTuristicaPaquete(control);
        contenedorPrincipal.add(verAgregarActividadPaquete);
        verAgregarActividadPaquete.show();
    }//GEN-LAST:event_altaAgregarActividadPaqueteActionPerformed

    private void altaCrearPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaCrearPaqueteActionPerformed
        CrearPaqueteActividadTuristica verCrearPaquete = new CrearPaqueteActividadTuristica(control);
        contenedorPrincipal.add(verCrearPaquete);
        verCrearPaquete.show();
    }//GEN-LAST:event_altaCrearPaqueteActionPerformed

    private void altaActividadTuristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActividadTuristicaActionPerformed
        AltaActividadTuristica verAltaActividadTuristica = new AltaActividadTuristica(control);
        contenedorPrincipal.add(verAltaActividadTuristica);
        verAltaActividadTuristica.show();
    }//GEN-LAST:event_altaActividadTuristicaActionPerformed

    private void altaUsuarioProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaUsuarioProveedorActionPerformed
        AltaUsuarioProveedor verAltaUsuarioProveedor = new AltaUsuarioProveedor(control);
        contenedorPrincipal.add(verAltaUsuarioProveedor);
        verAltaUsuarioProveedor.show();
    }//GEN-LAST:event_altaUsuarioProveedorActionPerformed

    private void altaUsuarioTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaUsuarioTuristaActionPerformed
        AltaUsuarioTurista verAltaUsuarioTurista = new AltaUsuarioTurista(control);
        contenedorPrincipal.add(verAltaUsuarioTurista);
        verAltaUsuarioTurista.show();
    }//GEN-LAST:event_altaUsuarioTuristaActionPerformed

    private void consPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consPaqueteActionPerformed
        ConsultaPaqueteActividadesTuristicas verConsultaPaquete = new ConsultaPaqueteActividadesTuristicas(control);
        contenedorPrincipal.add(verConsultaPaquete);
        verConsultaPaquete.show();
    }//GEN-LAST:event_consPaqueteActionPerformed

    private void consActividadTuristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consActividadTuristicaActionPerformed
        ConsultaActividadTuristica verConsultaActividadTuristica = new ConsultaActividadTuristica(control);
        contenedorPrincipal.add(verConsultaActividadTuristica);
        verConsultaActividadTuristica.show();
    }//GEN-LAST:event_consActividadTuristicaActionPerformed

    private void consUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consUsuarioActionPerformed
        // TODO add your handling code here:
        ConsultaDeUsuarios verConsultaUsuarios = new ConsultaDeUsuarios(control);
        contenedorPrincipal.add(verConsultaUsuarios);
        verConsultaUsuarios.show();
    }//GEN-LAST:event_consUsuarioActionPerformed

    private void consSalidaTuristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consSalidaTuristicaActionPerformed
        // TODO add your handling code here:
        ConsultaDeSalidaTuristica verSalidaConsTuristica = new ConsultaDeSalidaTuristica(control);
        contenedorPrincipal.add(verSalidaConsTuristica);
        verSalidaConsTuristica.show();
    }//GEN-LAST:event_consSalidaTuristicaActionPerformed

    private void altaSalidaTuristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaSalidaTuristicaActionPerformed
        ListaActividadPorDepto verAltaSalidaTuristica = new ListaActividadPorDepto(control);
        contenedorPrincipal.add(verAltaSalidaTuristica);
        verAltaSalidaTuristica.show();
    }//GEN-LAST:event_altaSalidaTuristicaActionPerformed

    private void modUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modUsuarioActionPerformed
        ListaUsuarios verListaUsuarios = new ListaUsuarios(control);
        contenedorPrincipal.add(verListaUsuarios);
        verListaUsuarios.show();
    }//GEN-LAST:event_modUsuarioActionPerformed

    private void altaInscripcionSalidaTuristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaInscripcionSalidaTuristicaActionPerformed
        // TODO add your handling code here:
        InscripcionASalidaTuristica verIns = new InscripcionASalidaTuristica(control);
        contenedorPrincipal.add(verIns);
        verIns.show();
    }//GEN-LAST:event_altaInscripcionSalidaTuristicaActionPerformed

    private void mitemDatosPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemDatosPruebaActionPerformed
     
        if (!datosyacargados){
            control.cargarDatosDePrueba();
            datosyacargados=true;
            mostrsarMensaje("Datos de prueba cargados correctamente", "Info", "Carga exitosa");
        }else{
            mostrsarMensaje("Los datos de prueba ya fueron cargados", "Error", "Datos de prueba ya cargados");
        }
     
    }//GEN-LAST:event_mitemDatosPruebaActionPerformed

    private void altaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaCategoriaActionPerformed
           
        AltaCategoria verAltaCategoria = new AltaCategoria(control);
        contenedorPrincipal.add(verAltaCategoria);
        verAltaCategoria.show();
    }//GEN-LAST:event_altaCategoriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AceptarRechazarActividadTuristica verAceptarRechazarActividadTuristica = new AceptarRechazarActividadTuristica(control);
        contenedorPrincipal.add(verAceptarRechazarActividadTuristica);
        verAceptarRechazarActividadTuristica.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasActionPerformed
        
    }//GEN-LAST:event_menuConsultasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VerTopDiez verTopDiez = new VerTopDiez(control);
        contenedorPrincipal.add(verTopDiez);
        verTopDiez.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

       public JDesktopPane obtenerJDesktopPane() {
      //  System.out.print("funcion obtener");
    return contenedorPrincipal;
}
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Usuario;
    private javax.swing.JMenuItem altaActividadTuristica;
    private javax.swing.JMenuItem altaAgregarActividadPaquete;
    private javax.swing.JMenuItem altaCategoria;
    private javax.swing.JMenuItem altaCrearPaquete;
    private javax.swing.JMenuItem altaDepartamento;
    private javax.swing.JMenuItem altaInscripcionSalidaTuristica;
    private javax.swing.JMenuItem altaSalidaTuristica;
    private javax.swing.JMenuItem altaUsuarioProveedor;
    private javax.swing.JMenuItem altaUsuarioTurista;
    private javax.swing.JMenuBar barraMenuPrincipal;
    private javax.swing.JMenu cargarDatos;
    private javax.swing.JMenuItem consActividadTuristica;
    private javax.swing.JMenuItem consPaquete;
    private javax.swing.JMenuItem consSalidaTuristica;
    private javax.swing.JMenuItem consUsuario;
    private javax.swing.JDesktopPane contenedorPrincipal;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuAltas;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuModificar;
    private javax.swing.JMenuItem mitemDatosPrueba;
    private javax.swing.JMenuItem modUsuario;
    // End of variables declaration//GEN-END:variables

public void mostrsarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    
    }


}
