package DEV;

import DEV.Conexion;
import DEV.Metodos;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cuentas_acumuladoras extends javax.swing.JFrame {

    public Cuentas_acumuladoras() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cuentas Acumuladoras");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Conexion.Verificar_conexion();

        //  Metodos.Cliente_clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_cuenta = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cuenta = new javax.swing.JTable();
        jDialog_cuenta_acumuladora = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_cuenta_acumuladora = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField_cuenta = new javax.swing.JTextField();
        jTextField_cuenta_acumuladora = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_buscar = new javax.swing.JButton();

        jDialog_cuenta.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_cuenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_cuentaMouseClicked(evt);
            }
        });
        jTable_cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_cuentaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_cuenta);
        if (jTable_cuenta.getColumnModel().getColumnCount() > 0) {
            jTable_cuenta.getColumnModel().getColumn(0).setResizable(false);
            jTable_cuenta.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_cuenta.getColumnModel().getColumn(1).setResizable(false);
            jTable_cuenta.getColumnModel().getColumn(1).setPreferredWidth(470);
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

        jDialog_cuenta_acumuladora.setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_cuenta_acumuladora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cuenta acumuladora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_cuenta_acumuladora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_cuenta_acumuladoraMouseClicked(evt);
            }
        });
        jTable_cuenta_acumuladora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_cuenta_acumuladoraKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_cuenta_acumuladora);
        if (jTable_cuenta_acumuladora.getColumnModel().getColumnCount() > 0) {
            jTable_cuenta_acumuladora.getColumnModel().getColumn(0).setResizable(false);
            jTable_cuenta_acumuladora.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_cuenta_acumuladora.getColumnModel().getColumn(1).setResizable(false);
            jTable_cuenta_acumuladora.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_cuenta_acumuladoraLayout = new javax.swing.GroupLayout(jDialog_cuenta_acumuladora.getContentPane());
        jDialog_cuenta_acumuladora.getContentPane().setLayout(jDialog_cuenta_acumuladoraLayout);
        jDialog_cuenta_acumuladoraLayout.setHorizontalGroup(
            jDialog_cuenta_acumuladoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_cuenta_acumuladoraLayout.setVerticalGroup(
            jDialog_cuenta_acumuladoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jTextField_cuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta (F1 buscar)"));
        jTextField_cuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_cuentaFocusLost(evt);
            }
        });
        jTextField_cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cuentaKeyPressed(evt);
            }
        });

        jTextField_cuenta_acumuladora.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Acumuladora (F1 buscar)"));
        jTextField_cuenta_acumuladora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cuenta_acumuladoraActionPerformed(evt);
            }
        });
        jTextField_cuenta_acumuladora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cuenta_acumuladoraKeyPressed(evt);
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
                        .addGap(0, 216, Short.MAX_VALUE)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_cuenta_acumuladora)
                    .addComponent(jTextField_cuenta))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_cuenta_acumuladora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Metodos.Cuentas_acumuladoras_guardar();
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void clear() {
        jTextField_cuenta.setText("");
        jTextField_cuenta_acumuladora.setText("");
        Metodos.cuentas_acumuladoras_id_cuenta = 0;
        Metodos.cuentas_acumuladoras_id_cuenta_acumuladora = 0;
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_cuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_cuentaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cuentaFocusLost

    private void jTextField_cuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_cuenta();
        }
    }//GEN-LAST:event_jTextField_cuentaKeyPressed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
//        jDialog_buscar();
    }//GEN-LAST:event_jButton_buscarActionPerformed

    public void jDialog_cuenta() {
        jDialog_cuenta.setVisible(true);
        jDialog_cuenta.setTitle("Cuentas");
        jDialog_cuenta.setSize(500, 500);
        jDialog_cuenta.setLocationRelativeTo(null);
        jDialog_cuenta.setAlwaysOnTop(true);
        jDialog_cuenta.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Cuentas_acumuladoras_cuenta_jtable();
    }

    public void jDialog_cuenta_acumuladora() {
        jDialog_cuenta_acumuladora.setVisible(true);
        jDialog_cuenta_acumuladora.setTitle("Cuentas acumuladoras");
        jDialog_cuenta_acumuladora.setSize(500, 500);
        jDialog_cuenta_acumuladora.setLocationRelativeTo(null);
        jDialog_cuenta_acumuladora.setAlwaysOnTop(true);
        jDialog_cuenta_acumuladora.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Cuentas_acumuladoras_cuenta_acumuladora_jtable();
    }

    private void jTable_cuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_cuentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_cuenta.setVisible(false);
            jTextField_cuenta.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jDialog_cuenta.setVisible(false);
            Metodos.Cuentas_acumuladoras_selected();
            jTextField_cuenta.requestFocus();
        }
    }//GEN-LAST:event_jTable_cuentaKeyPressed

    private void jTable_cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_cuentaMouseClicked
    }//GEN-LAST:event_jTable_cuentaMouseClicked

    private void jTextField_cuenta_acumuladoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cuenta_acumuladoraActionPerformed
    }//GEN-LAST:event_jTextField_cuenta_acumuladoraActionPerformed

    private void jTable_cuenta_acumuladoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_cuenta_acumuladoraMouseClicked
    }//GEN-LAST:event_jTable_cuenta_acumuladoraMouseClicked

    private void jTable_cuenta_acumuladoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_cuenta_acumuladoraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_cuenta_acumuladora.setVisible(false);
            jTextField_cuenta_acumuladora.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jDialog_cuenta_acumuladora.setVisible(false);
            Metodos.Cuentas_acumuladoras_cuenta_acumuladora_selected();
            jTextField_cuenta_acumuladora.requestFocus();
        }
    }//GEN-LAST:event_jTable_cuenta_acumuladoraKeyPressed

    private void jTextField_cuenta_acumuladoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuenta_acumuladoraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_cuenta_acumuladora();
        }
    }//GEN-LAST:event_jTextField_cuenta_acumuladoraKeyPressed

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
            new Cuentas_acumuladoras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JDialog jDialog_cuenta;
    private javax.swing.JDialog jDialog_cuenta_acumuladora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_cuenta;
    public static javax.swing.JTable jTable_cuenta_acumuladora;
    public static javax.swing.JTextField jTextField_cuenta;
    public static javax.swing.JTextField jTextField_cuenta_acumuladora;
    // End of variables declaration//GEN-END:variables
}
