package DEV;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Cheques extends javax.swing.JFrame {
    
    public Cheques() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cheques");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/4k_icon.png")).getImage());
        Clear();
    }
    
    public static void Clear() {
        jTextField_proveedor.setText("");
        jTextField_buscar_proveedor.setText("");
        jTextField_cuenta.setText("");
        jTextField_descripcion.setText("");
        jTextField_importe.setText("");
        jTextField_numero.setText("");
        jDateChooser_fecha.setDate(Metodos.hoy);
        jTextField_numero.requestFocus();
        Metodos.cheques_id_cuenta_bancaria = 0;
        Metodos.cheques_id_proveedor = 0;
        Metodos.id_cheque = 0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_cheques = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cheques = new javax.swing.JTable();
        jTextField_buscar_cheque = new javax.swing.JTextField();
        jDialog_proveedor = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_proveedor = new javax.swing.JTable();
        jTextField_buscar_proveedor = new javax.swing.JTextField();
        jDialog_cuenta_bancaria = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_cuenta_bancaria = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField_cuenta = new javax.swing.JTextField();
        jTextField_proveedor = new javax.swing.JTextField();
        jTextField_numero = new javax.swing.JTextField();
        jTextField_importe = new javax.swing.JTextField();
        jTextField_descripcion = new javax.swing.JTextField();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jButton_buscar = new javax.swing.JButton();
        jButton_imprimir1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_imprimir2 = new javax.swing.JButton();

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

        jDialog_proveedor.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 500));

        jTable_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_proveedorKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_proveedor);
        if (jTable_proveedor.getColumnModel().getColumnCount() > 0) {
            jTable_proveedor.getColumnModel().getColumn(0).setResizable(false);
            jTable_proveedor.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_proveedor.getColumnModel().getColumn(1).setResizable(false);
            jTable_proveedor.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        jTextField_buscar_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_buscar_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscar_proveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_buscar_proveedorKeyReleased(evt);
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
                    .addComponent(jTextField_buscar_proveedor))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_proveedorLayout = new javax.swing.GroupLayout(jDialog_proveedor.getContentPane());
        jDialog_proveedor.getContentPane().setLayout(jDialog_proveedorLayout);
        jDialog_proveedorLayout.setHorizontalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_proveedorLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog_proveedorLayout.setVerticalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_proveedorLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDialog_cuenta_bancaria.setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 500));

        jTable_cuenta_bancaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Numero", "Banco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_cuenta_bancaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_cuenta_bancariaKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_cuenta_bancaria);
        if (jTable_cuenta_bancaria.getColumnModel().getColumnCount() > 0) {
            jTable_cuenta_bancaria.getColumnModel().getColumn(0).setResizable(false);
            jTable_cuenta_bancaria.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_cuenta_bancaria.getColumnModel().getColumn(1).setResizable(false);
            jTable_cuenta_bancaria.getColumnModel().getColumn(1).setPreferredWidth(235);
            jTable_cuenta_bancaria.getColumnModel().getColumn(2).setResizable(false);
            jTable_cuenta_bancaria.getColumnModel().getColumn(2).setPreferredWidth(235);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_cuenta_bancariaLayout = new javax.swing.GroupLayout(jDialog_cuenta_bancaria.getContentPane());
        jDialog_cuenta_bancaria.getContentPane().setLayout(jDialog_cuenta_bancariaLayout);
        jDialog_cuenta_bancariaLayout.setHorizontalGroup(
            jDialog_cuenta_bancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_cuenta_bancariaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog_cuenta_bancariaLayout.setVerticalGroup(
            jDialog_cuenta_bancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_cuenta_bancariaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_cuenta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255)), "Cuenta Bancaria(F1 buscar)")); // NOI18N
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

        jTextField_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255)), "A la orden de (F1 buscar)")); // NOI18N
        jTextField_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_proveedorKeyPressed(evt);
            }
        });

        jTextField_numero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255)), "Número")); // NOI18N
        jTextField_numero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_numeroFocusLost(evt);
            }
        });

        jTextField_importe.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255)), "Importe")); // NOI18N
        jTextField_importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_importeKeyReleased(evt);
            }
        });

        jTextField_descripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255)), "Descripción")); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_cuenta))
                            .addComponent(jTextField_proveedor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_importe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_imprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_imprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton_imprimir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton_imprimir2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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

    private void jTextField_cuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuentaKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_F1)) {
            jDialog_cuenta_bancaria();
            Metodos.Cheques_cuentas_bancarias_jtable();
        }
    }//GEN-LAST:event_jTextField_cuentaKeyPressed

    private void jTextField_numeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_numeroFocusLost
