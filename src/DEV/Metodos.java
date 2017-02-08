package DEV;

import static DEV.Conexion.conexion;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Metodos {

    public static int id_usuario = 0;
    public static int id_rubro = 0;
    public static int id_producto = 0;
    public static int id_proveedor = 0;
    public static int id_compra_detalle = 0;
    public static int id_compra = 0;
    public static int compras_id_producto = 0;
    public static int compras_id_proveedor = 0;
    public static int compras_id_sector = 0;
    public static int producto_id_proveedor = 0;
    public static int producto_id_rubro = 0;
    public static int producto_id_unidad_medida = 0;
    public static int id_productos_tipo = 0;
    public static int id_cuenta = 0;
    public static int id_cliente = 0;
    public static int listado_compras_id_sector = 0;
    public static int id_unidad_medida = 0;
    public static int id_ubicacion = 0;
    public static int id_sector = 0;
    public static int privilegio = 0;
    public static String ubicacion_proyecto = "";
    public static String path = "";
    public static String titulo = "";
    public static boolean entro = false;
    public static Date hoy = new Date();

    public static DecimalFormat num = new DecimalFormat("###,###,###");

    public synchronized static void Proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Proveedor.jTable_proveedor.getModel();
        id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Proveedor.jTable_proveedor.getSelectedRow(), 0)));
    }

    public synchronized static void Productos_selected() {
        DefaultTableModel tm = (DefaultTableModel) Producto.jTable_producto.getModel();
        id_producto = Integer.parseInt(String.valueOf(tm.getValueAt(Producto.jTable_producto.getSelectedRow(), 0)));
    }

    public synchronized static void Listado_compras_sector_selected() {
        DefaultTableModel tm = (DefaultTableModel) Listado_compras_por_sector.jTable_sector.getModel();
        listado_compras_id_sector = Integer.parseInt(String.valueOf(tm.getValueAt(Listado_compras_por_sector.jTable_sector.getSelectedRow(), 0)));
        Listado_compras_por_sector.jtexfield_sector.setText(String.valueOf(tm.getValueAt(Listado_compras_por_sector.jTable_sector.getSelectedRow(), 1)));
    }

    public synchronized static void Compra_buscar_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_buscar.getModel();
        id_compra = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_buscar.getSelectedRow(), 0)));
    }

    public synchronized static void Compras_producto_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_productos.getModel();
        compras_id_producto = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_productos.getSelectedRow(), 0)));
        Compras.jTextField_producto.setText(String.valueOf(tm.getValueAt(Compras.jTable_productos.getSelectedRow(), 1)));
    }

    public synchronized static void Compras_proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_proveedor.getModel();
        compras_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_proveedor.getSelectedRow(), 0)));
        Compras.jt_Proveedor.setText((String.valueOf(tm.getValueAt(Compras.jTable_proveedor.getSelectedRow(), 1)).trim()));
    }

    public synchronized static void Compras_sector_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_sector.getModel();
        compras_id_sector = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_sector.getSelectedRow(), 0)));
        Compras.jt_sector.setText((String.valueOf(tm.getValueAt(Compras.jTable_sector.getSelectedRow(), 1)).trim()));
    }

    public synchronized static void Productos_proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Producto.jTable_proveedor.getModel();
        producto_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Producto.jTable_proveedor.getSelectedRow(), 0)));
        Producto.producto_proveedor.setText((String.valueOf(tm.getValueAt(Producto.jTable_proveedor.getSelectedRow(), 1))));
    }

    public synchronized static void Rubro_proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Producto.jTable_rubro.getModel();
        producto_id_rubro = Integer.parseInt(String.valueOf(tm.getValueAt(Producto.jTable_rubro.getSelectedRow(), 0)));
        Producto.producto_rubro.setText((String.valueOf(tm.getValueAt(Producto.jTable_rubro.getSelectedRow(), 1))));
    }

    public synchronized static void Cliente_selected() {
        DefaultTableModel tm = (DefaultTableModel) Clientes.jTable_cliente.getModel();
        id_cliente = Integer.parseInt(String.valueOf(tm.getValueAt(Clientes.jTable_cliente.getSelectedRow(), 0)));
    }

    public synchronized static void Unidad_medida_selected() {
        DefaultTableModel tm = (DefaultTableModel) Unidad_de_medida.jTable_unidad_medida.getModel();
        id_unidad_medida = Integer.parseInt(String.valueOf(tm.getValueAt(Unidad_de_medida.jTable_unidad_medida.getSelectedRow(), 0)));
    }

    public synchronized static void Ubicacion_selected() {
        DefaultTableModel tm = (DefaultTableModel) Ubicacion.jTable_ubicacion.getModel();
        id_ubicacion = Integer.parseInt(String.valueOf(tm.getValueAt(Ubicacion.jTable_ubicacion.getSelectedRow(), 0)));
    }

    public synchronized static void Sector_selected() {
        DefaultTableModel tm = (DefaultTableModel) Sector.jTable_ubicacion.getModel();
        id_sector = Integer.parseInt(String.valueOf(tm.getValueAt(Sector.jTable_ubicacion.getSelectedRow(), 0)));
    }

    public synchronized static void Rubro_selected() {
        DefaultTableModel tm = (DefaultTableModel) Rubro.jTable_ubicacion.getModel();
        id_productos_tipo = Integer.parseInt(String.valueOf(tm.getValueAt(Rubro.jTable_ubicacion.getSelectedRow(), 0)));
    }

    public static void Producto_Nuevo() {
        Metodos.id_producto = 0;
        Metodos.id_proveedor = 0;
        Metodos.id_ubicacion = 0;
        Metodos.id_proveedor = 1;
        Producto.producto_nombre.setText("");
        Producto.producto_precio.setText("");
        // Producto.ubicacion.setText("");
        Producto.producto_proveedor.setText("No especificado");
        Producto.producto_rubro.setText("No especificado");
        Producto.producto_stock_bajo.setText("");
        Producto.producto_nombre.requestFocus();
        Producto.producto_codigo.setText("");
        Producto.producto_nombre.setEditable(true);
        Producto.jTextField_porcentaje.setText("0");
        Producto.jTextField_precio_de_compra.setText("0");
        Producto.jTextField_iva.setText("10");
        Producto.jButton_borrar.setVisible(false);
        Producto.producto_codigo.requestFocus();
    }

    public static void Cliente_clear() {
        Clientes.jTextField_ci.setText("");
        Clientes.jt_direccion.setText("");
        Clientes.jt_email.setText("");
        Clientes.jt_nombre.setText("");
        Clientes.jt_telefono.setText("");
        Clientes.jt_ruc.setText("");
        Clientes.jt_ruc.requestFocus();
        Clientes.jButton_borrar.setVisible(false);
        id_cliente = 0;

    }

    public static void Proveedor_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT * FROM proveedor where id_proveedor = '" + id_proveedor + "'");
            if (result.next()) {
                if (result.getString("direccion") != null) {
                    Proveedor.JT_Direccion.setText(result.getString("direccion").trim());
                }
                if (result.getString("nombre") != null) {
                    Proveedor.JT_Nombre.setText(result.getString("nombre").trim());
                }
                if (result.getString("ruc") != null) {
                    Proveedor.JT_Ruc.setText(result.getString("ruc").trim());
                }
                if (result.getString("telefono") != null) {
                    Proveedor.JT_Telefono.setText(result.getString("telefono").trim());
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Productos_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT *, proveedor.nombre as proveedor_nombre FROM productos "
                    + "inner join proveedor on proveedor.id_proveedor = productos.id_proveedor "
                    + "inner join productos_tipo on productos_tipo.id_productos_tipo = productos.id_productos_tipo "
                    + "where id_producto = '" + id_producto + "'");
            if (result.next()) {
                if (result.getString("nombre") != null) {
                    Producto.producto_nombre.setText(result.getString("nombre").trim());
                }
                if (result.getString("codigo") != null) {
                    Producto.producto_codigo.setText(result.getString("codigo").trim());
                }
                if (result.getString("precio") != null) {
                    Producto.producto_precio.setText(result.getString("precio").trim());
                }
                if (result.getString("proveedor_nombre") != null) {
                    Producto.producto_proveedor.setText(result.getString("proveedor_nombre").trim());
                }
                producto_id_proveedor = result.getInt("id_proveedor");

                if (result.getString("productos_tipo") != null) {
                    Producto.producto_rubro.setText(result.getString("productos_tipo").trim());
                }
                producto_id_rubro = result.getInt("id_productos_tipo");
                if (result.getString("stock_bajo") != null) {
                    Producto.producto_stock_bajo.setText(result.getString("stock_bajo").trim());
                }
                Producto.jTextField_iva.setText(result.getString("iva").trim());
                Producto.jDateChooser_vencimiento.setDate(result.getDate("vencimiento"));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Comprfas_buscar_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT * FROM compra "
                    + " inner join proveedor on proveedor.id_proveedor = compra.id_proveedor "
                    + " inner join sector on sector.id_sector = compra.id_sector "
                    + "where id_compra = '" + id_compra + "'");
            if (result.next()) {

                compras_id_proveedor = result.getInt("id_proveedor");
                compras_id_sector = result.getInt("id_sector");

                if (result.getString("factura") != null) {
                    Compras.jt_factura.setText(result.getString("factura").trim());
                }
                if (result.getString("nombre") != null) {
                    Compras.jt_Proveedor.setText(result.getString("nombre").trim());
                }
                if (result.getString("sector") != null) {
                    Compras.jt_sector.setText(result.getString("sector").trim());
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Cliente_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT * FROM cliente where id_cliente = '" + id_cliente + "'");
            if (result.next()) {
                if (result.getString("direccion") != null) {
                    Clientes.jt_direccion.setText(result.getString("direccion").trim());
                }
                if (result.getString("nombre") != null) {
                    Clientes.jt_nombre.setText(result.getString("nombre").trim());
                }
                if (result.getString("ruc") != null) {
                    Clientes.jt_ruc.setText(result.getString("ruc").trim());
                }
                if (result.getString("telef") != null) {
                    Clientes.jt_telefono.setText(result.getString("telef").trim());
                }
                if (result.getString("email") != null) {
                    Clientes.jt_email.setText(result.getString("email").trim());
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Ubicacion_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT * FROM ubicacion where id_ubicacion = '" + id_ubicacion + "'");
            if (result.next()) {
                if (result.getString("ubicacion") != null) {
                    Ubicacion.jt_ubicacion.setText(result.getString("ubicacion").trim());
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Sector_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT * FROM sector where id_sector = '" + id_sector + "'");
            if (result.next()) {
                if (result.getString("sector") != null) {
                    Sector.jt_sector.setText(result.getString("sector").trim());
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Rubro_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT * FROM productos_tipo where id_productos_tipo = '" + id_productos_tipo + "'");
            if (result.next()) {
                if (result.getString("productos_tipo") != null) {
                    Rubro.jt_rubro.setText(result.getString("productos_tipo").trim());
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Unidad_medida_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT * FROM unidad_medida "
                    + "where id_unidad_medida = '" + id_unidad_medida + "'");
            if (result.next()) {
                if (result.getString("unidad_medida") != null) {
                    Unidad_de_medida.jt_unidad.setText(result.getString("unidad_medida").trim());
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Proveedor_guardar(String nombre_proveedor, String ruc, String telefono, String direccion) {
        try {

            if ((nombre_proveedor == null) && (nombre_proveedor.length() < 1)) {
                JOptionPane.showMessageDialog(null, "Ingresar el Nombre");
            } else if (Metodos.id_proveedor == 0) {

                int id = 0;
                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_proveedor) FROM proveedor");
                if (result.next()) {
                    id = result.getInt(1) + 1;
                }

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO proveedor VALUES(?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setString(2, nombre_proveedor);
                stUpdateProducto.setString(3, ruc);
                stUpdateProducto.setString(4, telefono);
                stUpdateProducto.setString(5, direccion);
                stUpdateProducto.setInt(6, 0);
                stUpdateProducto.executeUpdate();
                Proveedor.jButton_borrar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE proveedor "
                        + " SET nombre ='" + nombre_proveedor + "',"
                        + " direccion ='" + direccion + "',"
                        + " telefono ='" + telefono + "',"
                        + " ruc ='" + ruc + "' "
                        + " WHERE id_proveedor = '" + Metodos.id_proveedor + "'");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Compras_agregar_detalle_guardar(String unidades, String precio) {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_compra_detalle) FROM compra_detalle");
            if (result.next()) {
                id_compra_detalle = result.getInt(1) + 1;
            }
            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO compra_detalle VALUES(?,?,?,?,?,?)");
            stUpdateProducto.setInt(1, id_compra_detalle);
            stUpdateProducto.setDouble(2, Double.parseDouble(unidades));
            stUpdateProducto.setLong(3, Long.parseLong(precio));

            double total = Double.parseDouble(unidades) * Double.parseDouble(precio);
            long total_long = (long) total;
            stUpdateProducto.setLong(4, total_long);
            stUpdateProducto.setInt(5, id_compra);
            stUpdateProducto.setInt(6, compras_id_producto);
            stUpdateProducto.executeUpdate();
//                Proveedor.jButton_borrar.setVisible(false);
            //  JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Compras_actualizar_total() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT sum(total) FROM compra_detalle where id_compra = '" + id_compra + "'");
            if (result.next()) {
                PreparedStatement stUpdateProducto = conexion.prepareStatement(""
                        + "UPDATE compra "
                        + "set total = '" + result.getLong(1) + "' "
                        + "where id_compra = '" + id_compra + "'");
                stUpdateProducto.executeUpdate();
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Compras_guardar(String factura, Date fecha) {
        try {
            if (id_compra == 0) {
                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_compra) FROM compra");
                if (result.next()) {
                    id_compra = result.getInt(1) + 1;
                }

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO compra VALUES(?,?,?,?,?)");
                stUpdateProducto.setInt(1, id_compra);
                stUpdateProducto.setInt(2, compras_id_proveedor);
                stUpdateProducto.setInt(3, compras_id_sector);
                stUpdateProducto.setString(4, factura);
                stUpdateProducto.setDate(5, util_Date_to_sql_date(fecha));
                stUpdateProducto.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");

            } else {

                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE compra "
                        + " SET factura ='" + factura + "',"
                        + " fecha ='" + util_Date_to_sql_date(fecha) + "',"
                        + " id_proveedor ='" + compras_id_proveedor + "',"
                        + " id_sector ='" + compras_id_sector + "' "
                        + " WHERE id_compra = '" + id_compra + "'");
                st.executeUpdate();

            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static java.sql.Date util_Date_to_sql_date(Date fecha) {
        java.sql.Date fecha_sql_date = null;
        if (fecha != null) {
            java.util.Date utilDate = fecha;
            fecha_sql_date = new java.sql.Date(utilDate.getTime());
        }
        return fecha_sql_date;
    }

    public synchronized static void Producto_Guardar(String nombre, String codigo, String precio, String iva, String stock_bajo,
            Date vencimiento, String porcentaje) {
        try {

            if (!isNumeric(stock_bajo)) {
                stock_bajo = "0";
            }

            if (Metodos.id_producto == 0) {
                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_producto) FROM productos");
                if (result.next()) {
                    id_producto = result.getInt(1) + 1;
                }

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO productos VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id_producto);
                stUpdateProducto.setString(2, nombre);
                stUpdateProducto.setString(3, codigo);
                stUpdateProducto.setLong(4, Long.parseLong(precio));
                stUpdateProducto.setLong(5, Long.parseLong(iva));
                stUpdateProducto.setLong(6, Long.parseLong(stock_bajo));
                stUpdateProducto.setDate(7, util_Date_to_sql_date(vencimiento));
                stUpdateProducto.setInt(8, 0);
                stUpdateProducto.setString(9, "");
                stUpdateProducto.setInt(10, producto_id_proveedor);
                stUpdateProducto.setInt(11, producto_id_rubro);
                stUpdateProducto.setInt(12, producto_id_unidad_medida);
                stUpdateProducto.setInt(13, 0);
                stUpdateProducto.executeUpdate();
//                Proveedor.jButton_borrar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
//                PreparedStatement st = conexion.prepareStatement(
//                        " UPDATE productos "
//                        + " SET nombre ='" + nombre_proveedor + "',"
//                        + " direccion ='" + direccion + "',"
//                        + " telefono ='" + telefono + "',"
//                        + " ruc ='" + ruc + "' "
//                        + " WHERE id_proveedor = '" + Metodos.id_proveedor + "'");
//                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Proveedor_buscar_por_ruc() {
        try {
            if (id_proveedor == 0) {
                if (Proveedor.JT_Ruc.getText().length() > 1) {
                    Statement ST = conexion.createStatement();
                    ResultSet RS = ST.executeQuery("Select * "
                            + "from proveedor "
                            + "WHERE ruc ='" + Proveedor.JT_Ruc.getText() + "'");
                    if (RS.next()) {
                        JOptionPane.showMessageDialog(null, "R.U.C. registrado. Se mostrarán los datos del comercio");

                        Proveedor.JT_Nombre.setText(RS.getString("nombre").trim());
                        Proveedor.JT_Direccion.setText(RS.getString("direccion").trim());
                        Proveedor.JT_Ruc.setText(RS.getString("ruc").trim());
                        Proveedor.JT_Telefono.setText(RS.getString("telefono").trim());
                        Proveedor.jButton_borrar.setVisible(true);
                        Proveedor.JT_Nombre.setEditable(true);

                    }
                }
            } else if (Proveedor.JT_Ruc.getText().length() > 1) {
                Statement ST = conexion.createStatement();
                ResultSet RS = ST.executeQuery("Select * "
                        + "from proveedor "
                        + "WHERE ruc ='" + Proveedor.JT_Ruc.getText() + "' "
                        + "and id_proveedor != '" + id_proveedor + "'");
                if (RS.next()) {
                    JOptionPane.showMessageDialog(null, "R.U.C. registrado. Se mostrarán los datos del comercio");

                    Proveedor.JT_Nombre.setText(RS.getString("nombre").trim());
                    Proveedor.JT_Direccion.setText(RS.getString("direccion").trim());
                    Proveedor.JT_Ruc.setText(RS.getString("ruc").trim());
                    Proveedor.JT_Telefono.setText(RS.getString("telefono").trim());
                    Proveedor.jButton_borrar.setVisible(true);
                    Proveedor.JT_Nombre.setEditable(true);
                }
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Proveedores_delete() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "UPDATE proveedor "
                    + "SET borrado_int = '1' "
                    + "WHERE id_proveedor ='" + id_proveedor + "'");
            Update2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Proveedor eliminado.");

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void getIngresar(String nombre, char[] password) {

        try {
            String pass = new String(password);
            PreparedStatement ps = conexion.prepareStatement("select * from usuario where usuario ='" + nombre + "' and contrasenha = '" + pass + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nombre = rs.getString("nombre").trim();
                id_usuario = rs.getInt("id_usuario");
                privilegio = rs.getInt("id_privilegio");
                ubicacion_proyecto = new File("").getAbsolutePath();
                path = ubicacion_proyecto + "\\reports\\";

                PreparedStatement ps2 = conexion.prepareStatement("select * from configuracion");
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    titulo = rs2.getString("empresa").trim() + " - Usuario: " + nombre;
                }
                new Principal().setVisible(true);
                entro = true;
            }

            if (entro == false) {
                JOptionPane.showMessageDialog(null, "Error de usuario y/o contraseña.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public synchronized static void Cuentas_imprimir() {
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + "plan_de_cuentas.jasper");
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Compras_imprimir(Date desde, Date hasta) {
        try {
            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);
            parametros.put("id_sector", listado_compras_id_sector);

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + "compras_por_sector.jasper");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Cuentas_guardar() {
        try {
            if (id_cuenta == 0) {
                if ((Cuentas_ABM.jTextField_nv1.getText().length() < 1)
                        || (Cuentas_ABM.jTextField_cuenta.getText().length() < 1)) {
                    System.err.println("Complete todos los campos");
                } else {

                    Statement st1 = conexion.createStatement();

                    ResultSet result = st1.executeQuery("SELECT MAX(id_cuenta) FROM cuenta");
                    if (result.next()) {
                        id_cuenta = result.getInt(1) + 1;
                    }
                    int nv1 = 0;
                    if (Cuentas_ABM.jTextField_nv1.getText().length() > 0) {
                        nv1 = Integer.parseInt(Cuentas_ABM.jTextField_nv1.getText());
                    }
                    int nv2 = 0;
                    if (Cuentas_ABM.jTextField_nv2.getText().length() > 0) {
                        nv2 = Integer.parseInt(Cuentas_ABM.jTextField_nv2.getText());
                    }
                    int nv3 = 0;
                    if (Cuentas_ABM.jTextField_nv3.getText().length() > 0) {
                        nv3 = Integer.parseInt(Cuentas_ABM.jTextField_nv3.getText());
                    }
                    int nv4 = 0;
                    if (Cuentas_ABM.jTextField_nv4.getText().length() > 0) {
                        nv4 = Integer.parseInt(Cuentas_ABM.jTextField_nv4.getText());
                    }
                    int nv5 = 0;
                    if (Cuentas_ABM.jTextField_nv5.getText().length() > 0) {
                        nv5 = Integer.parseInt(Cuentas_ABM.jTextField_nv5.getText());
                    }
                    PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO cuenta VALUES(?,?,?,?,?,?,?,?)");
                    stUpdateProducto.setInt(1, id_cuenta);
                    stUpdateProducto.setInt(2, nv1);
                    stUpdateProducto.setInt(3, nv2);
                    stUpdateProducto.setInt(4, nv3);
                    stUpdateProducto.setInt(5, nv4);
                    stUpdateProducto.setInt(6, nv5);
                    stUpdateProducto.setString(7, Cuentas_ABM.jTextField_cuenta.getText());
                    stUpdateProducto.setInt(8, 0);
                    stUpdateProducto.executeUpdate();

                }
            } else if (Cuentas_ABM.jTextField_cuenta.getText().length() > 0) {

                int nv1 = 0;
                if (Cuentas_ABM.jTextField_nv1.getText().length() > 0) {
                    nv1 = Integer.parseInt(Cuentas_ABM.jTextField_nv1.getText());
                }
                int nv2 = 0;
                if (Cuentas_ABM.jTextField_nv2.getText().length() > 0) {
                    nv2 = Integer.parseInt(Cuentas_ABM.jTextField_nv2.getText());
                }
                int nv3 = 0;
                if (Cuentas_ABM.jTextField_nv3.getText().length() > 0) {
                    nv3 = Integer.parseInt(Cuentas_ABM.jTextField_nv3.getText());
                }
                int nv4 = 0;
                if (Cuentas_ABM.jTextField_nv4.getText().length() > 0) {
                    nv4 = Integer.parseInt(Cuentas_ABM.jTextField_nv4.getText());
                }
                int nv5 = 0;
                if (Cuentas_ABM.jTextField_nv5.getText().length() > 0) {
                    nv5 = Integer.parseInt(Cuentas_ABM.jTextField_nv5.getText());
                }

                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET cuenta ='" + Cuentas_ABM.jTextField_cuenta.getText().trim() + "', "
                        + "nv1 ='" + nv1 + "', "
                        + "nv2 ='" + nv2 + "', "
                        + "nv3 ='" + nv3 + "', "
                        + "nv4 = '" + nv4 + "', "
                        + "nv5 = '" + nv5 + "' "
                        + "WHERE id_cuenta = '" + id_cuenta + "'");
                st.executeUpdate();
            } else {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            }

            JOptionPane.showMessageDialog(null, "Guardado correctamente");

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void Cuentas_clear() {
        id_cuenta = 0;
        Cuentas_ABM.jTextField_nv1.setText("");
        Cuentas_ABM.jTextField_nv2.setText("");
        Cuentas_ABM.jTextField_nv3.setText("");
        Cuentas_ABM.jTextField_nv4.setText("");
        Cuentas_ABM.jTextField_nv5.setText("");
        Cuentas_ABM.jTextField_cuenta.setText("");
    }

    public synchronized static void Cuentas_seleccionar() {
        DefaultTableModel tm = (DefaultTableModel) Cuentas.jTable1.getModel();
        id_cuenta = Integer.parseInt(String.valueOf(tm.getValueAt(Cuentas.jTable1.getSelectedRow(), 0)));

        try {
            Statement ST = conexion.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * FROM cuenta where id_cuenta = '" + id_cuenta + "'");
            if (RS.next()) {
                Cuentas_ABM.jTextField_nv1.setText(RS.getString("nv1"));
                Cuentas_ABM.jTextField_nv2.setText(RS.getString("nv2"));
                Cuentas_ABM.jTextField_nv3.setText(RS.getString("nv3"));
                Cuentas_ABM.jTextField_nv4.setText(RS.getString("nv4"));
                Cuentas_ABM.jTextField_nv5.setText(RS.getString("nv5"));
                Cuentas_ABM.jTextField_cuenta.setText(RS.getString("cuenta").trim());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public synchronized static void Cuentas_cargar_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Cuentas.jTable1.getModel();
            for (int j = 0; j < Cuentas.jTable1.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta,  (nv1 || '.' || nv2|| '.' || nv3|| '.' || nv4|| '.' || nv5|| ' ' || cuenta) AS cuenta  "
                    + "from cuenta "
                    + "where cuenta ilike '%" + Cuentas.jTextField_buscar.getText() + "%' order by nv1, nv2,nv3,nv4,nv5");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {

                    String cadena = rs2.getObject(i + 1).toString().trim().replace("....", "                    ");
                    cadena = cadena.replace(".0.0.0.0", " ");
                    cadena = cadena.replace(".0.0.0", " ");
                    cadena = cadena.replace(".0.0", " ");
                    cadena = cadena.replace(".0", " ");
                    rows[i] = cadena;
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Cuentas.jTable1.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Cliente_jatble(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Clientes.jTable_cliente.getModel();
            for (int j = 0; j < Clientes.jTable_cliente.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_cliente, nombre from cliente where nombre ilike '%" + buscar + "%'");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1);
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Clientes.jTable_cliente.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Listado_compras_sector_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Listado_compras_por_sector.jTable_sector.getModel();
            for (int j = 0; j < Listado_compras_por_sector.jTable_sector.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_sector, sector from sector");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1);
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Listado_compras_por_sector.jTable_sector.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Unidad_de_Medida_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Unidad_de_medida.jTable_unidad_medida.getModel();
            for (int j = 0; j < Unidad_de_medida.jTable_unidad_medida.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_unidad_medida, unidad_medida from unidad_medida order by unidad_medida ");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Unidad_de_medida.jTable_unidad_medida.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ubicacion_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Ubicacion.jTable_ubicacion.getModel();
            for (int j = 0; j < Ubicacion.jTable_ubicacion.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_ubicacion, ubicacion from ubicacion order by ubicacion ");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Ubicacion.jTable_ubicacion.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Sector_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Sector.jTable_ubicacion.getModel();
            for (int j = 0; j < Sector.jTable_ubicacion.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_sector, sector from sector order by sector");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Sector.jTable_ubicacion.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Rubro_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Rubro.jTable_ubicacion.getModel();
            for (int j = 0; j < Rubro.jTable_ubicacion.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_productos_tipo, productos_tipo from productos_tipo order by productos_tipo");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Rubro.jTable_ubicacion.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Proveedor_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Proveedor.jTable_proveedor.getModel();
            for (int j = 0; j < Proveedor.jTable_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_proveedor, nombre from proveedor order by proveedor ");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs2.getObject(i + 1).toString().trim();
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Proveedor.jTable_proveedor.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Proveedor_jtable(String buscar) {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_proveedor, nombre "
                    + "from proveedor "
                    + "where nombre ilike '%" + buscar + "%' "
                    + "and borrado != '1' ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Producto.jTable_proveedor.getModel();
            for (int j = 0; j < Producto.jTable_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) == null) {
                        System.err.println("Es NULL");
                    } else if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Producto.jTable_proveedor.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Rubro_jtable(String buscar) {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_productos_tipo, productos_tipo "
                    + "from productos_tipo "
                    + "where productos_tipo ilike '%" + buscar + "%' "
                    + " ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Producto.jTable_rubro.getModel();
            for (int j = 0; j < Producto.jTable_rubro.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) == null) {
                        System.err.println("Es NULL");
                    } else if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Producto.jTable_rubro.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Producto_jtable(String buscar) {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_producto, nombre "
                    + "from productos "
                    + "where nombre ilike '%" + buscar + "%' "
                    + " ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Producto.jTable_producto.getModel();
            for (int j = 0; j < Producto.jTable_producto.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) == null) {
                        System.err.println("Es NULL");
                    } else if (rs.getObject(i + 1).toString().length() > 1) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Producto.jTable_producto.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Compras_proveedor_jtable(String buscar) {
        try {

            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_proveedor, nombre "
                    + "from proveedor "
                    + "where nombre ilike '%" + buscar + "%'"
                    + " ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_proveedor.getModel();
            for (int j = 0; j < Compras.jTable_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {

                    rows[i] = rs.getObject(i + 1);

                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras.jTable_proveedor.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Compras_sector_jtable() {
        try {

            PreparedStatement ps = conexion.prepareStatement("select id_sector, sector from sector ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_sector.getModel();
            for (int j = 0; j < Compras.jTable_sector.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {

                    rows[i] = rs.getObject(i + 1);

                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras.jTable_sector.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Compras_buscar_jtable(String buscar) {
        try {

            PreparedStatement ps = conexion.prepareStatement("select id_compra, nombre, factura, fecha from compra"
                    + " inner join proveedor on proveedor.id_proveedor = compra.id_proveedor "
                    + " where nombre ilike '%" + buscar + "%'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_buscar.getModel();
            for (int j = 0; j < Compras.jTable_buscar.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {

                    rows[i] = rs.getObject(i + 1);

                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras.jTable_buscar.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Compras_agregar_producto_jtable(String buscar) {
        try {
            PreparedStatement ps = conexion.prepareStatement("select id_producto, nombre from productos "
                    + " where nombre ilike '%" + buscar + "%'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_productos.getModel();
            for (int j = 0; j < Compras.jTable_productos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {

                    rows[i] = rs.getObject(i + 1);

                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras.jTable_productos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Compras_detalle_jtable() {
        try {

            PreparedStatement ps2 = conexion.prepareStatement("select SUM(total) "
                    + " from compra_detalle "
                    + " where id_compra = '" + id_compra + "'");
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                Compras.jTextField_total.setText(num.format(rs2.getLong(1)));
            }

            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_compra_detalle, nombre,  cantidad, compra_detalle.precio, total "
                    + "from compra_detalle "
                    + "inner join productos on productos.id_producto = compra_detalle.id_producto "
                    + " where id_compra = '" + id_compra + "' order by id_compra_detalle DESC");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_detalle.getModel();
            for (int j = 0; j < Compras.jTable_detalle.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {

                    rows[i] = rs.getObject(i + 1);

                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras.jTable_detalle.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public static void Configuracion_guardar(String empresa, String ruc, String telefono, String direccion) {
        try {
            PreparedStatement Update = conexion.prepareStatement("UPDATE configuracion "
                    + "SET empresa = '" + empresa + "', "
                    + "ruc = '" + ruc + "', "
                    + "telefono = '" + telefono + "', "
                    + "direccion = '" + direccion + "' "
                    + "WHERE id ='1'");
            Update.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void Configuracion_buscar() {
        try {
            PreparedStatement ps = conexion.prepareStatement("select * from configuracion");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Configuracion.jTextField_empresa.setText(rs.getString("empresa"));
                Configuracion.jTextField_direccion.setText(rs.getString("direccion"));
                Configuracion.jTextField_ruc.setText(rs.getString("ruc"));
                Configuracion.jTextField_telefono.setText(rs.getString("telefono"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void Cliente_Guardar(String ruc, String ci, String direccion, String email, String nombre, String telefono) {
        try {

            if (!isNumeric(ci.replace(".", ""))) {
                ci = "0";
            }

            if (id_cliente == 0) {

                PreparedStatement ps = conexion.prepareStatement("select max(id_cliente) from cliente");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_cliente = rs.getInt(1) + 1;
                }

                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?)");
                st2.setInt(1, id_cliente);
                st2.setInt(2, Integer.parseInt(ci));
                st2.setString(3, ruc);
                st2.setString(4, nombre);
                st2.setString(5, direccion);
                st2.setString(6, telefono);
                st2.setString(7, email);
                st2.setInt(8, 0);
                st2.executeUpdate();

                JOptionPane.showMessageDialog(null, "Guardado correctamente");

            } else {
                PreparedStatement Update = conexion.prepareStatement("UPDATE cliente "
                        + "SET nombre = '" + nombre + "', "
                        + "ruc = '" + ruc + "', "
                        + "telef = '" + telefono + "', "
                        + "ci = '" + Integer.parseInt(ci) + "', "
                        + "email = '" + email + "', "
                        + "direccion = '" + direccion + "' "
                        + "WHERE id_cliente ='" + id_cliente + "'");
                Update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void Unidad_medida_Guardar(String unidad) {
        try {
            if (id_unidad_medida == 0) {
                PreparedStatement ps = conexion.prepareStatement("select max(id_unidad_medida) from unidad_medida");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_unidad_medida = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO unidad_medida VALUES(?,?)");
                st2.setInt(1, id_unidad_medida);
                st2.setString(2, unidad);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement Update = conexion.prepareStatement("UPDATE unidad_medida "
                        + "SET unidad_medida = '" + unidad + "' "
                        + "WHERE id_unidad_medida ='" + id_unidad_medida + "'");
                Update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void Ubicacion_Guardar(String ubicacion) {
        try {
            if (id_ubicacion == 0) {
                PreparedStatement ps = conexion.prepareStatement("select max(id_ubicacion) from ubicacion");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_ubicacion = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO ubicacion VALUES(?,?)");
                st2.setInt(1, id_ubicacion);
                st2.setString(2, ubicacion);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement Update = conexion.prepareStatement("UPDATE ubicacion "
                        + "SET ubicacion = '" + ubicacion + "' "
                        + "WHERE id_ubicacion ='" + id_ubicacion + "'");
                Update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void Sector_Guardar(String sector) {
        try {
            if (id_sector == 0) {
                PreparedStatement ps = conexion.prepareStatement("select max(id_sector) from sector");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_sector = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO sector VALUES(?,?)");
                st2.setInt(1, id_sector);
                st2.setString(2, sector);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement Update = conexion.prepareStatement("UPDATE sector "
                        + "SET sector = '" + sector + "' "
                        + "WHERE id_sector ='" + id_sector + "'");
                Update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void Rubro_Guardar(String productos_tipo) {
        try {
            if (id_productos_tipo == 0) {
                PreparedStatement ps = conexion.prepareStatement("select max(id_productos_tipo) from productos_tipo");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_productos_tipo = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO productos_tipo VALUES(?,?)");
                st2.setInt(1, id_productos_tipo);
                st2.setString(2, productos_tipo);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement Update = conexion.prepareStatement("UPDATE productos_tipo "
                        + "SET productos_tipo = '" + productos_tipo + "' "
                        + "WHERE id_productos_tipo ='" + id_productos_tipo + "'");
                Update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
