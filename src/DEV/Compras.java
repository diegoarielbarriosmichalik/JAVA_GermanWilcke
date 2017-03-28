package DEV;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Compras extends javax.swing.JFrame {

    public Compras() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Compras");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Conexion.Verificar_conexion();
        jDateChooser3.setDate(Metodos.hoy);
        Metodos.compras_id_proveedor = 0;
        Metodos.compras_id_sector = 0;
        jButton_borrar.setVisible(false);
        Compras_clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_compras = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_buscar = new javax.swing.JTable();
        jTextField_buscar = new javax.swing.JTextField();
        jDialog_proveedor = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jTextField_proveedor_buscar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_proveedor = new javax.swing.JTable();
        jDialog_sector = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_sector = new javax.swing.JTable();
        jDialog_agregar_detalle = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jTextField_producto = new javax.swing.JTextField();
        jTextField_unidades = new javax.swing.JTextField();
        jTextField_precio = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField_ubicacion = new javax.swing.JTextField();
        jTextField_sector = new javax.swing.JTextField();
        jTextField_cuenta = new javax.swing.JTextField();
        jDialog_detalle_producto = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jTextField_buscar_producto = new javax.swing.JTextField();
        jDialog_ubicacion = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_ubicacion = new javax.swing.JTable();
        jDialog_detalle_borrar = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jDialog_tipo_pago = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_tipo_pago = new javax.swing.JTable();
        jDialog_forma_pago = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable_forma_pago = new javax.swing.JTable();
        jDialog_cuenta = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable_cuenta = new javax.swing.JTable();
        jTextField_cuenta_buscar = new javax.swing.JTextField();
        jDialog_impuesto = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable_impuesto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jt_Proveedor = new javax.swing.JTextField();
        jButton_borrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_buscar = new javax.swing.JButton();
        jt_factura = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_detalle = new javax.swing.JTable();
        jButton_agregar_detalle = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jTextField_total = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField_compra_tipo = new javax.swing.JTextField();
        jTextField_forma_pago = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jDialog_compras.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_buscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Proveedor", "Factura", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            jTable_buscar.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_buscar.getColumnModel().getColumn(1).setResizable(false);
            jTable_buscar.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTable_buscar.getColumnModel().getColumn(2).setResizable(false);
            jTable_buscar.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable_buscar.getColumnModel().getColumn(3).setResizable(false);
            jTable_buscar.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jTextField_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por proveedor"));
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

        javax.swing.GroupLayout jDialog_comprasLayout = new javax.swing.GroupLayout(jDialog_compras.getContentPane());
        jDialog_compras.getContentPane().setLayout(jDialog_comprasLayout);
        jDialog_comprasLayout.setHorizontalGroup(
            jDialog_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_comprasLayout.setVerticalGroup(
            jDialog_comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_proveedor.setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_proveedor_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_proveedor_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_proveedor_buscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_proveedor_buscarKeyReleased(evt);
            }
        });

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
        jScrollPane3.setViewportView(jTable_proveedor);
        if (jTable_proveedor.getColumnModel().getColumnCount() > 0) {
            jTable_proveedor.getColumnModel().getColumn(0).setResizable(false);
            jTable_proveedor.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_proveedor.getColumnModel().getColumn(1).setResizable(false);
            jTable_proveedor.getColumnModel().getColumn(1).setPreferredWidth(460);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jTextField_proveedor_buscar))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_proveedor_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_proveedorLayout = new javax.swing.GroupLayout(jDialog_proveedor.getContentPane());
        jDialog_proveedor.getContentPane().setLayout(jDialog_proveedorLayout);
        jDialog_proveedorLayout.setHorizontalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_proveedorLayout.setVerticalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog_sector.setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTable_sector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sector"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_sector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_sectorKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_sector);
        if (jTable_sector.getColumnModel().getColumnCount() > 0) {
            jTable_sector.getColumnModel().getColumn(0).setResizable(false);
            jTable_sector.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_sector.getColumnModel().getColumn(1).setResizable(false);
            jTable_sector.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_sectorLayout = new javax.swing.GroupLayout(jDialog_sector.getContentPane());
        jDialog_sector.getContentPane().setLayout(jDialog_sectorLayout);
        jDialog_sectorLayout.setHorizontalGroup(
            jDialog_sectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_sectorLayout.setVerticalGroup(
            jDialog_sectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_agregar_detalle.setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTextField_producto.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto (F1 para buscar)"));
        jTextField_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_productoKeyPressed(evt);
            }
        });

        jTextField_unidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidades"));
        jTextField_unidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_unidadesKeyPressed(evt);
            }
        });

        jTextField_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio Unitario"));
        jTextField_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyPressed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField_ubicacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicación (F1 para buscar)"));
        jTextField_ubicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ubicacionKeyPressed(evt);
            }
        });

        jTextField_sector.setBorder(javax.swing.BorderFactory.createTitledBorder("Sector (F1 buscar)"));
        jTextField_sector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_sectorKeyPressed(evt);
            }
        });

        jTextField_cuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta (F1 para buscar)"));
        jTextField_cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_cuentaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_producto)
                    .addComponent(jTextField_unidades)
                    .addComponent(jTextField_ubicacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_sector)
                    .addComponent(jTextField_cuenta)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 440, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_precio))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_sector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_agregar_detalleLayout = new javax.swing.GroupLayout(jDialog_agregar_detalle.getContentPane());
        jDialog_agregar_detalle.getContentPane().setLayout(jDialog_agregar_detalleLayout);
        jDialog_agregar_detalleLayout.setHorizontalGroup(
            jDialog_agregar_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_agregar_detalleLayout.setVerticalGroup(
            jDialog_agregar_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_detalle_producto.setUndecorated(true);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jTable_productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_productosKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_productos);
        if (jTable_productos.getColumnModel().getColumnCount() > 0) {
            jTable_productos.getColumnModel().getColumn(0).setResizable(false);
            jTable_productos.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_productos.getColumnModel().getColumn(1).setResizable(false);
            jTable_productos.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        jTextField_buscar_producto.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_buscar_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscar_productoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_buscar_productoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jTextField_buscar_producto))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_detalle_productoLayout = new javax.swing.GroupLayout(jDialog_detalle_producto.getContentPane());
        jDialog_detalle_producto.getContentPane().setLayout(jDialog_detalle_productoLayout);
        jDialog_detalle_productoLayout.setHorizontalGroup(
            jDialog_detalle_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_detalle_productoLayout.setVerticalGroup(
            jDialog_detalle_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_ubicacion.setUndecorated(true);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_ubicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ubicacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_ubicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_ubicacionKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(jTable_ubicacion);
        if (jTable_ubicacion.getColumnModel().getColumnCount() > 0) {
            jTable_ubicacion.getColumnModel().getColumn(0).setResizable(false);
            jTable_ubicacion.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_ubicacion.getColumnModel().getColumn(1).setResizable(false);
            jTable_ubicacion.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_ubicacionLayout = new javax.swing.GroupLayout(jDialog_ubicacion.getContentPane());
        jDialog_ubicacion.getContentPane().setLayout(jDialog_ubicacionLayout);
        jDialog_ubicacionLayout.setHorizontalGroup(
            jDialog_ubicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_ubicacionLayout.setVerticalGroup(
            jDialog_ubicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_detalle_borrar.setAlwaysOnTop(true);
        jDialog_detalle_borrar.setUndecorated(true);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jButton6.setText("Borrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_detalle_borrarLayout = new javax.swing.GroupLayout(jDialog_detalle_borrar.getContentPane());
        jDialog_detalle_borrar.getContentPane().setLayout(jDialog_detalle_borrarLayout);
        jDialog_detalle_borrarLayout.setHorizontalGroup(
            jDialog_detalle_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_detalle_borrarLayout.setVerticalGroup(
            jDialog_detalle_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_tipo_pago.setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTable_tipo_pago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo"
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
        jScrollPane7.setViewportView(jTable_tipo_pago);
        if (jTable_tipo_pago.getColumnModel().getColumnCount() > 0) {
            jTable_tipo_pago.getColumnModel().getColumn(0).setResizable(false);
            jTable_tipo_pago.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_tipo_pago.getColumnModel().getColumn(1).setResizable(false);
            jTable_tipo_pago.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_tipo_pagoLayout = new javax.swing.GroupLayout(jDialog_tipo_pago.getContentPane());
        jDialog_tipo_pago.getContentPane().setLayout(jDialog_tipo_pagoLayout);
        jDialog_tipo_pagoLayout.setHorizontalGroup(
            jDialog_tipo_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_tipo_pagoLayout.setVerticalGroup(
            jDialog_tipo_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_forma_pago.setUndecorated(true);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTable_forma_pago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Forma de Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_forma_pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_forma_pagoMouseClicked(evt);
            }
        });
        jTable_forma_pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_forma_pagoKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(jTable_forma_pago);
        if (jTable_forma_pago.getColumnModel().getColumnCount() > 0) {
            jTable_forma_pago.getColumnModel().getColumn(0).setResizable(false);
            jTable_forma_pago.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_forma_pago.getColumnModel().getColumn(1).setResizable(false);
            jTable_forma_pago.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_forma_pagoLayout = new javax.swing.GroupLayout(jDialog_forma_pago.getContentPane());
        jDialog_forma_pago.getContentPane().setLayout(jDialog_forma_pagoLayout);
        jDialog_forma_pagoLayout.setHorizontalGroup(
            jDialog_forma_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_forma_pagoLayout.setVerticalGroup(
            jDialog_forma_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_cuenta.setUndecorated(true);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

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
        jTable_cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_cuentaKeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(jTable_cuenta);
        if (jTable_cuenta.getColumnModel().getColumnCount() > 0) {
            jTable_cuenta.getColumnModel().getColumn(0).setResizable(false);
            jTable_cuenta.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_cuenta.getColumnModel().getColumn(1).setResizable(false);
            jTable_cuenta.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        jTextField_cuenta_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_cuenta_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_cuenta_buscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jTextField_cuenta_buscar))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_cuenta_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_cuentaLayout = new javax.swing.GroupLayout(jDialog_cuenta.getContentPane());
        jDialog_cuenta.getContentPane().setLayout(jDialog_cuentaLayout);
        jDialog_cuentaLayout.setHorizontalGroup(
            jDialog_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_cuentaLayout.setVerticalGroup(
            jDialog_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_impuesto.setUndecorated(true);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jTable_impuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Impuesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_impuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_impuestoKeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(jTable_impuesto);
        if (jTable_impuesto.getColumnModel().getColumnCount() > 0) {
            jTable_impuesto.getColumnModel().getColumn(0).setResizable(false);
            jTable_impuesto.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_impuesto.getColumnModel().getColumn(1).setResizable(false);
            jTable_impuesto.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_impuestoLayout = new javax.swing.GroupLayout(jDialog_impuesto.getContentPane());
        jDialog_impuesto.getContentPane().setLayout(jDialog_impuestoLayout);
        jDialog_impuestoLayout.setHorizontalGroup(
            jDialog_impuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog_impuestoLayout.setVerticalGroup(
            jDialog_impuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jt_Proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor (F1 buscar)"));
        jt_Proveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jt_ProveedorFocusGained(evt);
            }
        });
        jt_Proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_ProveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_ProveedorKeyReleased(evt);
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

        jt_factura.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de Factura"));

        jTable_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Cuenta", "Sector", "Ubicación", "Unidades", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_detalleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_detalle);
        if (jTable_detalle.getColumnModel().getColumnCount() > 0) {
            jTable_detalle.getColumnModel().getColumn(0).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable_detalle.getColumnModel().getColumn(1).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable_detalle.getColumnModel().getColumn(2).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable_detalle.getColumnModel().getColumn(3).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable_detalle.getColumnModel().getColumn(4).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable_detalle.getColumnModel().getColumn(5).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(5).setPreferredWidth(20);
            jTable_detalle.getColumnModel().getColumn(6).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(6).setPreferredWidth(20);
            jTable_detalle.getColumnModel().getColumn(7).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        jButton_agregar_detalle.setMnemonic('a');
        jButton_agregar_detalle.setText("Agregar detalle");
        jButton_agregar_detalle.setToolTipText("");
        jButton_agregar_detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_detalleActionPerformed(evt);
            }
        });
        jButton_agregar_detalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_agregar_detalleKeyPressed(evt);
            }
        });

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser3KeyPressed(evt);
            }
        });

        jTextField_total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_total.setText("0");

        jTextField_compra_tipo.setText("CONTADO");
        jTextField_compra_tipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo (F1 buscar)"));
        jTextField_compra_tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_compra_tipoKeyPressed(evt);
            }
        });

        jTextField_forma_pago.setText("No especificado");
        jTextField_forma_pago.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de Pago (F1 buscar)"));
        jTextField_forma_pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_forma_pagoKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jt_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_compra_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_forma_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 189, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_agregar_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jt_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jt_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_compra_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_forma_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_agregar_detalle, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Metodos.Compras_guardar(jt_factura.getText(), jDateChooser3.getDate());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Compras_clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void Compras_clear() {
        jt_Proveedor.setText("");
        jLabel1.setText("");
        Metodos.compras_id_proveedor = 0;
        Metodos.compras_id_tipo = 1;
        Metodos.compras_id_forma_pago = 0;
        Metodos.compras_id_sector = 0;
        Metodos.id_compra = 0;
        Metodos.compras_id_productos_ubicacion = 0;
        jTextField_compra_tipo.setText("CONTADO");
        jTextField_forma_pago.setText("No especificado");
        jt_factura.setText("");
        jDateChooser3.setDate(Metodos.hoy);
        Metodos.Compras_ubicacion_jtable();
        Metodos.Compras_detalle_jtable();
        jButton_borrar.setVisible(false);
        jt_Proveedor.requestFocus();

    }

    private void jt_ProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_ProveedorKeyReleased

    }//GEN-LAST:event_jt_ProveedorKeyReleased

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea borrar esta compra? Este proceso no se puede revertir.",
                "ALERTA", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Metodos.Compras_borrar();
            Compras_clear();
            jButton_borrar.setVisible(false);

        }

    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void jt_ProveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jt_ProveedorFocusGained
    }//GEN-LAST:event_jt_ProveedorFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jt_ProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_ProveedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_proveedor();
        }
    }//GEN-LAST:event_jt_ProveedorKeyPressed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        jDialog_compras();
    }//GEN-LAST:event_jButton_buscarActionPerformed

    public void jDialog_compras() {
        jDialog_compras.setVisible(true);
        jDialog_compras.setTitle("Buscar Compras");
        jDialog_compras.setSize(500, 500);
        jDialog_compras.setLocationRelativeTo(null);
        jDialog_compras.setAlwaysOnTop(true);
        jDialog_compras.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jTextField_buscar.setText("");
        jTextField_buscar.requestFocus();

    }

    public void jDialog_detalle_borrar() {
        jDialog_detalle_borrar.setVisible(true);
        jDialog_detalle_borrar.setTitle("Quitar detalle");
        jDialog_detalle_borrar.setSize(214, 74);
        jDialog_detalle_borrar.setLocationRelativeTo(null);
        jDialog_detalle_borrar.setAlwaysOnTop(true);
        jDialog_detalle_borrar.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_proveedor() {
        jTextField_proveedor_buscar.setText("");
        jDialog_proveedor.setVisible(true);
        jDialog_proveedor.setTitle("Proveedores");
        jDialog_proveedor.setSize(500, 500);
        jDialog_proveedor.setLocationRelativeTo(null);
        jDialog_proveedor.setAlwaysOnTop(true);
        jDialog_proveedor.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Compras_proveedor_jtable(jTextField_proveedor_buscar.getText());
        jTextField_proveedor_buscar.requestFocus();

    }

    public void jDialog_impuesto() {
        jDialog_impuesto.setVisible(true);
        jDialog_impuesto.setTitle("Impuesto");
        jDialog_impuesto.setSize(323, 156);
        jDialog_impuesto.setLocationRelativeTo(null);
        jDialog_impuesto.setAlwaysOnTop(true);
        jDialog_impuesto.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_sector() {
        jDialog_sector.setVisible(true);
        jDialog_sector.setTitle("Sector");
        jDialog_sector.setSize(500, 500);
        jDialog_sector.setLocationRelativeTo(null);
        jDialog_sector.setAlwaysOnTop(true);
        jDialog_sector.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Compras_sector_jtable();
    }

    public void jDialog_agregar_detalle() {
        jTextField_precio.setText("");
        jTextField_unidades.setText("");
        jTextField_producto.setText("");
        Metodos.compras_id_producto = 0;
        Metodos.compras_id_impuesto = 0;
        jDialog_agregar_detalle.setVisible(true);
        jDialog_agregar_detalle.setTitle("Agregar detalle");
        jDialog_agregar_detalle.setSize(499, 335);
        jDialog_agregar_detalle.setLocationRelativeTo(null);
        jDialog_agregar_detalle.setAlwaysOnTop(true);
        jDialog_agregar_detalle.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        jTextField_producto.requestFocus();

    }

    public void jDialog_detalle_producto() {
        jTextField_buscar_producto.setText("");
        jDialog_detalle_producto.setVisible(true);
        jDialog_detalle_producto.setTitle("Productos");
        jDialog_detalle_producto.setSize(500, 500);
        jDialog_detalle_producto.setLocationRelativeTo(null);
        jDialog_detalle_producto.setAlwaysOnTop(true);
        jDialog_detalle_producto.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_ubicacion() {
        jDialog_ubicacion.setVisible(true);
        jDialog_ubicacion.setTitle("Ubicación");
        jDialog_ubicacion.setSize(500, 500);
        jDialog_ubicacion.setLocationRelativeTo(null);
        jDialog_ubicacion.setAlwaysOnTop(true);
        jDialog_ubicacion.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

    }

    public void jDialog_tipo_pago() {
        jDialog_tipo_pago.setVisible(true);
        jDialog_tipo_pago.setTitle("Tipo");
        jDialog_tipo_pago.setSize(203, 154);
        jDialog_tipo_pago.setLocationRelativeTo(null);
        jDialog_tipo_pago.setAlwaysOnTop(true);
        jDialog_tipo_pago.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Compras_tipo_pago_jtable();

    }

    public void jDialog_forma_pago() {
        jDialog_forma_pago.setVisible(true);
        jDialog_forma_pago.setTitle("Forma de Pago");
        jDialog_forma_pago.setSize(340, 300);
        jDialog_forma_pago.setLocationRelativeTo(null);
        jDialog_forma_pago.setAlwaysOnTop(true);
        jDialog_forma_pago.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Compras_tipo_pago_jtable();
        Metodos.Compras_forma_pago_jtable();

    }

    public void jDialog_cuenta() {
        jDialog_cuenta.setVisible(true);
        jDialog_cuenta.setTitle("Cuentas");
        jDialog_cuenta.setSize(500, 500);
        jDialog_cuenta.setLocationRelativeTo(null);
        jDialog_cuenta.setAlwaysOnTop(true);
        jDialog_cuenta.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

    }

    private void jTable_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_compras.setVisible(false);
            jt_Proveedor.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Compra_buscar_selected();
            Metodos.Compras_buscar_traer_datos();
            jDialog_compras.setVisible(false);
            Metodos.Compras_detalle_jtable();
            jButton_borrar.setVisible(true);
            jButton_agregar_detalle.requestFocus();
        }
    }//GEN-LAST:event_jTable_buscarKeyPressed

    private void jTextField_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_compras.setVisible(false);
            jt_Proveedor.requestFocus();
        }
    }//GEN-LAST:event_jTextField_buscarKeyPressed

    private void jDateChooser3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser3KeyPressed

    }//GEN-LAST:event_jDateChooser3KeyPressed

    private void jButton_agregar_detalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_detalleActionPerformed
        if ((Metodos.compras_id_proveedor > 0)) {
            Metodos.Compras_guardar(jt_factura.getText(), jDateChooser3.getDate());
            jDialog_agregar_detalle();
        } else {
            JOptionPane.showMessageDialog(null, "Proveedor no puede ser vacio.");
            jt_Proveedor.requestFocus();
        }
    }//GEN-LAST:event_jButton_agregar_detalleActionPerformed

    private void jTextField_proveedor_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedor_buscarKeyReleased

    }//GEN-LAST:event_jTextField_proveedor_buscarKeyReleased

    private void jTextField_proveedor_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedor_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_proveedor.setVisible(false);
            jt_Proveedor.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_proveedor.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                System.err.println(ex);
            }
        } else {
            Metodos.Compras_proveedor_jtable(jTextField_proveedor_buscar.getText());
        }

    }//GEN-LAST:event_jTextField_proveedor_buscarKeyPressed

    private void jTable_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_proveedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_proveedor.setVisible(false);
            jt_Proveedor.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Compras_proveedor_selected();
            jDialog_proveedor.setVisible(false);
        }
    }//GEN-LAST:event_jTable_proveedorKeyPressed

    private void jTable_sectorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_sectorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_sector.setVisible(false);
            jTextField_sector.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Compras_sector_selected();
            jDialog_sector.setVisible(false);
        }
    }//GEN-LAST:event_jTable_sectorKeyPressed

    private void jTextField_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_productoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_agregar_detalle.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_detalle_producto();
        }
    }//GEN-LAST:event_jTextField_productoKeyPressed

    private void jTextField_unidadesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_unidadesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_agregar_detalle.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_unidadesKeyPressed

    private void jTextField_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_agregar_detalle.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_precioKeyPressed

    private void jTextField_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscarKeyReleased

        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_buscar.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                System.err.println(ex);
            }
        } else {
            Metodos.Compras_buscar_jtable(jTextField_buscar.getText());
        }

    }//GEN-LAST:event_jTextField_buscarKeyReleased

    private void jTable_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_buscarMouseClicked
        Metodos.Compra_buscar_selected();
        Metodos.Compras_buscar_traer_datos();
        jDialog_compras.setVisible(false);
        Metodos.Compras_detalle_jtable();
        jButton_borrar.setVisible(true);
        jButton_agregar_detalle.requestFocus();
    }//GEN-LAST:event_jTable_buscarMouseClicked

    private void jTextField_buscar_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_productoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_detalle_producto.setVisible(false);
        }


    }//GEN-LAST:event_jTextField_buscar_productoKeyPressed

    private void jTable_productosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_productosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_detalle_producto.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Compras_producto_selected();
            Metodos.Compras_producto_ubicacion_selected();
            jDialog_detalle_producto.setVisible(false);
        }
    }//GEN-LAST:event_jTable_productosKeyPressed

    private void jButton_agregar_detalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_agregar_detalleKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton_agregar_detalleKeyPressed

    private void jTextField_buscar_productoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_productoKeyReleased

        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_productos.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                System.err.println(ex);
            }
        } else {
            Metodos.Compras_agregar_producto_jtable(jTextField_buscar_producto.getText());
        }

    }//GEN-LAST:event_jTextField_buscar_productoKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDialog_agregar_detalle.setVisible(false);
        Metodos.Compras_agregar_detalle_guardar(jTextField_unidades.getText(), jTextField_precio.getText());
        Metodos.Compras_actualizar_total();
        Metodos.Compras_actualizar_stock();
        Metodos.Compras_detalle_jtable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField_ubicacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ubicacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_ubicacion();
            Metodos.Compras_ubicacion_jtable();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_agregar_detalle.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_ubicacionKeyPressed

    private void jTable_ubicacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_ubicacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_ubicacion.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Compras_detalle_productos_ubicacion_selected();
            jDialog_ubicacion.setVisible(false);
        }
    }//GEN-LAST:event_jTable_ubicacionKeyPressed

    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
        Metodos.Compras_producto_selected();
        Metodos.Compras_producto_ubicacion_selected();
        jDialog_detalle_producto.setVisible(false);
    }//GEN-LAST:event_jTable_productosMouseClicked

    private void jTable_detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_detalleMouseClicked

        jDialog_detalle_borrar();
