package DEV;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Clientes extends javax.swing.JFrame {

    public Clientes() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Clientes");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Conexion.Verificar_conexion();

        Metodos.Cliente_clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_buscar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cliente = new javax.swing.JTable();
        jTextField_buscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jt_ruc = new javax.swing.JTextField();
        jt_nombre = new javax.swing.JTextField();
        jt_direccion = new javax.swing.JTextField();
        jt_telefono = new javax.swing.JTextField();
        jt_email = new javax.swing.JTextField();
        jButton_borrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_buscar = new javax.swing.JButton();

        jDialog_buscar.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_clienteMouseClicked(evt);
            }
        });
        jTable_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_clienteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_cliente);
        if (jTable_cliente.getColumnModel().getColumnCount() > 0) {
            jTable_cliente.getColumnModel().getColumn(0).setResizable(false);
            jTable_cliente.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_cliente.getColumnModel().getColumn(1).setResizable(false);
            jTable_cliente.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        jTextField_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_buscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jTextField_buscar))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_buscarLayout = new javax.swing.GroupLayout(jDialog_buscar.getContentPane());
        jDialog_buscar.getContentPane().setLayout(jDialog_buscarLayout);
        jDialog_buscarLayout.setHorizontalGroup(
            jDialog_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_buscarLayout.setVerticalGroup(
            jDialog_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        jt_ruc.setBorder(javax.swing.BorderFactory.createTitledBorder("RUC"));
        jt_ruc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jt_rucFocusLost(evt);
            }
        });
        jt_ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_rucKeyPressed(evt);
            }
        });

        jt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre y Apellido"));
        jt_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jt_nombreFocusGained(evt);
            }
        });
        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_nombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_nombreKeyReleased(evt);
            }
        });

        jt_direccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));
        jt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_direccionActionPerformed(evt);
            }
        });

        jt_telefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));

        jt_email.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo Electrónico"));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_direccion)
                    .addComponent(jt_nombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_email))
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Metodos.Cliente_Guardar(jt_ruc.getText(), jt_direccion.getText(), jt_email.getText(), jt_nombre.getText(), jt_telefono.getText());
        jt_ruc.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombreKeyReleased

    }//GEN-LAST:event_jt_nombreKeyReleased

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed
        jButton_borrar.setVisible(false);
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void jt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_direccionActionPerformed
    }//GEN-LAST:event_jt_direccionActionPerformed

    private void jt_nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jt_nombreFocusGained
    }//GEN-LAST:event_jt_nombreFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }


    }//GEN-LAST:event_jt_nombreKeyPressed

    private void jt_rucFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jt_rucFocusLost

    }//GEN-LAST:event_jt_rucFocusLost

    private void jt_rucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_rucKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jt_rucKeyPressed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        jDialog_buscar();
    }//GEN-LAST:event_jButton_buscarActionPerformed

    public void jDialog_buscar() {
        jTextField_buscar.setText("");
        jTextField_buscar.requestFocus();
        jDialog_buscar.setVisible(true);
        jDialog_buscar.setTitle("Buscar cliente");
        jDialog_buscar.setSize(500, 500);
        jDialog_buscar.setLocationRelativeTo(null);
        jDialog_buscar.setAlwaysOnTop(true);
        jDialog_buscar.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }


    private void jTable_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_clienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_buscar.setVisible(false);
            jt_ruc.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jDialog_buscar.setVisible(false);
            Metodos.Cliente_selected();
            Metodos.Cliente_traer_datos();
            jt_ruc.requestFocus();
            jButton_borrar.setVisible(true);

        }
    }//GEN-LAST:event_jTable_clienteKeyPressed

    private void jTextField_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_buscar.setVisible(false);
            jt_ruc.requestFocus();
        }


    }//GEN-LAST:event_jTextField_buscarKeyPressed

    private void jTable_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clienteMouseClicked
        Metodos.Cliente_selected();
        Metodos.Cliente_traer_datos();
        jDialog_buscar.setVisible(false);
        jButton_borrar.setVisible(true);
    }//GEN-LAST:event_jTable_clienteMouseClicked

    private void jTextField_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscarKeyReleased
        Metodos.Cliente_jatble(jTextField_buscar.getText());
    }//GEN-LAST:event_jTextField_buscarKeyReleased

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
            new Clientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton_borrar;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JDialog jDialog_buscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_cliente;
    private javax.swing.JTextField jTextField_buscar;
    public static javax.swing.JTextField jt_direccion;
    public static javax.swing.JTextField jt_email;
    public static javax.swing.JTextField jt_nombre;
    public static javax.swing.JTextField jt_ruc;
    public static javax.swing.JTextField jt_telefono;
    // End of variables declaration//GEN-END:variables
}
