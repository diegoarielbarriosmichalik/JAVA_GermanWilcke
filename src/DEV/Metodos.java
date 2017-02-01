package DEV;

import static DEV.Conexion.conexion;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Metodos {

    public static int id_usuario = 0;
    public static int id_cliente = 0;
    public static int privilegio = 0;
    public static String ubicacion_proyecto = "";
    public static String titulo = "";
    public static boolean entro = false;

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
