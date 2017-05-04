package DEV;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventas extends javax.swing.JFrame {

    public Ventas() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ventas");
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Conexion.Verificar_conexion();
        jButton_borrar.setVisible(false);
        jDateChooser3.setDate(Metodos.hoy);
        Metodos.Ventas_max();
        Metodos.Ventas_traer_datos();
        Metodos.Ventas_detalle_jtable();

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
        jTextField_total_detalle = new javax.swing.JTextField();
        jDialog_detalle_producto = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jTextField_buscar_producto = new javax.swing.JTextField();
        jDialog_clientes = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jTextField_buscar_cliente = new javax.swing.JTextField();
        jDialog_ventas = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_ventas = new javax.swing.JTable();
        jTextField_buscar_venta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField_cliente = new javax.swing.JTextField();
        jButton_borrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_detalle = new javax.swing.JTable();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jTextField_total = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField_tipo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

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
            jTable_buscar.getColumnModel().getColumn(1).setPreferredWidth(300);
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
        jTextField_unidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_unidadesActionPerformed(evt);
            }
        });
        jTextField_unidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_unidadesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_unidadesKeyReleased(evt);
            }
        });

        jTextField_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio Unitario"));
        jTextField_precio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_precioFocusGained(evt);
            }
        });
        jTextField_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_precioKeyReleased(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField_total_detalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));
        jTextField_total_detalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_total_detalleKeyPressed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_total_detalle, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_total_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                "ID", "Producto", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
            jTable_productos.getColumnModel().getColumn(1).setPreferredWidth(350);
            jTable_productos.getColumnModel().getColumn(2).setResizable(false);
            jTable_productos.getColumnModel().getColumn(2).setPreferredWidth(75);
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

        jDialog_clientes.setUndecorated(true);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "RUC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_clientesMouseClicked(evt);
            }
        });
        jTable_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_clientesKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(jTable_clientes);
        if (jTable_clientes.getColumnModel().getColumnCount() > 0) {
            jTable_clientes.getColumnModel().getColumn(0).setResizable(false);
            jTable_clientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_clientes.getColumnModel().getColumn(1).setResizable(false);
            jTable_clientes.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable_clientes.getColumnModel().getColumn(2).setResizable(false);
            jTable_clientes.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jTextField_buscar_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_buscar_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscar_clienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_buscar_clienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jTextField_buscar_cliente))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_clientesLayout = new javax.swing.GroupLayout(jDialog_clientes.getContentPane());
        jDialog_clientes.getContentPane().setLayout(jDialog_clientesLayout);
        jDialog_clientesLayout.setHorizontalGroup(
            jDialog_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_clientesLayout.setVerticalGroup(
            jDialog_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_ventas.setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Factura", "Fecha", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ventasMouseClicked(evt);
            }
        });
        jTable_ventas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_ventasKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(jTable_ventas);
        if (jTable_ventas.getColumnModel().getColumnCount() > 0) {
            jTable_ventas.getColumnModel().getColumn(0).setResizable(false);
            jTable_ventas.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_ventas.getColumnModel().getColumn(1).setResizable(false);
            jTable_ventas.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable_ventas.getColumnModel().getColumn(2).setResizable(false);
            jTable_ventas.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable_ventas.getColumnModel().getColumn(3).setResizable(false);
            jTable_ventas.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable_ventas.getColumnModel().getColumn(4).setResizable(false);
            jTable_ventas.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jTextField_buscar_venta.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por cliente"));
        jTextField_buscar_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscar_ventaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_buscar_ventaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jTextField_buscar_venta))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_ventasLayout = new javax.swing.GroupLayout(jDialog_ventas.getContentPane());
        jDialog_ventas.getContentPane().setLayout(jDialog_ventasLayout);
        jDialog_ventasLayout.setHorizontalGroup(
            jDialog_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_ventasLayout.setVerticalGroup(
            jDialog_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jTextField_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente (F1 para buscar)"));
        jTextField_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_clienteFocusGained(evt);
            }
        });
        jTextField_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_clienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_clienteKeyReleased(evt);
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

        jButton_buscar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton_buscar.setToolTipText("");
        jButton_buscar.setBorder(null);
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jTable_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Unidades", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_detalle);
        if (jTable_detalle.getColumnModel().getColumnCount() > 0) {
            jTable_detalle.getColumnModel().getColumn(0).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable_detalle.getColumnModel().getColumn(1).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTable_detalle.getColumnModel().getColumn(2).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(3).setResizable(false);
            jTable_detalle.getColumnModel().getColumn(4).setResizable(false);
        }

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jDateChooser3.setDateFormatString("dd/MM/yyyy");
        jDateChooser3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser3KeyPressed(evt);
            }
        });

        jTextField_total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_total.setText("0");

        jTextField_tipo.setText("Contado");
        jTextField_tipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo (F1 para buscar)"));
        jTextField_tipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_tipoFocusGained(evt);
            }
        });
        jTextField_tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_tipoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_tipoKeyReleased(evt);
            }
        });

        jButton2.setMnemonic('a');
        jButton2.setText("Agregar Detalle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 285, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jTextField_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(jTextField_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_total, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Ventas_clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void Ventas_clear() {
        Metodos.Ventas_insert();
        jTextField_tipo.setText("Contado");
        jTextField_cliente.setText("");
        jTextField_cliente.requestFocus();
        Metodos.ventas_id_cliente = 0;
        Metodos.Ventas_detalle_jtable();
    }

    private void jTextField_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_clienteKeyReleased

    }//GEN-LAST:event_jTextField_clienteKeyReleased

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed
        jButton_borrar.setVisible(false);
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void jTextField_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_clienteFocusGained
    }//GEN-LAST:event_jTextField_clienteFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_clienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_clientes();
        }
    }//GEN-LAST:event_jTextField_clienteKeyPressed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        jDialog_ventas();
        Metodos.Ventas_buscar_jtable(jTextField_buscar_cliente.getText());
    }//GEN-LAST:event_jButton_buscarActionPerformed

    public void jDialog_compras() {
        jDialog_compras.setVisible(true);
        jDialog_compras.setTitle("Buscar Compras");
        jDialog_compras.setSize(500, 500);
        jDialog_compras.setLocationRelativeTo(null);
        jDialog_compras.setAlwaysOnTop(true);
        jDialog_compras.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_ventas() {
        jDialog_ventas.setVisible(true);
        jDialog_ventas.setTitle("Buscar Ventas");
        jDialog_ventas.setSize(500, 500);
        jDialog_ventas.setLocationRelativeTo(null);
        jDialog_ventas.setAlwaysOnTop(true);
        jDialog_ventas.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_clientes() {
        jDialog_clientes.setVisible(true);
        jDialog_clientes.setTitle("Clientes");
        jDialog_clientes.setSize(500, 500);
        jDialog_clientes.setLocationRelativeTo(null);
        jDialog_clientes.setAlwaysOnTop(true);
        jDialog_clientes.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
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
        jDialog_agregar_detalle.setVisible(true);
        jDialog_agregar_detalle.setTitle("Agregar detalle");
        jDialog_agregar_detalle.setSize(499, 155);
        jDialog_agregar_detalle.setLocationRelativeTo(null);
        jDialog_agregar_detalle.setAlwaysOnTop(true);
        jDialog_agregar_detalle.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
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

    private void jTable_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_jTable_buscarKeyPressed

    private void jTextField_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        }
    }//GEN-LAST:event_jTextField_buscarKeyPressed

    private void jDateChooser3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser3KeyPressed

    }//GEN-LAST:event_jDateChooser3KeyPressed

    private void jTextField_proveedor_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedor_buscarKeyReleased

    }//GEN-LAST:event_jTextField_proveedor_buscarKeyReleased

    private void jTextField_proveedor_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_proveedor_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

        }
    }//GEN-LAST:event_jTextField_proveedor_buscarKeyPressed

    private void jTable_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_proveedorKeyPressed

    }//GEN-LAST:event_jTable_proveedorKeyPressed

    private void jTable_sectorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_sectorKeyPressed

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
//        Metodos.Compras_buscar_jtable(jTextField_buscar.getText());
    }//GEN-LAST:event_jTextField_buscarKeyReleased

    private void jTable_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_buscarMouseClicked
