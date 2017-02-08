package DEV;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Producto extends javax.swing.JFrame {

    public Producto() {
        initComponents();
        setTitle("Productos");
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Producto_Nuevo();
        jTextField_porcentaje.setVisible(false);
        jLabel8.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_proveedor = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jTextField_buscar = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_proveedor = new javax.swing.JTable();
        jDialog_rubro = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jTextField_buscar_rubro = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_rubro = new javax.swing.JTable();
        jDialog_productos = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jTextField_buscar_producto = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_producto = new javax.swing.JTable();
        jDialog_ubicacion = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_ubicacion = new javax.swing.JTable();
        jDialog_ubicacion_borrar = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        producto_codigo = new javax.swing.JTextField();
        producto_nombre = new javax.swing.JTextField();
        jTextField_precio_de_compra = new javax.swing.JTextField();
        producto_precio = new javax.swing.JTextField();
        jTextField_porcentaje = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        producto_stock_bajo = new javax.swing.JTextField();
        jDateChooser_vencimiento = new com.toedter.calendar.JDateChooser();
        producto_proveedor = new javax.swing.JTextField();
        jTextField_iva = new javax.swing.JTextField();
        producto_rubro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_producto_ubicacion = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jTextField_stock = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_precios = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_historial = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton_borrar = new javax.swing.JButton();
        jButton_buscar = new javax.swing.JButton();

        jDialog_proveedor.setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscarActionPerformed(evt);
            }
        });
        jTextField_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscarKeyPressed(evt);
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
        jScrollPane4.setViewportView(jTable_proveedor);
        if (jTable_proveedor.getColumnModel().getColumnCount() > 0) {
            jTable_proveedor.getColumnModel().getColumn(0).setResizable(false);
            jTable_proveedor.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable_proveedor.getColumnModel().getColumn(1).setResizable(false);
            jTable_proveedor.getColumnModel().getColumn(1).setPreferredWidth(450);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addComponent(jTextField_buscar))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_proveedorLayout = new javax.swing.GroupLayout(jDialog_proveedor.getContentPane());
        jDialog_proveedor.getContentPane().setLayout(jDialog_proveedorLayout);
        jDialog_proveedorLayout.setHorizontalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_proveedorLayout.setVerticalGroup(
            jDialog_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_rubro.setUndecorated(true);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_buscar_rubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_buscar_rubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscar_rubroActionPerformed(evt);
            }
        });
        jTextField_buscar_rubro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscar_rubroKeyPressed(evt);
            }
        });

        jTable_rubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Rubro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_rubro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_rubroKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_rubro);
        if (jTable_rubro.getColumnModel().getColumnCount() > 0) {
            jTable_rubro.getColumnModel().getColumn(0).setResizable(false);
            jTable_rubro.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable_rubro.getColumnModel().getColumn(1).setResizable(false);
            jTable_rubro.getColumnModel().getColumn(1).setPreferredWidth(450);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addComponent(jTextField_buscar_rubro))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar_rubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_rubroLayout = new javax.swing.GroupLayout(jDialog_rubro.getContentPane());
        jDialog_rubro.getContentPane().setLayout(jDialog_rubroLayout);
        jDialog_rubroLayout.setHorizontalGroup(
            jDialog_rubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_rubroLayout.setVerticalGroup(
            jDialog_rubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_productos.setUndecorated(true);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTextField_buscar_producto.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jTextField_buscar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscar_productoActionPerformed(evt);
            }
        });
        jTextField_buscar_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_buscar_productoKeyPressed(evt);
            }
        });

        jTable_producto.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productoMouseClicked(evt);
            }
        });
        jTable_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_productoKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(jTable_producto);
        if (jTable_producto.getColumnModel().getColumnCount() > 0) {
            jTable_producto.getColumnModel().getColumn(0).setResizable(false);
            jTable_producto.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable_producto.getColumnModel().getColumn(1).setResizable(false);
            jTable_producto.getColumnModel().getColumn(1).setPreferredWidth(450);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addComponent(jTextField_buscar_producto))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_buscar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog_productosLayout = new javax.swing.GroupLayout(jDialog_productos.getContentPane());
        jDialog_productos.getContentPane().setLayout(jDialog_productosLayout);
        jDialog_productosLayout.setHorizontalGroup(
            jDialog_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_productosLayout.setVerticalGroup(
            jDialog_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_ubicacion.setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jTable_ubicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ubicación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_ubicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ubicacionMouseClicked(evt);
            }
        });
        jTable_ubicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_ubicacionKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(jTable_ubicacion);
        if (jTable_ubicacion.getColumnModel().getColumnCount() > 0) {
            jTable_ubicacion.getColumnModel().getColumn(0).setResizable(false);
            jTable_ubicacion.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_ubicacion.getColumnModel().getColumn(1).setResizable(false);
            jTable_ubicacion.getColumnModel().getColumn(1).setPreferredWidth(470);
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_ubicacionLayout = new javax.swing.GroupLayout(jDialog_ubicacion.getContentPane());
        jDialog_ubicacion.getContentPane().setLayout(jDialog_ubicacionLayout);
        jDialog_ubicacionLayout.setHorizontalGroup(
            jDialog_ubicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_ubicacionLayout.setVerticalGroup(
            jDialog_ubicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog_ubicacion_borrar.setAlwaysOnTop(true);
        jDialog_ubicacion_borrar.setUndecorated(true);

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

        javax.swing.GroupLayout jDialog_ubicacion_borrarLayout = new javax.swing.GroupLayout(jDialog_ubicacion_borrar.getContentPane());
        jDialog_ubicacion_borrar.getContentPane().setLayout(jDialog_ubicacion_borrarLayout);
        jDialog_ubicacion_borrarLayout.setHorizontalGroup(
            jDialog_ubicacion_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_ubicacion_borrarLayout.setVerticalGroup(
            jDialog_ubicacion_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        producto_codigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        producto_codigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Códigos de barra"));
        producto_codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                producto_codigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                producto_codigoFocusLost(evt);
            }
        });
        producto_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_codigoActionPerformed(evt);
            }
        });
        producto_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_codigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                producto_codigoKeyReleased(evt);
            }
        });

        producto_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del producto o servicio"));
        producto_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_nombreActionPerformed(evt);
            }
        });
        producto_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                producto_nombreFocusLost(evt);
            }
        });
        producto_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_nombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                producto_nombreKeyReleased(evt);
            }
        });

        jTextField_precio_de_compra.setEditable(false);
        jTextField_precio_de_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_precio_de_compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_precio_de_compra.setBorder(javax.swing.BorderFactory.createTitledBorder("Pr Compra"));
        jTextField_precio_de_compra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_precio_de_compraFocusGained(evt);
            }
        });
        jTextField_precio_de_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_precio_de_compraActionPerformed(evt);
            }
        });

        producto_precio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        producto_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio de venta"));
        producto_precio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                producto_precioFocusGained(evt);
            }
        });
        producto_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                producto_precioKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_precioKeyPressed(evt);
            }
        });

        jTextField_porcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_porcentaje.setText("0");
        jTextField_porcentaje.setBorder(javax.swing.BorderFactory.createTitledBorder("Recargo"));
        jTextField_porcentaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_porcentajeFocusGained(evt);
            }
        });
        jTextField_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_porcentajeActionPerformed(evt);
            }
        });

        jLabel8.setText("% sobre el precio de la última compra");

        producto_stock_bajo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        producto_stock_bajo.setBorder(javax.swing.BorderFactory.createTitledBorder("Stock bajo"));
        producto_stock_bajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_stock_bajoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                producto_stock_bajoKeyReleased(evt);
            }
        });

        jDateChooser_vencimiento.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser_vencimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Vencimiento"));
        jDateChooser_vencimiento.setDateFormatString("dd/MMM/yyyy");

        producto_proveedor.setToolTipText("Click para buscar");
        producto_proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor (F1 para buscar)"));
        producto_proveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                producto_proveedorFocusGained(evt);
            }
        });
        producto_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producto_proveedorMouseClicked(evt);
            }
        });
        producto_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_proveedorActionPerformed(evt);
            }
        });
        producto_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_proveedorKeyPressed(evt);
            }
        });

        jTextField_iva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_iva.setText("10");
        jTextField_iva.setBorder(javax.swing.BorderFactory.createTitledBorder("I.V.A."));
        jTextField_iva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_ivaMouseClicked(evt);
            }
        });
        jTextField_iva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ivaKeyPressed(evt);
            }
        });

        producto_rubro.setToolTipText("Click para buscar");
        producto_rubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Rubro (F1 para buscar)"));
        producto_rubro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producto_rubroMouseClicked(evt);
            }
        });
        producto_rubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_rubroActionPerformed(evt);
            }
        });
        producto_rubro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                producto_rubroFocusGained(evt);
            }
        });
        producto_rubro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                producto_rubroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(producto_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(producto_nombre)
                        .addGap(340, 340, 340))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(producto_rubro, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(producto_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_iva))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField_precio_de_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(producto_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(producto_stock_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(0, 236, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(producto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_precio_de_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(producto_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(producto_stock_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(producto_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(producto_rubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 164, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Información general", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_producto_ubicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ubicación", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_producto_ubicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_producto_ubicacionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_producto_ubicacion);
        if (jTable_producto_ubicacion.getColumnModel().getColumnCount() > 0) {
            jTable_producto_ubicacion.getColumnModel().getColumn(0).setResizable(false);
            jTable_producto_ubicacion.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_producto_ubicacion.getColumnModel().getColumn(1).setResizable(false);
            jTable_producto_ubicacion.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTable_producto_ubicacion.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton5.setText("Agregar Ubicación");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField_stock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_stock.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(569, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ubicaciones", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable_precios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Unidades", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_precios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_preciosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_precios);
        if (jTable_precios.getColumnModel().getColumnCount() > 0) {
            jTable_precios.getColumnModel().getColumn(0).setResizable(false);
            jTable_precios.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_precios.getColumnModel().getColumn(1).setResizable(false);
            jTable_precios.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable_precios.getColumnModel().getColumn(2).setResizable(false);
            jTable_precios.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Precios de Venta", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTable_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Proveedor", "Precio Unitario", "Unidades", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_historial);
        if (jTable_historial.getColumnModel().getColumnCount() > 0) {
            jTable_historial.getColumnModel().getColumn(0).setResizable(false);
            jTable_historial.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable_historial.getColumnModel().getColumn(1).setResizable(false);
            jTable_historial.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable_historial.getColumnModel().getColumn(2).setResizable(false);
            jTable_historial.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable_historial.getColumnModel().getColumn(3).setResizable(false);
            jTable_historial.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable_historial.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Historial de compras", jPanel5);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        jButton1.setMnemonic('x');
        jButton1.setToolTipText("Alt + X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminar_mini.jpg"))); // NOI18N
        jButton2.setMnemonic('t');
        jButton2.setToolTipText("Alt + T");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-4);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_mini.png"))); // NOI18N
        jButton3.setMnemonic('n');
        jButton3.setToolTipText("Alt + N");
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-4);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton_borrar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del_mini.png"))); // NOI18N
        jButton_borrar.setToolTipText("Borrar");
        jButton_borrar.setBorder(null);
        jButton_borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_borrar.setIconTextGap(-4);
        jButton_borrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrarActionPerformed(evt);
            }
        });

        jButton_buscar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_mini.png"))); // NOI18N
        jButton_buscar.setToolTipText("Borrar");
        jButton_buscar.setBorder(null);
        jButton_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_buscar.setIconTextGap(-4);
        jButton_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void producto_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_nombreActionPerformed

    }//GEN-LAST:event_producto_nombreActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void producto_proveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_proveedorFocusGained

    }//GEN-LAST:event_producto_proveedorFocusGained

    private void producto_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_proveedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //  new Productos_buscar_proveedores().setVisible(true);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_proveedor();
        }
    }//GEN-LAST:event_producto_proveedorKeyPressed

    private void producto_nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_nombreFocusLost
