package trabajon5.Jframe.Directorio;

import javax.swing.table.DefaultTableModel;
import trabajon5.Ciudad;
import static trabajon5.Jframe.Cliente.AgregarCliente.cmbCiudad;
import trabajon5.Jframe.NewJFrame;
import trabajon5.Persona;

public class BuscarClientePorCiudad extends javax.swing.JInternalFrame {

    public BuscarClientePorCiudad() {
        initComponents();
        llenarCiudades();
    }
    private void llenarCiudades() {
    Cb_Ciudades.removeAllItems(); 

    for (Ciudad ciudad : NewJFrame.ciudades) {
        Cb_Ciudades.addItem(ciudad.getNombre());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_BCDDPC = new javax.swing.JTable();
        BCDDPC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Cb_Ciudades = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        Tabla_BCDDPC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Direccion", "Ciudad", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(Tabla_BCDDPC);

        BCDDPC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BCDDPC.setText("Buscar Clientes de Directorio por Ciudad");

        jLabel1.setText("Ciudades:");

        Cb_Ciudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Cb_Ciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_CiudadesActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 109, Short.MAX_VALUE))
                            .addComponent(Cb_Ciudades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BCDDPC)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(BCDDPC)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cb_Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cb_CiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_CiudadesActionPerformed
         String ciudadSeleccionada = (String) Cb_Ciudades.getSelectedItem();

  
    if (ciudadSeleccionada == null) {
        return;
    }


    String[] columnas = {"DNI", "Apellido", "Nombre", "Direccion", "Ciudad", "Telefono"};
    DefaultTableModel modeloFiltrado = new DefaultTableModel(columnas, 0);


    for (Persona persona : NewJFrame.Personas.values()) {
        if (persona.getCiudad().equals(ciudadSeleccionada)) {
            Object[] fila = new Object[6];
            fila[0] = persona.getDni();
            fila[1] = persona.getApellido();
            fila[2] = persona.getNombre();
            fila[3] = persona.getDomicilio();
            fila[4] = persona.getCiudad();
            fila[5] = persona.getNumCelu();
            modeloFiltrado.addRow(fila);
        }
    }


    Tabla_BCDDPC.setModel(modeloFiltrado);

    }//GEN-LAST:event_Cb_CiudadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BCDDPC;
    private javax.swing.JComboBox<String> Cb_Ciudades;
    private javax.swing.JTable Tabla_BCDDPC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
