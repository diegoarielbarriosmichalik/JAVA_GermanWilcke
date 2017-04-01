package DEV;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Transferencias extends javax.swing.JFrame {

    public Transferencias() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Transferencias");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/4k_icon.png")).getImage());

    }

    public static void Clear() {

        jTextField_buscar_beneficiario.setText("");
        jTextField_descripcion.setText("");
        jTextField_importe.setText("");
        jTextField_numero.setText("");
        jDateChooser_fecha.setDate(Metodos.hoy);
        jTextField_numero.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_cheques = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cheques = new javax.swing.JTable();
        jTextField_buscar_cheque = new javax.swing.JTextField();
        jDialog_beneficiarios = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_beneficiario = new javax.swing.JTable();
        jTextField_buscar_beneficiario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField_numero = new javax.swing.JTextField();
        jTextField_importe = new javax.swing.JTextField();
        jTextField_descripcion = new javax.swing.JTextField();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jButton_buscar = new javax.swing.JButton();
        jButton_imprimir1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_imprimir2 = new javax.swing.JButton();
        jTextField_cuenta1 = new javax.swing.JTextField();

        jDialog_cheques.setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        jTable_cheques.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Beneficiario", "Numero", "Cuenta", "Fecha", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_cheques.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_chequesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_cheques);
        if (jTable_cheques.getColumnModel().getColumnCount() > 0) {
            jTable_cheques.getColumnModel().getColumn(0).setResizable(false);
            jTable_cheques.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_cheques.getColumnModel().getColumn(1).setResizable(false);
            jTable_cheques.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable_cheques.getColumnModel().getColumn(2).setResizable(false);
            jTable_cheques.getColumnModel().getColumn(3).setResizable(false);
            jTable_cheques.getColumnModel().getColumn(4).setResizable(false);
            jTable_cheques.getColumnModel().getColumn(5).setResizable(false);
        }

        jTextField_buscar_cheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_buscar_cheque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscar_chequeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_buscar_chequeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jTextField_buscar_cheque))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_chequesLayout = new javax.swing.GroupLayout(jDialog_cheques.getContentPane());
        jDialog_cheques.getContentPane().setLayout(jDialog_chequesLayout);
        jDialog_chequesLayout.setHorizontalGroup(
            jDialog_chequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_chequesLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog_chequesLayout.setVerticalGroup(
            jDialog_chequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_chequesLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDialog_beneficiarios.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 500));

        jTable_beneficiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Beneficiario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_beneficiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_beneficiarioKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_beneficiario);
        if (jTable_beneficiario.getColumnModel().getColumnCount() > 0) {
            jTable_beneficiario.getColumnModel().getColumn(0).setResizable(false);
            jTable_beneficiario.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_beneficiario.getColumnModel().getColumn(1).setResizable(false);
            jTable_beneficiario.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        jTextField_buscar_beneficiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_buscar_beneficiario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscar_beneficiarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_buscar_beneficiarioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jTextField_buscar_beneficiario))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar_beneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_beneficiariosLayout = new javax.swing.GroupLayout(jDialog_beneficiarios.getContentPane());
        jDialog_beneficiarios.getContentPane().setLayout(jDialog_beneficiariosLayout);
        jDialog_beneficiariosLayout.setHorizontalGroup(
            jDialog_beneficiariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_beneficiariosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog_beneficiariosLayout.setVerticalGroup(
            jDialog_beneficiariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_beneficiariosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_numero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255)), "Número")); // NOI18N
        jTextField_numero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_numeroFocusLost(evt);
            }
        });

        jTextField_importe.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255)), "Importe")); // NOI18N

        jTextField_descripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255)), "Descripción")); // NOI18N

        jDateChooser_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));

        jButton_buscar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton_buscar.setToolTipText("");
        jButton_buscar.setBorder(null);
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jButton_imprimir1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_imprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton_imprimir1.setToolTipText("Salir");
        jButton_imprimir1.setBorder(null);
        jButton_imprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_imprimir1ActionPerformed(evt);
            }
        });

        jButton_imprimir2.setBackground(new java.awt.Color(255, 255, 255));
        jButton_imprimir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton_imprimir2.setToolTipText("");
        jButton_imprimir2.setBorder(null);
        jButton_imprimir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_imprimir2ActionPerformed(evt);
            }
        });

        jTextField_cuenta1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255)), "Cuenta Bancaria(F1 buscar)")); // NOI18N
        jTextField_cuenta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_cuenta1FocusLost(evt);
            }
        });
        jTextField_cuenta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cuenta1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_imprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_imprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_importe)
                            .addComponent(jTextField_numero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_cuenta1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jTextField_descripcion))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_cuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_imprimir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton_imprimir2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        jDialog_cheques();
        jTextField_buscar_cheque.setText("");
        jTextField_buscar_cheque.requestFocus();
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jButton_imprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_imprimir1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton_imprimir1ActionPerformed

    private void jTextField_numeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_numeroFocusLost
