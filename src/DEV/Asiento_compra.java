package DEV;

import DEV.Metodos;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;

public class Asiento_compra extends javax.swing.JFrame {

    public Asiento_compra() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Compras");
        new File(".").getAbsolutePath();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/4k_icon.png")).getImage());

//        Metodos.id_condicion = 1;
//        Metodos.id_moneda = 1;
//        Metodos.id_comprobante = 1;
//
//        Metodos.Facturas_de_compra_max();
//        Metodos.Facturas_de_compra_buscar();
        jTextField_proveedor.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_asientos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_asientos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_compras_detalle = new javax.swing.JTable();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jTextField_proveedor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jTextField_asiento = new javax.swing.JTextField();
        jTextField_factura = new javax.swing.JTextField();

        jDialog_asientos.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_asientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Asiento", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_asientos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_asientosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_asientos);
        if (jTable_asientos.getColumnModel().getColumnCount() > 0) {
            jTable_asientos.getColumnModel().getColumn(0).setResizable(false);
            jTable_asientos.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_asientos.getColumnModel().getColumn(1).setResizable(false);
            jTable_asientos.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable_asientos.getColumnModel().getColumn(2).setResizable(false);
            jTable_asientos.getColumnModel().getColumn(2).setPreferredWidth(350);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_asientosLayout = new javax.swing.GroupLayout(jDialog_asientos.getContentPane());
        jDialog_asientos.getContentPane().setLayout(jDialog_asientosLayout);
        jDialog_asientosLayout.setHorizontalGroup(
            jDialog_asientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_asientosLayout.setVerticalGroup(
            jDialog_asientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_compras_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cuenta", "Debe", "Haber", "Gravada 10%", "Gravada 5%", "IVA 10%", "IVA 5%", "Exentas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_compras_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_compras_detalleMouseClicked(evt);
            }
        });
        jTable_compras_detalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_compras_detalleKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_compras_detalle);
        if (jTable_compras_detalle.getColumnModel().getColumnCount() > 0) {
            jTable_compras_detalle.getColumnModel().getColumn(0).setResizable(false);
            jTable_compras_detalle.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable_compras_detalle.getColumnModel().getColumn(1).setResizable(false);
            jTable_compras_detalle.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable_compras_detalle.getColumnModel().getColumn(2).setResizable(false);
            jTable_compras_detalle.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable_compras_detalle.getColumnModel().getColumn(3).setResizable(false);
            jTable_compras_detalle.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable_compras_detalle.getColumnModel().getColumn(4).setResizable(false);
            jTable_compras_detalle.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable_compras_detalle.getColumnModel().getColumn(5).setResizable(false);
            jTable_compras_detalle.getColumnModel().getColumn(5).setPreferredWidth(10);
            jTable_compras_detalle.getColumnModel().getColumn(6).setResizable(false);
            jTable_compras_detalle.getColumnModel().getColumn(6).setPreferredWidth(10);
            jTable_compras_detalle.getColumnModel().getColumn(7).setResizable(false);
            jTable_compras_detalle.getColumnModel().getColumn(7).setPreferredWidth(2);
            jTable_compras_detalle.getColumnModel().getColumn(8).setResizable(false);
            jTable_compras_detalle.getColumnModel().getColumn(8).setPreferredWidth(2);
        }

        jDateChooser_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser_fecha.setDateFormatString("dd-MM-yyyy");
        jDateChooser_fecha.setPreferredSize(new java.awt.Dimension(16, 39));
        jDateChooser_fecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooser_fechaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser_fechaFocusLost(evt);
            }
        });

        jTextField_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor"));
        jTextField_proveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_proveedorFocusLost(evt);
            }
        });
        jTextField_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_proveedorKeyPressed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton2.setMnemonic('x');
        jButton2.setToolTipText("Alt + X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_mini.png"))); // NOI18N
        jButton3.setMnemonic('n');
        jButton3.setToolTipText("Alt + N");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField_asiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Asiento Nro"));
        jTextField_asiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_asientoKeyPressed(evt);
            }
        });

        jTextField_factura.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura Nro"));
        jTextField_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_facturaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 964, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_asiento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_asiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        Metodos.id_factura = 0;
//        Metodos.Facturas_de_compra_clear();
//        Metodos.Compras_detalle_cargar_jtable();
//        Metodos.Sucursal_empresa_compras();
        jTextField_proveedor.requestFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedorKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
//            new Compras_proveedores_buscar().setVisible(true);
        }
    }//GEN-LAST:event_jTextField_proveedorKeyPressed

    private void jDateChooser_fechaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser_fechaFocusGained

    }//GEN-LAST:event_jDateChooser_fechaFocusGained

    private void jTextField_proveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_proveedorFocusLost
        //  jTextField_sucursal.requestFocus();
    }//GEN-LAST:event_jTextField_proveedorFocusLost

    private void jDateChooser_fechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser_fechaFocusLost
        //  Metodos.Compras_actualizar_fecha();
    }//GEN-LAST:event_jDateChooser_fechaFocusLost

    private void jTable_compras_detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_compras_detalleMouseClicked
//        new Compras_detalle_modificar().setVisible(true);
//        Metodos.Compras_detalle_seleccionar_detalle();
    }//GEN-LAST:event_jTable_compras_detalleMouseClicked

    private void jTable_compras_detalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_compras_detalleKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
//            new Compras_detalle_modificar().setVisible(true);
//            Metodos.Compras_detalle_seleccionar_detalle();
        }
    }//GEN-LAST:event_jTable_compras_detalleKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jDialog_asientos();
        Metodos.Asiento_compra_jtable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable_asientosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_asientosKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_asientos.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Asiento_compra_selected();
            Metodos.Asiento_compra_traer_datos();
            Metodos.Asiento_compra_detalle_jatble();
            jDialog_asientos.setVisible(false);
        }
    }//GEN-LAST:event_jTable_asientosKeyPressed

    private void jTextField_asientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_asientoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_asientoKeyPressed

    private void jTextField_facturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_facturaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_facturaKeyPressed

    public void jDialog_asientos() {
        jDialog_asientos.setVisible(true);
        jDialog_asientos.setTitle("Asientos");
        jDialog_asientos.setSize(500, 500);
        jDialog_asientos.setLocationRelativeTo(null);
        jDialog_asientos.setAlwaysOnTop(true);
        jDialog_asientos.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asiento_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Asiento_compra().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private javax.swing.JDialog jDialog_asientos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_asientos;
    public static javax.swing.JTable jTable_compras_detalle;
    public static javax.swing.JTextField jTextField_asiento;
    public static javax.swing.JTextField jTextField_factura;
    public static javax.swing.JTextField jTextField_proveedor;
    // End of variables declaration//GEN-END:variables
}
