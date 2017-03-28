package DEV;

import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;

public class Cuentas_ABM extends javax.swing.JFrame {

    public Cuentas_ABM() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cuentas");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jTextField_nv1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_nv1 = new javax.swing.JTextField();
        jTextField_nv2 = new javax.swing.JTextField();
        jTextField_nv3 = new javax.swing.JTextField();
        jTextField_nv4 = new javax.swing.JTextField();
        jTextField_nv5 = new javax.swing.JTextField();
        jTextField_cuenta = new javax.swing.JTextField();

        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton3.setMnemonic('g');
        jButton3.setToolTipText("Alt + G");
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

        jTextField_nv1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_nv1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nivel 1"));
        jTextField_nv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nv1ActionPerformed(evt);
            }
        });
        jTextField_nv1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nv1KeyPressed(evt);
            }
        });

        jTextField_nv2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_nv2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nivel 2"));
        jTextField_nv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nv2ActionPerformed(evt);
            }
        });
        jTextField_nv2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nv2KeyPressed(evt);
            }
        });

        jTextField_nv3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_nv3.setBorder(javax.swing.BorderFactory.createTitledBorder("Nivel 3"));
        jTextField_nv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nv3ActionPerformed(evt);
            }
        });
        jTextField_nv3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nv3KeyPressed(evt);
            }
        });

        jTextField_nv4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_nv4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nivel 4"));
        jTextField_nv4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nv4ActionPerformed(evt);
            }
        });
        jTextField_nv4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nv4KeyPressed(evt);
            }
        });

        jTextField_nv5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_nv5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nivel 5"));
        jTextField_nv5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_nv5FocusLost(evt);
            }
        });
        jTextField_nv5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nv5ActionPerformed(evt);
            }
        });
        jTextField_nv5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nv5KeyPressed(evt);
            }
        });

        jTextField_cuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción"));
        jTextField_cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cuentaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_cuenta, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField_nv1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_nv2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_nv3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_nv4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_nv5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nv5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_cuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        Metodos.Cuentas_guardar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField_nv5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nv5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nv5ActionPerformed

    private void jTextField_nv4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nv4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nv4ActionPerformed

    private void jTextField_nv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nv2ActionPerformed

    private void jTextField_nv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nv3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nv3ActionPerformed

    private void jTextField_nv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nv1ActionPerformed

    private void jTextField_nv5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_nv5FocusLost
        jTextField_cuenta.requestFocus();
    }//GEN-LAST:event_jTextField_nv5FocusLost

    private void jTextField_nv1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nv1KeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_nv1KeyPressed

    private void jTextField_nv2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nv2KeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_nv2KeyPressed

    private void jTextField_nv3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nv3KeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_nv3KeyPressed

    private void jTextField_nv4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nv4KeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_nv4KeyPressed

    private void jTextField_nv5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nv5KeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_nv5KeyPressed

    private void jTextField_cuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuentaKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_cuentaKeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton3KeyPressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuentas_ABM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Cuentas_ABM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextField jTextField_cuenta;
    public static javax.swing.JTextField jTextField_nv1;
    public static javax.swing.JTextField jTextField_nv2;
    public static javax.swing.JTextField jTextField_nv3;
    public static javax.swing.JTextField jTextField_nv4;
    public static javax.swing.JTextField jTextField_nv5;
    // End of variables declaration//GEN-END:variables
}