//        jTextField_precio_de_compra.requestFocus();
    }//GEN-LAST:event_producto_nombreFocusLost

    private void producto_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_nombreKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            //    new Producto_buscar().setVisible(true);
            //    Producto_buscar.formulario = 1;
        }
    }//GEN-LAST:event_producto_nombreKeyPressed

    private void producto_precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_precioKeyPressed

    }//GEN-LAST:event_producto_precioKeyPressed

    private void producto_stock_bajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_stock_bajoKeyPressed

    }//GEN-LAST:event_producto_stock_bajoKeyPressed

    private void producto_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_codigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            //  new Producto_buscar().setVisible(true);
            //  Producto_buscar.formulario = 1;
        }
    }//GEN-LAST:event_producto_codigoKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void producto_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_codigoActionPerformed

    private void producto_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_proveedorActionPerformed

    private void producto_precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_precioKeyReleased
//        String puntitos = getSepararMiles(producto_precio.getText().replace(".", ""));
//        producto_precio.setText(puntitos);
//
//        if (evt.getKeyCode() == KeyEvent.VK_F4) {
//            Producto_Guardar();
//        }
    }//GEN-LAST:event_producto_precioKeyReleased


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Metodos.Producto_Guardar(producto_nombre.getText(), producto_codigo.getText(), producto_precio.getText(), jTextField_iva.getText(),
                producto_stock_bajo.getText(), jDateChooser_vencimiento.getDate(), jTextField_porcentaje.getText());
