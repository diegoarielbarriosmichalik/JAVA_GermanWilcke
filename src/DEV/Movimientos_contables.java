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
        Metodos.Movimientos_contables_max();
        Metodos.Movimientos_contables_traer_datos();
        Metodos.Movimientos_contables_factura_jtable();
        Metodos.Movimientos_contables_pago_jtable();
        Metodos.Movimientos_contables_totales();
        
        jButton_borrar.setVisible(false);
    }

    public static void Movimientos_contables_clear() {
        jButton_factura.requestFocus();
        jDateChooser_factura_fecha.setDate(Metodos.hoy);
        Metodos.Movimientos_contables_factura_jtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_factura = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jTextField_factura_cuenta = new javax.swing.JTextField();
        jTextField_descripcion = new javax.swing.JTextField();
        jTextField_importe = new javax.swing.JTextField();
        jDateChooser_factura_fecha = new com.toedter.calendar.JDateChooser();
        jButton_guardar_factura = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField_comprobante = new javax.swing.JTextField();
        jTextField_factura_proveedor = new javax.swing.JTextField();
        jDialog_pago = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jTextField_pago_tipo = new javax.swing.JTextField();
        jTextField_pago_cta_cte = new javax.swing.JTextField();
        jTextField_pago_numero = new javax.swing.JTextField();
        jTextField_pago_importe = new javax.swing.JTextField();
        jDateChooser_pago_fecha = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField_pago_nombre = new javax.swing.JTextField();
        jDialog_cuentas_vinculadas = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_cuentas_vinculadas = new javax.swing.JTable();
        jTextField_cuenta_buscar = new javax.swing.JTextField();
        jDialog_detalle_borrar = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jDialog_buscar = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_buscar = new javax.swing.JTable();
        jDialog_tipo_pago = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_tipo_pago = new javax.swing.JTable();
        jDialog_cuenta_bancaria = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_cuenta_bancaria = new javax.swing.JTable();
        jDialog_pago_borrar = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jDialog_proveedor = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_factura_proveedor = new javax.swing.JTable();
        jTextField_proveedor_buscar = new javax.swing.JTextField();
        jDialog_pago_proveedor = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable_pago_proveedor = new javax.swing.JTable();
        jTextField_pago_proveedor_buscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_borrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_movimeintos_contables_factura = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_pago = new javax.swing.JTable();
        jButton_pagos = new javax.swing.JButton();
        jTextField_total_factura = new javax.swing.JTextField();
        jButton_factura = new javax.swing.JButton();
        jTextField_total_pago = new javax.swing.JTextField();
        jTextField_asiento_nro = new javax.swing.JTextField();
        jDateChooser_asiento_fecha = new com.toedter.calendar.JDateChooser();

        jDialog_factura.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_factura_cuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta (F1 buscar)"));
        jTextField_factura_cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_factura_cuentaKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_factura_cuentaKeyPressed(evt);
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

        jTextField_importe.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_importe.setBorder(javax.swing.BorderFactory.createTitledBorder("Importe"));
        jTextField_importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_importeActionPerformed(evt);
            }
        });
        jTextField_importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_importeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_importeKeyReleased(evt);
            }
        });

        jDateChooser_factura_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_factura_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser_factura_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser_factura_fechaKeyPressed(evt);
            }
        });

        jButton_guardar_factura.setMnemonic('g');
        jButton_guardar_factura.setText("Guardar");
        jButton_guardar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_facturaActionPerformed(evt);
            }
        });
        jButton_guardar_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_guardar_facturaKeyPressed(evt);
            }
        });

        jTextField_comprobante.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_comprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Comprobante"));
        jTextField_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_comprobanteActionPerformed(evt);
            }
        });
        jTextField_comprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_comprobanteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_comprobanteKeyReleased(evt);
            }
        });

        jTextField_factura_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre o Razón Social (F1 buscar)"));
        jTextField_factura_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_factura_proveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_factura_proveedorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_factura_cuenta)
                    .addComponent(jTextField_descripcion)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 371, Short.MAX_VALUE)
                        .addComponent(jButton_guardar_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField_importe, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser_factura_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField_factura_proveedor))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_factura_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_factura_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser_factura_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jTextField_pago_tipo.setToolTipText("");
        jTextField_pago_tipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo (F1 buscar)"));
        jTextField_pago_tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_pago_tipoKeyPressed(evt);
            }
        });

        jTextField_pago_cta_cte.setToolTipText("");
        jTextField_pago_cta_cte.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Bancaria (F1 buscar)"));
        jTextField_pago_cta_cte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_pago_cta_cteKeyPressed(evt);
            }
        });

        jTextField_pago_numero.setToolTipText("");
        jTextField_pago_numero.setBorder(javax.swing.BorderFactory.createTitledBorder("Número"));
        jTextField_pago_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_pago_numeroKeyPressed(evt);
            }
        });

        jTextField_pago_importe.setToolTipText("");
        jTextField_pago_importe.setBorder(javax.swing.BorderFactory.createTitledBorder("Importe"));
        jTextField_pago_importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_pago_importeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_pago_importeKeyReleased(evt);
            }
        });

        jDateChooser_pago_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_pago_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser_pago_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser_pago_fechaKeyPressed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jTextField_pago_nombre.setToolTipText("");
        jTextField_pago_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre o Razón Social (F1 buscar)"));
        jTextField_pago_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_pago_nombreKeyPressed(evt);
            }
        });

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
                    .addComponent(jTextField_pago_cta_cte, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField_pago_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_pago_importe, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser_pago_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addComponent(jTextField_pago_tipo)
                    .addComponent(jTextField_pago_nombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_pago_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_pago_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_pago_cta_cte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_pago_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jDialog_detalle_borrar.setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jButton5.setText("Borrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_detalle_borrarLayout = new javax.swing.GroupLayout(jDialog_detalle_borrar.getContentPane());
        jDialog_detalle_borrar.getContentPane().setLayout(jDialog_detalle_borrarLayout);
        jDialog_detalle_borrarLayout.setHorizontalGroup(
            jDialog_detalle_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_detalle_borrarLayout.setVerticalGroup(
            jDialog_detalle_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog_buscar.setUndecorated(true);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTable_buscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asiento Número", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_buscarMouseClicked(evt);
            }
        });
        jTable_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_buscarKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_buscar);
        if (jTable_buscar.getColumnModel().getColumnCount() > 0) {
            jTable_buscar.getColumnModel().getColumn(0).setResizable(false);
            jTable_buscar.getColumnModel().getColumn(0).setPreferredWidth(250);
            jTable_buscar.getColumnModel().getColumn(1).setResizable(false);
            jTable_buscar.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_buscarLayout = new javax.swing.GroupLayout(jDialog_buscar.getContentPane());
        jDialog_buscar.getContentPane().setLayout(jDialog_buscarLayout);
        jDialog_buscarLayout.setHorizontalGroup(
            jDialog_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_buscarLayout.setVerticalGroup(
            jDialog_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_tipo_pago.setUndecorated(true);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

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
        jTable_tipo_pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_tipo_pagoKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_tipo_pago);
        if (jTable_tipo_pago.getColumnModel().getColumnCount() > 0) {
            jTable_tipo_pago.getColumnModel().getColumn(0).setResizable(false);
            jTable_tipo_pago.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_tipo_pago.getColumnModel().getColumn(1).setResizable(false);
            jTable_tipo_pago.getColumnModel().getColumn(1).setPreferredWidth(230);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_tipo_pagoLayout = new javax.swing.GroupLayout(jDialog_tipo_pago.getContentPane());
        jDialog_tipo_pago.getContentPane().setLayout(jDialog_tipo_pagoLayout);
        jDialog_tipo_pagoLayout.setHorizontalGroup(
            jDialog_tipo_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_tipo_pagoLayout.setVerticalGroup(
            jDialog_tipo_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_cuenta_bancaria.setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_cuenta_bancaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Cuenta Bancaria", "Número", "Banco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane6.setViewportView(jTable_cuenta_bancaria);
        if (jTable_cuenta_bancaria.getColumnModel().getColumnCount() > 0) {
            jTable_cuenta_bancaria.getColumnModel().getColumn(0).setResizable(false);
            jTable_cuenta_bancaria.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_cuenta_bancaria.getColumnModel().getColumn(1).setResizable(false);
            jTable_cuenta_bancaria.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable_cuenta_bancaria.getColumnModel().getColumn(2).setResizable(false);
            jTable_cuenta_bancaria.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTable_cuenta_bancaria.getColumnModel().getColumn(3).setResizable(false);
            jTable_cuenta_bancaria.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_cuenta_bancariaLayout = new javax.swing.GroupLayout(jDialog_cuenta_bancaria.getContentPane());
        jDialog_cuenta_bancaria.getContentPane().setLayout(jDialog_cuenta_bancariaLayout);
        jDialog_cuenta_bancariaLayout.setHorizontalGroup(
            jDialog_cuenta_bancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_cuenta_bancariaLayout.setVerticalGroup(
            jDialog_cuenta_bancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_pago_borrar.setUndecorated(true);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jButton7.setText("Borrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_pago_borrarLayout = new javax.swing.GroupLayout(jDialog_pago_borrar.getContentPane());
        jDialog_pago_borrar.getContentPane().setLayout(jDialog_pago_borrarLayout);
        jDialog_pago_borrarLayout.setHorizontalGroup(
            jDialog_pago_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_pago_borrarLayout.setVerticalGroup(
            jDialog_pago_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog_proveedor.setUndecorated(true);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTable_factura_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre o Razón Social"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_factura_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_factura_proveedorMouseClicked(evt);
            }
        });
        jTable_factura_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_factura_proveedorKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(jTable_factura_proveedor);
        if (jTable_factura_proveedor.getColumnModel().getColumnCount() > 0) {
            jTable_factura_proveedor.getColumnModel().getColumn(0).setResizable(false);
            jTable_factura_proveedor.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_factura_proveedor.getColumnModel().getColumn(1).setResizable(false);
            jTable_factura_proveedor.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        jTextField_proveedor_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_proveedor_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_proveedor_buscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jTextField_proveedor_buscar))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_proveedor_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_proveedorLayout = new javax.swing.GroupLayout(jDialog_proveedor.getContentPane());
        jDialog_proveedor.getContentPane().setLayout(jDialog_proveedorLayout);
        jDialog_proveedorLayout.setHorizontalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_proveedorLayout.setVerticalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_pago_proveedor.setUndecorated(true);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTable_pago_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre o Razón Social"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_pago_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pago_proveedorMouseClicked(evt);
            }
        });
        jTable_pago_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_pago_proveedorKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(jTable_pago_proveedor);
        if (jTable_pago_proveedor.getColumnModel().getColumnCount() > 0) {
            jTable_pago_proveedor.getColumnModel().getColumn(0).setResizable(false);
            jTable_pago_proveedor.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_pago_proveedor.getColumnModel().getColumn(1).setResizable(false);
            jTable_pago_proveedor.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        jTextField_pago_proveedor_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_pago_proveedor_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_pago_proveedor_buscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jTextField_pago_proveedor_buscar))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_pago_proveedor_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_pago_proveedorLayout = new javax.swing.GroupLayout(jDialog_pago_proveedor.getContentPane());
        jDialog_pago_proveedor.getContentPane().setLayout(jDialog_pago_proveedorLayout);
        jDialog_pago_proveedorLayout.setHorizontalGroup(
            jDialog_pago_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_pago_proveedorLayout.setVerticalGroup(
            jDialog_pago_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jButton_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_buscarKeyPressed(evt);
            }
        });

        jTable_movimeintos_contables_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Nombre o razón Social", "Cuenta", "Descripción", "Comprobante", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_movimeintos_contables_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_movimeintos_contables_facturaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_movimeintos_contables_factura);
        if (jTable_movimeintos_contables_factura.getColumnModel().getColumnCount() > 0) {
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(0).setResizable(false);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(1).setResizable(false);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(2).setResizable(false);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(2).setPreferredWidth(190);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(3).setResizable(false);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(3).setPreferredWidth(190);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(4).setResizable(false);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(4).setPreferredWidth(190);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(5).setResizable(false);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(5).setPreferredWidth(40);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(6).setResizable(false);
            jTable_movimeintos_contables_factura.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        jTable_pago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Nombre o Razón Social", "Tipo", "Número", "Cta Cte", "Banco", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pagoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_pago);
        if (jTable_pago.getColumnModel().getColumnCount() > 0) {
            jTable_pago.getColumnModel().getColumn(0).setResizable(false);
            jTable_pago.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable_pago.getColumnModel().getColumn(1).setResizable(false);
            jTable_pago.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable_pago.getColumnModel().getColumn(2).setResizable(false);
            jTable_pago.getColumnModel().getColumn(2).setPreferredWidth(250);
            jTable_pago.getColumnModel().getColumn(3).setResizable(false);
            jTable_pago.getColumnModel().getColumn(4).setResizable(false);
            jTable_pago.getColumnModel().getColumn(5).setResizable(false);
            jTable_pago.getColumnModel().getColumn(6).setResizable(false);
            jTable_pago.getColumnModel().getColumn(6).setPreferredWidth(70);
            jTable_pago.getColumnModel().getColumn(7).setResizable(false);
            jTable_pago.getColumnModel().getColumn(7).setPreferredWidth(30);
        }

        jButton_pagos.setMnemonic('p');
        jButton_pagos.setText("Agregar forma de pago");
        jButton_pagos.setToolTipText("");
        jButton_pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pagosActionPerformed(evt);
            }
        });
        jButton_pagos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_pagosKeyPressed(evt);
            }
        });

        jTextField_total_factura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_total_factura.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        jButton_factura.setMnemonic('f');
        jButton_factura.setText("Agregar detalles");
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

        jTextField_total_pago.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_total_pago.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        jTextField_asiento_nro.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField_asiento_nro.setBorder(javax.swing.BorderFactory.createTitledBorder("Asiento Contable Nro"));

        jDateChooser_asiento_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_asiento_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser_asiento_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser_asiento_fechaKeyPressed(evt);
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField_asiento_nro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser_asiento_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_total_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_total_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_asiento_nro)
                    .addComponent(jDateChooser_asiento_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_total_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_total_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Metodos.Asiento_contable_guardar();
        Metodos.Movimientos_contables_traer_datos();
        Movimientos_contables_clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed
        jButton_borrar.setVisible(false);
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        jDialog_buscar();
        Metodos.Movimientos_contables_buscar_jtable();

    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jTextField_factura_cuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_factura_cuentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_factura.setVisible(false);
            jButton_factura.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_cuentas_vinculadas();
        }
    }//GEN-LAST:event_jTextField_factura_cuentaKeyPressed

    private void jTextField_factura_cuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_factura_cuentaKeyReleased

    }//GEN-LAST:event_jTextField_factura_cuentaKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_facturaActionPerformed
        jDialog_factura();
    }//GEN-LAST:event_jButton_facturaActionPerformed

    public void jDialog_factura() {

        Metodos.movimientos_contables_cuentas_vicnuladas_id_cuenta = 0;
        jTextField_factura_cuenta.setText("");
        jTextField_descripcion.setText("");
        jTextField_comprobante.setText("");
        jTextField_importe.setText("");
        jDateChooser_factura_fecha.setDate(Metodos.hoy);

        jDialog_factura.setVisible(true);
        jDialog_factura.setTitle("Agregar Factura");
        jDialog_factura.setSize(501, 283);
        jDialog_factura.setLocationRelativeTo(null);
        jDialog_factura.setAlwaysOnTop(true);
        jDialog_factura.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jTextField_factura_proveedor.requestFocus();
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

    public void jDialog_buscar() {
        jDialog_buscar.setVisible(true);
        jDialog_buscar.setTitle("Buscar");
        jDialog_buscar.setSize(500, 500);
        jDialog_buscar.setLocationRelativeTo(null);
        jDialog_buscar.setAlwaysOnTop(true);
        jDialog_buscar.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_pago() {
        jDialog_pago.setVisible(true);
        jDialog_pago.setTitle("Pago");
        jDialog_pago.setSize(500, 290);
        jDialog_pago.setLocationRelativeTo(null);
        jDialog_pago.setAlwaysOnTop(true);
        jDialog_pago.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        jTextField_pago_tipo.setText("");
        jTextField_pago_cta_cte.setText("");
        jTextField_pago_importe.setText("");
        jTextField_pago_numero.setText("");

        jDateChooser_pago_fecha.setDate(Metodos.hoy);
        Metodos.movimiento_contable_id_cuenta_bancaria = 0;
        Metodos.movimiento_contable_id_tipo_pago = 0;
        jTextField_pago_nombre.requestFocus();

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

    private void jTextField_importeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_importeKeyReleased
        jTextField_importe.setText(Metodos.Separar_Miles(jTextField_importe.getText()));
    }//GEN-LAST:event_jTextField_importeKeyReleased

    private void jTextField_importeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_importeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_factura.setVisible(false);
            jButton_factura.requestFocus();
        }
    }//GEN-LAST:event_jTextField_importeKeyPressed

    private void jDateChooser_factura_fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_factura_fechaKeyPressed

    }//GEN-LAST:event_jDateChooser_factura_fechaKeyPressed

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
            jTextField_factura_cuenta.requestFocus();
        }
    }//GEN-LAST:event_jTextField_cuenta_buscarKeyReleased

    private void jTextField_importeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_importeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_importeActionPerformed

    private void jDateChooser_asiento_fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_asiento_fechaKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_F5)) {
            jDateChooser_pago_fecha.setDate(Metodos.hoy);
        }
    }//GEN-LAST:event_jDateChooser_asiento_fechaKeyPressed

    private void jDateChooser_pago_fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_pago_fechaKeyPressed

    }//GEN-LAST:event_jDateChooser_pago_fechaKeyPressed

    private void jButton_pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pagosActionPerformed
        jDialog_pago();
    }//GEN-LAST:event_jButton_pagosActionPerformed

    private void jButton_guardar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_facturaActionPerformed
        Metodos.Movimientos_contables_factura_guardar(
                jTextField_descripcion.getText(),
                jTextField_comprobante.getText(),
                jTextField_importe.getText(),
                jDateChooser_factura_fecha.getDate());

        Metodos.Movimientos_contables_factura_jtable();
        Metodos.Movimientos_contables_totales();

        jDialog_factura.setVisible(false);
        jButton_factura.requestFocus();

    }//GEN-LAST:event_jButton_guardar_facturaActionPerformed

    private void jTextField_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_comprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_comprobanteActionPerformed

    private void jTextField_comprobanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_comprobanteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_comprobanteKeyPressed

    private void jTextField_comprobanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_comprobanteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_comprobanteKeyReleased

    private void jTable_movimeintos_contables_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_movimeintos_contables_facturaMouseClicked
        Metodos.Movimientos_contables_detalle_selected();
        jDialog_detalle_borrar();
    }//GEN-LAST:event_jTable_movimeintos_contables_facturaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Metodos.Movimientos_contables_factura_borrar();
        jDialog_detalle_borrar.setVisible(false);
        Metodos.Movimientos_contables_factura_jtable();
        Metodos.Movimientos_contables_totales();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jDialog_detalle_borrar.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_buscarKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_buscar.setVisible(false);
            jButton_factura.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Movimientos_contables_buscar_selected();
            Metodos.Movimientos_contables_traer_datos();
            Metodos.Movimientos_contables_factura_jtable();
            Metodos.Movimientos_contables_totales();
            jDialog_buscar.setVisible(false);
        }
    }//GEN-LAST:event_jTable_buscarKeyPressed

    private void jTable_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_buscarMouseClicked
        Metodos.Movimientos_contables_buscar_selected();
        Metodos.Movimientos_contables_traer_datos();
        Metodos.Movimientos_contables_factura_jtable();
        Metodos.Movimientos_contables_pago_jtable();
        Metodos.Movimientos_contables_totales();
        jDialog_buscar.setVisible(false);
    }//GEN-LAST:event_jTable_buscarMouseClicked

    private void jTextField_pago_tipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pago_tipoKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_pago.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_F1)) {
            jDialog_tipo_pago();
            Metodos.Movimientos_contables_pago_tipo_pago_jtable();
        }

    }//GEN-LAST:event_jTextField_pago_tipoKeyPressed

    private void jTextField_pago_cta_cteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pago_cta_cteKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_pago.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_F1)) {
            jDialog_cuenta_bancaria();
            Metodos.Movimientos_contables_cuenta_bancaria_jtable();
        }
    }//GEN-LAST:event_jTextField_pago_cta_cteKeyPressed

    private void jTextField_pago_numeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pago_numeroKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_pago.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_pago_numeroKeyPressed

    private void jTextField_pago_importeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pago_importeKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_pago.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_pago_importeKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_pago.setVisible(false);
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton_pagosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_pagosKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton_pagosKeyPressed

    private void jTable_tipo_pagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_tipo_pagoKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_tipo_pago.setVisible(false);
            jTextField_pago_tipo.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Movimientos_contables_tipo_pago_selected();
            jDialog_tipo_pago.setVisible(false);
            jTextField_pago_tipo.requestFocus();
        }
    }//GEN-LAST:event_jTable_tipo_pagoKeyPressed

    private void jTable_cuenta_bancariaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_cuenta_bancariaKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_cuenta_bancaria.setVisible(false);
            jTextField_pago_cta_cte.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Movimientos_contables_cuenta_bancaria_selected();
            jDialog_cuenta_bancaria.setVisible(false);
            jTextField_pago_cta_cte.requestFocus();
        }
    }//GEN-LAST:event_jTable_cuenta_bancariaKeyPressed

    private void jTextField_pago_importeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pago_importeKeyReleased
        jTextField_pago_importe.setText(Metodos.Separar_Miles(jTextField_pago_importe.getText()));
    }//GEN-LAST:event_jTextField_pago_importeKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Metodos.Movimientos_contables_pago_guardar(jTextField_pago_importe.getText(), jTextField_pago_numero.getText(), jDateChooser_pago_fecha.getDate());
        Metodos.Movimientos_contables_pago_jtable();
        Metodos.Movimientos_contables_totales();
        jDialog_pago.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Metodos.Movimientos_contables_pago_borrar();
        Metodos.Movimientos_contables_pago_jtable();
        Metodos.Movimientos_contables_totales();
        jDialog_pago_borrar.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jDialog_pago_borrar.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable_pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_pagoMouseClicked
        Metodos.Movimientos_contables_pago_selected();
        jDialog_pago_borrar();


    }//GEN-LAST:event_jTable_pagoMouseClicked

    private void jTextField_factura_proveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_factura_proveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_factura_proveedorKeyReleased

    private void jTextField_factura_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_factura_proveedorKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_F1)) {
            jDialog_proveedor();
            Metodos.Movimientos_contables_factura_proveedor_jtable(jTextField_proveedor_buscar.getText());
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_factura.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_factura_proveedorKeyPressed

    private void jTable_factura_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_factura_proveedorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_factura_proveedorMouseClicked

    private void jTable_factura_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_factura_proveedorKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_proveedor.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.movimientos_contables_factura_proveedor_selected();
            jDialog_proveedor.setVisible(false);
        }
    }//GEN-LAST:event_jTable_factura_proveedorKeyPressed

    private void jTextField_proveedor_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedor_buscarKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_proveedor.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_factura_proveedor.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                System.err.println(ex);
            }
        } else {
            Metodos.Movimientos_contables_factura_proveedor_jtable(jTextField_proveedor_buscar.getText());
        }
    }//GEN-LAST:event_jTextField_proveedor_buscarKeyPressed

    private void jTextField_pago_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pago_nombreKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_pago.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_F1)) {
            jDialog_pago_proveedor();
        }
    }//GEN-LAST:event_jTextField_pago_nombreKeyPressed

    private void jTable_pago_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_pago_proveedorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_pago_proveedorMouseClicked

    private void jTable_pago_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_pago_proveedorKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_pago_proveedor.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            Metodos.Movimeintos_bancarios_pago_proveedor_selected();
            jDialog_pago_proveedor.setVisible(false);
        }
    }//GEN-LAST:event_jTable_pago_proveedorKeyPressed

    private void jTextField_pago_proveedor_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_pago_proveedor_buscarKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ESCAPE)) {
            jDialog_pago_proveedor.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_pago_proveedor.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                System.err.println(ex);
            }
        } else {
            Metodos.Movimientos_contables_pago_proveedor_jtable(jTextField_pago_proveedor_buscar.getText());
        }

    }//GEN-LAST:event_jTextField_pago_proveedor_buscarKeyPressed

    private void jButton_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_buscarKeyPressed
    
    }//GEN-LAST:event_jButton_buscarKeyPressed

    public void jDialog_detalle_borrar() {
        jDialog_detalle_borrar.setVisible(true);
        jDialog_detalle_borrar.setTitle("Borrar detalle");
        jDialog_detalle_borrar.setSize(220, 76);
        jDialog_detalle_borrar.setLocationRelativeTo(null);
        jDialog_detalle_borrar.setAlwaysOnTop(true);
        jDialog_detalle_borrar.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_proveedor() {
        jDialog_proveedor.setVisible(true);
        jDialog_proveedor.setTitle("Personas");
        jDialog_proveedor.setSize(500, 500);
        jDialog_proveedor.setLocationRelativeTo(null);
        jDialog_proveedor.setAlwaysOnTop(true);
        jDialog_proveedor.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_pago_proveedor() {
        jDialog_pago_proveedor.setVisible(true);
        jDialog_pago_proveedor.setTitle("Personas");
        jDialog_pago_proveedor.setSize(500, 500);
        jDialog_pago_proveedor.setLocationRelativeTo(null);
        jDialog_pago_proveedor.setAlwaysOnTop(true);
        jDialog_pago_proveedor.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

    }

    public void jDialog_pago_borrar() {
        jDialog_pago_borrar.setVisible(true);
        jDialog_pago_borrar.setTitle("Borrar detalle");
        jDialog_pago_borrar.setSize(220, 76);
        jDialog_pago_borrar.setLocationRelativeTo(null);
        jDialog_pago_borrar.setAlwaysOnTop(true);
        jDialog_pago_borrar.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_tipo_pago() {
        jDialog_tipo_pago.setVisible(true);
        jDialog_tipo_pago.setTitle("Tipo de pago");
        jDialog_tipo_pago.setSize(500, 500);
        jDialog_tipo_pago.setLocationRelativeTo(null);
        jDialog_tipo_pago.setAlwaysOnTop(true);
        jDialog_tipo_pago.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_cuenta_bancaria() {
        jDialog_cuenta_bancaria.setVisible(true);
        jDialog_cuenta_bancaria.setTitle("Cuenta Bancaria");
        jDialog_cuenta_bancaria.setSize(500, 500);
        jDialog_cuenta_bancaria.setLocationRelativeTo(null);
        jDialog_cuenta_bancaria.setAlwaysOnTop(true);
        jDialog_cuenta_bancaria.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton_borrar;
    private javax.swing.JButton jButton_buscar;
    public static javax.swing.JButton jButton_factura;
    private javax.swing.JButton jButton_guardar_factura;
    public static javax.swing.JButton jButton_pagos;
    public static com.toedter.calendar.JDateChooser jDateChooser_asiento_fecha;
    public static com.toedter.calendar.JDateChooser jDateChooser_factura_fecha;
    public static com.toedter.calendar.JDateChooser jDateChooser_pago_fecha;
    private javax.swing.JDialog jDialog_buscar;
    private javax.swing.JDialog jDialog_cuenta_bancaria;
    private javax.swing.JDialog jDialog_cuentas_vinculadas;
    private javax.swing.JDialog jDialog_detalle_borrar;
    private javax.swing.JDialog jDialog_factura;
    private javax.swing.JDialog jDialog_pago;
    private javax.swing.JDialog jDialog_pago_borrar;
    private javax.swing.JDialog jDialog_pago_proveedor;
    private javax.swing.JDialog jDialog_proveedor;
    private javax.swing.JDialog jDialog_tipo_pago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public static javax.swing.JTable jTable_buscar;
    public static javax.swing.JTable jTable_cuenta_bancaria;
    public static javax.swing.JTable jTable_cuentas_vinculadas;
    public static javax.swing.JTable jTable_factura_proveedor;
    public static javax.swing.JTable jTable_movimeintos_contables_factura;
    public static javax.swing.JTable jTable_pago;
    public static javax.swing.JTable jTable_pago_proveedor;
    public static javax.swing.JTable jTable_tipo_pago;
    public static javax.swing.JTextField jTextField_asiento_nro;
    private javax.swing.JTextField jTextField_comprobante;
    private javax.swing.JTextField jTextField_cuenta_buscar;
    private javax.swing.JTextField jTextField_descripcion;
    public static javax.swing.JTextField jTextField_factura_cuenta;
    public static javax.swing.JTextField jTextField_factura_proveedor;
    private javax.swing.JTextField jTextField_importe;
    public static javax.swing.JTextField jTextField_pago_cta_cte;
    private javax.swing.JTextField jTextField_pago_importe;
    public static javax.swing.JTextField jTextField_pago_nombre;
    private javax.swing.JTextField jTextField_pago_numero;
    public static javax.swing.JTextField jTextField_pago_proveedor_buscar;
    public static javax.swing.JTextField jTextField_pago_tipo;
    public static javax.swing.JTextField jTextField_proveedor_buscar;
    public static javax.swing.JTextField jTextField_total_factura;
    public static javax.swing.JTextField jTextField_total_pago;
    // End of variables declaration//GEN-END:variables
}
