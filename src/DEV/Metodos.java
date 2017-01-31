
package DEV;

import static DEV.Conexion.conexion;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Metodos {
    public synchronized static boolean getIngresar(String nombre, char[] password) {
        boolean entro = false;
        try {
            String pass = new String(password);
            PreparedStatement ps = conexion.prepareStatement("select * from usuario where nombre ='" + nombre + "' and contrasenha = '" + pass + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nombre = rs.getString("nombre_real").trim();
                id_usuario = rs.getInt("id_usuario");
                privilegio = rs.getInt("privilegio");
                Comercio_obtener_datos();
                Configuracion_inicial();
                ubicacion_proyecto = new File("").getAbsolutePath();
                new Principal().setVisible(true);
                entro = true;
                String hoy = DEV.Metodos.getHoy_format3();
                Metodos.Configuracion_iniciar_datos();
                Metodos.Control_de_acceso();
            }
            if (entro == false) {
                JOptionPane.showMessageDialog(null, "Error de usuario y/o contraseña.");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return entro;
    }
}
