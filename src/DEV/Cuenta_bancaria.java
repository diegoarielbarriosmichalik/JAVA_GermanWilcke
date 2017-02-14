package DEV;

import DEV.Conexion;
import DEV.Metodos;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cuenta_bancaria extends javax.swing.JFrame {

    public Cuenta_bancaria() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cuentas Bancarias");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Conexion.Verificar_conexion();

        Clear();
    }

    public static void Clear() {
        jt_nombre.setText("");
        jt_numero.setText("");
        jt_banco.setText("");
        Metodos.cuenta_bancaria_id_banco = 0;
        Metodos.id_cuenta_bancaria = 0;
        jt_nombre.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_banco = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_banco = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jt_nombre = new javax.swing.JTextField();
        jButton_borrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_buscar = new javax.swing.JButton();
        jt_numero = new javax.swing.JTextField();
        jt_banco = new javax.swing.JTextField();

        jDialog_banco.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_banco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Banco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_banco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_bancoMouseClicked(evt);
            }
        });
        jTable_banco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_bancoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_banco);
        if (jTable_banco.getColumnModel().getColumnCount() > 0) {
            jTable_banco.getColumnModel().getColumn(0).setResizable(false);
            jTable_banco.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_banco.getColumnModel().getColumn(1).setResizable(false);
            jTable_banco.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_bancoLayout = new javax.swing.GroupLayout(jDialog_banco.getContentPane());
        jDialog_banco.getContentPane().setLayout(jDialog_bancoLayout);
        jDialog_bancoLayout.setHorizontalGroup(
            jDialog_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_bancoLayout.setVerticalGroup(
            jDialog_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre d la cuenta"));
        jt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nombreActionPerformed(evt);
            }
        });
        jt_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jt_nombreFocusLost(evt);
            }
        });
        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_nombreKeyPressed(evt);
            }
        });

        jButton_borrar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del_mini.png"))); // NOI18N
        jButton_borrar.setToolTipText("");
        jButton_borrar.setBorder(null);
        jButton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_mini.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton4.setToolTipText("Guardar");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_buscar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton_buscar.setToolTipText("");
        jButton_buscar.setBorder(null);
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jt_numero.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de Cuenta"));
        jt_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_numeroActionPerformed(evt);
            }
        });
        jt_numero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jt_numeroFocusLost(evt);
            }
        });
        jt_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_numeroKeyPressed(evt);
            }
        });

        jt_banco.setBorder(javax.swing.BorderFactory.createTitledBorder("Banco (F1 buscar)"));
        jt_banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_bancoActionPerformed(evt);
            }
        });
        jt_banco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jt_bancoFocusLost(evt);
            }
        });
        jt_banco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_bancoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_bancoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 175, Short.MAX_VALUE)
                        .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jt_nombre)
                    .addComponent(jt_numero)
                    .addComponent(jt_banco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Metodos.Cuenta_bancaria_Guardar(jt_nombre.getText(), jt_numero.getText());
        Clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed
        //  Metodos.Cliente_update();
        jButton_borrar.setVisible(false);
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        //Facturacion.jT_buscador.requestFocus();
//        if (Metodos.formulario_que_pide == 1) {
//            Metodos.Facturacion_update_cliente(Metodos.id_cliente);
//            Metodos.formulario_que_pide = 0;
//        }
//        if (Metodos.formulario_que_pide == 4) {
//            Metodos.formulario_que_pide = 0;
//         //   Facturacion_Terminar.jTextField_ruc.setText(jt_ruc.getText());
//         //   Facturacion_Terminar.jTextField_ci.setText(jTextField_ci.getText());
//            Facturacion_Terminar.jTextField_nombre.setText(jt_nombre.getText());
//            Facturacion_Terminar.jTextField_nombre.requestFocus();
//
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jt_nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jt_nombreFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nombreFocusLost

    private void jt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
//
//        if (evt.getKeyCode() == KeyEvent.VK_F1) {
//            new Cliente_buscar().setVisible(true);
//            Cliente_buscar.jT_Buscar.setText("");
//            Cliente_buscar.formulario = 1;
//        }

    }//GEN-LAST:event_jt_nombreKeyPressed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
//        jDialog_buscar();
    }//GEN-LAST:event_jButton_buscarActionPerformed

    public void jDialog_banco() {
        jDialog_banco.setVisible(true);
        jDialog_banco.setTitle("Bancos");
        jDialog_banco.setSize(500, 500);
        jDialog_banco.setLocationRelativeTo(null);
        jDialog_banco.setAlwaysOnTop(true);
        jDialog_banco.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }


    private void jTable_bancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_bancoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_banco.setVisible(false);
            jt_banco.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jDialog_banco.setVisible(false);
            Metodos.Cuenta_bancaria_banco_selected();
            jt_banco.requestFocus();
        }
    }//GEN-LAST:event_jTable_bancoKeyPressed

    private void jTable_bancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_bancoMouseClicked
//        Metodos.Cliente_selected();
//        Metodos.Cliente_traer_datos();
//        jDialog_buscar.setVisible(false);
//        jButton_borrar.setVisible(true);
    }//GEN-LAST:event_jTable_bancoMouseClicked

    private void jt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nombreActionPerformed

    private void jt_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_numeroActionPerformed

    private void jt_numeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jt_numeroFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_numeroFocusLost

    private void jt_numeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_numeroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_numeroKeyPressed

    private void jt_bancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_bancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_bancoActionPerformed

    private void jt_bancoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jt_bancoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_bancoFocusLost

    private void jt_bancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_bancoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_banco();
            Metodos.Cuenta_bancaria_banco_jtable();
        }
    }//GEN-LAST:event_jt_bancoKeyPressed

    private void jt_bancoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_bancoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_bancoKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Cuenta_bancaria().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton_borrar;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JDialog jDialog_banco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_banco;
    public static javax.swing.JTextField jt_banco;
    public static javax.swing.JTextField jt_nombre;
    public static javax.swing.JTextField jt_numero;
    // End of variables declaration//GEN-END:variables
}
