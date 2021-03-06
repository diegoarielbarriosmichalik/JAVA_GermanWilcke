package DEV;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Recibo_de_dinero extends javax.swing.JFrame {

    public Recibo_de_dinero() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Recibo de Dinero");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/4k_icon.png")).getImage());

        jDateChooser2.setDate(Metodos.hoy);
        jButton_borrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_proveedor = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jTextField_proveedor_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_proveedor = new javax.swing.JTable();
        jDialog_recibos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jTextField_proveedoor_buscar_recibos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_recibos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField_concepto = new javax.swing.JTextField();
        jTextField_dinero = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton_borrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_proveedor = new javax.swing.JTextField();
        jButton_borrado1 = new javax.swing.JButton();
        jButton_borrado2 = new javax.swing.JButton();
        jTextField_recibo = new javax.swing.JTextField();

        jDialog_proveedor.setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTextField_proveedor_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_proveedor_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_proveedor_buscarKeyReleased(evt);
            }
        });

        jTable_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Nombre Fantasia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jScrollPane1.setViewportView(jTable_proveedor);
        if (jTable_proveedor.getColumnModel().getColumnCount() > 0) {
            jTable_proveedor.getColumnModel().getColumn(0).setResizable(false);
            jTable_proveedor.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_proveedor.getColumnModel().getColumn(1).setResizable(false);
            jTable_proveedor.getColumnModel().getColumn(1).setPreferredWidth(470);
            jTable_proveedor.getColumnModel().getColumn(2).setResizable(false);
            jTable_proveedor.getColumnModel().getColumn(2).setPreferredWidth(235);
            jTable_proveedor.getColumnModel().getColumn(2).setHeaderValue("Nombre Fantasia");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jTextField_proveedor_buscar))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_proveedor_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_proveedorLayout = new javax.swing.GroupLayout(jDialog_proveedor.getContentPane());
        jDialog_proveedor.getContentPane().setLayout(jDialog_proveedorLayout);
        jDialog_proveedorLayout.setHorizontalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_proveedorLayout.setVerticalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_recibos.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTextField_proveedoor_buscar_recibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_proveedoor_buscar_recibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_proveedoor_buscar_recibosActionPerformed(evt);
            }
        });
        jTextField_proveedoor_buscar_recibos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_proveedoor_buscar_recibosKeyReleased(evt);
            }
        });

        jTable_recibos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fantasía"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_recibos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_recibosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_recibos);
        if (jTable_recibos.getColumnModel().getColumnCount() > 0) {
            jTable_recibos.getColumnModel().getColumn(0).setResizable(false);
            jTable_recibos.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_recibos.getColumnModel().getColumn(1).setResizable(false);
            jTable_recibos.getColumnModel().getColumn(1).setPreferredWidth(230);
            jTable_recibos.getColumnModel().getColumn(2).setResizable(false);
            jTable_recibos.getColumnModel().getColumn(2).setPreferredWidth(230);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jTextField_proveedoor_buscar_recibos))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_proveedoor_buscar_recibos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_recibosLayout = new javax.swing.GroupLayout(jDialog_recibos.getContentPane());
        jDialog_recibos.getContentPane().setLayout(jDialog_recibosLayout);
        jDialog_recibosLayout.setHorizontalGroup(
            jDialog_recibosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_recibosLayout.setVerticalGroup(
            jDialog_recibosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_concepto.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción"));
        jTextField_concepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_conceptoKeyPressed(evt);
            }
        });

        jTextField_dinero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_dinero.setBorder(javax.swing.BorderFactory.createTitledBorder("Dinero Recibido"));
        jTextField_dinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_dineroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_dineroKeyReleased(evt);
            }
        });

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));

        jButton_borrar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_borrar.setText("Borrar");
        jButton_borrar.setBorder(null);
        jButton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton2.setMnemonic('x');
        jButton2.setToolTipText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor (F1 buscar)"));
        jTextField_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_proveedorKeyPressed(evt);
            }
        });

        jButton_borrado1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_borrado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton_borrado1.setBorder(null);
        jButton_borrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrado1ActionPerformed(evt);
            }
        });

        jButton_borrado2.setBackground(new java.awt.Color(255, 255, 255));
        jButton_borrado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton_borrado2.setBorder(null);
        jButton_borrado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrado2ActionPerformed(evt);
            }
        });

        jTextField_recibo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_recibo.setBorder(javax.swing.BorderFactory.createTitledBorder("Recibo Nº"));
        jTextField_recibo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_reciboKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_reciboKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_concepto)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_borrado1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrado2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addGap(4, 4, 4))
                    .addComponent(jTextField_proveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_dinero, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_concepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_recibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_borrado1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_borrado2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_dineroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_dineroKeyReleased
        jTextField_dinero.setText(Metodos.getSepararMiles(jTextField_dinero.getText().replace(".", "")));
    }//GEN-LAST:event_jTextField_dineroKeyReleased

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed
        Metodos.Recibo_de_dinero_borrar();
        Clear();
