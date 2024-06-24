/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import logica.Controlador;
import logica.IControlador;

/**
 *
 * @author natil
 */
public class AltaActividadTuristica extends javax.swing.JInternalFrame {
    private IControlador control;
    /**
     * Creates new form AltaActividadTuristica
     */
    public AltaActividadTuristica(IControlador icu) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        proveedorActividadTuristica = new javax.swing.JComboBox<>();
        departamentoActividadTuristica = new javax.swing.JComboBox<>();
        nombreActividadTuristica = new javax.swing.JTextField();
        descripcionActividadTuristica = new javax.swing.JTextField();
        duracionActividadTuristica = new javax.swing.JTextField();
        costoActividadTuristica = new javax.swing.JTextField();
        diaAltaActividadTuristica = new javax.swing.JSpinner();
        mesAltaActividadTuristica = new javax.swing.JSpinner();
        anioAltaActividadTuristica = new javax.swing.JSpinner();
        aceptarAltaActividadTuristica = new javax.swing.JButton();
        cancelarAltaActividadTuristica = new javax.swing.JButton();
        ciudadActividadTuristica = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCategorias = new javax.swing.JTable();

        setClosable(true);
        setTitle("Alta de Actividad Turistica");
        setToolTipText("");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Proveedor:");

        jLabel2.setText("Departamento:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Descripcion:");

        jLabel5.setText("Duracion:");

        jLabel6.setText("Costo:");

        jLabel7.setText("Ciudad:");

        jLabel8.setText("Fecha de Alta:");

        proveedorActividadTuristica.setToolTipText("");

