package DEV;

import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cuentas_vinculadas extends javax.swing.JFrame {

    public Cuentas_vinculadas() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cuentas");
        new File(".").getAbsolutePath();
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        Metodos.Cuentas_vinculdas_cargar_jtable();
        jButton_agregar.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_agregar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jTextField_cuenta = new javax.swing.JTextField();
        jTextField_descripcion = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jDialog_cuenta = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_cuenta_buscar = new javax.swing.JTable();
        jDialog_opciones = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cuentas_vinculadas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton_agregar = new javax.swing.JButton();

        jDialog_agregar.setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_cuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta (F1 buscar)"));
        jTextField_cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cuentaKeyPressed(evt);
            }
        });

        jTextField_descripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción"));
        jTextField_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_descripcionKeyPressed(evt);
            }
        });

        jButton3.setMnemonic('g');
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_cuenta)
                    .addComponent(jTextField_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_agregarLayout = new javax.swing.GroupLayout(jDialog_agregar.getContentPane());
        jDialog_agregar.getContentPane().setLayout(jDialog_agregarLayout);
        jDialog_agregarLayout.setHorizontalGroup(
            jDialog_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_agregarLayout.setVerticalGroup(
            jDialog_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_cuenta.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_cuenta_buscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cuenta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_cuenta_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_cuenta_buscarKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_cuenta_buscar);
        if (jTable_cuenta_buscar.getColumnModel().getColumnCount() > 0) {
            jTable_cuenta_buscar.getColumnModel().getColumn(0).setResizable(false);
            jTable_cuenta_buscar.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_cuenta_buscar.getColumnModel().getColumn(1).setResizable(false);
            jTable_cuenta_buscar.getColumnModel().getColumn(1).setPreferredWidth(400);
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_cuentaLayout = new javax.swing.GroupLayout(jDialog_cuenta.getContentPane());
        jDialog_cuenta.getContentPane().setLayout(jDialog_cuentaLayout);
        jDialog_cuentaLayout.setHorizontalGroup(
            jDialog_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_cuentaLayout.setVerticalGroup(
            jDialog_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_opciones.setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jButton4.setMnemonic('g');
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        jButton5.setMnemonic('g');
        jButton5.setText("Borrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_opcionesLayout = new javax.swing.GroupLayout(jDialog_opciones.getContentPane());
        jDialog_opciones.getContentPane().setLayout(jDialog_opcionesLayout);
        jDialog_opcionesLayout.setHorizontalGroup(
            jDialog_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_opcionesLayout.setVerticalGroup(
            jDialog_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTable_cuentas_vinculadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cuenta", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_cuentas_vinculadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_cuentas_vinculadasMouseClicked(evt);
            }
        });
        jTable_cuentas_vinculadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_cuentas_vinculadasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_cuentas_vinculadas);
        if (jTable_cuentas_vinculadas.getColumnModel().getColumnCount() > 0) {
            jTable_cuentas_vinculadas.getColumnModel().getColumn(0).setResizable(false);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(1).setResizable(false);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(2).setResizable(false);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton2.setMnemonic('x');
        jButton2.setToolTipText("Alt + X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton_agregar.setMnemonic('a');
        jButton_agregar.setText("Agregar");
        jButton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarActionPerformed(evt);
            }
        });
        jButton_agregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_agregarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable_cuentas_vinculadasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_cuentas_vinculadasKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            this.setVisible(false);
            new Cuentas_ABM().setVisible(true);
            Metodos.Cuentas_seleccionar();
        }
    }//GEN-LAST:event_jTable_cuentas_vinculadasKeyPressed

    private void jTable_cuentas_vinculadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_cuentas_vinculadasMouseClicked
//        this.setVisible(false);
        //        new Cuentas_ABM().setVisible(true);
        //        Metodos.Cuentas_seleccionar();
        Metodos.Cuenta_vinculada_selected();
        jDialog_opciones();

    }//GEN-LAST:event_jTable_cuentas_vinculadasMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (Metodos.cuentas_vicnuladas_id_cuenta == 0) {
            JOptionPane.showMessageDialog(null, "Complete los campos.");
        } else {
            Metodos.Cuentas_vinculadas_guardar(jTextField_descripcion.getText());
            jDialog_agregar.setVisible(false);
            jTextField_cuenta.setText("");
            jTextField_descripcion.setText("");
            Metodos.cuentas_vicnuladas_id_cuenta = 0;
            Metodos.id_cuenta_vinculada = 0;
            Metodos.Cuentas_vinculdas_cargar_jtable();
            jButton_agregar.requestFocus();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed
        jDialog_agregar();
    }//GEN-LAST:event_jButton_agregarActionPerformed

    private void jTextField_cuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuentaKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_agregar.setVisible(false);
            jButton_agregar.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_F1)) {
            jDialog_cuenta();
        }
    }//GEN-LAST:event_jTextField_cuentaKeyPressed

    private void jTextField_descripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_descripcionKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_agregar.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_descripcionKeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_agregar.setVisible(false);
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jTable_cuenta_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_cuenta_buscarKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_cuenta.setVisible(false);
            jTextField_cuenta.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Cuentas_vicnuladas_cuenta_selected();
            jDialog_cuenta.setVisible(false);
            jTextField_cuenta.requestFocus();
        }
    }//GEN-LAST:event_jTable_cuenta_buscarKeyPressed

    private void jButton_agregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_agregarKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton_agregarKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jDialog_opciones.setVisible(false);
        jButton_agregar.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Metodos.Cuentas_vinculadas_borrar();
        Metodos.Cuentas_vinculdas_cargar_jtable();
        jDialog_opciones.setVisible(false);
        jButton_agregar.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5KeyPressed

    public void jDialog_agregar() {
        Metodos.cuentas_vicnuladas_id_cuenta = 0;
        Metodos.id_cuenta_vinculada = 0;
        jTextField_cuenta.setText("");
        jTextField_descripcion.setText("");
        jDialog_agregar.setVisible(true);
        jDialog_agregar.setTitle("Agregar Cuenta");
        jDialog_agregar.setSize(489, 185);
        jDialog_agregar.setLocationRelativeTo(null);
        jDialog_agregar.setAlwaysOnTop(true);
        jDialog_agregar.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jTextField_cuenta.requestFocus();
    }
    public void jDialog_opciones() {
        jDialog_opciones.setVisible(true);
        jDialog_opciones.setTitle("Opciones");
        jDialog_opciones.setSize(299, 77);
        jDialog_opciones.setLocationRelativeTo(null);
        jDialog_opciones.setAlwaysOnTop(true);
        jDialog_opciones.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        
    }

    public void jDialog_cuenta() {
        jDialog_cuenta.setVisible(true);
        jDialog_cuenta.setTitle("Cuentas");
        jDialog_cuenta.setSize(500, 500);
        jDialog_cuenta.setLocationRelativeTo(null);
        jDialog_cuenta.setAlwaysOnTop(true);
        jDialog_cuenta.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Cuentas_vinculadas_cuenta_jtable();
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
            java.util.logging.Logger.getLogger(Cuentas_vinculadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Cuentas_vinculadas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton_agregar;
    private javax.swing.JDialog jDialog_agregar;
    private javax.swing.JDialog jDialog_cuenta;
    private javax.swing.JDialog jDialog_opciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_cuenta_buscar;
    public static javax.swing.JTable jTable_cuentas_vinculadas;
    public static javax.swing.JTextField jTextField_cuenta;
    private javax.swing.JTextField jTextField_descripcion;
    // End of variables declaration//GEN-END:variables
}