//        Metodos.Cheques_verificar();
    }//GEN-LAST:event_jTextField_numeroFocusLost

    private void jTable_beneficiarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_beneficiarioKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
//            Metodos.Cheques_beneficiario_selected();
            jDialog_beneficiarios.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_beneficiarios.setVisible(false);
        }
    }//GEN-LAST:event_jTable_beneficiarioKeyPressed

    private void jTextField_buscar_beneficiarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_beneficiarioKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_beneficiarios.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_buscar_beneficiarioKeyPressed

    private void jTextField_buscar_beneficiarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_beneficiarioKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_beneficiario.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {

            }
        } else {
//            Metodos.Cheques_beneficiario_jtable(jTextField_buscar_beneficiario.getText());
        }
    }//GEN-LAST:event_jTextField_buscar_beneficiarioKeyReleased

    private void jTable_chequesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_chequesKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_cheques.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
//            Metodos.Cheques_selected();
//            Metodos.Cheques_buscar();
            jDialog_cheques.setVisible(false);
        }
    }//GEN-LAST:event_jTable_chequesKeyPressed

    private void jTextField_buscar_chequeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_chequeKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_cheques.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_buscar_chequeKeyPressed

    private void jTextField_buscar_chequeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_chequeKeyReleased
//        Metodos.Cheques_jtable(jTextField_buscar_cheque.getText());
    }//GEN-LAST:event_jTextField_buscar_chequeKeyReleased

    private void jButton_imprimir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_imprimir2ActionPerformed
//        Metodos.Cheque_guardar(jTextField_numero.getText(), jTextField_importe.getText(), jDateChooser_fecha.getDate(), jTextField_descripcion.getText(), jTextField_nombre.getText());

    }//GEN-LAST:event_jButton_imprimir2ActionPerformed

    private void jTextField_cuenta1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_cuenta1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cuenta1FocusLost

    private void jTextField_cuenta1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuenta1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cuenta1KeyPressed

    public void jDialog_cheques() {
        jDialog_cheques.setVisible(true);
        jDialog_cheques.setTitle("Cheques");
        jDialog_cheques.setSize(500, 500);
        jDialog_cheques.setLocationRelativeTo(null);
        jDialog_cheques.setIconImage(new ImageIcon(getClass().getResource("/Images/4k_icon.png")).getImage());
    }

    public void jDialog_beneficiarios() {
        jDialog_beneficiarios.setVisible(true);
        jDialog_beneficiarios.setTitle("Beneficiarios");
        jDialog_beneficiarios.setSize(500, 500);
        jDialog_beneficiarios.setLocationRelativeTo(null);
        jDialog_beneficiarios.setIconImage(new ImageIcon(getClass().getResource("/Images/4k_icon.png")).getImage());
        jTextField_buscar_beneficiario.setText("");
        jTextField_buscar_beneficiario.requestFocus();
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
            java.util.logging.Logger.getLogger(Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Transferencias().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_imprimir1;
    private javax.swing.JButton jButton_imprimir2;
    public static com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private javax.swing.JDialog jDialog_beneficiarios;
    private javax.swing.JDialog jDialog_cheques;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_beneficiario;
    public static javax.swing.JTable jTable_cheques;
    public static javax.swing.JTextField jTextField_buscar_beneficiario;
    private javax.swing.JTextField jTextField_buscar_cheque;
    public static javax.swing.JTextField jTextField_cuenta1;
    public static javax.swing.JTextField jTextField_descripcion;
    public static javax.swing.JTextField jTextField_importe;
    public static javax.swing.JTextField jTextField_numero;
    // End of variables declaration//GEN-END:variables
}