//        Metodos.Clientes_estado_de_cuenta_buscar_cliente_cargar_lista();
//        this.setVisible(false);
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void jTextField_dineroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_dineroKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            Metodos.Recibos_guardar();
//            Metodos.Recibo_imprimir();
//            Metodos.Clientes_estado_de_cuenta_buscar_cliente_cargar_lista();
//            this.setVisible(false);
//        }
//        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
//            this.setVisible(false);
//        }
//        if (evt.getKeyCode() == KeyEvent.VK_F4) {
//            Metodos.Recibos_guardar();
//            Metodos.Recibo_imprimir();
//            Metodos.Clientes_estado_de_cuenta_buscar_cliente_cargar_lista();
//            this.setVisible(false);
//        }
    }//GEN-LAST:event_jTextField_dineroKeyPressed

    private void jTextField_conceptoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_conceptoKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
//            this.setVisible(false);
//        }
//        if (evt.getKeyCode() == KeyEvent.VK_F4) {
//            Metodos.Recibos_guardar();
//            Metodos.Recibo_imprimir();
//            Metodos.Clientes_estado_de_cuenta_buscar_cliente_cargar_lista();
//            this.setVisible(false);
//        }
    }//GEN-LAST:event_jTextField_conceptoKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_proveedor();
            Metodos.Recibo_de_dinero_proveedor_jtable(jTextField_proveedor_buscar.getText());
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_proveedorKeyPressed

    public void jDialog_proveedor() {
        jDialog_proveedor.setVisible(true);
        jDialog_proveedor.setTitle("Proveedor");
        jDialog_proveedor.setSize(500, 500);
        jDialog_proveedor.setLocationRelativeTo(null);
        jDialog_proveedor.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_recibos() {
        jDialog_recibos.setVisible(true);
        jDialog_recibos.setTitle("Recibos");
        jDialog_recibos.setSize(500, 500);
        jDialog_recibos.setLocationRelativeTo(null);
        jDialog_recibos.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    private void jButton_borrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrado1ActionPerformed
        jDialog_recibos();
        jTextField_proveedoor_buscar_recibos.setText("");
        jTextField_proveedoor_buscar_recibos.requestFocus();
        Metodos.Recibo_de_dinero_buscar_jtable(jTextField_proveedoor_buscar_recibos.getText());
    }//GEN-LAST:event_jButton_borrado1ActionPerformed

    private void jTextField_proveedor_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedor_buscarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_proveedor.setVisible(false);
        } else {
            if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
                try {
                    jTable_proveedor.requestFocus();
                    Robot r = new Robot();
                    r.keyPress(KeyEvent.VK_DOWN);
                } catch (AWTException ex) {
                    System.err.println(ex);
                }
            } else {
                Metodos.Recibo_de_dinero_proveedor_jtable(jTextField_proveedor_buscar.getText());
            }
        }
    }//GEN-LAST:event_jTextField_proveedor_buscarKeyReleased

    private void jTable_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_proveedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_proveedor.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Recido_de_dinero_proveedor_selected();
            jDialog_proveedor.setVisible(false);
        }
    }//GEN-LAST:event_jTable_proveedorKeyPressed

    private void jButton_borrado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrado2ActionPerformed
        Metodos.Recibo_de_dinero_proveedor_guardar(jTextField_proveedor.getText(), jTextField_dinero.getText(), jTextField_concepto.getText(), jDateChooser2.getDate(), jTextField_recibo.getText());
        Clear();
    }//GEN-LAST:event_jButton_borrado2ActionPerformed

    public static void Clear() {
        jTextField_concepto.setText("");
        jTextField_dinero.setText("");
        jTextField_proveedor.setText("");
        jTextField_recibo.setText("");
        jDateChooser2.setDate(Metodos.hoy);
        jTextField_proveedor.requestFocus();

    }

    private void jTextField_reciboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_reciboKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_reciboKeyPressed

    private void jTextField_reciboKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_reciboKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_reciboKeyReleased

    private void jTextField_proveedoor_buscar_recibosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedoor_buscar_recibosKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_recibos.setVisible(false);
        } else {
            if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
                try {
                    jTable_recibos.requestFocus();
                    Robot r = new Robot();
                    r.keyPress(KeyEvent.VK_DOWN);
                } catch (AWTException ex) {
                    System.err.println(ex);
                }
            } else {
                Metodos.Recibo_de_dinero_buscar_jtable(jTextField_proveedoor_buscar_recibos.getText());
            }
        }
    }//GEN-LAST:event_jTextField_proveedoor_buscar_recibosKeyReleased

    private void jTable_recibosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_recibosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_recibos.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Recibo_de_dinero_selected();
            Metodos.Recibo_de_dinero_traer_datos();
            jDialog_recibos.setVisible(false);
            jButton_borrar.setVisible(true);
            
        }
    }//GEN-LAST:event_jTable_recibosKeyPressed

    private void jTextField_proveedoor_buscar_recibosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_proveedoor_buscar_recibosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_proveedoor_buscar_recibosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo_de_dinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Recibo_de_dinero().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton_borrado1;
    public static javax.swing.JButton jButton_borrado2;
    public static javax.swing.JButton jButton_borrar;
    public static com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JDialog jDialog_proveedor;
    private javax.swing.JDialog jDialog_recibos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_proveedor;
    public static javax.swing.JTable jTable_recibos;
    public static javax.swing.JTextField jTextField_concepto;
    public static javax.swing.JTextField jTextField_dinero;
    private javax.swing.JTextField jTextField_proveedoor_buscar_recibos;
    public static javax.swing.JTextField jTextField_proveedor;
    private javax.swing.JTextField jTextField_proveedor_buscar;
    public static javax.swing.JTextField jTextField_recibo;
    // End of variables declaration//GEN-END:variables
}
