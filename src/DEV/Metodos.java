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
    public static int id_proveedor = 0;
    public static int id_cuenta = 0;
    public static int id_cliente = 0;
    public static int privilegio = 0;
    public static String ubicacion_proyecto = "";
    public static String titulo = "";
    public static boolean entro = false;
    public static Date hoy = new Date();

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
                Proveedor_ABM.jButton_borrar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE proveedor "
                        + " SET nombre ='" + nombre_proveedor + "',"
                        + " direccion ='" + direccion + "',"
                        + " telefono ='" + telefono + "',"
                        + " ruc ='" + ruc + "',"
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
                if (Proveedor_ABM.JT_Ruc.getText().length() > 1) {
                    Statement ST = conexion.createStatement();
                    ResultSet RS = ST.executeQuery("Select * "
                            + "from proveedor "
                            + "WHERE ruc ='" + Proveedor_ABM.JT_Ruc.getText() + "'");
                    if (RS.next()) {
                        JOptionPane.showMessageDialog(null, "R.U.C. registrado. Se mostrarán los datos del comercio");

                        Proveedor_ABM.JT_Nombre.setText(RS.getString("nombre").trim());
                        Proveedor_ABM.JT_Direccion.setText(RS.getString("direccion").trim());
                        Proveedor_ABM.JT_Ruc.setText(RS.getString("ruc").trim());
                        Proveedor_ABM.JT_Telefono.setText(RS.getString("telefono").trim());
                        Proveedor_ABM.jButton_borrar.setVisible(true);
                        Proveedor_ABM.JT_Nombre.setEditable(true);

                    }
                }
            } else if (Proveedor_ABM.JT_Ruc.getText().length() > 1) {
                Statement ST = conexion.createStatement();
                ResultSet RS = ST.executeQuery("Select * "
                        + "from proveedor "
                        + "WHERE ruc ='" + Proveedor_ABM.JT_Ruc.getText() + "' "
                        + "and id_proveedor != '" + id_proveedor + "'");
                if (RS.next()) {
                    JOptionPane.showMessageDialog(null, "R.U.C. registrado. Se mostrarán los datos del comercio");

                    Proveedor_ABM.JT_Nombre.setText(RS.getString("nombre").trim());
                    Proveedor_ABM.JT_Direccion.setText(RS.getString("direccion").trim());
                    Proveedor_ABM.JT_Ruc.setText(RS.getString("ruc").trim());
                    Proveedor_ABM.JT_Telefono.setText(RS.getString("telefono").trim());
                    Proveedor_ABM.jButton_borrar.setVisible(true);
                    Proveedor_ABM.JT_Nombre.setEditable(true);
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
    public synchronized static void Proveedor_jtable(String buscar) {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_proveedor, nombre "
                    + "from proveedor "
                    + "where nombre ilike '%" + buscar + "%' "
                    + "and borrado_int != '1' ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Proveedor_ABM.jTable_proveedor.getModel();
            for (int j = 0; j < Proveedor_ABM.jTable_proveedor.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Proveedor_ABM.jTable_proveedor.getModel();
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

    public static void Cliente_Guardar(String ruc, String ci, String direccion, String email, String nombre, String telefono) {
        try {

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
                        + "telefono = '" + telefono + "', "
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

   
}
