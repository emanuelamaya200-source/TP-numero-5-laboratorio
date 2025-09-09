package trabajon5.Jframe.Cliente;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trabajon5.Jframe.NewJFrame;
import trabajon5.Persona;

public class BorrarCliente extends javax.swing.JInternalFrame {

    public BorrarCliente() {
        initComponents();
        rellenarTabla();
        rellenarListaClientes();
    }
    public void rellenarListaClientes() {

    jTextArea1.setText("");
    

    for (Persona persona : NewJFrame.Personas.values()) {
        jTextArea1.append(persona.getDni() + "\n");
    }
}
    
    private void rellenarTabla() {
    // Define las columnas de la tabla
    String[] columnas = {"DNI", "Apellido", "Nombre", "Direccion", "Ciudad", "Telefono"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);


    for (Persona persona : NewJFrame.Personas.values()) {
        Object[] fila = new Object[6];
        fila[0] = persona.getDni();
        fila[1] = persona.getApellido();
        fila[2] = persona.getNombre();
        fila[3] = persona.getDomicilio();
        fila[4] = persona.getCiudad();
        fila[5] = persona.getNumCelu();
        modelo.addRow(fila);
    }

    // Asigna el modelo de datos a tu JTable
    jTable1.setModel(modelo);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CuadroDniBus = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Borrar Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("DNI:");

        CuadroDniBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroDniBusActionPerformed(evt);
            }
        });
        CuadroDniBus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CuadroDniBusKeyPressed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jToggleButton1.setText("Borrar Cliente/s");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jToggleButton2.setText("Salir");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Apellidos", "Nombre", "Dirrecion", "Ciudad", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(CuadroDniBus, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jToggleButton1)
                        .addGap(173, 173, 173)
                        .addComponent(jToggleButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(CuadroDniBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton1))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
           // 1. Obtener el índice de la fila seleccionada
    int filaSeleccionada = jTable1.getSelectedRow();
    
    // 2. Verificar si se ha seleccionado una fila
    if (filaSeleccionada != -1) {
        try {
            // 3. Obtener el modelo de la tabla para acceder a los datos
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            
            // 4. Obtener el número de teléfono de la fila seleccionada (está en la columna 6, que es el índice 5)
            Object telefonoObjeto = modelo.getValueAt(filaSeleccionada, 5);
            

            Long telefono = Long.valueOf(telefonoObjeto.toString());
            
            // 6. Eliminar el cliente del mapa usando el teléfono como clave
            NewJFrame.Personas.remove(telefono);
            
            // 7. Refrescar la tabla para que el cliente eliminado no se muestre
            rellenarTabla();
            
            // 8. Mostrar un mensaje de confirmación
            JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente.");
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: El teléfono en la tabla no es un número válido.");
        }
    } else {
        // Si no se selecciona ninguna fila, mostrar un mensaje de error
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un cliente de la tabla para borrar.");
    }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void CuadroDniBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroDniBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroDniBusActionPerformed

    private void CuadroDniBusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuadroDniBusKeyPressed
   

      String textoBusqueda = CuadroDniBus.getText().trim();

    String[] columnas = {"DNI", "Apellido", "Nombre", "Direccion", "Ciudad", "Telefono"};
    DefaultTableModel modeloFiltrado = new DefaultTableModel(columnas, 0);


    if (textoBusqueda.isEmpty()) {
        rellenarTabla();
        return;
    }

    // Itera sobre todas las personas para encontrar una coincidencia
    for (Persona persona : NewJFrame.Personas.values()) {
        String dniPersona = String.valueOf(persona.getDni());

        // Comprueba si el DNI comienza con el texto de búsqueda
        if (dniPersona.startsWith(textoBusqueda)) {
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

    // Actualiza la JTable con los resultados filtrados
    jTable1.setModel(modeloFiltrado);
        
    }//GEN-LAST:event_CuadroDniBusKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CuadroDniBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
