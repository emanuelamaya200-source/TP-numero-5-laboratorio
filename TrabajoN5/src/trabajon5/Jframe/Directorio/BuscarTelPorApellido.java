

package trabajon5.Jframe.Directorio;

import javax.swing.table.DefaultTableModel;
import trabajon5.Persona;
import trabajon5.Jframe.NewJFrame;


public class BuscarTelPorApellido extends javax.swing.JInternalFrame {

    public BuscarTelPorApellido() {
        initComponents();
        rellenarListaClientes();
    }
    public void rellenarListaClientes() {

    listaApellidos.setText("");
    

    for (Persona persona : NewJFrame.Personas.values()) {
        listaApellidos.append(persona.getApellido()+ "\n");
    }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabel_Apellido = new javax.swing.JLabel();
        BuscarApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_BTPA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotonSalir_BTPA = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaApellidos = new javax.swing.JTextArea();

        JLabel_Apellido.setText("Apellido:");

        BuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarApellidoActionPerformed(evt);
            }
        });
        BuscarApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarApellidoKeyReleased(evt);
            }
        });

        Tabla_BTPA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Direccion", "Ciudad", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_BTPA);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Buscar Teléfono Por Apellido");

        BotonSalir_BTPA.setText("Salir");
        BotonSalir_BTPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalir_BTPAActionPerformed(evt);
            }
        });

        listaApellidos.setColumns(20);
        listaApellidos.setRows(5);
        jScrollPane3.setViewportView(listaApellidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonSalir_BTPA)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabel_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonSalir_BTPA)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarApellidoActionPerformed


    }//GEN-LAST:event_BuscarApellidoActionPerformed

    private void BotonSalir_BTPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalir_BTPAActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalir_BTPAActionPerformed

    private void BuscarApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarApellidoKeyReleased
        buscarPorApellido(null);
    }//GEN-LAST:event_BuscarApellidoKeyReleased
  private void buscarPorApellido(java.awt.event.ActionEvent evt) { 
  
   String textoBusqueda = BuscarApellido.getText().trim();

 
    listaApellidos.setText(""); 
    if (textoBusqueda.isEmpty()) {
        rellenarListaClientes(); 
    } else {

        for (Persona persona : NewJFrame.Personas.values()) {
            if (persona.getApellido().toLowerCase().startsWith(textoBusqueda.toLowerCase())) {
                listaApellidos.append(persona.getApellido() + "\n");
            }
        }
    }

    // 2. Lógica para filtrar la JTable
    String[] columnas = {"DNI", "Apellido", "Nombre", "Direccion", "Ciudad", "Telefono"};
    DefaultTableModel modeloFiltrado = new DefaultTableModel(columnas, 0);

    for (Persona persona : NewJFrame.Personas.values()) {
        if (persona.getApellido().toLowerCase().startsWith(textoBusqueda.toLowerCase())) {
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
    Tabla_BTPA.setModel(modeloFiltrado);

  }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir_BTPA;
    private javax.swing.JTextField BuscarApellido;
    private javax.swing.JLabel JLabel_Apellido;
    private javax.swing.JTable Tabla_BTPA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea listaApellidos;
    // End of variables declaration//GEN-END:variables
}
