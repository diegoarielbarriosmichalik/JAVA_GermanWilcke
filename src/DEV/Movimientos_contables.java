package DEV;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Movimientos_contables extends javax.swing.JFrame {

    public Movimientos_contables() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Movimientos contables");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Conexion.Verificar_conexion();

        Movimientos_contables_clear();

    }

    public static void Movimientos_contables_clear() {
        jButton_factura.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_factura = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jTextField_cuenta = new javax.swing.JTextField();
        jTextField_descripcion = new javax.swing.JTextField();
        jTextField_cantidad = new javax.swing.JTextField();
        jTextField_precio = new javax.swing.JTextField();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jButton_guardar_factura = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jDialog_pago = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jTextField_tipo = new javax.swing.JTextField();
        jTextField_banco = new javax.swing.JTextField();
        jTextField_cta_cte = new javax.swing.JTextField();
        jTextField_numero = new javax.swing.JTextField();
        jTextField_pago_importe = new javax.swing.JTextField();
        jDateChooser_pago_fecha = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jDialog_cuentas_vinculadas = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_cuentas_vinculadas = new javax.swing.JTable();
        jTextField_cuenta_buscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_borrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton_pagos = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton_factura = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();

        jDialog_factura.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_cuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta (F1 buscar)"));
        jTextField_cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_cuentaKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cuentaKeyPressed(evt);
            }
        });

        jTextField_descripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción "));
        jTextField_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_descripcionKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_descripcionKeyPressed(evt);
            }
        });

        jTextField_cantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        jTextField_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_cantidadKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cantidadKeyPressed(evt);
            }
        });

        jTextField_precio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Importe"));
        jTextField_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_precioActionPerformed(evt);
            }
        });
        jTextField_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyPressed(evt);
            }
        });

        jDateChooser_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser_fechaKeyPressed(evt);
            }
        });

        jButton_guardar_factura.setMnemonic('g');
        jButton_guardar_factura.setText("Guardar");
        jButton_guardar_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_guardar_facturaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_cuenta)
                    .addComponent(jTextField_descripcion)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_guardar_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 180, Short.MAX_VALUE))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_guardar_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_facturaLayout = new javax.swing.GroupLayout(jDialog_factura.getContentPane());
        jDialog_factura.getContentPane().setLayout(jDialog_facturaLayout);
        jDialog_facturaLayout.setHorizontalGroup(
            jDialog_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_facturaLayout.setVerticalGroup(
            jDialog_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_pago.setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_tipo.setToolTipText("");
        jTextField_tipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo (F1 buscar)"));

        jTextField_banco.setToolTipText("");
        jTextField_banco.setBorder(javax.swing.BorderFactory.createTitledBorder("Banco (F1 buscar)"));

        jTextField_cta_cte.setToolTipText("");
        jTextField_cta_cte.setBorder(javax.swing.BorderFactory.createTitledBorder("Cta Cte (F1 buscar)"));

        jTextField_numero.setToolTipText("");
        jTextField_numero.setBorder(javax.swing.BorderFactory.createTitledBorder("Número"));

        jTextField_pago_importe.setToolTipText("");
        jTextField_pago_importe.setBorder(javax.swing.BorderFactory.createTitledBorder("Importe"));

        jDateChooser_pago_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_pago_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser_pago_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser_pago_fechaKeyPressed(evt);
            }
        });

        jButton2.setText("Guardar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_tipo)
                    .addComponent(jTextField_banco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_cta_cte, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_pago_importe, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser_pago_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 100, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_cta_cte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_pago_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser_pago_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_pagoLayout = new javax.swing.GroupLayout(jDialog_pago.getContentPane());
        jDialog_pago.getContentPane().setLayout(jDialog_pagoLayout);
        jDialog_pagoLayout.setHorizontalGroup(
            jDialog_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_pagoLayout.setVerticalGroup(
            jDialog_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_cuentas_vinculadas.setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_cuentas_vinculadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción", "Cuenta"
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
        jScrollPane5.setViewportView(jTable_cuentas_vinculadas);
        if (jTable_cuentas_vinculadas.getColumnModel().getColumnCount() > 0) {
            jTable_cuentas_vinculadas.getColumnModel().getColumn(0).setResizable(false);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(1).setResizable(false);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(1).setPreferredWidth(230);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(2).setResizable(false);
            jTable_cuentas_vinculadas.getColumnModel().getColumn(2).setPreferredWidth(230);
        }

        jTextField_cuenta_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por descripción"));
        jTextField_cuenta_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_cuenta_buscarKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cuenta_buscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jTextField_cuenta_buscar))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_cuenta_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_cuentas_vinculadasLayout = new javax.swing.GroupLayout(jDialog_cuentas_vinculadas.getContentPane());
        jDialog_cuentas_vinculadas.getContentPane().setLayout(jDialog_cuentas_vinculadasLayout);
        jDialog_cuentas_vinculadasLayout.setHorizontalGroup(
            jDialog_cuentas_vinculadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_cuentas_vinculadasLayout.setVerticalGroup(
            jDialog_cuentas_vinculadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Cuenta", "Descripción", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Tipo", "Número", "Cta Cte", "Banco", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton_pagos.setMnemonic('p');
        jButton_pagos.setText("Agregar Pago");
        jButton_pagos.setToolTipText("");
        jButton_pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pagosActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        jButton_factura.setMnemonic('f');
        jButton_factura.setText("Agregar Facturas");
        jButton_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_facturaActionPerformed(evt);
            }
        });
        jButton_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_facturaKeyPressed(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder("Asiento Contable Nro"));

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jButton_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //  Metodos.Cliente_clear();
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

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
//        jDialog_buscar();
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jTextField_cuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_factura.setVisible(false);
            jButton_factura.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_cuentas_vinculadas();
        }
    }//GEN-LAST:event_jTextField_cuentaKeyPressed

    private void jTextField_cuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuentaKeyReleased

    }//GEN-LAST:event_jTextField_cuentaKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_facturaActionPerformed
        jDialog_factura();
    }//GEN-LAST:event_jButton_facturaActionPerformed

    public void jDialog_factura() {
        jDialog_factura.setVisible(true);
        jDialog_factura.setTitle("Agregar Factura");
        jDialog_factura.setSize(501, 238);
        jDialog_factura.setLocationRelativeTo(null);
        jDialog_factura.setAlwaysOnTop(true);
        jDialog_factura.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jTextField_cuenta.requestFocus();
    }

    public void jDialog_cuentas_vinculadas() {
        jDialog_cuentas_vinculadas.setVisible(true);
        jDialog_cuentas_vinculadas.setTitle("Cuentas Viculadas");
        jDialog_cuentas_vinculadas.setSize(500, 500);
        jDialog_cuentas_vinculadas.setLocationRelativeTo(null);
        jDialog_cuentas_vinculadas.setAlwaysOnTop(true);
        jDialog_cuentas_vinculadas.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Movimientos_contables_cuentas_vinculadas_jtable(jTextField_cuenta_buscar.getText());
        jTextField_cuenta_buscar.setText("");
        jTextField_cuenta_buscar.requestFocus();

    }
    public void jDialog_pago() {
        jDialog_pago.setVisible(true);
        jDialog_pago.setTitle("Forma de Pago");
        jDialog_pago.setSize(501, 290);
        jDialog_pago.setLocationRelativeTo(null);
        jDialog_pago.setAlwaysOnTop(true);
        jDialog_pago.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
//        Metodos.Movimientos_contables_cuentas_vinculadas_jtable(jTextField_cuenta_buscar.getText());
        jTextField_tipo.setText("");
        jTextField_tipo.requestFocus();
        
//        jTextField_cuenta_buscar.requestFocus();

    }
    private void jTextField_descripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_descripcionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_descripcionKeyReleased

    private void jTextField_descripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_descripcionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_factura.setVisible(false);
            jButton_factura.requestFocus();
        }
    }//GEN-LAST:event_jTextField_descripcionKeyPressed

    private void jTextField_cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cantidadKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cantidadKeyReleased

    private void jTextField_cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_factura.setVisible(false);
            jButton_factura.requestFocus();
        }
    }//GEN-LAST:event_jTextField_cantidadKeyPressed

    private void jTextField_precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyReleased
        jTextField_precio.setText(Metodos.Separar_Miles(jTextField_precio.getText()));
    }//GEN-LAST:event_jTextField_precioKeyReleased

    private void jTextField_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_factura.setVisible(false);
            jButton_factura.requestFocus();
        }
    }//GEN-LAST:event_jTextField_precioKeyPressed

    private void jDateChooser_fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_fechaKeyPressed

    }//GEN-LAST:event_jDateChooser_fechaKeyPressed

    private void jButton_guardar_facturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_guardar_facturaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_factura.setVisible(false);
            jButton_factura.requestFocus();
        }
    }//GEN-LAST:event_jButton_guardar_facturaKeyPressed

    private void jButton_facturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_facturaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton_facturaKeyPressed

    private void jTable_cuentas_vinculadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_cuentas_vinculadasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_cuentas_vinculadasMouseClicked

    private void jTable_cuentas_vinculadasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_cuentas_vinculadasKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_cuentas_vinculadas.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Movimientos_contables_cuenta_vinculada_selected();
            jDialog_cuentas_vinculadas.setVisible(false);
        }


    }//GEN-LAST:event_jTable_cuentas_vinculadasKeyPressed

    private void jTextField_cuenta_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuenta_buscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cuenta_buscarKeyPressed

    private void jTextField_cuenta_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuenta_buscarKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_cuentas_vinculadas.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                System.err.println(ex);
            }
        } else {
            Metodos.Movimientos_contables_cuentas_vinculadas_jtable(jTextField_cuenta_buscar.getText());
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_cuentas_vinculadas.setVisible(false);
            jTextField_cuenta.requestFocus();
        }
    }//GEN-LAST:event_jTextField_cuenta_buscarKeyReleased

    private void jTextField_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precioActionPerformed

    private void jDateChooser3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser3KeyPressed

    }//GEN-LAST:event_jDateChooser3KeyPressed

    private void jDateChooser_pago_fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_pago_fechaKeyPressed

    }//GEN-LAST:event_jDateChooser_pago_fechaKeyPressed

    private void jButton_pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pagosActionPerformed
        jDialog_pago();
    }//GEN-LAST:event_jButton_pagosActionPerformed

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
            new Movimientos_contables().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton_borrar;
    private javax.swing.JButton jButton_buscar;
    public static javax.swing.JButton jButton_factura;
    private javax.swing.JButton jButton_guardar_factura;
    public static javax.swing.JButton jButton_pagos;
    public static com.toedter.calendar.JDateChooser jDateChooser3;
    public static com.toedter.calendar.JDateChooser jDateChooser_fecha;
    public static com.toedter.calendar.JDateChooser jDateChooser_pago_fecha;
    private javax.swing.JDialog jDialog_cuentas_vinculadas;
    private javax.swing.JDialog jDialog_factura;
    private javax.swing.JDialog jDialog_pago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable_cuentas_vinculadas;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField_banco;
    private javax.swing.JTextField jTextField_cantidad;
    private javax.swing.JTextField jTextField_cta_cte;
    public static javax.swing.JTextField jTextField_cuenta;
    private javax.swing.JTextField jTextField_cuenta_buscar;
    private javax.swing.JTextField jTextField_descripcion;
    private javax.swing.JTextField jTextField_numero;
    private javax.swing.JTextField jTextField_pago_importe;
    private javax.swing.JTextField jTextField_precio;
    private javax.swing.JTextField jTextField_tipo;
    // End of variables declaration//GEN-END:variables
}