//        Metodos.Cheques_verificar();
    }//GEN-LAST:event_jTextField_numeroFocusLost

    private void jTextField_cuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_cuentaFocusLost
//        Metodos.Cheques_verificar();
    }//GEN-LAST:event_jTextField_cuentaFocusLost

    private void jTextField_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedorKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_F1)) {
            jDialog_Proveedor();
        }
    }//GEN-LAST:event_jTextField_proveedorKeyPressed

    private void jTable_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_proveedorKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Cheques_proveedor_selected();
            jDialog_proveedor.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_proveedor.setVisible(false);
        }
    }//GEN-LAST:event_jTable_proveedorKeyPressed

    private void jTextField_buscar_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_proveedorKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_proveedor.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_buscar_proveedorKeyPressed

    private void jTextField_buscar_proveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_proveedorKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_proveedor.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                
            }
        } else {
            Metodos.Cheques_proveedor_jtable(jTextField_buscar_proveedor.getText());
        }
    }//GEN-LAST:event_jTextField_buscar_proveedorKeyReleased

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
        Metodos.Cheque_guardar(jTextField_numero.getText(), jTextField_importe.getText(), jDateChooser_fecha.getDate(), jTextField_descripcion.getText());
        Clear();
    }//GEN-LAST:event_jButton_imprimir2ActionPerformed

    private void jTable_cuenta_bancariaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_cuenta_bancariaKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_cuenta_bancaria.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Cheques_cuentas_bancarias_selected();
            jDialog_cuenta_bancaria.setVisible(false);
        }
    }//GEN-LAST:event_jTable_cuenta_bancariaKeyPressed

    private void jTextField_importeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_importeKeyReleased
        jTextField_importe.setText(Metodos.getSepararMiles(jTextField_importe.getText().replace(".", "")));
    }//GEN-LAST:event_jTextField_importeKeyReleased
    
    public void jDialog_cheques() {
        jDialog_cheques.setVisible(true);
        jDialog_cheques.setTitle("Cheques");
        jDialog_cheques.setSize(500, 500);
        jDialog_cheques.setLocationRelativeTo(null);
        jDialog_cheques.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/4k_icon.png")).getImage());
    }
    
    public void jDialog_Proveedor() {
        jDialog_proveedor.setVisible(true);
        jDialog_proveedor.setTitle("Beneficiarios");
        jDialog_proveedor.setSize(500, 500);
        jDialog_proveedor.setLocationRelativeTo(null);
        jDialog_proveedor.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/4k_icon.png")).getImage());
        jTextField_buscar_proveedor.setText("");
        jTextField_buscar_proveedor.requestFocus();
    }
    
    public void jDialog_cuenta_bancaria() {
        jDialog_cuenta_bancaria.setVisible(true);
        jDialog_cuenta_bancaria.setTitle("Cuentas Bancarias");
        jDialog_cuenta_bancaria.setSize(500, 500);
        jDialog_cuenta_bancaria.setLocationRelativeTo(null);
        jDialog_cuenta_bancaria.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/4k_icon.png")).getImage());
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
            java.util.logging.Logger.getLogger(Cheques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Cheques().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_imprimir1;
    private javax.swing.JButton jButton_imprimir2;
    public static com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private javax.swing.JDialog jDialog_cheques;
    private javax.swing.JDialog jDialog_cuenta_bancaria;
    private javax.swing.JDialog jDialog_proveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_cheques;
    public static javax.swing.JTable jTable_cuenta_bancaria;
    public static javax.swing.JTable jTable_proveedor;
    private javax.swing.JTextField jTextField_buscar_cheque;
    public static javax.swing.JTextField jTextField_buscar_proveedor;
    public static javax.swing.JTextField jTextField_cuenta;
    public static javax.swing.JTextField jTextField_descripcion;
    public static javax.swing.JTextField jTextField_importe;
    public static javax.swing.JTextField jTextField_numero;
    public static javax.swing.JTextField jTextField_proveedor;
    // End of variables declaration//GEN-END:variables
}
