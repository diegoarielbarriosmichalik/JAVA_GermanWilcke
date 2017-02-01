package DEV;

import static DEV.Conexion.conexion;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
    public static int id_producto = 0;
    public static int id_proveedor = 0;
    public static int id_cuenta = 0;
    public static int id_cliente = 0;
    public static int id_unidad_medida = 0;
    public static int id_ubicacion = 0;
    public static int privilegio = 0;
    public static String ubicacion_proyecto = "";
    public static String titulo = "";
    public static boolean entro = false;
    public static Date hoy = new Date();

    public synchronized static void Proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Proveedor.jTable_proveedor.getModel();
        id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Proveedor.jTable_proveedor.getSelectedRow(), 0)));
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

    public static void Producto_Nuevo() {
        Metodos.id_producto = 0;
//        Metodos.id_proveedor = 0;
//        Metodos.id_ubicacion = 0;
//        Metodos.id_proveedor = 1;
//        producto_nombre.setText("");
//        producto_precio.setText("");
//        ubicacion.setText("");
//        producto_proveedor.setText("No especificado");
//        jTextField_Tipo.setText("No especificado");
//        producto_stock_bajo.setText("");
//        producto_nombre.requestFocus();
//        producto_codigo.setText("");
//        Producto.producto_nombre.setEditable(true);
//        Producto.jTextField_porcentaje.setText("0");
//        Producto.jTextField_precio_de_compra.setText("0");
//        jTextField_iva.setText("10");
//        jButton_borrar.setVisible(false);
//        producto_codigo.requestFocus();
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

            String path = ubicacion_proyecto + "\\reports\\plan_de_cuentas.jasper";

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
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

    public synchronized static void Proveedor_jtable(String buscar) {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_proveedor, nombre "
                    + "from proveedor "
                    + "where nombre ilike '%" + buscar + "%' "
                    + "and borrado != '1' ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Proveedor.jTable_proveedor.getModel();
            for (int j = 0; j < Proveedor.jTable_proveedor.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Proveedor.jTable_proveedor.getModel();
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

}