//        Producto_Nuevo();
//        if (formulario_externo == 1) {
//            formulario_externo = 0;
//            this.setVisible(false);
//            Facturacion.jT_buscador.requestFocus();
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Metodos.Producto_Nuevo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void producto_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_nombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            //    Producto_Guardar();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            Metodos.Producto_Nuevo();
        }
    }//GEN-LAST:event_producto_nombreKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            //  Producto_Guardar();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            Metodos.Producto_Nuevo();
        }
    }//GEN-LAST:event_formKeyReleased

    private void producto_stock_bajoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_stock_bajoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            //  Producto_Guardar();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            Metodos.Producto_Nuevo();
        }
    }//GEN-LAST:event_producto_stock_bajoKeyReleased

    private void producto_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_codigoKeyReleased

    }//GEN-LAST:event_producto_codigoKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        Metodos.id_producto = 0;
    }//GEN-LAST:event_formWindowOpened

    private void producto_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto_proveedorMouseClicked
//        new Productos_buscar_proveedores().setVisible(true);
        //buscar_proveedor.formulario = 1;
    }//GEN-LAST:event_producto_proveedorMouseClicked

    private void jTextField_ivaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_ivaMouseClicked
        //   new Iva().setVisible(true);
    }//GEN-LAST:event_jTextField_ivaMouseClicked

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed

        if (JOptionPane.showConfirmDialog(
                rootPane, "¿Desea borrar este producto?", "AVISO",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            //       Metodos.Productos_delete();
            jButton_borrar.setVisible(false);
        }
    }//GEN-LAST:event_jButton_borrarActionPerformed

    private void producto_precioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_precioFocusGained
        producto_precio.selectAll();
    }//GEN-LAST:event_producto_precioFocusGained

    private void jTextField_porcentajeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_porcentajeFocusGained
        jTextField_porcentaje.selectAll();
    }//GEN-LAST:event_jTextField_porcentajeFocusGained

    private void producto_codigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_codigoFocusGained
        producto_codigo.selectAll();
    }//GEN-LAST:event_producto_codigoFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        //     Facturacion.jT_buscador.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void producto_codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_codigoFocusLost

        if (Producto.producto_codigo.getText().length() > 0) {
            //       Metodos.Producto_Buscar_por_codigo_de_barras();
            producto_nombre.requestFocus();
        }
    }//GEN-LAST:event_producto_codigoFocusLost

    private void jTextField_ivaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ivaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //       new Iva().setVisible(true);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            //       new Iva().setVisible(true);
        }
    }//GEN-LAST:event_jTextField_ivaKeyPressed

    private void jTextField_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_porcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_porcentajeActionPerformed

    private void jTextField_precio_de_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_precio_de_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precio_de_compraActionPerformed

    private void jTextField_precio_de_compraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_precio_de_compraFocusGained
        producto_precio.requestFocus();
    }//GEN-LAST:event_jTextField_precio_de_compraFocusGained

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        jDialog_productos();
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //    new Producto_precio().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable_preciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_preciosMouseClicked
        //   Metodos.Productos_precio_seleccionar();
        //    new Productos_precio_opciones().setVisible(true);
    }//GEN-LAST:event_jTable_preciosMouseClicked

    private void jTextField_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_proveedor.setVisible(false);
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
            Metodos.Proveedor_jtable(jTextField_buscar.getText());
        }
    }//GEN-LAST:event_jTextField_buscarKeyPressed

    private void jTextField_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscarActionPerformed

    private void jTable_proveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_proveedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_proveedor.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Productos_proveedor_selected();
            jDialog_proveedor.setVisible(false);
        }
    }//GEN-LAST:event_jTable_proveedorKeyPressed

    private void producto_rubroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_producto_rubroFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_rubroFocusGained

    private void producto_rubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto_rubroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_rubroMouseClicked

    private void producto_rubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_rubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto_rubroActionPerformed

    private void producto_rubroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_producto_rubroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            jDialog_rubro();
        }
    }//GEN-LAST:event_producto_rubroKeyPressed

    private void jTextField_buscar_rubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscar_rubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscar_rubroActionPerformed

    private void jTextField_buscar_rubroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_rubroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_rubro.setVisible(false);
        }
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_rubro.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                System.err.println(ex);
            }
        } else {
            Metodos.Rubro_jtable(jTextField_buscar_rubro.getText());
        }
    }//GEN-LAST:event_jTextField_buscar_rubroKeyPressed

    private void jTable_rubroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_rubroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jDialog_rubro.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Rubro_proveedor_selected();
            jDialog_rubro.setVisible(false);
        }
    }//GEN-LAST:event_jTable_rubroKeyPressed

    private void jTextField_buscar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscar_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscar_productoActionPerformed

    private void jTextField_buscar_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_buscar_productoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_productos.setVisible(false);
            producto_codigo.requestFocus();
        }
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            try {
                jTable_producto.requestFocus();
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
            } catch (AWTException ex) {
                System.err.println(ex);
            }
        } else {
            Metodos.Producto_jtable(jTextField_buscar_producto.getText());
        }
    }//GEN-LAST:event_jTextField_buscar_productoKeyPressed

    private void jTable_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_productoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_productos.setVisible(false);
            producto_codigo.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Productos_selected();
            Metodos.Productos_traer_datos();
            Metodos.Producto_ubicacion_jtable();
            jDialog_productos.setVisible(false);
            producto_nombre.requestFocus();
        }
    }//GEN-LAST:event_jTable_productoKeyPressed

    private void jTable_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productoMouseClicked
        Metodos.Productos_selected();
        Metodos.Productos_traer_datos();
        Metodos.Producto_ubicacion_jtable();
        jDialog_productos.setVisible(false);
        producto_nombre.requestFocus();
    }//GEN-LAST:event_jTable_productoMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDialog_ubicacion();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable_ubicacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_ubicacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jDialog_ubicacion.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Metodos.Productos_ubicacion_selected();
            Metodos.Productos_ubicacion_guardar();
            Metodos.Producto_ubicacion_jtable();
            jDialog_ubicacion.setVisible(false);
        }


    }//GEN-LAST:event_jTable_ubicacionKeyPressed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTable_ubicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ubicacionMouseClicked
        Metodos.Productos_ubicacion_selected();
        Metodos.Productos_ubicacion_guardar();
        jDialog_ubicacion.setVisible(false);
        Metodos.Producto_ubicacion_jtable();
    }//GEN-LAST:event_jTable_ubicacionMouseClicked

    private void jTable_producto_ubicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_producto_ubicacionMouseClicked
        Metodos.Productos_jTable_producto_ubicacion_selected();
        jDialog_ubicacion_borrar();
    }//GEN-LAST:event_jTable_producto_ubicacionMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jDialog_ubicacion_borrar.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Metodos.Productos_ubicacion_delete();
        Metodos.Producto_ubicacion_jtable();
        jDialog_ubicacion_borrar.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    public void jDialog_proveedor() {
        jDialog_proveedor.setVisible(true);
        jDialog_proveedor.setTitle("Buscar Proveedor");
        jDialog_proveedor.setSize(500, 500);
        jDialog_proveedor.setLocationRelativeTo(null);
        jDialog_proveedor.setAlwaysOnTop(true);
        jDialog_proveedor.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_ubicacion_borrar() {
        jDialog_ubicacion_borrar.setVisible(true);
        jDialog_ubicacion_borrar.setTitle("Quitar Ubicación");
        jDialog_ubicacion_borrar.setSize(214, 74);
        jDialog_ubicacion_borrar.setLocationRelativeTo(null);
        jDialog_ubicacion_borrar.setAlwaysOnTop(true);
        jDialog_ubicacion_borrar.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
    }

    public void jDialog_ubicacion() {
        jDialog_ubicacion.setVisible(true);
        jDialog_ubicacion.setTitle("Buscar Ubicación");
        jDialog_ubicacion.setSize(500, 500);
        jDialog_ubicacion.setLocationRelativeTo(null);
        jDialog_ubicacion.setAlwaysOnTop(true);
        jDialog_ubicacion.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Producto_ubicacion_buscar_jtable();
    }

    public void jDialog_productos() {
        jDialog_productos.setVisible(true);
        jDialog_productos.setTitle("Buscar Producto");
        jDialog_productos.setSize(500, 500);
        jDialog_productos.setLocationRelativeTo(null);
        jDialog_productos.setAlwaysOnTop(true);
        jDialog_productos.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        Metodos.Producto_jtable("");
        Producto.jTextField_buscar_producto.requestFocus();
    }

    public void jDialog_rubro() {
        jDialog_rubro.setVisible(true);
        jDialog_rubro.setTitle("Buscar Rubro");
        jDialog_rubro.setSize(500, 500);
        jDialog_rubro.setLocationRelativeTo(null);
        jDialog_rubro.setAlwaysOnTop(true);
        jDialog_rubro.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Producto().setVisible(true);
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
    public static javax.swing.JButton jButton_borrar;
    public static javax.swing.JButton jButton_buscar;
    public static com.toedter.calendar.JDateChooser jDateChooser_vencimiento;
    private javax.swing.JDialog jDialog_productos;
    private javax.swing.JDialog jDialog_proveedor;
    private javax.swing.JDialog jDialog_rubro;
    private javax.swing.JDialog jDialog_ubicacion;
    private javax.swing.JDialog jDialog_ubicacion_borrar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable_historial;
    public static javax.swing.JTable jTable_precios;
    public static javax.swing.JTable jTable_producto;
    public static javax.swing.JTable jTable_producto_ubicacion;
    public static javax.swing.JTable jTable_proveedor;
    public static javax.swing.JTable jTable_rubro;
    public static javax.swing.JTable jTable_ubicacion;
    public static javax.swing.JTextField jTextField_buscar;
    public static javax.swing.JTextField jTextField_buscar_producto;
    public static javax.swing.JTextField jTextField_buscar_rubro;
    public static javax.swing.JTextField jTextField_iva;
    public static javax.swing.JTextField jTextField_porcentaje;
    public static javax.swing.JTextField jTextField_precio_de_compra;
    public static javax.swing.JTextField jTextField_stock;
    public static javax.swing.JTextField producto_codigo;
    public static javax.swing.JTextField producto_nombre;
    public static javax.swing.JTextField producto_precio;
    public static javax.swing.JTextField producto_proveedor;
    public static javax.swing.JTextField producto_rubro;
    public static javax.swing.JTextField producto_stock_bajo;
    // End of variables declaration//GEN-END:variables
}