//        Metodos.Compra_buscar_selected();
//        Metodos.Comprfas_buscar_traer_datos();
//        jDialog_compras.setVisible(false);
//        Metodos.Compras_detalle_jtable();
//        jButton_borrar.setVisible(true);
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
            Metodos.Ventas_productos_selected();
            jDialog_detalle_producto.setVisible(false);
        }
    }//GEN-LAST:event_jTable_productosKeyPressed

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
            Metodos.Ventas_agregar_producto_jtable(jTextField_buscar_producto.getText());
        }
    }//GEN-LAST:event_jTextField_buscar_productoKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDialog_agregar_detalle.setVisible(false);
        Metodos.Ventas_agregar_detalle_guardar(jTextField_unidades.getText(), jTextField_precio.getText(), jTextField_total_detalle.getText());
//        Metodos.Ventas_actualizar_total();
        Metodos.Ventas_detalle_jtable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField_tipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_tipoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tipoFocusGained

    private void jTextField_tipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_tipoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tipoKeyPressed

    private void jTextField_tipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_tipoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tipoKeyReleased

    private void jTable_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_clientesMouseClicked

    private void jTable_clientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_clientesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_clientes.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Ventas_clientes_selected();
            Metodos.Ventas_clientes_guardar();
            jDialog_clientes.setVisible(false);
        }
    }//GEN-LAST:event_jTable_clientesKeyPressed

    private void jTextField_buscar_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_clienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_clientes.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_buscar_clienteKeyPressed

    private void jTextField_buscar_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_clienteKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_clientes.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {

            }
        } else {
            Metodos.Ventas_clientes_jtable(jTextField_buscar_cliente.getText());
        }
    }//GEN-LAST:event_jTextField_buscar_clienteKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Clear_detalle();
        if (Metodos.ventas_id_cliente != 0) {
            jDialog_agregar_detalle();
        } else {
            JOptionPane.showMessageDialog(null, "Elija un cliente para continuar.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jTextField_total_detalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_total_detalleKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_agregar_detalle.setVisible(false);
        }
    }//GEN-LAST:event_jTextField_total_detalleKeyPressed

    private void jTextField_unidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_unidadesKeyReleased
        jTextField_total_detalle.setText(String.valueOf(Double.parseDouble(jTextField_precio.getText()) * Double.parseDouble(jTextField_unidades.getText())));
    }//GEN-LAST:event_jTextField_unidadesKeyReleased

    private void jTextField_precioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_precioFocusGained
        jTextField_precio.selectAll();
    }//GEN-LAST:event_jTextField_precioFocusGained

    private void jTextField_unidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_unidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_unidadesActionPerformed

    private void jTextField_precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_precioKeyReleased
        jTextField_total_detalle.setText(String.valueOf(Double.parseDouble(jTextField_precio.getText()) * Double.parseDouble(jTextField_unidades.getText())));
    }//GEN-LAST:event_jTextField_precioKeyReleased

    private void jTable_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ventasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_ventasMouseClicked

    private void jTable_ventasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_ventasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_ventas.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Ventas_buscar_selected();
            Metodos.Ventas_traer_datos();
            Metodos.Ventas_detalle_jtable();
            jDialog_ventas.setVisible(false);
        }
    }//GEN-LAST:event_jTable_ventasKeyPressed

    private void jTextField_buscar_ventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_ventaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_ventas.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_ventas.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {

            }
        }

    }//GEN-LAST:event_jTextField_buscar_ventaKeyPressed

    private void jTextField_buscar_ventaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_ventaKeyReleased
        Metodos.Ventas_buscar_jtable(jTextField_buscar_venta.getText());
    }//GEN-LAST:event_jTextField_buscar_ventaKeyReleased

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
            new Ventas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton_borrar;
    private javax.swing.JButton jButton_buscar;
    public static com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JDialog jDialog_agregar_detalle;
    private javax.swing.JDialog jDialog_clientes;
    private javax.swing.JDialog jDialog_compras;
    private javax.swing.JDialog jDialog_detalle_producto;
    private javax.swing.JDialog jDialog_proveedor;
    private javax.swing.JDialog jDialog_sector;
    private javax.swing.JDialog jDialog_ventas;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JTable jTable_buscar;
    public static javax.swing.JTable jTable_clientes;
    public static javax.swing.JTable jTable_detalle;
    public static javax.swing.JTable jTable_productos;
    public static javax.swing.JTable jTable_proveedor;
    public static javax.swing.JTable jTable_sector;
    public static javax.swing.JTable jTable_ventas;
    public static javax.swing.JTextField jTextField_buscar;
    public static javax.swing.JTextField jTextField_buscar_cliente;
    private javax.swing.JTextField jTextField_buscar_producto;
    public static javax.swing.JTextField jTextField_buscar_venta;
    public static javax.swing.JTextField jTextField_cliente;
    public static javax.swing.JTextField jTextField_precio;
    public static javax.swing.JTextField jTextField_producto;
    private javax.swing.JTextField jTextField_proveedor_buscar;
    public static javax.swing.JTextField jTextField_tipo;
    public static javax.swing.JTextField jTextField_total;
    public static javax.swing.JTextField jTextField_total_detalle;
    public static javax.swing.JTextField jTextField_unidades;
    // End of variables declaration//GEN-END:variables

    private void Clear_detalle() {
        Metodos.ventas_id_producto = 0;
        jTextField_producto.setText("");
        jTextField_precio.setText("");
        jTextField_unidades.setText("");
        jTextField_total_detalle.setText("");
        jTextField_producto.requestFocus();

    }
}
