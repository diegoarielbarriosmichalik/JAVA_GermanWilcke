package DEV;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Listado_de_pagos extends javax.swing.JFrame {

    public Listado_de_pagos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cheques");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jDateChooser_desde.setDate(Metodos.hoy);
        jDateChooser_hasta.setDate(Metodos.hoy);
        Metodos.titulo_de_pagos = "Listado de Pagos";
        Metodos.listado_de_pagos_id_tipo_pago = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_tipo_pago = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_tipo_pago = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtexfield_tipo_pago = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jDateChooser_desde = new com.toedter.calendar.JDateChooser();
        jDateChooser_hasta = new com.toedter.calendar.JDateChooser();
        jtexfield_cta_cte = new javax.swing.JTextField();
        jtexfield_proveedor = new javax.swing.JTextField();

        jDialog_tipo_pago.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_tipo_pago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo de Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_tipo_pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tipo_pagoMouseClicked(evt);
            }
        });
        jTable_tipo_pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_tipo_pagoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_tipo_pago);
        if (jTable_tipo_pago.getColumnModel().getColumnCount() > 0) {
            jTable_tipo_pago.getColumnModel().getColumn(0).setResizable(false);
            jTable_tipo_pago.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_tipo_pago.getColumnModel().getColumn(1).setResizable(false);
            jTable_tipo_pago.getColumnModel().getColumn(1).setPreferredWidth(470);
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

        javax.swing.GroupLayout jDialog_tipo_pagoLayout = new javax.swing.GroupLayout(jDialog_tipo_pago.getContentPane());
        jDialog_tipo_pago.getContentPane().setLayout(jDialog_tipo_pagoLayout);
        jDialog_tipo_pagoLayout.setHorizontalGroup(
            jDialog_tipo_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_tipo_pagoLayout.setVerticalGroup(
            jDialog_tipo_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        jtexfield_tipo_pago.setText("TODOS");
        jtexfield_tipo_pago.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de pago (F1 buscar)"));
        jtexfield_tipo_pago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtexfield_tipo_pagoFocusLost(evt);
            }
        });
        jtexfield_tipo_pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtexfield_tipo_pagoKeyPressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora_mini.png"))); // NOI18N
        jButton4.setToolTipText("");
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

        jDateChooser_desde.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_desde.setBorder(javax.swing.BorderFactory.createTitledBorder("Desde"));
        jDateChooser_desde.setDateFormatString("dd/MM/yyyy");
        jDateChooser_desde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser_desdeKeyPressed(evt);
            }
        });

        jDateChooser_hasta.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_hasta.setBorder(javax.swing.BorderFactory.createTitledBorder("Hasta"));
        jDateChooser_hasta.setDateFormatString("dd/MM/yyyy");
        jDateChooser_hasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser_hastaKeyPressed(evt);
            }
        });

        jtexfield_cta_cte.setText("TODOS");
        jtexfield_cta_cte.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Corriente (F1 buscar)"));
        jtexfield_cta_cte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtexfield_cta_cteFocusLost(evt);
            }
        });
        jtexfield_cta_cte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtexfield_cta_cteKeyPressed(evt);
            }
        });

        jtexfield_proveedor.setText("TODOS");
        jtexfield_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor (F1 buscar)"));
        jtexfield_proveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtexfield_proveedorFocusLost(evt);
            }
        });
        jtexfield_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtexfield_proveedorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtexfield_tipo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtexfield_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtexfield_cta_cte, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jDateChooser_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtexfield_tipo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexfield_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexfield_cta_cte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateChooser_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
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
        Metodos.Cheques_imprimir(jDateChooser_desde.getDate(), jDateChooser_hasta.getDate());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtexfield_tipo_pagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtexfield_tipo_pagoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexfield_tipo_pagoFocusLost

    private void jtexfield_tipo_pagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtexfield_tipo_pagoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_tipo_pago();
        }
    }//GEN-LAST:event_jtexfield_tipo_pagoKeyPressed

    public void jDialog_tipo_pago() {
        jDialog_tipo_pago.setVisible(true);
        jDialog_tipo_pago.setTitle("Sector");
        jDialog_tipo_pago.setSize(500, 500);
        jDialog_tipo_pago.setLocationRelativeTo(null);
        jDialog_tipo_pago.setAlwaysOnTop(true);
        jDialog_tipo_pago.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        Metodos.Listado_tipo_pago_jtable();
    }

    private void jTable_tipo_pagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_tipo_pagoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_tipo_pago.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Listado_de_pagos_tipo_pago_selected();
            jDialog_tipo_pago.setVisible(false);
        }
    }//GEN-LAST:event_jTable_tipo_pagoKeyPressed

    private void jTable_tipo_pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tipo_pagoMouseClicked
        Metodos.Listado_de_pagos_tipo_pago_selected();
        jDialog_tipo_pago.setVisible(false);
    }//GEN-LAST:event_jTable_tipo_pagoMouseClicked

    private void jDateChooser_desdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_desdeKeyPressed

    }//GEN-LAST:event_jDateChooser_desdeKeyPressed

    private void jDateChooser_hastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_hastaKeyPressed

    }//GEN-LAST:event_jDateChooser_hastaKeyPressed

    private void jtexfield_cta_cteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtexfield_cta_cteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexfield_cta_cteFocusLost

    private void jtexfield_cta_cteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtexfield_cta_cteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexfield_cta_cteKeyPressed

    private void jtexfield_proveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtexfield_proveedorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexfield_proveedorFocusLost

    private void jtexfield_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtexfield_proveedorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexfield_proveedorKeyPressed

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
            new Listado_de_pagos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    public static com.toedter.calendar.JDateChooser jDateChooser_desde;
    public static com.toedter.calendar.JDateChooser jDateChooser_hasta;
    private javax.swing.JDialog jDialog_tipo_pago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_tipo_pago;
    public static javax.swing.JTextField jtexfield_cta_cte;
    public static javax.swing.JTextField jtexfield_proveedor;
    public static javax.swing.JTextField jtexfield_tipo_pago;
    // End of variables declaration//GEN-END:variables
}