        diaAltaActividadTuristica.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        mesAltaActividadTuristica.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        anioAltaActividadTuristica.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2023, 1));

        aceptarAltaActividadTuristica.setText("Aceptar");
        aceptarAltaActividadTuristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAltaActividadTuristicaActionPerformed(evt);
            }
        });

        cancelarAltaActividadTuristica.setText("Limpiar");
        cancelarAltaActividadTuristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAltaActividadTuristicaActionPerformed(evt);
            }
        });

        jLabel9.setText("Elegir Categoria:");

        tablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCategorias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(proveedorActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(departamentoActividadTuristica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(nombreActividadTuristica))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(descripcionActividadTuristica))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(duracionActividadTuristica))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(costoActividadTuristica))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(ciudadActividadTuristica))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancelarAltaActividadTuristica)
                                    .addGap(131, 131, 131)
                                    .addComponent(aceptarAltaActividadTuristica))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(diaAltaActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(mesAltaActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(anioAltaActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(proveedorActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(departamentoActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descripcionActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(duracionActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(costoActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ciudadActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(diaAltaActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesAltaActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioAltaActividadTuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarAltaActividadTuristica)
                    .addComponent(aceptarAltaActividadTuristica))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void aceptarAltaActividadTuristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAltaActividadTuristicaActionPerformed
        try {
            String nombreActividad = nombreActividadTuristica.getText();
            String descripcionActividad = descripcionActividadTuristica.getText();
            String nombreCuidad = (String) ciudadActividadTuristica.getText();
            String nombreProveedor = (String) proveedorActividadTuristica.getSelectedItem();
            String nombreDepartamento = (String) departamentoActividadTuristica.getSelectedItem();

            int duracionActividad = Integer.parseInt(duracionActividadTuristica.getText());

            float costoActividad = Float.parseFloat(costoActividadTuristica.getText());

            int diaA = (int) diaAltaActividadTuristica.getValue();
            int mesA = (int) mesAltaActividadTuristica.getValue();
            int anioA = (int) anioAltaActividadTuristica.getValue();
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, anioA);
            calendar.set(Calendar.MONTH, mesA - 1); // Los meses en Calendar se indexan desde 0 (enero) hasta 11 (diciembre) sasa
            calendar.set(Calendar.DAY_OF_MONTH, diaA);
            Date fecha = calendar.getTime();
            
            //creo lista de categorias seleccionadas por los checkbox
            ArrayList<String> listaCategorias = new ArrayList();
            //columna 1 es las de los checkbox
            for (int i=0; i<tablaCategorias.getRowCount(); i++){
                if (estaSeleccionada(i, 1, tablaCategorias)){
                    listaCategorias.add(tablaCategorias.getValueAt(i,0).toString());
                    //System.out.println(listaCategorias.get(i));
                }
            }
            //si no se seleccionó nada tiro un mensaje
            if (!listaCategorias.isEmpty()){
                control.guardarActividad(nombreActividad, descripcionActividad, duracionActividad, costoActividad, nombreCuidad, fecha, nombreProveedor, nombreDepartamento, listaCategorias);
                JOptionPane.showMessageDialog(null, "Alta realizada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una Categoria", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
            
            

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Duracion y Costo tienen que ser numeros", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "El nombre ya está en uso por otra actividad", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarAltaActividadTuristicaActionPerformed

    private void cancelarAltaActividadTuristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAltaActividadTuristicaActionPerformed
       duracionActividadTuristica.setText("");
       descripcionActividadTuristica.setText("");
       diaAltaActividadTuristica.setValue(1);
       mesAltaActividadTuristica.setValue(1);
       anioAltaActividadTuristica.setValue(1900);
       nombreActividadTuristica.setText("");
       proveedorActividadTuristica.setSelectedIndex(-1);
       departamentoActividadTuristica.setSelectedIndex(-1);
       costoActividadTuristica.setText("");
       ciudadActividadTuristica.setText("");
       departamentoActividadTuristica.setSelectedIndex(-1);
    }//GEN-LAST:event_cancelarAltaActividadTuristicaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        proveedorActividadTuristica.removeAllItems();
        ArrayList<String> nicknames = control.listaProveedores();
        for (int i = 0; i < nicknames.size(); i++) {
            proveedorActividadTuristica.addItem(nicknames.get(i));

        }
        departamentoActividadTuristica.removeAllItems();
        ArrayList<String> nicks = control.listaDeptos();
        for (int i = 0; i < nicks.size(); i++) {
            departamentoActividadTuristica.addItem(nicks.get(i));
        }
        
        cargarTablaCategoria();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarAltaActividadTuristica;
    private javax.swing.JSpinner anioAltaActividadTuristica;
    private javax.swing.JButton cancelarAltaActividadTuristica;
    private javax.swing.JTextField ciudadActividadTuristica;
    private javax.swing.JTextField costoActividadTuristica;
    private javax.swing.JComboBox<String> departamentoActividadTuristica;
    private javax.swing.JTextField descripcionActividadTuristica;
    private javax.swing.JSpinner diaAltaActividadTuristica;
    private javax.swing.JTextField duracionActividadTuristica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner mesAltaActividadTuristica;
    private javax.swing.JTextField nombreActividadTuristica;
    private javax.swing.JComboBox<String> proveedorActividadTuristica;
    private javax.swing.JTable tablaCategorias;
    // End of variables declaration//GEN-END:variables

public void agregarCheckBox(int columna, JTable tabla){
    TableColumn tc = tabla.getColumnModel().getColumn(columna);
    tc.setCellEditor(tabla.getDefaultEditor(Boolean.class));
    tc.setCellRenderer(tabla.getDefaultRenderer(Boolean.class));

}  

public boolean estaSeleccionada(int fila, int columna, JTable tabla){
    return tabla.getValueAt(fila, columna) != null;

}
    
private void cargarTablaCategoria() {
        //definir el modelo
        DefaultTableModel tablaCategoria = new DefaultTableModel(){
            //que filas y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column){
                if (column == 0){
                    return false;
            }else {return true;}
            };
        };
       
        
        //establecemos los nombres de las columnas
        String titulos[] = {"Categoria", "Seleccionar"};
        
        tablaCategoria.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la BD
        ArrayList<String> listaCategorias = control.traerCategorias();
        
        //recorrer la lista y mostrar cada elemento en la tabla
        if (listaCategorias != null){
            for (String c : listaCategorias){
                Object[] objeto = {c};
                tablaCategoria.addRow(objeto);   
  
            }
        }
        
        tablaCategorias.setModel(tablaCategoria);
        
        agregarCheckBox(1, tablaCategorias);
    }





}