//        

    }//GEN-LAST:event_jTable_detalleMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Metodos.Compras_detalle_selected();
        Metodos.Compras_obtener_datos();
        Metodos.Compras_detalle_delete();
        Metodos.Compras_actualizar_stock();
        jDialog_detalle_borrar.setVisible(false);
        Metodos.Compras_detalle_jtable();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jDialog_detalle_borrar.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable_tipo_pagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_tipo_pagoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Compras_tipo_pago_selected();
            jDialog_tipo_pago.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_tipo_pago.setVisible(false);
        }
    }//GEN-LAST:event_jTable_tipo_pagoKeyPressed

    private void jTextField_compra_tipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_compra_tipoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_tipo_pago();
        }
    }//GEN-LAST:event_jTextField_compra_tipoKeyPressed

    private void jTable_tipo_pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tipo_pagoMouseClicked
        Metodos.Compras_tipo_pago_selected();
        jDialog_tipo_pago.setVisible(false);
    }//GEN-LAST:event_jTable_tipo_pagoMouseClicked

    private void jTextField_sectorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_sectorKeyPressed
        jDialog_sector();
    }//GEN-LAST:event_jTextField_sectorKeyPressed

    private void jTable_forma_pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_forma_pagoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_forma_pagoMouseClicked

    private void jTable_forma_pagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_forma_pagoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_forma_pago.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Compras_forma_pago_selected();
            jDialog_forma_pago.setVisible(false);
        }

    }//GEN-LAST:event_jTable_forma_pagoKeyPressed

    private void jTextField_forma_pagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_forma_pagoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_forma_pago();
        }
    }//GEN-LAST:event_jTextField_forma_pagoKeyPressed

    private void jTextField_precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyReleased
        jTextField_precio.setText(Metodos.Separar_Miles(jTextField_precio.getText()));
    }//GEN-LAST:event_jTextField_precioKeyReleased

    private void jTextField_cuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_cuenta();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_agregar_detalle();
        }
    }//GEN-LAST:event_jTextField_cuentaKeyPressed

    private void jTable_cuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_cuentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_cuenta.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Compras_cuenta_selected();
            jDialog_cuenta.setVisible(false);
        }
    }//GEN-LAST:event_jTable_cuentaKeyPressed

    private void jTextField_cuenta_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cuenta_buscarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_cuenta.setVisible(false);
        }

        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_cuenta.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                System.err.println(ex);
            }
        } else {
            Metodos.Compras_cuenta_jtable(jTextField_cuenta_buscar.getText());
        }

    }//GEN-LAST:event_jTextField_cuenta_buscarKeyReleased

    private void jTable_impuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_impuestoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_impuesto.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Compras_impuestos_selected();
            jDialog_impuesto.setVisible(false);
        }
    }//GEN-LAST:event_jTable_impuestoKeyPressed

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
            new Compras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton_agregar_detalle;
    public static javax.swing.JButton jButton_borrar;
    private javax.swing.JButton jButton_buscar;
    public static com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JDialog jDialog_agregar_detalle;
    private javax.swing.JDialog jDialog_compras;
    private javax.swing.JDialog jDialog_cuenta;
    private javax.swing.JDialog jDialog_detalle_borrar;
    private javax.swing.JDialog jDialog_detalle_producto;
    private javax.swing.JDialog jDialog_forma_pago;
    private javax.swing.JDialog jDialog_impuesto;
    private javax.swing.JDialog jDialog_proveedor;
    private javax.swing.JDialog jDialog_sector;
    private javax.swing.JDialog jDialog_tipo_pago;
    private javax.swing.JDialog jDialog_ubicacion;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JTable jTable_buscar;
    public static javax.swing.JTable jTable_cuenta;
    public static javax.swing.JTable jTable_detalle;
    public static javax.swing.JTable jTable_forma_pago;
    public static javax.swing.JTable jTable_impuesto;
    public static javax.swing.JTable jTable_productos;
    public static javax.swing.JTable jTable_proveedor;
    public static javax.swing.JTable jTable_sector;
    public static javax.swing.JTable jTable_tipo_pago;
    public static javax.swing.JTable jTable_ubicacion;
    public static javax.swing.JTextField jTextField_buscar;
    private javax.swing.JTextField jTextField_buscar_producto;
    public static javax.swing.JTextField jTextField_compra_tipo;
    public static javax.swing.JTextField jTextField_cuenta;
    private javax.swing.JTextField jTextField_cuenta_buscar;
    public static javax.swing.JTextField jTextField_forma_pago;
    private javax.swing.JTextField jTextField_precio;
    public static javax.swing.JTextField jTextField_producto;
    private javax.swing.JTextField jTextField_proveedor_buscar;
    public static javax.swing.JTextField jTextField_sector;
    public static javax.swing.JTextField jTextField_total;
    public static javax.swing.JTextField jTextField_ubicacion;
    private javax.swing.JTextField jTextField_unidades;
    public static javax.swing.JTextField jt_Proveedor;
    public static javax.swing.JTextField jt_factura;
    // End of variables declaration//GEN-END:variables
}
