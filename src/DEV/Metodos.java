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
    public static int id_transferencia = 0;
    public static int id_tipo_pago = 0;
    public static int listado_pagos_tipo_pago = 0;
    public static int id_rubro = 0;
    public static int id_producto = 0;
    public static int producto_id_ubicacion = 0;
    public static int id_proveedor = 0;
    public static int id_recibo_dinero_proveedores = 0;
    public static int compras_id_timbrado = 0;
    public static int libro_banco_id_cuenta_bancaria = 0;
    public static int transferencia_id_cuenta_bancaria = 0;
    public static int cheques_id_proveedor = 0;
    public static int transferencia_id_proveedor = 0;
    public static int cheques_id_cuenta_bancaria = 0;
    public static int id_cheque = 0;
    public static int depositos_bancarios_id_cuenta_bancaria = 0;
    public static int id_deposito_bancario = 0;
    public static int recibo_dinero_proveedores_id_proveedor = 0;
    public static int id_timbrado = 0;
    public static int ventas_id_producto = 0;
    public static int ventas_id_cliente = 0;
    public static int proveedor_id_timbrado = 0;
    public static int movimiento_contable_id_asiento_contable_pago = 0;
    public static int id_asiento_contable = 0;
    public static int id_venta = 0;
    public static int id_venta_detalle = 0;
    public static int id_asiento_contable_pago = 0;
    public static int asiento_contable_max = 0;
    public static int movimientos_contables_selected_id_factura = 0;
    public static int id_compra_detalle = 0;
    public static int id_compra = 0;
    public static int compras_id_producto = 0;
    public static int compras_id_productos_ubicacion = 0;
    public static int movimiento_contable_id_tipo_pago = 0;
    public static int contado_id_cuenta = 0;
    public static int credito_id_cuenta = 0;
    public static int pagares_id_cuenta = 0;
    public static int movimiento_contable_id_deposito_bancario = 0;
    public static int movimiento_contable_id_cuenta_bancaria = 0;
    public static int compras_id_proveedor = 0;
    public static int compras_id_forma_pago = 0;
    public static int compras_id_sector = 0;
    public static int producto_id_proveedor = 0;
    public static int producto_id_rubro = 0;
    public static int producto_id_unidad_medida = 0;
    public static int id_productos_tipo = 0;
    public static int id_cuenta = 0;
    public static int productos_id_timbrado = 0;
    public static int id_cliente = 0;
    public static int cuenta_bancaria_id_banco = 0;
    public static int id_cuenta_bancaria = 0;
    public static int cuentas_acumuladoras_id_cuenta = 0;
    public static int id_cuenta_acumuladora = 0;
    public static int cuentas_acumuladoras_id_cuenta_acumuladora = 0;
    public static int listado_compras_id_sector = 0;
    public static int listado_de_pagos_id_tipo_pago = 0;
    public static int listado_de_pagos_id_cuenta = 0;
    public static int listado_de_pagos_por_cuenta_id_cuenta_vinculada = 0;
    public static int listado_de_cheques_id_cuenta_bancaria = 0;
    public static int listado_compras_id_proveedor = 0;
    public static int producto_id_ubicacion_selected = 0;
    public static int producto_id_ubicacion_selected_borrar = 0;
    public static int id_unidad_medida = 0;
    public static int id_banco = 0;
    public static int id_ubicacion = 0;
    public static int id_sector = 0;
    public static int producto_id_ubicacion_de = 0;
    public static int id_ubicacion_mover = 0;
    public static int compras_id_tipo = 0;
    public static int producto_id_ubicacion_a = 0;
    public static int movimientos_contables_cuentas_vicnuladas_id_cuenta = 0;
    public static int movimientos_contables_factura_id_proveedor = 0;
    public static int movimientos_contables_pago_id_proveedor = 0;
    public static int id_asiento_contable_factura = 0;
    public static int compras_detalle_productos_id_ubicacion = 0;
    public static int privilegio = 0;
    public static int Compras_id_compras_detalle = 0;
    public static int cuentas_vicnuladas_id_cuenta = 0;
    public static int id_cuenta_vinculada = 0;
    public static int id_asiento_compra = 0;
    public static int id_asiento_compra_detalle = 0;
    public static int movimiento_contable_deposito_id_cuenta_bancaria = 0;
    public static int compras_id_impuesto = 0;
    public static int compras_id_cuenta = 0;
    public static int movimiento_contable_deposito_id_cuenta_vinculada = 0;
    public static String ubicacion_proyecto = "";
    public static String usuario = "";
    public static String titulo_de_pagos = "";
    public static String path = "";
    public static String titulo = "";
    public static String empresa = "";
    public static String membrete = "";
    public static boolean entro = false;
    public static Date hoy = new Date();
    public static boolean error = false;

    public static DecimalFormat num = new DecimalFormat("###,###,###");

    public static String Separar_Miles(String cadena) {
        long precio = 0;
        String valor = "";
        if (cadena != null) {
            precio = Long.parseLong(cadena.replace(".", ""));
            valor = String.valueOf(Metodos.num.format(precio));
        }
        return valor;
    }

    public static void Asiento_compra_traer_datos() {

        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT * FROM asiento_compra "
                    + "inner join compra on compra.id_compra = asiento_compra.id_compra "
                    + "inner join proveedor on proveedor.id_proveedor = compra.id_proveedor "
                    + "where id_asiento_compra = '" + id_asiento_compra + "'"
                    + " ");
            while (result.next()) {
                id_compra = result.getInt("id_compra");
                Asiento_compra.jTextField_proveedor.setText(result.getString("nombre").trim());
                Asiento_compra.jTextField_factura.setText(result.getString("factura").trim());
                Asiento_compra.jTextField_asiento.setText(result.getString("id_asiento_compra"));
                Asiento_compra.jDateChooser_fecha.setDate(result.getDate("fecha"));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Ventas_traer_datos() {

        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT * FROM venta "
                    + "inner join cliente on cliente.id_cliente = venta.id_cliente "
                    + "inner join venta_tipo on venta_tipo.id_venta_tipo = venta.id_venta_tipo "
                    + "where id_venta = '" + id_venta + "'"
                    + " ");
            while (result.next()) {
                ventas_id_cliente = result.getInt("id_cliente");
                Ventas.jTextField_cliente.setText(result.getString("nombre"));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Cuenta_bancaria_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT * FROM cuenta_bancaria "
                    + "inner join banco on banco.id_banco = cuenta_bancaria.id_banco "
                    + "where id_cuenta_bancaria = '" + id_cuenta_bancaria + "'"
                    + " ");
            while (result.next()) {
                cuenta_bancaria_id_banco = result.getInt("id_banco");
                Cuenta_bancaria.jt_banco.setText(result.getString("banco").trim());
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Asientos_compra_generar() {
        try {

            id_compra = 0;
            boolean cargado = false;
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT * FROM compra ");
            while (result.next()) {

                id_compra = result.getInt("id_compra");
                cargado = false;
                Statement st3 = conexion.createStatement();
                ResultSet result3 = st3.executeQuery("SELECT * FROM asiento_compra where id_compra = '" + id_compra + "' ");
                while (result3.next()) {
                    cargado = true;
                }

                if (cargado == false) {

                    Statement st2 = conexion.createStatement();
                    ResultSet result2 = st2.executeQuery("SELECT MAX(id_asiento_compra) FROM asiento_compra");
                    if (result2.next()) {
                        id_asiento_compra = result2.getInt(1) + 1;
                    }

                    PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO asiento_compra VALUES(?,?)");
                    stUpdateProducto.setInt(1, id_asiento_compra);
                    stUpdateProducto.setInt(2, id_compra);
                    stUpdateProducto.executeUpdate();

                    Statement st4 = conexion.createStatement();
                    ResultSet result4 = st4.executeQuery("SELECT * from compra_detalle where id_compra = '" + id_compra + "' order by id_compra_detalle");
                    while (result4.next()) {

                        id_producto = result4.getInt("id_producto");
                        int iva = result4.getInt("impuesto");

//                        Statement st7 = conexion.createStatement();
//                        ResultSet result7 = st7.executeQuery("SELECT * from productos where id_producto = '" + id_producto + "'");
//                        if (result7.next()) {
//                            iva = result7.getInt("iva");
//                        }
                        long gravada_10_long = result4.getLong("total");
                        long gravada_5_long = result4.getLong("total");
                        long iva_10 = gravada_10_long / 11;
                        long iva_5 = gravada_10_long / 21;
                        gravada_10_long = gravada_10_long - iva_10;
                        gravada_5_long = gravada_5_long - iva_5;

                        Statement st5 = conexion.createStatement();
                        ResultSet result5 = st5.executeQuery("SELECT MAX(id_asiento_compra_detalle) FROM asiento_compra_detalle");
                        if (result5.next()) {
                            id_asiento_compra_detalle = result5.getInt(1) + 1;
                        }

                        PreparedStatement st6 = conexion.prepareStatement("INSERT INTO asiento_compra_detalle VALUES(?,?,?,?,?, ?,?,?,?,?)");
                        st6.setInt(1, id_asiento_compra_detalle);
                        st6.setInt(2, id_asiento_compra);
                        st6.setInt(3, result4.getInt("id_cuenta"));
                        st6.setInt(4, result4.getInt("total"));
                        st6.setInt(5, 0);
                        if (iva == 10) {
                            st6.setLong(6, gravada_10_long);
                            st6.setLong(8, iva_10);
                        } else {
                            st6.setInt(6, 0);
                            st6.setLong(8, 0);
                        }
                        if (iva == 5) {
                            st6.setLong(7, gravada_5_long);
                            st6.setLong(9, iva_5);
                        } else {
                            st6.setInt(7, 0);
                            st6.setLong(9, 0);
                        }
                        if (iva == 0) {
                            st6.setLong(10, result4.getLong("total"));
                        } else {
                            st6.setLong(10, 0);
                        }
                        st6.executeUpdate();

                    }
                    // INSERTAR HABER 
                    Statement st5 = conexion.createStatement();
                    ResultSet result5 = st5.executeQuery("SELECT MAX(id_asiento_compra_detalle) FROM asiento_compra_detalle");
                    if (result5.next()) {
                        id_asiento_compra_detalle = result5.getInt(1) + 1;
                    }
                    long total = 0;
                    Statement st10 = conexion.createStatement();
                    ResultSet result10 = st10.executeQuery("SELECT SUM(debe) FROM asiento_compra_detalle where id_asiento_compra = '" + id_asiento_compra + "'");
                    if (result10.next()) {
                        total = result10.getLong(1);
                    }

                    st5 = conexion.createStatement();
                    result5 = st5.executeQuery("SELECT * FROM configuracion_asiento_compra");
                    if (result5.next()) {
                        contado_id_cuenta = result5.getInt("contado");
                    }

                    PreparedStatement st8 = conexion.prepareStatement("INSERT INTO asiento_compra_detalle VALUES(?,?,?,?,?, ?,?,?,?,?)");
                    st8.setInt(1, id_asiento_compra_detalle);
                    st8.setInt(2, id_asiento_compra);
                    st8.setInt(3, contado_id_cuenta);
                    st8.setInt(4, 0);
                    st8.setLong(5, total);
                    st8.setLong(6, 0);
                    st8.setLong(8, 0);
                    st8.setLong(7, 0);
                    st8.setLong(9, 0);
                    st8.setLong(10, 0);
                    st8.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Proveedor.jTable_proveedor.getModel();
        id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Proveedor.jTable_proveedor.getSelectedRow(), 0)));
    }

    public synchronized static void Depositos_bancarios_selected() {
        DefaultTableModel tm = (DefaultTableModel) Depositos_bancarios.jTable_buscar.getModel();
        id_deposito_bancario = Integer.parseInt(String.valueOf(tm.getValueAt(Depositos_bancarios.jTable_buscar.getSelectedRow(), 0)));
    }

    public synchronized static void Timbrado_selected() {
        DefaultTableModel tm = (DefaultTableModel) Proveedor.jTable_timbrado.getModel();
        id_timbrado = Integer.parseInt(String.valueOf(tm.getValueAt(Proveedor.jTable_timbrado.getSelectedRow(), 0)));
    }
    
    public synchronized static void Ventas_buscar_selected() {
        DefaultTableModel tm = (DefaultTableModel) Ventas.jTable_ventas.getModel();
        id_venta = Integer.parseInt(String.valueOf(tm.getValueAt(Ventas.jTable_ventas.getSelectedRow(), 0)));
    }

    public synchronized static void Compras_timbrado_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_timbrado.getModel();
        compras_id_timbrado = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_timbrado.getSelectedRow(), 0)));
        Compras.jTextField_timbrado.setText(String.valueOf(tm.getValueAt(Compras.jTable_timbrado.getSelectedRow(), 1)));
    }

    public synchronized static void Ventas_productos_selected() {
        DefaultTableModel tm = (DefaultTableModel) Ventas.jTable_productos.getModel();
        ventas_id_producto = Integer.parseInt(String.valueOf(tm.getValueAt(Ventas.jTable_productos.getSelectedRow(), 0)));
        Ventas.jTextField_producto.setText(String.valueOf(tm.getValueAt(Ventas.jTable_productos.getSelectedRow(), 1)));
        Ventas.jTextField_precio.setText(String.valueOf(tm.getValueAt(Ventas.jTable_productos.getSelectedRow(), 2)));
        Ventas.jTextField_total_detalle.setText(String.valueOf(tm.getValueAt(Ventas.jTable_productos.getSelectedRow(), 2)));
        Ventas.jTextField_unidades.setText("1");
        Ventas.jTextField_unidades.requestFocus();
        Ventas.jTextField_unidades.selectAll();

    }

    public synchronized static void Ventas_clientes_selected() {
        DefaultTableModel tm = (DefaultTableModel) Ventas.jTable_clientes.getModel();
        ventas_id_cliente = Integer.parseInt(String.valueOf(tm.getValueAt(Ventas.jTable_clientes.getSelectedRow(), 0)));
        Ventas.jTextField_cliente.setText(String.valueOf(tm.getValueAt(Ventas.jTable_clientes.getSelectedRow(), 1)));
    }

    public synchronized static void Libro_banco_cuentas_bancarias_selected() {
        DefaultTableModel tm = (DefaultTableModel) Libro_banco.jTable_cuenta_bancari.getModel();
        libro_banco_id_cuenta_bancaria = Integer.parseInt(String.valueOf(tm.getValueAt(Libro_banco.jTable_cuenta_bancari.getSelectedRow(), 0)));
        Libro_banco.jTextField_cuenta.setText(String.valueOf(tm.getValueAt(Libro_banco.jTable_cuenta_bancari.getSelectedRow(), 1)) + " - " + String.valueOf(tm.getValueAt(Libro_banco.jTable_cuenta_bancari.getSelectedRow(), 2)));
    }

    public synchronized static void Transferencia_cuenta_bancaria_selected() {
        DefaultTableModel tm = (DefaultTableModel) Transferencias.jTable_cuenta_bancaria.getModel();
        transferencia_id_cuenta_bancaria = Integer.parseInt(String.valueOf(tm.getValueAt(Transferencias.jTable_cuenta_bancaria.getSelectedRow(), 0)));
        Transferencias.jTextField_cuenta_bancaria.setText(String.valueOf(tm.getValueAt(Transferencias.jTable_cuenta_bancaria.getSelectedRow(), 1)));
    }

    public synchronized static void Cheques_proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Cheques.jTable_proveedor.getModel();
        cheques_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Cheques.jTable_proveedor.getSelectedRow(), 0)));
        Cheques.jTextField_proveedor.setText(String.valueOf(tm.getValueAt(Cheques.jTable_proveedor.getSelectedRow(), 1)));
    }

    public synchronized static void Transferencia_proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Transferencias.jTable_proveedor.getModel();
        transferencia_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Transferencias.jTable_proveedor.getSelectedRow(), 0)));
        Transferencias.jTextField_proveedor.setText(String.valueOf(tm.getValueAt(Transferencias.jTable_proveedor.getSelectedRow(), 1)));
    }

    public synchronized static void Cheques_cuentas_bancarias_selected() {
        DefaultTableModel tm = (DefaultTableModel) Cheques.jTable_cuenta_bancaria.getModel();
        cheques_id_cuenta_bancaria = Integer.parseInt(String.valueOf(tm.getValueAt(Cheques.jTable_cuenta_bancaria.getSelectedRow(), 0)));
        Cheques.jTextField_cuenta.setText(String.valueOf(tm.getValueAt(Cheques.jTable_cuenta_bancaria.getSelectedRow(), 1)) + " - " + String.valueOf(tm.getValueAt(Cheques.jTable_cuenta_bancaria.getSelectedRow(), 2)));
    }

    public synchronized static void Deposito_bancario_cuenta_bancaria_selected() {
        DefaultTableModel tm = (DefaultTableModel) Depositos_bancarios.jTable_cuentas.getModel();
        depositos_bancarios_id_cuenta_bancaria = Integer.parseInt(String.valueOf(tm.getValueAt(Depositos_bancarios.jTable_cuentas.getSelectedRow(), 0)));
        Depositos_bancarios.jTextField_cuenta_bancaria.setText(String.valueOf(tm.getValueAt(Depositos_bancarios.jTable_cuentas.getSelectedRow(), 1)) + " - " + String.valueOf(tm.getValueAt(Depositos_bancarios.jTable_cuentas.getSelectedRow(), 2)));
    }

    public synchronized static void Cuentas_bancarias_selected() {
        DefaultTableModel tm = (DefaultTableModel) Cuenta_bancaria.jTable_cuenta_bancaria.getModel();
        id_cuenta_bancaria = Integer.parseInt(String.valueOf(tm.getValueAt(Cuenta_bancaria.jTable_cuenta_bancaria.getSelectedRow(), 0)));
        Cuenta_bancaria.jt_numero.setText(String.valueOf(tm.getValueAt(Cuenta_bancaria.jTable_cuenta_bancaria.getSelectedRow(), 1)));
        Cuenta_bancaria.jt_nombre.setText(String.valueOf(tm.getValueAt(Cuenta_bancaria.jTable_cuenta_bancaria.getSelectedRow(), 2)));
    }

    public synchronized static void Bancos_selected() {
        DefaultTableModel tm = (DefaultTableModel) Banco.jTable_bancos.getModel();
        id_banco = Integer.parseInt(String.valueOf(tm.getValueAt(Banco.jTable_bancos.getSelectedRow(), 0)));
        Banco.jt_nombre.setText(String.valueOf(tm.getValueAt(Banco.jTable_bancos.getSelectedRow(), 1)).toString().trim());
    }

    public synchronized static void Recido_de_dinero_proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Recibo_de_dinero.jTable_proveedor.getModel();
        recibo_dinero_proveedores_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Recibo_de_dinero.jTable_proveedor.getSelectedRow(), 0)));
        Recibo_de_dinero.jTextField_proveedor.setText(String.valueOf(tm.getValueAt(Recibo_de_dinero.jTable_proveedor.getSelectedRow(), 1)));
    }

    public synchronized static void Asiento_compra_selected() {
        DefaultTableModel tm = (DefaultTableModel) Asiento_compra.jTable_asientos.getModel();
        id_asiento_compra = Integer.parseInt(String.valueOf(tm.getValueAt(Asiento_compra.jTable_asientos.getSelectedRow(), 0)));
    }

    public synchronized static void Compras_impuestos_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_impuesto.getModel();
        compras_id_impuesto = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_impuesto.getSelectedRow(), 0)));
        Compras.jTextField_impuesto.setText(String.valueOf(tm.getValueAt(Compras.jTable_impuesto.getSelectedRow(), 1)));
    }

    public synchronized static void Movimientos_contables_deposito_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_deposito_cuenta_bancaria.getModel();
        movimiento_contable_deposito_id_cuenta_bancaria = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_deposito_cuenta_bancaria.getSelectedRow(), 0)));
        Movimientos_contables.jTextField_deposito_cuenta_bancaria.setText(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_deposito_cuenta_bancaria.getSelectedRow(), 1)));
    }

    public synchronized static void Configuraciones_asiento_compra_contado_selected() {
        DefaultTableModel tm = (DefaultTableModel) Configuracion.jTable_cuenta_contado.getModel();
        contado_id_cuenta = Integer.parseInt(String.valueOf(tm.getValueAt(Configuracion.jTable_cuenta_contado.getSelectedRow(), 0)));
        Configuracion.jTextField_contado.setText(String.valueOf(tm.getValueAt(Configuracion.jTable_cuenta_contado.getSelectedRow(), 1)));
    }

    public synchronized static void Configuraciones_asiento_compra_credito_selected() {
        DefaultTableModel tm = (DefaultTableModel) Configuracion.jTable_cuenta_credito.getModel();
        credito_id_cuenta = Integer.parseInt(String.valueOf(tm.getValueAt(Configuracion.jTable_cuenta_credito.getSelectedRow(), 0)));
        Configuracion.jTextField_credito.setText(String.valueOf(tm.getValueAt(Configuracion.jTable_cuenta_credito.getSelectedRow(), 1)));
    }

    public synchronized static void Movimientos_contables_deposito_cuenta_vinculada_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_deposito_cuenta_bancaria.getModel();
        movimiento_contable_deposito_id_cuenta_bancaria = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_deposito_cuenta_bancaria.getSelectedRow(), 0)));
        Movimientos_contables.jTextField_deposito_cuenta_bancaria.setText(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_deposito_cuenta_bancaria.getSelectedRow(), 1)));
    }

    public synchronized static void Compras_cuenta_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_cuenta.getModel();
        compras_id_cuenta = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_cuenta.getSelectedRow(), 0)));
        Compras.jTextField_cuenta.setText(String.valueOf(tm.getValueAt(Compras.jTable_cuenta.getSelectedRow(), 1)));
    }

    public synchronized static void Movimientos_contables_pago_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_pago.getModel();
        movimiento_contable_id_asiento_contable_pago = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_pago.getSelectedRow(), 0)));
    }

    public synchronized static void Movimientos_contables_buscar_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_buscar.getModel();
        id_asiento_contable = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_buscar.getSelectedRow(), 0)));
    }

    public synchronized static void Movimientos_contables_detalle_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_movimeintos_contables_factura.getModel();
        movimientos_contables_selected_id_factura = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_movimeintos_contables_factura.getSelectedRow(), 0)));
        //   System.err.println(movimientos_contables_selected_id_factura);
    }

    public synchronized static void Cuenta_vinculada_selected() {
        DefaultTableModel tm = (DefaultTableModel) Cuentas_vinculadas.jTable_cuentas_vinculadas.getModel();
        id_cuenta_vinculada = Integer.parseInt(String.valueOf(tm.getValueAt(Cuentas_vinculadas.jTable_cuentas_vinculadas.getSelectedRow(), 0)));
    }

    public synchronized static void Cuentas_vicnuladas_cuenta_selected() {
        DefaultTableModel tm = (DefaultTableModel) Cuentas_vinculadas.jTable_cuenta_buscar.getModel();
        cuentas_vicnuladas_id_cuenta = Integer.parseInt(String.valueOf(tm.getValueAt(Cuentas_vinculadas.jTable_cuenta_buscar.getSelectedRow(), 0)));
        Cuentas_vinculadas.jTextField_cuenta.setText(String.valueOf(tm.getValueAt(Cuentas_vinculadas.jTable_cuenta_buscar.getSelectedRow(), 1)));
    }

    public synchronized static void movimientos_contables_factura_proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_factura_proveedor.getModel();
        movimientos_contables_factura_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_factura_proveedor.getSelectedRow(), 0)));
        Movimientos_contables.jTextField_factura_proveedor.setText(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_factura_proveedor.getSelectedRow(), 1)));
    }

    public synchronized static void Movimeintos_bancarios_pago_proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_pago_proveedor.getModel();
        movimientos_contables_pago_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_pago_proveedor.getSelectedRow(), 0)));
        Movimientos_contables.jTextField_pago_nombre.setText(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_pago_proveedor.getSelectedRow(), 1)));
    }

    public synchronized static void Movimientos_contables_cuenta_vinculada_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_cuentas_vinculadas.getModel();
        movimientos_contables_cuentas_vicnuladas_id_cuenta = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_cuentas_vinculadas.getSelectedRow(), 0)));
        Movimientos_contables.jTextField_factura_cuenta.setText(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_cuentas_vinculadas.getSelectedRow(), 1)));
    }

    public synchronized static void Compras_forma_pago_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_forma_pago.getModel();
        compras_id_forma_pago = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_forma_pago.getSelectedRow(), 0)));
        Compras.jTextField_forma_pago.setText(String.valueOf(tm.getValueAt(Compras.jTable_forma_pago.getSelectedRow(), 1)));
    }

    public synchronized static void Compras_tipo_pago_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_tipo_pago.getModel();
        compras_id_tipo = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_tipo_pago.getSelectedRow(), 0)));
        Compras.jTextField_compra_tipo.setText(String.valueOf(tm.getValueAt(Compras.jTable_tipo_pago.getSelectedRow(), 1)));
    }

    public synchronized static void Producto_ubicacion_de_selected() {
        DefaultTableModel tm = (DefaultTableModel) Producto.jTable_ubicacion_de.getModel();
        producto_id_ubicacion_de = Integer.parseInt(String.valueOf(tm.getValueAt(Producto.jTable_ubicacion_de.getSelectedRow(), 0)));
        Producto.jTextField_ubicacion_de.setText(String.valueOf(tm.getValueAt(Producto.jTable_ubicacion_de.getSelectedRow(), 1)));
    }

    public synchronized static void Producto_ubicacion_a_selected() {
        DefaultTableModel tm = (DefaultTableModel) Producto.jTable_ubicacion_a.getModel();
        producto_id_ubicacion_a = Integer.parseInt(String.valueOf(tm.getValueAt(Producto.jTable_ubicacion_a.getSelectedRow(), 0)));
        Producto.jTextField_ubicacion_a.setText(String.valueOf(tm.getValueAt(Producto.jTable_ubicacion_a.getSelectedRow(), 1)));
    }

    public synchronized static void Compras_detalle_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_detalle.getModel();
        Compras_id_compras_detalle = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_detalle.getSelectedRow(), 0)));
    }

    public synchronized static void Compras_detalle_productos_ubicacion_selected() {
        DefaultTableModel tm = (DefaultTableModel) Compras.jTable_ubicacion.getModel();
        compras_id_productos_ubicacion = Integer.parseInt(String.valueOf(tm.getValueAt(Compras.jTable_ubicacion.getSelectedRow(), 0)));
//        Compras.jTextField_ubicacion.setText(String.valueOf(tm.getValueAt(Compras.jTable_ubicacion.getSelectedRow(), 1)));
    }

    public synchronized static void Productos_ubicacion_selected() {
        DefaultTableModel tm = (DefaultTableModel) Producto.jTable_ubicacion.getModel();
        producto_id_ubicacion_selected = Integer.parseInt(String.valueOf(tm.getValueAt(Producto.jTable_ubicacion.getSelectedRow(), 0)));
    }

    public synchronized static void Movimientos_contables_tipo_pago_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_tipo_pago.getModel();
        movimiento_contable_id_tipo_pago = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_tipo_pago.getSelectedRow(), 0)));
        Movimientos_contables.jTextField_pago_tipo.setText(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_tipo_pago.getSelectedRow(), 1)));
        System.err.println(movimiento_contable_id_tipo_pago);
    }

    public synchronized static void Movimientos_contables_cuenta_bancaria_selected() {
        DefaultTableModel tm = (DefaultTableModel) Movimientos_contables.jTable_cuenta_bancaria.getModel();
        movimiento_contable_id_cuenta_bancaria = Integer.parseInt(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_cuenta_bancaria.getSelectedRow(), 0)));
        Movimientos_contables.jTextField_pago_cta_cte.setText(String.valueOf(tm.getValueAt(Movimientos_contables.jTable_cuenta_bancaria.getSelectedRow(), 1)));
    }

    public synchronized static void Productos_jTable_producto_ubicacion_selected() {
        DefaultTableModel tm = (DefaultTableModel) Producto.jTable_producto_ubicacion.getModel();
        producto_id_ubicacion_selected_borrar = Integer.parseInt(String.valueOf(tm.getValueAt(Producto.jTable_producto_ubicacion.getSelectedRow(), 0)));
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

    public synchronized static void Listado_de_pagos_tipo_pago_selected() {
        DefaultTableModel tm = (DefaultTableModel) Listado_de_pagos.jTable_tipo_pago.getModel();
        listado_de_pagos_id_tipo_pago = Integer.parseInt(String.valueOf(tm.getValueAt(Listado_de_pagos.jTable_tipo_pago.getSelectedRow(), 0)));
        Listado_de_pagos.jtexfield_tipo_pago.setText(String.valueOf(tm.getValueAt(Listado_de_pagos.jTable_tipo_pago.getSelectedRow(), 1)));
    }

    public synchronized static void Listado_de_pagos_cuenta_selected() {
        DefaultTableModel tm = (DefaultTableModel) Listado_de_pagos_por_cuentas.jTable_cuentas.getModel();
        listado_de_pagos_por_cuenta_id_cuenta_vinculada = Integer.parseInt(String.valueOf(tm.getValueAt(Listado_de_pagos_por_cuentas.jTable_cuentas.getSelectedRow(), 0)));
        Listado_de_pagos_por_cuentas.jtexfield_tipo_pago.setText(String.valueOf(tm.getValueAt(Listado_de_pagos_por_cuentas.jTable_cuentas.getSelectedRow(), 1)));
    }

    public synchronized static void Listado_compras_sector_detallado_selected() {
        DefaultTableModel tm = (DefaultTableModel) Listado_compras_por_sector_detallado.jTable_sector.getModel();
        listado_compras_id_sector = Integer.parseInt(String.valueOf(tm.getValueAt(Listado_compras_por_sector_detallado.jTable_sector.getSelectedRow(), 0)));
        Listado_compras_por_sector_detallado.jtexfield_sector.setText(String.valueOf(tm.getValueAt(Listado_compras_por_sector_detallado.jTable_sector.getSelectedRow(), 1)));
    }

    public synchronized static void Listado_compras_proveedor_selected() {
        DefaultTableModel tm = (DefaultTableModel) Listado_compras_por_proveedor.jTable_proveedor.getModel();
        listado_compras_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Listado_compras_por_proveedor.jTable_proveedor.getSelectedRow(), 0)));
        Listado_compras_por_proveedor.jtexfield_proveedor.setText(String.valueOf(tm.getValueAt(Listado_compras_por_proveedor.jTable_proveedor.getSelectedRow(), 1)).trim());
    }

    public synchronized static void Listado_compras_proveedor_x_cuenta_selected() {
        DefaultTableModel tm = (DefaultTableModel) Listado_compras_x_proveedor_x_cuenta.jTable_proveedor.getModel();
        listado_compras_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Listado_compras_x_proveedor_x_cuenta.jTable_proveedor.getSelectedRow(), 0)));
        Listado_compras_x_proveedor_x_cuenta.jtexfield_proveedor.setText(String.valueOf(tm.getValueAt(Listado_compras_x_proveedor_x_cuenta.jTable_proveedor.getSelectedRow(), 1)).trim());
    }

    public synchronized static void Extracto_compras_proveedor_x_cuenta_selected() {
        DefaultTableModel tm = (DefaultTableModel) Extracto_cuentas_x_proveedor.jTable_proveedor.getModel();
        listado_compras_id_proveedor = Integer.parseInt(String.valueOf(tm.getValueAt(Extracto_cuentas_x_proveedor.jTable_proveedor.getSelectedRow(), 0)));
        Extracto_cuentas_x_proveedor.jtexfield_proveedor.setText(String.valueOf(tm.getValueAt(Extracto_cuentas_x_proveedor.jTable_proveedor.getSelectedRow(), 1)).trim());
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
        Compras.jTextField_sector.setText((String.valueOf(tm.getValueAt(Compras.jTable_sector.getSelectedRow(), 1)).trim()));
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

    public synchronized static void Cuenta_bancaria_banco_selected() {
        DefaultTableModel tm = (DefaultTableModel) Cuenta_bancaria.jTable_banco.getModel();
        cuenta_bancaria_id_banco = Integer.parseInt(String.valueOf(tm.getValueAt(Cuenta_bancaria.jTable_banco.getSelectedRow(), 0)));
        Cuenta_bancaria.jt_banco.setText(String.valueOf(tm.getValueAt(Cuenta_bancaria.jTable_banco.getSelectedRow(), 1)));
    }

    public synchronized static void Cuentas_acumuladoras_selected() {
        DefaultTableModel tm = (DefaultTableModel) Cuentas_acumuladoras.jTable_cuenta.getModel();
        cuentas_acumuladoras_id_cuenta = Integer.parseInt(String.valueOf(tm.getValueAt(Cuentas_acumuladoras.jTable_cuenta.getSelectedRow(), 0)));
        Cuentas_acumuladoras.jTextField_cuenta.setText((String.valueOf(tm.getValueAt(Cuentas_acumuladoras.jTable_cuenta.getSelectedRow(), 1))));
    }

    public synchronized static void Cuentas_acumuladoras_cuenta_acumuladora_selected() {
        DefaultTableModel tm = (DefaultTableModel) Cuentas_acumuladoras.jTable_cuenta_acumuladora.getModel();
        cuentas_acumuladoras_id_cuenta_acumuladora = Integer.parseInt(String.valueOf(tm.getValueAt(Cuentas_acumuladoras.jTable_cuenta_acumuladora.getSelectedRow(), 0)));
        Cuentas_acumuladoras.jTextField_cuenta_acumuladora.setText((String.valueOf(tm.getValueAt(Cuentas_acumuladoras.jTable_cuenta_acumuladora.getSelectedRow(), 1))));
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
        Producto.producto_precio.setText("0");
        // Producto.ubicacion.setText("");
        Producto.producto_proveedor.setText("No especificado");
        Producto.producto_rubro.setText("No especificado");
        Producto.producto_stock_bajo.setText("0");
        Producto.producto_nombre.requestFocus();
        Producto.producto_codigo.setText("");
        Producto.producto_nombre.setEditable(true);
        Producto.jTextField_porcentaje.setText("0");
        Producto.jTextField_precio_de_compra.setText("0");
        Producto.jTextField_iva.setText("10");
        Producto.jButton_borrar.setVisible(false);
        Producto.producto_nombre.requestFocus();
    }

    public static void Cliente_clear() {
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
                if (result.getString("nombre_fantasia") != null) {
                    Proveedor.JT_Nombre_Fantasia.setText(result.getString("nombre_fantasia").trim());
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

    public static void Depositos_bancarios_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT *, cuenta_bancaria.numero as cuenta_numero, banco "
                    + "FROM deposito_bancario "
                    + "inner join cuenta_bancaria on cuenta_bancaria.id_cuenta_bancaria = deposito_bancario.id_cuenta_bancaria "
                    + "inner join banco on banco.id_banco = cuenta_bancaria.id_banco "
                    + "where id_deposito_bancario = '" + id_deposito_bancario + "'");
            if (result.next()) {

                depositos_bancarios_id_cuenta_bancaria = result.getInt("id_cuenta_bancaria");

                Depositos_bancarios.jTextField_comprobante.setText(result.getString("numero"));
                Depositos_bancarios.jTextField_monto.setText(result.getString("monto"));
                Depositos_bancarios.jDateChooser_fecha.setDate(result.getDate("fecha"));
                Depositos_bancarios.jTextField_cuenta_bancaria.setText(result.getString("cuenta_numero").trim() + " - " + result.getString("banco").trim());
                Depositos_bancarios.jTextField_cuenta_bancaria.requestFocus();

            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Movimientos_contables_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT * FROM asiento_contable "
                    + "where id_asiento_contable = '" + id_asiento_contable + "'");
            if (result.next()) {
                if (result.getString("id_asiento_contable") != null) {
                    Movimientos_contables.jTextField_asiento_nro.setText(result.getString("id_asiento_contable"));
                }
                Movimientos_contables.jDateChooser_asiento_fecha.setDate(result.getDate("fecha"));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Movimientos_contables_totales() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT sum(importe) FROM asiento_contable_factura "
                    + "where id_asiento_contable = '" + id_asiento_contable + "'");
            if (result.next()) {
                Movimientos_contables.jTextField_total_factura.setText(Separar_Miles(result.getString(1)));
            }
            st1 = conexion.createStatement();
            result = st1.executeQuery(""
                    + "SELECT sum(importe) FROM asiento_contable_pago "
                    + "where id_asiento_contable = '" + id_asiento_contable + "'");
            if (result.next()) {
                Movimientos_contables.jTextField_total_pago.setText(Separar_Miles(result.getString(1)));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Compras_obtener_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT * FROM compra_detalle "
                    + "where id_compra_detalle = '" + Compras_id_compras_detalle + "'");
            if (result.next()) {
                compras_id_producto = result.getInt("id_producto");
                compras_id_productos_ubicacion = result.getInt("id_productos_ubicacion");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public static void Compras_producto_ubicacion_selected() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT id_productos_ubicacion, ubicacion "
                    + "FROM productos_ubicacion "
                    + "inner join ubicacion on ubicacion.id_ubicacion = productos_ubicacion.id_ubicacion "
                    + "where id_producto = '" + compras_id_producto + "' "
                    + "order by id_productos_ubicacion ASC ");
            if (result.next()) {
                compras_id_productos_ubicacion = result.getInt("id_productos_ubicacion");
//                Compras.jTextField_ubicacion.setText(result.getString("ubicacion"));
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

    public static void Compras_buscar_traer_datos() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT *, proveedor.nombre as proveedor_nombre, usuario.nombre as usuario_nombre, timbrado as timbrado FROM compra "
                    + " inner join proveedor on proveedor.id_proveedor = compra.id_proveedor "
                    + " inner join compra_tipo on compra_tipo.id_compra_tipo = compra.id_compra_tipo "
                    + " inner join timbrado on timbrado.id_timbrado = compra.id_timbrado "
                    + " inner join usuario on usuario.id_usuario = compra.id_usuario "
                    + " inner join compra_forma_pago on compra_forma_pago.id_compra_forma_pago = compra.id_compra_forma_pago "
                    + "where id_compra = '" + id_compra + "'");
            if (result.next()) {

                compras_id_proveedor = result.getInt("id_proveedor");
                compras_id_tipo = result.getInt("id_compra_tipo");
                compras_id_forma_pago = result.getInt("id_compra_forma_pago");
                compras_id_timbrado = result.getInt("id_timbrado");

                if (result.getString("factura") != null) {
                    Compras.jt_factura.setText(result.getString("factura").trim());
                }
                Compras.jTextField_timbrado.setText(result.getString("timbrado").trim());

                if (result.getString("fecha") != null) {
                    Compras.jDateChooser3.setDate(result.getDate("fecha"));
                }
                if (result.getString("proveedor_nombre") != null) {
                    Compras.jt_Proveedor.setText(result.getString("proveedor_nombre").trim() + " (" + result.getString("nombre_fantasia").trim() + ")");
                }
                if (result.getString("compra_tipo") != null) {
                    Compras.jTextField_compra_tipo.setText(result.getString("compra_tipo").trim());
                }
                if (result.getString("compra_forma_pago") != null) {
                    Compras.jTextField_forma_pago.setText(result.getString("compra_forma_pago").trim());
                }
                Compras.jLabel1.setText(result.getString("usuario_nombre").trim());

                if (result.getString("modificado_por") != null) {
                    Compras.jLabel1.setText("Creado por: " + result.getString("usuario_nombre").trim() + " - Modificado por: " + result.getString("modificado_por").trim() + " (" + result.getString("modificado_fecha") + ")");
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

    public static void Movimientos_contables_max() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_asiento_contable) FROM asiento_contable ");
            if (result.next()) {
                id_asiento_contable = result.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Ventas_max() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_venta) FROM venta ");
            if (result.next()) {
                id_venta = result.getInt(1);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Proveedor_guardar(String nombre_proveedor, String ruc, String telefono, String direccion, String nombre_fantasia) {
        try {

            if ((nombre_proveedor == null) && (nombre_proveedor.length() < 1)) {
                JOptionPane.showMessageDialog(null, "Ingresar el Nombre");
            } else if (Metodos.id_proveedor == 0) {

                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_proveedor) FROM proveedor");
                if (result.next()) {
                    id_proveedor = result.getInt(1) + 1;
                }

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO proveedor VALUES(?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id_proveedor);
                stUpdateProducto.setString(2, nombre_proveedor);
                stUpdateProducto.setString(3, ruc);
                stUpdateProducto.setString(4, telefono);
                stUpdateProducto.setString(5, direccion);
                stUpdateProducto.setInt(6, 0);
                stUpdateProducto.setString(7, nombre_fantasia);
                stUpdateProducto.executeUpdate();
                Proveedor.jButton_borrar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE proveedor "
                        + " SET nombre ='" + nombre_proveedor + "',"
                        + " direccion ='" + direccion + "',"
                        + " nombre_fantasia ='" + nombre_fantasia + "',"
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

    public synchronized static void Ventas_agregar_detalle_guardar(String precio, String unidades, String total) {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_venta_detalle) FROM venta_detalle");
            if (result.next()) {
                id_venta_detalle = result.getInt(1) + 1;
            }

            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO venta_detalle VALUES(?,?,?,?,?,?)");
            stUpdateProducto.setInt(1, id_venta_detalle);
            stUpdateProducto.setInt(2, id_venta);
            stUpdateProducto.setInt(3, ventas_id_producto);
            stUpdateProducto.setDouble(4, Double.parseDouble(unidades));
            stUpdateProducto.setDouble(5, Double.parseDouble(precio));
            stUpdateProducto.setDouble(6, Double.parseDouble(total));
            stUpdateProducto.executeUpdate();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Ventas_clientes_guardar() {
        try {
            PreparedStatement st = conexion.prepareStatement(
                    " UPDATE venta "
                    + " SET id_cliente ='" + ventas_id_cliente + "' "
                    + " WHERE id_venta = '" + id_venta + "'");
            st.executeUpdate();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Movimientos_contables_deposito_guardar(Date fecha, String comprobante, String importe, String descripcion) {
        try {

            importe = importe.replace(".", "");
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_deposito_bancario) FROM deposito_bancario");
            if (result.next()) {
                movimiento_contable_id_deposito_bancario = result.getInt(1) + 1;
            }

            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO deposito_bancario VALUES(?,?,?,?,?,?,?,?)");
            stUpdateProducto.setInt(1, movimiento_contable_id_deposito_bancario);
            stUpdateProducto.setLong(2, Long.parseLong(comprobante));
            stUpdateProducto.setDate(3, util_Date_to_sql_date(fecha));
            stUpdateProducto.setLong(4, Long.parseLong(importe));
            stUpdateProducto.setInt(5, movimiento_contable_deposito_id_cuenta_bancaria);
            stUpdateProducto.setInt(6, id_asiento_contable);
            stUpdateProducto.setInt(7, 1);
            stUpdateProducto.setInt(8, 0);
            stUpdateProducto.executeUpdate();

            st1 = conexion.createStatement();
            result = st1.executeQuery("SELECT MAX(id_asiento_contable_factura) FROM asiento_contable_factura");
            if (result.next()) {
                id_asiento_contable_factura = result.getInt(1) + 1;
            }

            stUpdateProducto = conexion.prepareStatement(""
                    + "INSERT INTO asiento_contable_factura VALUES(?,?,?,?,?,?,?,?)");
            stUpdateProducto.setInt(1, id_asiento_contable_factura);
            stUpdateProducto.setInt(2, id_asiento_contable); // id asiento contable
            stUpdateProducto.setInt(3, movimiento_contable_deposito_id_cuenta_vinculada);
            stUpdateProducto.setString(4, descripcion);
            stUpdateProducto.setString(5, comprobante);
            stUpdateProducto.setLong(6, Long.parseLong(importe));
            stUpdateProducto.setDate(7, util_Date_to_sql_date(fecha));
            stUpdateProducto.setInt(8, 0); // proveedor
            stUpdateProducto.executeUpdate();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Ventas_insert() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_venta) FROM venta");
            if (result.next()) {
                id_venta = result.getInt(1) + 1;
            }
            Date hoy = new Date();

            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO venta VALUES(?,?,?,?)");
            stUpdateProducto.setInt(1, id_venta);
            stUpdateProducto.setInt(2, 0);
            stUpdateProducto.setInt(3, 1);
            stUpdateProducto.setDate(4, util_Date_to_sql_date(hoy));
            stUpdateProducto.executeUpdate();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Configuracion_asiento_compra_guardar() {
        try {
            PreparedStatement stUpdateProducto34 = conexion.prepareStatement(""
                    + "UPDATE configuracion_asiento_compra "
                    + "set contado = '" + contado_id_cuenta + "',"
                    + "credito = '" + credito_id_cuenta + "', "
                    + "pagares = '" + pagares_id_cuenta + "'");
            stUpdateProducto34.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado correctamente.");
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Movimientos_contables_pago_guardar(String importe, String numero, Date fecha) {
        try {
            boolean error = false;
            if (movimiento_contable_id_tipo_pago == 0) {
                error = true;
                Movimientos_contables.jTextField_pago_tipo.requestFocus();
            }
            if (movimiento_contable_id_cuenta_bancaria == 0) {
                error = true;
                Movimientos_contables.jTextField_pago_cta_cte.requestFocus();
            }
            if (error == false) {

                importe = importe.replace(".", "");
                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_asiento_contable_pago) FROM asiento_contable_pago");
                if (result.next()) {
                    id_asiento_contable_pago = result.getInt(1) + 1;
                }
                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO asiento_contable_pago VALUES(?,?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id_asiento_contable_pago);
                stUpdateProducto.setInt(2, id_asiento_contable);
                stUpdateProducto.setInt(3, movimiento_contable_id_tipo_pago);
                stUpdateProducto.setInt(4, movimiento_contable_id_cuenta_bancaria);
                stUpdateProducto.setString(5, numero);
                stUpdateProducto.setDate(6, util_Date_to_sql_date(fecha));
                stUpdateProducto.setLong(7, Long.parseLong(importe));
                stUpdateProducto.setInt(8, movimientos_contables_pago_id_proveedor);
                stUpdateProducto.executeUpdate();
            }

        } catch (NumberFormatException | SQLException e) {
            System.err.println(e);
        }
    }

    public synchronized static void Asiento_contable_guardar() {
        try {

            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_asiento_contable) FROM asiento_contable ");
            if (result.next()) {
                id_asiento_contable = result.getInt(1) + 1;
            }

            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO asiento_contable VALUES(?,?)");
            stUpdateProducto.setInt(1, id_asiento_contable);
            stUpdateProducto.setDate(2, util_Date_to_sql_date(hoy));
            stUpdateProducto.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Guardado correctamente");

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Cuentas_acumuladoras_guardar() {
        try {

            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_cuenta_acumuladora) FROM cuenta_acumuladora");
            if (result.next()) {
                id_cuenta_acumuladora = result.getInt(1) + 1;
            }

            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO cuenta_acumuladora VALUES(?,?,?)");
            stUpdateProducto.setInt(1, id_cuenta_acumuladora);
            stUpdateProducto.setInt(2, cuentas_acumuladoras_id_cuenta);
            stUpdateProducto.setInt(3, cuentas_acumuladoras_id_cuenta_acumuladora);
            stUpdateProducto.executeUpdate();

            JOptionPane.showMessageDialog(null, "Guardado correctamente");

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Movimientos_contables_factura_guardar(String descripcion, String comprobante, String importe, Date fecha) {
        try {

            boolean error = false;

            if (movimientos_contables_cuentas_vicnuladas_id_cuenta == 0) {
                error = true;
//                JOptionPane.showMessageDialog(null, "Error: Debes seleccionar una cuenta.");
                Movimientos_contables.jTextField_factura_cuenta.requestFocus();
            }

            if (error == false) {

                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_asiento_contable_factura) FROM asiento_contable_factura");
                if (result.next()) {
                    id_asiento_contable_factura = result.getInt(1) + 1;
                }

                importe = importe.replace(".", "");

                PreparedStatement stUpdateProducto = conexion.prepareStatement(""
                        + "INSERT INTO asiento_contable_factura VALUES(?,?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id_asiento_contable_factura);
                stUpdateProducto.setInt(2, id_asiento_contable); // id asiento contable
                stUpdateProducto.setInt(3, movimientos_contables_cuentas_vicnuladas_id_cuenta);
                stUpdateProducto.setString(4, descripcion);
                stUpdateProducto.setString(5, comprobante);
                stUpdateProducto.setLong(6, Long.parseLong(importe));
                stUpdateProducto.setDate(7, util_Date_to_sql_date(fecha));
                stUpdateProducto.setInt(8, movimientos_contables_factura_id_proveedor);
                stUpdateProducto.executeUpdate();
                // JOptionPane.showMessageDialog(null, "Guardado correctamente");
            }

        } catch (NumberFormatException | SQLException e) {
            System.err.println(e);
        }
    }

    public synchronized static void Cuentas_vinculadas_guardar(String descripcion) {
        try {
            if (Metodos.id_cuenta_vinculada == 0) {

                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_cuenta_vinculada) FROM cuenta_vinculada");
                if (result.next()) {
                    id_cuenta_vinculada = result.getInt(1) + 1;
                }
                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO cuenta_vinculada VALUES(?,?,?,?)");
                stUpdateProducto.setInt(1, id_cuenta_vinculada);
                stUpdateProducto.setString(2, descripcion);
                stUpdateProducto.setInt(3, cuentas_vicnuladas_id_cuenta);
                stUpdateProducto.setInt(4, 2017);
                stUpdateProducto.executeUpdate();
//                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE cuenta_vinculada "
                        + " SET descripcion ='" + descripcion + "', "
                        + " id_cuenta_vinculada ='" + cuentas_vicnuladas_id_cuenta + "' "
                        + " WHERE id_cuenta_vinculada = '" + id_cuenta_vinculada + "'");
                st.executeUpdate();
//                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Productos_ubicacion_guardar() {
        try {

            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_productos_ubicacion) FROM productos_ubicacion");
            if (result.next()) {
                producto_id_ubicacion = result.getInt(1) + 1;
            }

            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO productos_ubicacion VALUES(?,?,?,?)");
            stUpdateProducto.setInt(1, producto_id_ubicacion);
            stUpdateProducto.setInt(2, id_producto);
            stUpdateProducto.setInt(3, producto_id_ubicacion_selected);
            stUpdateProducto.setInt(4, 0);
            stUpdateProducto.executeUpdate();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Compras_agregar_detalle_guardar(String unidades, String precio, String impuesto) {
        try {

            precio = precio.replace(".", "");

            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT MAX(id_compra_detalle) FROM compra_detalle");
            if (result.next()) {
                id_compra_detalle = result.getInt(1) + 1;
            }
            PreparedStatement stUpdateProducto = conexion.prepareStatement(""
                    + "INSERT INTO compra_detalle VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stUpdateProducto.setInt(1, id_compra_detalle);
            stUpdateProducto.setDouble(2, Double.parseDouble(unidades));
            stUpdateProducto.setLong(3, Long.parseLong(precio));

            double total = Double.parseDouble(unidades) * Double.parseDouble(precio);
            long total_long = (long) total;
            stUpdateProducto.setLong(4, total_long);
            stUpdateProducto.setInt(5, id_compra);
            stUpdateProducto.setInt(6, compras_id_producto);
            stUpdateProducto.setInt(7, compras_id_productos_ubicacion);
            stUpdateProducto.setInt(8, compras_id_sector);
            stUpdateProducto.setInt(9, compras_id_cuenta);
            stUpdateProducto.setInt(10, Integer.parseInt(impuesto));

            if (Integer.parseInt(impuesto) == 0) {
                stUpdateProducto.setLong(11, total_long);
            } else {
                stUpdateProducto.setLong(11, 0);
            }
            if (Integer.parseInt(impuesto) == 5) {
                stUpdateProducto.setLong(12, total_long);
            } else {
                stUpdateProducto.setLong(12, 0);
            }
            if (Integer.parseInt(impuesto) == 10) {
                stUpdateProducto.setLong(13, total_long);
            } else {
                stUpdateProducto.setLong(13, 0);
            }

            stUpdateProducto.executeUpdate();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
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

    public synchronized static void Ventas_actualizar_total() {
        try {
            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery("SELECT sum(total) FROM venta_detalle where id_venta = '" + id_venta + "'");
            if (result.next()) {
                PreparedStatement stUpdateProducto = conexion.prepareStatement(""
                        + "UPDATE venta "
                        + "set total = '" + result.getLong(1) + "' "
                        + "where id_venta = '" + id_venta + "'");
                stUpdateProducto.executeUpdate();
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Producto_mover(String unidades) {
        try {
            long unidades_long = Long.parseLong(unidades);
            if (producto_id_ubicacion_de > 0 && producto_id_ubicacion_a > 0) {

                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_ubicacion_mover) FROM ubicacion_mover");
                if (result.next()) {
                    id_ubicacion_mover = result.getInt(1) + 1;
                }

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO ubicacion_mover VALUES(?,?,?,?,?)");
                stUpdateProducto.setInt(1, id_ubicacion_mover);
                stUpdateProducto.setLong(2, (unidades_long * -1));
                stUpdateProducto.setDate(3, util_Date_to_sql_date(hoy));
                stUpdateProducto.setInt(4, id_producto);
                stUpdateProducto.setInt(5, producto_id_ubicacion_de);
                stUpdateProducto.executeUpdate();

                id_ubicacion_mover = id_ubicacion_mover + 1;

                PreparedStatement stUpdateProducto2 = conexion.prepareStatement("INSERT INTO ubicacion_mover VALUES(?,?,?,?,?)");
                stUpdateProducto2.setInt(1, id_ubicacion_mover);
                stUpdateProducto2.setLong(2, unidades_long);
                stUpdateProducto2.setDate(3, util_Date_to_sql_date(hoy));
                stUpdateProducto2.setInt(4, id_producto);
                stUpdateProducto2.setInt(5, producto_id_ubicacion_a);
                stUpdateProducto2.executeUpdate();

                long stock_compra_de = 0;
                long stock_compra_a = 0;
                long cantidad_movida_de = 0;
                long cantidad_movida_a = 0;
//
                Statement st122 = conexion.createStatement();
                ResultSet result22 = st122.executeQuery(""
                        + "SELECT sum(cantidad) FROM compra_detalle "
                        + "where id_producto = '" + id_producto + "' "
                        + "and id_productos_ubicacion = '" + producto_id_ubicacion_de + "'");
                if (result22.next()) {
                    stock_compra_de = result22.getLong(1);
                }
                Statement st123 = conexion.createStatement();
                ResultSet result23 = st123.executeQuery(""
                        + "SELECT sum(unidades) FROM ubicacion_mover "
                        + "where id_producto = '" + id_producto + "' "
                        + "and id_productos_ubicacion = '" + producto_id_ubicacion_de + "'");
                if (result23.next()) {
                    cantidad_movida_de = result23.getLong(1);
                }

                PreparedStatement stUpdateProducto34 = conexion.prepareStatement(""
                        + "UPDATE productos_ubicacion "
                        + "set stock = '" + (stock_compra_de + cantidad_movida_de) + "' "
                        + "where id_productos_ubicacion = '" + producto_id_ubicacion_de + "'");
                stUpdateProducto34.executeUpdate();

                ////////////////////////////////////////////////////////////////////////////////////////
                Statement st1223 = conexion.createStatement();
                ResultSet result223 = st1223.executeQuery(""
                        + "SELECT sum(cantidad) FROM compra_detalle "
                        + "where id_producto = '" + id_producto + "' "
                        + "and id_productos_ubicacion = '" + producto_id_ubicacion_a + "'");
                if (result223.next()) {
                    stock_compra_a = result223.getLong(1);
                }
//
                Statement st1233 = conexion.createStatement();
                ResultSet result233 = st1233.executeQuery(""
                        + "SELECT sum(unidades) FROM ubicacion_mover "
                        + "where id_producto = '" + id_producto + "' "
                        + "and id_productos_ubicacion = '" + producto_id_ubicacion_a + "'");
                if (result233.next()) {
                    cantidad_movida_a = result233.getLong(1);
                }

                PreparedStatement stUpdateProducto345 = conexion.prepareStatement(""
                        + "UPDATE productos_ubicacion "
                        + "set stock = '" + (stock_compra_a + cantidad_movida_a) + "' "
                        + "where id_productos_ubicacion = '" + producto_id_ubicacion_a + "'");
                stUpdateProducto345.executeUpdate();

            } else {
                JOptionPane.showMessageDialog(null, "Complete los campos");
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public synchronized static void Compras_actualizar_stock() {
        try {
            long stock = 0;
            long cantidad_movida_menos = 0;
            long cantidad_movida_mas = 0;

            Statement st1 = conexion.createStatement();
            ResultSet result = st1.executeQuery(""
                    + "SELECT sum(cantidad) FROM compra_detalle "
                    + "where id_producto = '" + compras_id_producto + "' "
                    + "and id_productos_ubicacion = '" + compras_id_productos_ubicacion + "'");
            if (result.next()) {
                stock = result.getLong(1);
            }

            long stock_compra_de = 0;
            long cantidad_movida_de = 0;
//
            Statement st122 = conexion.createStatement();
            ResultSet result22 = st122.executeQuery(""
                    + "SELECT sum(cantidad) FROM compra_detalle "
                    + "where id_producto = '" + compras_id_producto + "' "
                    + "and id_productos_ubicacion = '" + compras_id_productos_ubicacion + "'");
            if (result22.next()) {
                stock_compra_de = result22.getLong(1);
            }
            Statement st123 = conexion.createStatement();
            ResultSet result23 = st123.executeQuery(""
                    + "SELECT sum(unidades) FROM ubicacion_mover "
                    + "where id_producto = '" + compras_id_producto + "' "
                    + "and id_productos_ubicacion = '" + compras_id_productos_ubicacion + "'");
            if (result23.next()) {
                cantidad_movida_de = result23.getLong(1);
            }

            PreparedStatement stUpdateProducto34 = conexion.prepareStatement(""
                    + "UPDATE productos_ubicacion "
                    + "set stock = '" + (stock_compra_de + cantidad_movida_de) + "' "
                    + "where id_productos_ubicacion = '" + compras_id_productos_ubicacion + "'");
            stUpdateProducto34.executeUpdate();
//                    
//            PreparedStatement stUpdateProducto = conexion.prepareStatement(""
//                    + "UPDATE productos_ubicacion "
//                    + "set stock = '" + (stock - cantidad_movida_menos + cantidad_movida_mas) + "' "
//                    + "where id_productos_ubicacion = '" + compras_id_productos_ubicacion + "'");
//            stUpdateProducto.executeUpdate();

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

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO compra VALUES(?,?,?,?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id_compra);
                stUpdateProducto.setInt(2, compras_id_proveedor);
                stUpdateProducto.setString(3, factura);
                stUpdateProducto.setDate(4, util_Date_to_sql_date(fecha));
                stUpdateProducto.setInt(5, 0); // borrado
                stUpdateProducto.setInt(6, 0); // total
                stUpdateProducto.setInt(7, compras_id_tipo);
                stUpdateProducto.setInt(8, compras_id_forma_pago);
                stUpdateProducto.setInt(9, id_usuario);
                stUpdateProducto.setInt(10, compras_id_timbrado);
                stUpdateProducto.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");

            } else {
//                Date ahora = new Date();
//                PreparedStatement st = conexion.prepareStatement(
//                        " UPDATE compra "
//                        + " SET factura ='" + factura + "',"
//                        + " fecha ='" + util_Date_to_sql_date(fecha) + "',"
//                        + " id_proveedor ='" + compras_id_proveedor + "',"
//                        + " id_timbrado ='" + compras_id_timbrado + "',"
//                        + " id_compra_forma_pago ='" + compras_id_forma_pago + "',"
//                        + " modificado_por ='" + usuario + "', "
//                        + " modificado_fecha ='" + util_Date_to_sql_date(ahora) + "', "
//                        + " id_compra_tipo ='" + compras_id_tipo + "' "
//                        + " WHERE id_compra = '" + id_compra + "'");
//                st.executeUpdate();

//                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void Compras_update(String factura, Date fecha) {
        try {
            if (id_compra == 0) {
                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery("SELECT MAX(id_compra) FROM compra");
                if (result.next()) {
                    id_compra = result.getInt(1) + 1;
                }

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO compra VALUES(?,?,?,?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id_compra);
                stUpdateProducto.setInt(2, compras_id_proveedor);
                stUpdateProducto.setString(3, factura);
                stUpdateProducto.setDate(4, util_Date_to_sql_date(fecha));
                stUpdateProducto.setInt(5, 0); // borrado
                stUpdateProducto.setInt(6, 0); // total
                stUpdateProducto.setInt(7, compras_id_tipo);
                stUpdateProducto.setInt(8, compras_id_forma_pago);
                stUpdateProducto.setInt(9, id_usuario);
                stUpdateProducto.setInt(10, compras_id_timbrado);
                stUpdateProducto.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");

            } else {

                Date ahora = new Date();
                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE compra "
                        + " SET factura ='" + factura + "',"
                        + " fecha ='" + util_Date_to_sql_date(fecha) + "',"
                        + " id_proveedor ='" + compras_id_proveedor + "',"
                        + " id_timbrado ='" + compras_id_timbrado + "',"
                        + " id_compra_forma_pago ='" + compras_id_forma_pago + "',"
                        + " modificado_por ='" + usuario + "', "
                        + " modificado_fecha ='" + util_Date_to_sql_date(ahora) + "', "
                        + " id_compra_tipo ='" + compras_id_tipo + "' "
                        + " WHERE id_compra = '" + id_compra + "'");
                st.executeUpdate();

                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
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

                Statement st12 = conexion.createStatement();
                ResultSet result2 = st12.executeQuery("SELECT MAX(id_productos_ubicacion) FROM productos_ubicacion");
                if (result2.next()) {
                    producto_id_ubicacion = result2.getInt(1) + 1;
                }
                PreparedStatement stUpdateProducto2 = conexion.prepareStatement("INSERT INTO productos_ubicacion VALUES(?,?,?,?)");
                stUpdateProducto2.setInt(1, producto_id_ubicacion);
                stUpdateProducto2.setInt(2, id_producto);
                stUpdateProducto2.setInt(3, 0);
                stUpdateProducto2.setInt(4, 0);
                stUpdateProducto2.executeUpdate();

                Metodos.Producto_ubicacion_jtable();

                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                if (vencimiento == null) {
                    PreparedStatement st = conexion.prepareStatement(
                            " UPDATE productos "
                            + " SET nombre ='" + nombre + "', "
                            + " codigo ='" + codigo + "', "
                            + " precio ='" + Long.parseLong(precio) + "', "
                            + " stock_bajo ='" + Long.parseLong(stock_bajo) + "', "
                            + " id_proveedor ='" + producto_id_proveedor + "', "
                            + " id_productos_tipo ='" + producto_id_rubro + "', "
                            + " id_unidad_medida ='" + producto_id_unidad_medida + "', "
                            + " iva ='" + Long.parseLong(iva) + "' "
                            + " WHERE id_producto = '" + id_producto + "'");
                    st.executeUpdate();
                } else {
                    PreparedStatement st = conexion.prepareStatement(
                            " UPDATE productos "
                            + " SET nombre ='" + nombre + "', "
                            + " codigo ='" + codigo + "', "
                            + " precio ='" + Long.parseLong(precio) + "', "
                            + " stock_bajo ='" + Long.parseLong(stock_bajo) + "', "
                            + " vencimiento ='" + util_Date_to_sql_date(vencimiento) + "', "
                            + " id_proveedor ='" + producto_id_proveedor + "', "
                            + " id_productos_tipo ='" + producto_id_rubro + "', "
                            + " id_unidad_medida ='" + producto_id_unidad_medida + "', "
                            + " iva ='" + Long.parseLong(iva) + "' "
                            + " WHERE id_producto = '" + id_producto + "'");
                    st.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
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
                    + "SET borrado = '1' "
                    + "WHERE id_proveedor ='" + id_proveedor + "'");
            Update2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Proveedor eliminado.");

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Productos_ubicacion_delete() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "DELETE from productos_ubicacion "
                    + "where id_productos_ubicacion ='" + producto_id_ubicacion_selected_borrar + "'");
            Update2.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Movimientos_contables_pago_borrar() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "DELETE from asiento_contable_pago "
                    + "where id_asiento_contable_pago ='" + movimiento_contable_id_asiento_contable_pago + "'");
            Update2.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Timbrado_borrar() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "DELETE from timbrado "
                    + "where id_timbrado  ='" + id_timbrado + "'");
            Update2.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public synchronized static void Movimientos_contables_factura_borrar() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "DELETE from asiento_contable_factura "
                    + "where id_asiento_contable_factura ='" + movimientos_contables_selected_id_factura + "'");
            Update2.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Cuentas_vinculadas_borrar() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "DELETE from cuenta_vinculada "
                    + "where id_cuenta_vinculada ='" + id_cuenta_vinculada + "'");
            Update2.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public synchronized static void Compras_borrar() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "DELETE from compra_detalle "
                    + "where id_compra ='" + id_compra + "'");
            Update2.executeUpdate();

            PreparedStatement Update22 = conexion.prepareStatement(""
                    + "DELETE from compra "
                    + "where id_compra ='" + id_compra + "'");
            Update22.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compra borrada correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se puede borrar. Es posible que haya un asiento asociado a esta factura.");
        }

    }

    public synchronized static void Compras_detalle_delete() {
        try {
            PreparedStatement Update2 = conexion.prepareStatement(""
                    + "DELETE from compra_detalle "
                    + "where id_compra_detalle ='" + Compras_id_compras_detalle + "'");
            Update2.executeUpdate();

            Date ahora = new Date();
            PreparedStatement Update22 = conexion.prepareStatement(""
                    + "UPDATE compra "
                    + "SET modificado_por = '" + usuario + "', "
                    + " modificado_fecha = '" + util_Date_to_sql_date(ahora) + "' "
                    + "WHERE id_compra ='" + id_compra + "'");
            Update22.executeUpdate();

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
                usuario = rs.getString("nombre").trim();
                id_usuario = rs.getInt("id_usuario");
                privilegio = rs.getInt("id_privilegio");
                ubicacion_proyecto = new File("").getAbsolutePath();
                path = ubicacion_proyecto + "\\reports\\";

                PreparedStatement ps2 = conexion.prepareStatement("select * from configuracion");
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    membrete = rs2.getString("empresa").trim() + " RUC: " + rs2.getString("ruc").trim();
                    titulo = rs2.getString("empresa").trim() + " - Usuario: " + nombre;
                    empresa = rs2.getString("empresa").trim();
                }
                new Principal().setVisible(true);
                entro = true;

            }

            System.err.println(membrete);

            if (entro == false) {
                JOptionPane.showMessageDialog(null, "Error de usuario y/o contraseña.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public synchronized static void Cuentas_imprimir() {
        try {

            int id = 0;
            String nv3 = "";
            String nv4 = "";
            String nv5 = "";

            Statement stAuxiliar = conexion.createStatement();
            stAuxiliar.executeUpdate("truncate table imprimir_plan_de_cuentas");

            PreparedStatement ps = conexion.prepareStatement(""
                    + "select * from cuenta  "
                    + "where borrado != '1' "
                    + "order by nv1,nv2,nv3,nv4,nv5, cuenta");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String espacio = "";
                id = id + 1;

                if (rs.getInt("nv3") < 10) {
                    nv3 = "0" + rs.getString("nv3");
                }
                if (rs.getInt("nv4") < 10) {
                    nv4 = "0" + rs.getString("nv4");
                }
                if (rs.getInt("nv5") < 100) {
                    nv5 = "0" + rs.getString("nv5");
                }
                if (rs.getInt("nv5") < 10) {
                    nv5 = "00" + rs.getString("nv5");
                }
                if (rs.getInt("nv2") > 0) {
                    espacio = espacio + "    ";
                }
                if (rs.getInt("nv3") > 0) {
                    espacio = espacio + "    ";
                }
                if (rs.getInt("nv4") > 0) {
                    espacio = espacio + "    ";
                }
                if (rs.getInt("nv5") > 0) {
                    espacio = espacio + "    ";
                }

                PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_plan_de_cuentas VALUES(?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setString(2, rs.getString("nv1") + "." + rs.getString("nv2") + "." + nv3 + "." + nv4 + "." + nv5);
                stUpdateProducto.setString(3, espacio + rs.getString("cuenta"));
                if (rs.getInt("imputable") == 1) {
                    stUpdateProducto.setString(4, "SI");
                } else {
                    stUpdateProducto.setString(4, "NO");
                }
                stUpdateProducto.executeUpdate();
            }

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + "plan_de_cuentas.jasper");
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException | SQLException ex) {
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

    public synchronized static void Cheques_imprimir(Date desde, Date hasta) {
        try {
            String reporte = "cheques_emitidos.jasper";

            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);
            parametros.put("titulo", titulo_de_pagos);

            if (listado_de_pagos_id_tipo_pago == 0) {
                reporte = "listado_de_pagos_todos.jasper";
            }
            if (listado_de_pagos_id_tipo_pago == 1) {
                parametros.put("titulo", "Listado de cheques");
                parametros.put("id_tipo_pago", 1);
                reporte = "listado_de_pagos_cheques_transferencia.jasper";
            }
            if (listado_de_pagos_id_tipo_pago == 2) {
                parametros.put("titulo", "Listado de transferencias");
                parametros.put("id_tipo_pago", 2);
                reporte = "listado_de_pagos_cheques_transferencia.jasper";
            }

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + reporte);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Lsitado_de_pagos_por_cuenta_imprimir(Date desde, Date hasta) {
        try {
            String reporte = "listado_de_pagos_por_cuenta.jasper";

            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);
            parametros.put("id_cuenta", listado_de_pagos_por_cuenta_id_cuenta_vinculada);

            if (listado_de_pagos_por_cuenta_id_cuenta_vinculada == 0) {
                reporte = "listado_de_pagos_por_cuenta_todos.jasper";
            }

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + reporte);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Lsitado_de_cheques_imprimir(Date desde, Date hasta) {
        try {
            String reporte = "listado_de_cheques.jasper";

            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);
            parametros.put("id_tipo_pago", 1); //cheque
            parametros.put("id_cuenta_bancaria", listado_de_cheques_id_cuenta_bancaria);

            if (listado_de_cheques_id_cuenta_bancaria == 0) {
                reporte = "listado_de_cheques.jasper";
            }

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + reporte);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Libro_mayor(Date desde, Date hasta) {
        try {
            int id = 0;

            long saldos = 0;

            PreparedStatement stUpdateProducto = null;

            Statement stAuxiliar = conexion.createStatement();
            stAuxiliar.executeUpdate("truncate table imprimir_libro_mayor");

            Statement st12 = conexion.createStatement();
            ResultSet result2 = st12.executeQuery("");
            //                    + "SELECT SUM(importe) FROM asiento_contable_compra "
            //                    + "inner join asiento_contable_compra_detalle on asiento_contable_compra.id_asiento_compra = asiento_contable_compra_detalle.id_asiento_contable_compra "
            //                    + "where asiento_contable.fecha < '" + desde + "' "
            //                    + "and asiento_contable_factura.id_proveedor = '0' ");
            //            if (result2.next()) {
            //                saldos = result2.getLong(1);
            //            }

            //            st12 = conexion.createStatement();
            //            result2 = st12.executeQuery(""
            //                    + "SELECT SUM(importe) FROM asiento_contable "
            //                    + "inner join asiento_contable_factura on asiento_contable_factura.id_asiento_contable = asiento_contable.id_asiento_contable "
            //                    + "where asiento_contable.fecha < '" + desde + "' "
            //                    + "and asiento_contable_factura.id_proveedor != '0' ");
            //            if (result2.next()) {
            //                saldos = saldos - result2.getLong(1);
            //            }
            st12 = conexion.createStatement();
            result2 = st12.executeQuery(""
                    + "SELECT * FROM asiento_compra "
                    + "inner join asiento_compra_detalle on asiento_compra_detalle.id_asiento_compra = asiento_compra_detalle.id_asiento_compra "
                    + "inner join compra on compra.id_compra = asiento_compra.id_compra "
                    + "where compra.fecha >= '" + desde + "'"
                    + "and compra.fecha <= '" + hasta + "' ");
            while (result2.next()) {
                id = id + 1;
                stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_libro_mayor VALUES(?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setInt(2, result2.getInt("id_asiento_compra"));
                stUpdateProducto.setDate(3, result2.getDate("fecha"));
                stUpdateProducto.setString(4, result2.getString("factura"));
                stUpdateProducto.setLong(5, 0);
                stUpdateProducto.setInt(6, 0);
                saldos = saldos + result2.getLong("importe");
                stUpdateProducto.setLong(7, saldos);
                stUpdateProducto.executeUpdate();

            }

            String reporte = "libro_mayor.jasper";

            Map parametros = new HashMap();
            parametros.put("titulo", membrete);
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + reporte);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public synchronized static void Libro_mayor(Date desde, Date hasta) {
//        try {
//            int id = 0;
//
//            long saldos = 0;
//
//            PreparedStatement stUpdateProducto = null;
//
//            Statement stAuxiliar = conexion.createStatement();
//            stAuxiliar.executeUpdate("truncate table imprimir_libro_mayor");
//
//            Statement st12 = conexion.createStatement();
//            ResultSet result2 = st12.executeQuery(""
//                    + "SELECT SUM(importe) FROM asiento_contable "
//                    + "inner join asiento_contable_factura on asiento_contable_factura.id_asiento_contable = asiento_contable.id_asiento_contable "
//                    + "where asiento_contable.fecha < '" + desde + "' "
//                    + "and asiento_contable_factura.id_proveedor = '0' ");
//            if (result2.next()) {
//                saldos = result2.getLong(1);
//            }
//
//            st12 = conexion.createStatement();
//            result2 = st12.executeQuery(""
//                    + "SELECT SUM(importe) FROM asiento_contable "
//                    + "inner join asiento_contable_factura on asiento_contable_factura.id_asiento_contable = asiento_contable.id_asiento_contable "
//                    + "where asiento_contable.fecha < '" + desde + "' "
//                    + "and asiento_contable_factura.id_proveedor != '0' ");
//            if (result2.next()) {
//                saldos = saldos - result2.getLong(1);
//            }
//
//            st12 = conexion.createStatement();
//            result2 = st12.executeQuery(""
//                    + "SELECT * FROM asiento_contable "
//                    + "inner join asiento_contable_factura on asiento_contable_factura.id_asiento_contable = asiento_contable.id_asiento_contable "
//                    + "where asiento_contable.fecha >= '" + desde + "'"
//                    + "and asiento_contable.fecha <= '" + hasta + "' ");
//            while (result2.next()) {
//                id = id + 1;
//                stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_libro_mayor VALUES(?,?,?,?,?,?,?)");
//                stUpdateProducto.setInt(1, id);
//                stUpdateProducto.setInt(2, result2.getInt("id_asiento_contable"));
//                stUpdateProducto.setDate(3, result2.getDate("fecha"));
//                stUpdateProducto.setString(4, result2.getString("descripcion") + " s/ Comp.: " + result2.getString("comprobante"));
//                if (result2.getInt("id_proveedor") == 0) {
//                    stUpdateProducto.setInt(5, 0);
//                    stUpdateProducto.setLong(6, result2.getLong("importe"));
//                    saldos = saldos - result2.getLong("importe");
//                } else {
//                    stUpdateProducto.setLong(5, result2.getLong("importe"));
//                    stUpdateProducto.setInt(6, 0);
//                    saldos = saldos + result2.getLong("importe");
//                }
//                stUpdateProducto.setLong(7, saldos);
//                stUpdateProducto.executeUpdate();
//
//            }
//
//            String reporte = "libro_mayor.jasper";
//
//            Map parametros = new HashMap();
//            parametros.put("titulo", membrete);
//            parametros.put("desde", desde);
//            parametros.put("hasta", hasta);
//
//            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + reporte);
//            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
//            JasperViewer jv = new JasperViewer(jp, false);
//            jv.setVisible(true);
//
//        } catch (JRException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public synchronized static void Compras_imprimir_detallado(Date desde, Date hasta) {
        try {
            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);
            parametros.put("id_sector", listado_compras_id_sector);

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + "compras_por_productos.jasper");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Compras_imprimir_proveedor(Date desde, Date hasta) {
        try {
            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);
            parametros.put("id_proveedor", listado_compras_id_proveedor);

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + "compras_por_proveedores.jasper");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Listado_Compras_imprimir_proveedor_x_cuenta(Date desde, Date hasta) {
        try {
            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);
            parametros.put("id_proveedor", listado_compras_id_proveedor);
            parametros.put("titulo", empresa);

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + "compras_x_proveedor_x_factura.jasper");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Extracto_Compras_imprimir_proveedor_x_cuenta(Date desde, Date hasta) {
        try {
            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);
            parametros.put("id_proveedor", listado_compras_id_proveedor);
            parametros.put("titulo", empresa);

            Statement stAuxiliar = conexion.createStatement();
            stAuxiliar.executeUpdate("truncate table extracto_cuenta_proveedores");

            int id = 0;
            long saldo = 0;

            Statement st30 = conexion.createStatement();
            ResultSet result30 = st30.executeQuery(""
                    + "SELECT SUM(compra.total) FROM compra_detalle "
                    + "inner join compra on compra.id_compra = compra_detalle.id_compra "
                    + "where id_proveedor = '" + listado_compras_id_proveedor + "' "
                    + "and fecha < '" + desde + "'");
            while (result30.next()) {
                saldo = result30.getLong(1);
            }

            Statement st31 = conexion.createStatement();
            ResultSet result31 = st31.executeQuery(""
                    + "SELECT SUM(importe) FROM recibo_dinero_proveedores "
                    + "where id_proveedor = '" + listado_compras_id_proveedor + "' "
                    + "and  fecha < '" + desde + "'");
            while (result31.next()) {
                saldo = saldo - result31.getLong(1);
            }

            id = id + 1;
            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO extracto_cuenta_proveedores VALUES(?,?,?,?,?,?,?)");
            stUpdateProducto.setInt(1, id);
            stUpdateProducto.setDate(2, util_Date_to_sql_date(desde));
            stUpdateProducto.setString(3, "TRANSPORTE");
            stUpdateProducto.setInt(4, 0);
            stUpdateProducto.setLong(5, 0);
            stUpdateProducto.setLong(6, saldo);
            stUpdateProducto.setInt(7, listado_compras_id_proveedor);
            stUpdateProducto.executeUpdate();

            Statement st12 = conexion.createStatement();
            ResultSet result2 = st12.executeQuery(""
                    + "SELECT * FROM compra_detalle "
                    + "inner join compra on compra.id_compra = compra_detalle.id_compra "
                    + "where id_proveedor = '" + listado_compras_id_proveedor + "' "
                    + "and (fecha >= '" + desde + "' and fecha <= '" + hasta + "') ");
            while (result2.next()) {

                id = id + 1;

                stUpdateProducto = conexion.prepareStatement("INSERT INTO extracto_cuenta_proveedores VALUES(?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setDate(2, util_Date_to_sql_date(result2.getDate("fecha")));
                stUpdateProducto.setString(3, "Segun factura: " + result2.getString("factura"));
                stUpdateProducto.setInt(4, 0);
                stUpdateProducto.setLong(5, result2.getLong("total"));
                stUpdateProducto.setLong(6, 0);
                stUpdateProducto.setInt(7, listado_compras_id_proveedor);
                stUpdateProducto.executeUpdate();

            }

            st12 = conexion.createStatement();
            result2 = st12.executeQuery(""
                    + "SELECT * FROM recibo_dinero_proveedores "
                    + "where id_proveedor = '" + listado_compras_id_proveedor + "' "
                    + "and (fecha >= '" + desde + "' and fecha <= '" + hasta + "') ");
            while (result2.next()) {
                id = id + 1;

                stUpdateProducto = conexion.prepareStatement("INSERT INTO extracto_cuenta_proveedores VALUES(?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setDate(2, util_Date_to_sql_date(result2.getDate("fecha")));
                stUpdateProducto.setString(3, result2.getString("descripcion").trim() + " S/ Rec. Nº " + result2.getString("numero"));
                stUpdateProducto.setLong(4, result2.getLong("importe"));
                stUpdateProducto.setLong(5, 0);
                stUpdateProducto.setLong(6, 0);
                stUpdateProducto.setInt(7, listado_compras_id_proveedor);
                stUpdateProducto.executeUpdate();
            }
            saldo = 0;
            st12 = conexion.createStatement();
            result2 = st12.executeQuery(""
                    + "SELECT * FROM extracto_cuenta_proveedores "
                    + "order by fecha ASC, id ");
            while (result2.next()) {

                saldo = saldo + result2.getLong("saldo") - result2.getLong("debe") + result2.getLong("haber");

                PreparedStatement Update2 = conexion.prepareStatement(""
                        + "UPDATE extracto_cuenta_proveedores "
                        + "SET saldo = '" + saldo + "' "
                        + "WHERE id ='" + result2.getLong("id") + "'");
                Update2.executeUpdate();

            }

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + "extracto_x_proveedor.jasper");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public synchronized static void Estado_de_situacion_patrimonial(Date desde, Date hasta) {
        try {
            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);

            Statement stAuxiliar = conexion.createStatement();
            stAuxiliar.executeUpdate("truncate table imprimir_estado_patrimonial");

            boolean existe = false;
            int id = 0;
            int nv1 = 0;
            int nv2 = 0;
            int nv3 = 0;
            int nv4 = 0;
            int nv5 = 0;

            boolean guardar_nv1 = false;
            boolean cuenta_titulo = false;
            String cuenta = "";
            long importe = 0;

            guardar_nv1 = false;

            Statement st12 = conexion.createStatement();
            ResultSet result2 = st12.executeQuery(""
                    + "SELECT * FROM asiento_contable_factura "
                    + "inner join cuenta_vinculada on asiento_contable_factura.id_cuenta_vinculada = cuenta_vinculada.id_cuenta_vinculada "
                    + "inner join cuenta on cuenta.id_cuenta = cuenta_vinculada.id_cuenta "
                    + "order by nv1, nv2, nv3, nv4, nv5, cuenta ");
            while (result2.next()) {
                importe = 0;
                id_cuenta = result2.getInt("id_cuenta");

                cuenta = result2.getString("nv1") + "."
                        + result2.getString("nv2") + "."
                        + result2.getString("nv3") + "."
                        + result2.getString("nv4") + "."
                        + result2.getString("nv5") + "  "
                        + result2.getString("cuenta");
                importe = importe + result2.getLong("importe");
                long importe_existe = 0;
                existe = false;
                Statement st19 = conexion.createStatement();
                ResultSet result9 = st19.executeQuery("SELECT * FROM imprimir_estado_patrimonial where id_cuenta = '" + id_cuenta + "' ");
                if (result9.next()) {
                    existe = true;
                    importe_existe = result9.getLong("importe");
                    System.err.println("existe" + id_cuenta);
                }

                Statement st1 = null;
                ResultSet result = null;
                PreparedStatement stUpdateProducto = null;

                if (existe == true) {
                    PreparedStatement Update2 = conexion.prepareStatement(""
                            + "UPDATE imprimir_estado_patrimonial "
                            + "SET importe = '" + (importe + importe_existe) + "' "
                            + "WHERE id_cuenta ='" + id_cuenta + "'");
                    Update2.executeUpdate();
                } else {

//                if (existe == false) {
                    st1 = conexion.createStatement();
                    result = st1.executeQuery("SELECT MAX(id) FROM imprimir_estado_patrimonial");
                    if (result.next()) {
                        id = result.getInt(1) + 1;
                    }
                    stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_estado_patrimonial VALUES(?,?,?,?,?,?,?,?,?)");
                    stUpdateProducto.setInt(1, id);
                    stUpdateProducto.setInt(2, nv1);
                    stUpdateProducto.setInt(3, nv2);
                    stUpdateProducto.setInt(4, nv3);
                    stUpdateProducto.setInt(5, nv4);
                    stUpdateProducto.setInt(6, nv5);
                    stUpdateProducto.setString(7, cuenta);
                    stUpdateProducto.setLong(8, importe);
                    stUpdateProducto.setInt(9, id_cuenta);
                    stUpdateProducto.executeUpdate();
                }
                existe = false;

                Statement st1235 = conexion.createStatement();
                ResultSet result235 = st1235.executeQuery(""
                        + "SELECT * FROM cuenta_acumuladora  "
                        + "where id_cuenta = '" + id_cuenta + "' ");
                while (result235.next()) {

                    int id_cuenta_madre = result235.getInt("id_cuenta_madre");
                    Statement st12355 = conexion.createStatement();
                    ResultSet result2355 = st12355.executeQuery(""
                            + "SELECT * FROM cuenta  "
                            + "where id_cuenta = '" + id_cuenta_madre + "' ");
                    if (result2355.next()) {

                        cuenta = result2355.getString("nv1") + "."
                                + result2355.getString("nv2") + "."
                                + result2355.getString("nv3") + "."
                                + result2355.getString("nv4") + "."
                                + result2355.getString("nv5") + "  "
                                + result2355.getString("cuenta");
                        st1 = conexion.createStatement();
                        existe = false;
                        Statement st199 = conexion.createStatement();
                        ResultSet result99 = st199.executeQuery("SELECT * FROM imprimir_estado_patrimonial where id_cuenta = '" + id_cuenta_madre + "' ");
                        if (result99.next()) {
                            existe = true;
                            importe_existe = result99.getLong("importe");
                        }
                        if (existe == true) {
                            PreparedStatement Update2 = conexion.prepareStatement(""
                                    + "UPDATE imprimir_estado_patrimonial "
                                    + "SET importe = '" + (importe + importe_existe) + "' "
                                    + "WHERE id_cuenta ='" + id_cuenta_madre + "'");
                            Update2.executeUpdate();
                            id_cuenta = id_cuenta_madre;
                        } else {

                            result = st1.executeQuery("SELECT MAX(id) FROM imprimir_estado_patrimonial");
                            if (result.next()) {
                                id = result.getInt(1) + 1;
                            }
                            stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_estado_patrimonial VALUES(?,?,?,?,?,?,?,?,?)");
                            stUpdateProducto.setInt(1, id);
                            stUpdateProducto.setInt(2, nv1);
                            stUpdateProducto.setInt(3, nv2);
                            stUpdateProducto.setInt(4, nv3);
                            stUpdateProducto.setInt(5, nv4);
                            stUpdateProducto.setInt(6, nv5);
                            stUpdateProducto.setString(7, cuenta);
                            stUpdateProducto.setLong(8, importe);
                            stUpdateProducto.setLong(9, id_cuenta_madre);
                            stUpdateProducto.executeUpdate();
                            id_cuenta = id_cuenta_madre;
                        }
                    }
                    st1235 = conexion.createStatement();
                    result235 = st1235.executeQuery(""
                            + "SELECT id_cuenta_madre FROM cuenta_acumuladora  "
                            + "where id_cuenta = '" + id_cuenta + "' ");
                    while (result235.next()) {

                        id_cuenta_madre = result235.getInt(1);
                        st12355 = conexion.createStatement();
                        result2355 = st12355.executeQuery(""
                                + "SELECT * FROM cuenta  "
                                + "where id_cuenta = '" + id_cuenta_madre + "' ");
                        if (result2355.next()) {

                            cuenta = result2355.getString("nv1") + "."
                                    + result2355.getString("nv2") + "."
                                    + result2355.getString("nv3") + "."
                                    + result2355.getString("nv4") + "."
                                    + result2355.getString("nv5") + "  "
                                    + result2355.getString("cuenta");

                            existe = false;
                            Statement st199 = conexion.createStatement();
                            ResultSet result99 = st199.executeQuery("SELECT * FROM imprimir_estado_patrimonial where id_cuenta = '" + id_cuenta_madre + "' ");
                            if (result99.next()) {
                                existe = true;
                                importe_existe = result99.getLong("importe");
                            }

                            if (existe == true) {
                                PreparedStatement Update2 = conexion.prepareStatement(""
                                        + "UPDATE imprimir_estado_patrimonial "
                                        + "SET importe = '" + (importe + importe_existe) + "' "
                                        + "WHERE id_cuenta ='" + id_cuenta_madre + "'");
                                Update2.executeUpdate();
                                id_cuenta = id_cuenta_madre;
                            } else {
                                st1 = conexion.createStatement();
                                result = st1.executeQuery("SELECT MAX(id) FROM imprimir_estado_patrimonial");
                                if (result.next()) {
                                    id = result.getInt(1) + 1;
                                }
                                stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_estado_patrimonial VALUES(?,?,?,?,?,?,?,?,?)");
                                stUpdateProducto.setInt(1, id);
                                stUpdateProducto.setInt(2, nv1);
                                stUpdateProducto.setInt(3, nv2);
                                stUpdateProducto.setInt(4, nv3);
                                stUpdateProducto.setInt(5, nv4);
                                stUpdateProducto.setInt(6, nv5);
                                stUpdateProducto.setString(7, cuenta);
                                stUpdateProducto.setLong(8, importe);
                                stUpdateProducto.setLong(9, id_cuenta_madre);
                                stUpdateProducto.executeUpdate();
                                id_cuenta = id_cuenta_madre;
                            }
                        }
                    }
                    st1235 = conexion.createStatement();
                    result235 = st1235.executeQuery(""
                            + "SELECT id_cuenta_madre FROM cuenta_acumuladora  "
                            + "where id_cuenta = '" + id_cuenta + "' ");
                    while (result235.next()) {

                        id_cuenta_madre = result235.getInt(1);
                        st12355 = conexion.createStatement();
                        result2355 = st12355.executeQuery(""
                                + "SELECT * FROM cuenta  "
                                + "where id_cuenta = '" + id_cuenta_madre + "' ");
                        if (result2355.next()) {

                            cuenta = result2355.getString("nv1") + "."
                                    + result2355.getString("nv2") + "."
                                    + result2355.getString("nv3") + "."
                                    + result2355.getString("nv4") + "."
                                    + result2355.getString("nv5") + "  "
                                    + result2355.getString("cuenta");

                            existe = false;
                            Statement st199 = conexion.createStatement();
                            ResultSet result99 = st199.executeQuery("SELECT * FROM imprimir_estado_patrimonial where id_cuenta = '" + id_cuenta_madre + "' ");
                            if (result99.next()) {
                                existe = true;
                                importe_existe = result99.getLong("importe");
                            }

                            if (existe == true) {
                                PreparedStatement Update2 = conexion.prepareStatement(""
                                        + "UPDATE imprimir_estado_patrimonial "
                                        + "SET importe = '" + (importe + importe_existe) + "' "
                                        + "WHERE id_cuenta ='" + id_cuenta_madre + "'");
                                Update2.executeUpdate();
                                id_cuenta = id_cuenta_madre;
                            } else {
                                st1 = conexion.createStatement();
                                result = st1.executeQuery("SELECT MAX(id) FROM imprimir_estado_patrimonial");
                                if (result.next()) {
                                    id = result.getInt(1) + 1;
                                }
                                stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_estado_patrimonial VALUES(?,?,?,?,?,?,?,?,?)");
                                stUpdateProducto.setInt(1, id);
                                stUpdateProducto.setInt(2, nv1);
                                stUpdateProducto.setInt(3, nv2);
                                stUpdateProducto.setInt(4, nv3);
                                stUpdateProducto.setInt(5, nv4);
                                stUpdateProducto.setInt(6, nv5);
                                stUpdateProducto.setString(7, cuenta);
                                stUpdateProducto.setLong(8, importe);
                                stUpdateProducto.setLong(9, id_cuenta_madre);
                                stUpdateProducto.executeUpdate();
                                id_cuenta = id_cuenta_madre;
                            }
                        }
                    }
                }

            }

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + "estado_situacion_patrimonial.jasper");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized static void Cuentas_guardar(String nv1, String nv2, String nv3, String nv4, String nv5, String cuenta) {
        try {
            error = false;
            if (id_cuenta == 0) {
                boolean cargado = false;
                Statement st1 = conexion.createStatement();
                ResultSet result = st1.executeQuery(""
                        + "SELECT * FROM cuenta "
                        + "where nv1 ='" + nv1 + "' "
                        + "and nv2 = '" + nv2 + "'"
                        + "and nv3 = '" + nv3 + "' "
                        + "and nv4 = '" + nv4 + "' "
                        + "and nv5 = '" + nv5 + "' "
                        + "and borrado != '1' ");
                if (result.next()) {
                    cargado = true;
                    error = true;
                }
                if (cargado == false) {

                    st1 = conexion.createStatement();
                    result = st1.executeQuery("SELECT MAX(id_cuenta) FROM cuenta");
                    if (result.next()) {
                        id_cuenta = result.getInt(1) + 1;
                    }

                    PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO cuenta VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
                    stUpdateProducto.setInt(1, id_cuenta);
                    stUpdateProducto.setInt(2, Integer.parseInt(nv1));
                    stUpdateProducto.setInt(3, Integer.parseInt(nv2));
                    stUpdateProducto.setInt(4, Integer.parseInt(nv3));
                    stUpdateProducto.setInt(5, Integer.parseInt(nv4));
                    stUpdateProducto.setInt(6, Integer.parseInt(nv5));
                    stUpdateProducto.setString(7, cuenta);
                    stUpdateProducto.setInt(8, 0);
                    stUpdateProducto.setInt(9, 0);
                    stUpdateProducto.setInt(10, 0);
                    stUpdateProducto.setInt(11, 0);
                    if (Integer.parseInt(nv5) > 0) {
                        stUpdateProducto.setInt(12, 1);
                    } else {
                        stUpdateProducto.setInt(12, 0);
                    }
                    stUpdateProducto.executeUpdate();
                }

                //    JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {

                PreparedStatement st = conexion.prepareStatement(""
                        + "UPDATE cuenta "
                        + "SET cuenta ='" + cuenta + "', "
                        + "nv1 ='" + nv1 + "', "
                        + "nv2 ='" + nv2 + "', "
                        + "nv3 ='" + nv3 + "', "
                        + "nv4 = '" + nv4 + "', "
                        + "nv5 = '" + nv5 + "' "
                        + "WHERE id_cuenta = '" + id_cuenta + "'");
                st.executeUpdate();
            }

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
                Cuentas.jTextField_nv1.setText(RS.getString("nv1"));
                Cuentas.jTextField_nv2.setText(RS.getString("nv2"));
                Cuentas.jTextField_nv3.setText(RS.getString("nv3"));
                Cuentas.jTextField_nv4.setText(RS.getString("nv4"));
                Cuentas.jTextField_nv5.setText(RS.getString("nv5"));
                Cuentas.jTextField_cuenta.setText(RS.getString("cuenta").trim());
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
                    + "where cuenta ilike '%" + Cuentas.jTextField_buscar.getText() + "%' "
                    + "and borrado != '1' "
                    + "order by nv1, nv2,nv3,nv4,nv5");
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

    public synchronized static void Movimientos_contables_deposito_cuentas_vinculadas_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_deposito_cuentas_vinculadas.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_deposito_cuentas_vinculadas.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta_vinculada,  descripcion, cuenta  "
                    + "from cuenta_vinculada "
                    + "inner join cuenta on cuenta.id_cuenta = cuenta_vinculada.id_cuenta "
                    + "where descripcion ilike '%" + buscar + "%'");
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
            dtm = (DefaultTableModel) Movimientos_contables.jTable_deposito_cuentas_vinculadas.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Timbrado_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Proveedor.jTable_timbrado.getModel();
            for (int j = 0; j < Proveedor.jTable_timbrado.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_timbrado,  timbrado, vencimiento  "
                    + "from timbrado "
                    + "where id_proveedor = '" + id_proveedor + "'");
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
            dtm = (DefaultTableModel) Proveedor.jTable_timbrado.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Ventas_agregar_producto_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Ventas.jTable_productos.getModel();
            for (int j = 0; j < Ventas.jTable_productos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_producto,  nombre, precio  "
                    + "from productos "
                    + "where nombre ilike '%" + buscar + "%'");
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
            dtm = (DefaultTableModel) Ventas.jTable_productos.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_timbrado_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_timbrado.getModel();
            for (int j = 0; j < Compras.jTable_timbrado.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_timbrado,  timbrado, vencimiento  "
                    + "from timbrado "
                    + "where id_proveedor = '" + compras_id_proveedor + "' "
                    + "order by vencimiento DESC");
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
            dtm = (DefaultTableModel) Compras.jTable_timbrado.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Asiento_compra_detalle_jatble() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Asiento_compra.jTable_compras_detalle.getModel();
            for (int j = 0; j < Asiento_compra.jTable_compras_detalle.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_asiento_compra_detalle,  (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) AS cuenta, debe, haber, gravada_10, gravada_5, iva_10, iva_5, exentas  "
                    + "from asiento_compra_detalle "
                    + "inner join cuenta on cuenta.id_cuenta = asiento_compra_detalle.id_cuenta "
                    + "where id_asiento_compra = '" + id_asiento_compra + "' "
                    + "order by id_asiento_compra_detalle ASC");
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
            dtm = (DefaultTableModel) Asiento_compra.jTable_compras_detalle.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Recibo_de_dinero_proveedor_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Recibo_de_dinero.jTable_proveedor.getModel();
            for (int j = 0; j < Recibo_de_dinero.jTable_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_proveedor, nombre, nombre_fantasia "
                    + "from proveedor "
                    + "where nombre ilike '%" + buscar + "%' "
                    + "or nombre_fantasia ilike '%" + buscar + "%' "
                    + "order by nombre ");
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
            dtm = (DefaultTableModel) Recibo_de_dinero.jTable_proveedor.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_asiento_compra_contado_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Configuracion.jTable_cuenta_contado.getModel();
            for (int j = 0; j < Configuracion.jTable_cuenta_contado.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta,  (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) AS cuenta  "
                    + "from cuenta "
                    + "where imputable = '1' "
                    + "order by nv1, nv2, nv3, nv4, nv5, cuenta");
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
            dtm = (DefaultTableModel) Configuracion.jTable_cuenta_contado.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Configuracion_asiento_compra_credito_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Configuracion.jTable_cuenta_credito.getModel();
            for (int j = 0; j < Configuracion.jTable_cuenta_credito.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta,  (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) AS cuenta  "
                    + "from cuenta "
                    + "where imputable = '1' "
                    + "order by nv1, nv2, nv3, nv4, nv5, cuenta");
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
            dtm = (DefaultTableModel) Configuracion.jTable_cuenta_credito.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Asiento_compra_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Asiento_compra.jTable_asientos.getModel();
            for (int j = 0; j < Asiento_compra.jTable_asientos.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_asiento_compra, compra.id_compra, nombre  "
                    + "from asiento_compra "
                    + "inner join compra on compra.id_compra = asiento_compra.id_compra "
                    + "inner join proveedor on proveedor.id_proveedor = compra.id_proveedor "
                    + "order by id_asiento_compra");
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
            dtm = (DefaultTableModel) Asiento_compra.jTable_asientos.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Compras_impuesto_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_impuesto.getModel();
            for (int j = 0; j < Compras.jTable_impuesto.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_impuesto, impuesto_str "
                    + "from impuesto ");
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
            dtm = (DefaultTableModel) Compras.jTable_impuesto.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Movimientos_contables_pago_tipo_pago_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_tipo_pago.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_tipo_pago.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_tipo_pago,  tipo_pago  "
                    + "from tipo_pago");
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
            dtm = (DefaultTableModel) Movimientos_contables.jTable_tipo_pago.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Movimientos_contables_deposito_cuenta_bancaria_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_deposito_cuenta_bancaria.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_deposito_cuenta_bancaria.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta_bancaria, nombre, numero, banco  "
                    + "from cuenta_bancaria "
                    + "inner join banco on banco.id_banco = cuenta_bancaria.id_banco ");
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
            dtm = (DefaultTableModel) Movimientos_contables.jTable_deposito_cuenta_bancaria.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Listado_de_pagos_por_cuentas_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Listado_de_pagos_por_cuentas.jTable_cuentas.getModel();
            for (int j = 0; j < Listado_de_pagos_por_cuentas.jTable_cuentas.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta_vinculada,  descripcion, cuenta  "
                    + "from cuenta_vinculada "
                    + "inner join cuenta on cuenta.id_cuenta = cuenta_vinculada.id_cuenta "
                    + "where descripcion ilike '%" + buscar + "%'");
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
            dtm = (DefaultTableModel) Listado_de_pagos_por_cuentas.jTable_cuentas.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Movimientos_contables_cuenta_bancaria_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_cuenta_bancaria.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_cuenta_bancaria.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta_bancaria,  nombre, numero, banco  "
                    + "from cuenta_bancaria "
                    + "inner join banco on banco.id_banco = cuenta_bancaria.id_banco "
                    + "order by banco ");
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
            dtm = (DefaultTableModel) Movimientos_contables.jTable_cuenta_bancaria.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Libro_banco_cuentas_bancarias_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Libro_banco.jTable_cuenta_bancari.getModel();
            for (int j = 0; j < Libro_banco.jTable_cuenta_bancari.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta_bancaria,  numero, banco  "
                    + "from cuenta_bancaria "
                    + "inner join banco on banco.id_banco = cuenta_bancaria.id_banco "
                    + "order by banco ");
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
            dtm = (DefaultTableModel) Libro_banco.jTable_cuenta_bancari.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Cuentas_vinculdas_cargar_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Cuentas_vinculadas.jTable_cuentas_vinculadas.getModel();
            for (int j = 0; j < Cuentas_vinculadas.jTable_cuentas_vinculadas.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta_vinculada,  (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) AS cuenta, cuenta_vinculada.descripcion  "
                    + "from cuenta_vinculada "
                    + "inner join cuenta on cuenta.id_cuenta = cuenta_vinculada.id_cuenta "
                    + "order by descripcion ");
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
            dtm = (DefaultTableModel) Cuentas_vinculadas.jTable_cuentas_vinculadas.getModel();
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

    public synchronized static void Compras_cuenta_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_cuenta.getModel();
            for (int j = 0; j < Compras.jTable_cuenta.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_cuenta, (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) as cuenta "
                    + "from cuenta "
                    + "where cuenta ilike '%" + buscar + "%' "
                    + "and borrado != '1' "
                    + "and imputable = '1' ");
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
            dtm = (DefaultTableModel) Compras.jTable_cuenta.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Movimientos_contables_factura_proveedor_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_factura_proveedor.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_factura_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_proveedor, nombre "
                    + "from proveedor where nombre ilike '%" + buscar + "%'");
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
            dtm = (DefaultTableModel) Movimientos_contables.jTable_factura_proveedor.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Movimientos_contables_pago_proveedor_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_pago_proveedor.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_pago_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_proveedor, nombre "
                    + "from proveedor where nombre ilike '%" + buscar + "%'");
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
            dtm = (DefaultTableModel) Movimientos_contables.jTable_pago_proveedor.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Cuenta_bancaria_banco_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Cuenta_bancaria.jTable_banco.getModel();
            for (int j = 0; j < Cuenta_bancaria.jTable_banco.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select * from banco ");
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
            dtm = (DefaultTableModel) Cuenta_bancaria.jTable_banco.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Movimientos_contables_factura_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_movimeintos_contables_factura.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_movimeintos_contables_factura.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_asiento_contable_factura,fecha, proveedor.nombre, cuenta_vinculada.descripcion as cuenta_descripcion, "
                    + "asiento_contable_factura.descripcion as asiento_descripcion, comprobante, importe "
                    + "from asiento_contable_factura "
                    + "inner join cuenta_vinculada on cuenta_vinculada.id_cuenta_vinculada = asiento_contable_factura.id_cuenta_vinculada "
                    + "inner join proveedor on proveedor.id_proveedor = asiento_contable_factura.id_proveedor "
                    + "where id_asiento_contable = '" + id_asiento_contable + "' ");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs2.getObject(i + 1) != null) {
                        rows[i] = rs2.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs2.getObject(i + 1);
                    }
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Movimientos_contables.jTable_movimeintos_contables_factura.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Movimientos_contables_pago_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_pago.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_pago.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_asiento_contable_pago, fecha, proveedor.nombre,  tipo_pago, asiento_contable_pago.numero, cuenta_bancaria.nombre, banco, importe "
                    + "from asiento_contable_pago "
                    + "inner join tipo_pago on tipo_pago.id_tipo_pago = asiento_contable_pago.id_tipo_pago "
                    + "inner join cuenta_bancaria on cuenta_bancaria.id_cuenta_bancaria = asiento_contable_pago.id_cuenta_bancaria "
                    + "inner join proveedor on proveedor.id_proveedor = asiento_contable_pago.id_proveedor "
                    + "inner join banco on banco.id_banco = cuenta_bancaria.id_banco "
                    + "where id_asiento_contable = '" + id_asiento_contable + "' ");
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
            dtm = (DefaultTableModel) Movimientos_contables.jTable_pago.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Listado_compras_proveedor_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Listado_compras_por_proveedor.jTable_proveedor.getModel();
            for (int j = 0; j < Listado_compras_por_proveedor.jTable_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_proveedor, nombre "
                    + "from proveedor where nombre ilike '%" + buscar + "%'");
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
            dtm = (DefaultTableModel) Listado_compras_por_proveedor.jTable_proveedor.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Listado_compras_proveedor_x_cuenta_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Listado_compras_x_proveedor_x_cuenta.jTable_proveedor.getModel();
            for (int j = 0; j < Listado_compras_x_proveedor_x_cuenta.jTable_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_proveedor, nombre, nombre_fantasia "
                    + "from proveedor "
                    + "where (nombre ilike '%" + buscar + "%' "
                    + "or nombre_fantasia ilike '%" + buscar + "%') "
                    + "order by nombre ");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs2.getObject(i + 1) != null) {
                        rows[i] = rs2.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs2.getObject(i + 1);
                    }
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Listado_compras_x_proveedor_x_cuenta.jTable_proveedor.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Extracto_compras_proveedor_x_cuenta_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Extracto_cuentas_x_proveedor.jTable_proveedor.getModel();
            for (int j = 0; j < Extracto_cuentas_x_proveedor.jTable_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_proveedor, nombre, nombre_fantasia "
                    + "from proveedor "
                    + "where nombre ilike '%" + buscar + "%' "
                    + "or nombre_fantasia ilike '%" + buscar + "%' "
                    + "order by nombre ");
            ResultSet rs2 = ps2.executeQuery();
            ResultSetMetaData rsm = rs2.getMetaData();
            ArrayList<Object[]> data2 = new ArrayList<>();
            while (rs2.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs2.getObject(i + 1) != null) {
                        rows[i] = rs2.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs2.getObject(i + 1);
                    }
                }
                data2.add(rows);
            }
            dtm = (DefaultTableModel) Extracto_cuentas_x_proveedor.jTable_proveedor.getModel();
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

    public synchronized static void Listado_tipo_pago_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Listado_de_pagos.jTable_tipo_pago.getModel();
            for (int j = 0; j < Listado_de_pagos.jTable_tipo_pago.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement("select id_tipo_pago, tipo_pago from tipo_pago order by id_tipo_pago");
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
            dtm = (DefaultTableModel) Listado_de_pagos.jTable_tipo_pago.getModel();
            for (int i = 0; i < data2.size(); i++) {
                dtm.addRow(data2.get(i));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static void Listado_compras_sector__detallado_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Listado_compras_por_sector_detallado.jTable_sector.getModel();
            for (int j = 0; j < Listado_compras_por_sector_detallado.jTable_sector.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Listado_compras_por_sector_detallado.jTable_sector.getModel();
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

    public synchronized static void Tranferencias_proveedor_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Transferencias.jTable_proveedor.getModel();
            for (int j = 0; j < Transferencias.jTable_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select id_proveedor, nombre "
                    + "from proveedor "
                    + "where nombre ilike '%" + buscar + "%'"
                    + "order by nombre ");
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
            dtm = (DefaultTableModel) Transferencias.jTable_proveedor.getModel();
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
                    + "select id_proveedor, nombre, nombre_fantasia "
                    + "from proveedor "
                    + "where nombre ilike '%" + buscar + "%' "
                    + "and borrado != '1' "
                    + "and id_proveedor > '0' "
                    + "order by nombre");
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
                    + "select id_proveedor, nombre, nombre_fantasia "
                    + "from proveedor "
                    + "where (nombre ilike '%" + buscar + "%' "
                    + "or nombre_fantasia ilike '%" + buscar + "%') "
                    + "and borrado != '1' "
                    + "and id_proveedor > '0'"
                    + " order by nombre");
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
                    if (rs.getObject(i + 1) != null) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
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

            PreparedStatement ps = conexion.prepareStatement("select id_compra, nombre, nombre_fantasia, factura, fecha from compra"
                    + " inner join proveedor on proveedor.id_proveedor = compra.id_proveedor "
                    + " where nombre ilike '%" + buscar + "%' "
                    + "or nombre_fantasia ilike '%" + buscar + "%' "
                    + "order by fecha DESC, nombre ");
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

                    if (rs.getObject(i + 1) != null) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    } else {
                        rows[i] = rs.getObject(i + 1);
                    }
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

            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_detalle.getModel();
            for (int j = 0; j < Compras.jTable_detalle.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }

            long total = 0;
            long iva_10 = 0;
            long iva_5 = 0;
            long iva_0 = 0;

            PreparedStatement ps2 = conexion.prepareStatement("select * from compra_detalle "
                    + " where id_compra = '" + id_compra + "'");
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {

                total = rs2.getLong("total") + total;
                iva_0 = rs2.getLong("iva_0") + iva_0;
                iva_5 = rs2.getLong("iva_5") + iva_5;
                iva_10 = rs2.getLong("iva_10") + iva_10;

                Compras.jTextField_total.setText(num.format(total));
                Compras.jTextField_iva_0.setText(num.format(iva_0));
                Compras.jTextField_iva_5.setText(num.format(iva_5 / 21));
                Compras.jTextField_iva_10.setText(num.format(iva_10 / 11));
            }

            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_compra_detalle, nombre, cuenta, sector, cantidad, "
                    + "compra_detalle.precio, iva_0, iva_5, iva_10 "
                    + "from compra_detalle "
                    + "inner join productos on productos.id_producto = compra_detalle.id_producto "
                    + "inner join sector on sector.id_sector = compra_detalle.id_sector "
                    + "inner join compra on compra.id_compra = compra_detalle.id_compra "
                    + "inner join productos_ubicacion on compra_detalle.id_productos_ubicacion = productos_ubicacion.id_productos_ubicacion "
                    + "inner join ubicacion on productos_ubicacion.id_ubicacion = ubicacion.id_ubicacion "
                    + "inner join cuenta on cuenta.id_cuenta = compra_detalle.id_cuenta "
                    + "where compra_detalle.id_compra = '" + id_compra + "' "
                    + "order by compra_detalle.id_compra_detalle DESC");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
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

    public synchronized static void Producto_ubicacion_buscar_jtable() {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select * from ubicacion order by ubicacion DESC");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Producto.jTable_ubicacion.getModel();
            for (int j = 0; j < Producto.jTable_ubicacion.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Producto.jTable_ubicacion.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Producto_ubicacion_jtable() {
        try {

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select sum(stock) "
                    + "from productos_ubicacion "
                    + "inner join ubicacion on ubicacion.id_ubicacion = productos_ubicacion.id_ubicacion "
                    + "where id_producto = '" + id_producto + "'");
            ResultSet rs2 = ps2.executeQuery();
            if (rs2.next()) {
                Producto.jTextField_stock.setText(rs2.getString(1));
            }

            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_productos_ubicacion, ubicacion, stock "
                    + "from productos_ubicacion "
                    + "inner join ubicacion on ubicacion.id_ubicacion = productos_ubicacion.id_ubicacion "
                    + "where id_producto = '" + id_producto + "'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Producto.jTable_producto_ubicacion.getModel();
            for (int j = 0; j < Producto.jTable_producto_ubicacion.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Producto.jTable_producto_ubicacion.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Producto_ubicacion_mover_jtable() {
        try {

            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_ubicacion_mover, ubicacion, unidades, fecha "
                    + "from ubicacion_mover "
                    + "inner join productos_ubicacion on "
                    + "productos_ubicacion.id_productos_ubicacion = ubicacion_mover.id_productos_ubicacion "
                    + "inner join ubicacion on ubicacion.id_ubicacion = productos_ubicacion.id_ubicacion "
                    + "where ubicacion_mover.id_producto = '" + id_producto + "'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Producto.jTable_ubicacion_mover.getModel();
            for (int j = 0; j < Producto.jTable_ubicacion_mover.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Producto.jTable_ubicacion_mover.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }
    public synchronized static void Ventas_buscar_jtable(String buscar) {
        try {

            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_venta, nombre "
                    + "from cliente "
                    + "inner join venta on venta.id_cliente = cliente.id_cliente "
                    + "where nombre ilike '%" + buscar + "%'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Ventas.jTable_ventas.getModel();
            for (int j = 0; j < Ventas.jTable_ventas.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Ventas.jTable_ventas.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Ventas_detalle_jtable() {
        try {

            PreparedStatement ps2 = conexion.prepareStatement(""
                    + "select sum(total) "
                    + "from venta_detalle "
                    + "where id_venta = '" + id_venta + "'");
            ResultSet rs2 = ps2.executeQuery();
            if (rs2.next()) {
                Ventas.jTextField_total.setText(rs2.getString(1));
            }

            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_venta_detalle, nombre, unidades, venta_detalle.precio, total "
                    + "from venta_detalle "
                    + "inner join productos on productos.id_producto = venta_detalle.id_producto "
                    + "where id_venta = '" + id_venta + "'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Ventas.jTable_detalle.getModel();
            for (int j = 0; j < Ventas.jTable_detalle.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Ventas.jTable_detalle.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Ventas_clientes_jtable(String buscar) {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_cliente, nombre, ruc "
                    + "from cliente "
                    + "where nombre ilike '%" + buscar + "%'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Ventas.jTable_clientes.getModel();
            for (int j = 0; j < Ventas.jTable_clientes.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Ventas.jTable_clientes.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Cheques_cuentas_bancarias_jtable() {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_cuenta_bancaria, numero, banco "
                    + "from cuenta_bancaria "
                    + "inner join banco on banco.id_banco = cuenta_bancaria.id_banco ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Cheques.jTable_cuenta_bancaria.getModel();
            for (int j = 0; j < Cheques.jTable_cuenta_bancaria.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1).toString().trim();
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cheques.jTable_cuenta_bancaria.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Tranferencias_cuentas_bancarias_jtable() {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_cuenta_bancaria, numero, banco "
                    + "from cuenta_bancaria "
                    + "inner join banco on banco.id_banco = cuenta_bancaria.id_banco ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Transferencias.jTable_cuenta_bancaria.getModel();
            for (int j = 0; j < Transferencias.jTable_cuenta_bancaria.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1).toString().trim();
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Transferencias.jTable_cuenta_bancaria.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Cheques_proveedor_jtable(String buscar) {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_proveedor, nombre "
                    + "from proveedor "
                    + "where nombre ilike '%" + buscar + "%'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Cheques.jTable_proveedor.getModel();
            for (int j = 0; j < Cheques.jTable_proveedor.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1).toString().trim();
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cheques.jTable_proveedor.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Depositos_bancarios_jtable() {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_deposito_bancario, deposito_bancario.numero, fecha, monto, cuenta_bancaria.numero "
                    + "from deposito_bancario "
                    + "inner join cuenta_bancaria on cuenta_bancaria.id_cuenta_bancaria = deposito_bancario.id_cuenta_bancaria "
                    + "order by fecha ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Depositos_bancarios.jTable_buscar.getModel();
            for (int j = 0; j < Depositos_bancarios.jTable_buscar.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1).toString().trim();
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Depositos_bancarios.jTable_buscar.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Depositos_bancarios_cuentas_bancarias_jtable() {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_cuenta_bancaria, numero, banco "
                    + "from cuenta_bancaria "
                    + "inner join banco on banco.id_banco = cuenta_bancaria.id_banco ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Depositos_bancarios.jTable_cuentas.getModel();
            for (int j = 0; j < Depositos_bancarios.jTable_cuentas.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1).toString().trim();
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Depositos_bancarios.jTable_cuentas.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Cuentas_bancarias_jtable() {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_cuenta_bancaria, numero, nombre "
                    + "from cuenta_bancaria order by nombre ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Cuenta_bancaria.jTable_cuenta_bancaria.getModel();
            for (int j = 0; j < Cuenta_bancaria.jTable_cuenta_bancaria.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    if (rs.getObject(i + 1) != null) {
                        rows[i] = rs.getObject(i + 1).toString().trim();
                    }
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cuenta_bancaria.jTable_cuenta_bancaria.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Bancos_jatble() {
        try {
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select * "
                    + "from banco "
                    + "order by banco");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) Banco.jTable_bancos.getModel();
            for (int j = 0; j < Banco.jTable_bancos.getRowCount(); j++) {
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
            dtm = (DefaultTableModel) Banco.jTable_bancos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Compras_ubicacion_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_ubicacion.getModel();
            for (int j = 0; j < Compras.jTable_ubicacion.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_productos_ubicacion, ubicacion "
                    + "from productos_ubicacion "
                    + "inner join ubicacion on ubicacion.id_ubicacion = productos_ubicacion.id_ubicacion "
                    + "where id_producto = '" + compras_id_producto + "'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
//            dtm = (DefaultTableModel) Compras.jTable_ubicacion.getModel();
//            for (int j = 0; j < Compras.jTable_ubicacion.getRowCount(); j++) {
//                dtm.removeRow(j);
//                j -= 1;
//            }
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras.jTable_ubicacion.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Compras_tipo_pago_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_tipo_pago.getModel();
            for (int j = 0; j < Compras.jTable_tipo_pago.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_compra_tipo, compra_tipo "
                    + "from compra_tipo ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras.jTable_tipo_pago.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Compras_forma_pago_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Compras.jTable_forma_pago.getModel();
            for (int j = 0; j < Compras.jTable_forma_pago.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_compra_forma_pago, compra_forma_pago "
                    + "from compra_forma_pago ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Compras.jTable_forma_pago.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Producto_ubicacion_de_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Producto.jTable_ubicacion_de.getModel();
            for (int j = 0; j < Producto.jTable_ubicacion_de.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_productos_ubicacion, ubicacion "
                    + "from productos_ubicacion "
                    + "inner join ubicacion on ubicacion.id_ubicacion = productos_ubicacion.id_ubicacion "
                    + "where id_producto = '" + id_producto + "'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Producto.jTable_ubicacion_de.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Producto_ubicacion_a_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Producto.jTable_ubicacion_a.getModel();
            for (int j = 0; j < Producto.jTable_ubicacion_a.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_productos_ubicacion, ubicacion "
                    + "from productos_ubicacion "
                    + "inner join ubicacion on ubicacion.id_ubicacion = productos_ubicacion.id_ubicacion "
                    + "where id_producto = '" + id_producto + "'");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Producto.jTable_ubicacion_a.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Cuentas_vinculadas_cuenta_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Cuentas_vinculadas.jTable_cuenta_buscar.getModel();
            for (int j = 0; j < Cuentas_vinculadas.jTable_cuenta_buscar.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_cuenta, (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) as cuenta "
                    + "from cuenta "
                    + "order by nv1, nv2, nv3,nv4,nv5,cuenta ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cuentas_vinculadas.jTable_cuenta_buscar.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Movimientos_contables_cuentas_vinculadas_jtable(String buscar) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_cuentas_vinculadas.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_cuentas_vinculadas.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_cuenta_vinculada, descripcion, (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) as cuenta "
                    + "from cuenta_vinculada "
                    + "inner join cuenta on cuenta.id_cuenta = cuenta_vinculada.id_cuenta "
                    + "where descripcion ilike '%" + buscar + "%'"
                    + "order by descripcion ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Movimientos_contables.jTable_cuentas_vinculadas.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Cuentas_acumuladoras_cuenta_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Cuentas_acumuladoras.jTable_cuenta.getModel();
            for (int j = 0; j < Cuentas_acumuladoras.jTable_cuenta.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_cuenta, (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) as cuenta "
                    + "from cuenta "
                    + "order by nv1,nv2,nv3,nv4,nv5 ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cuentas_acumuladoras.jTable_cuenta.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Cuentas_acumuladoras_cuenta_acumuladora_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Cuentas_acumuladoras.jTable_cuenta_acumuladora.getModel();
            for (int j = 0; j < Cuentas_acumuladoras.jTable_cuenta_acumuladora.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_cuenta, (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) as cuenta "
                    + "from cuenta "
                    + "order by nv1,nv2,nv3,nv4,nv5 ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Cuentas_acumuladoras.jTable_cuenta_acumuladora.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public synchronized static void Movimientos_contables_buscar_jtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) Movimientos_contables.jTable_buscar.getModel();
            for (int j = 0; j < Movimientos_contables.jTable_buscar.getRowCount(); j++) {
                dtm.removeRow(j);
                j -= 1;
            }
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select id_asiento_contable, fecha "
                    + "from asiento_contable "
                    + "order by id_asiento_contable ");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) Movimientos_contables.jTable_buscar.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex);
        }
    }

    public static void Configuracion_guardar(String empresa, String ruc, String direccion, String telefono) {
        try {
            PreparedStatement Update = conexion.prepareStatement("UPDATE configuracion "
                    + "SET empresa = '" + empresa + "', "
                    + "ruc = '" + ruc + "', "
                    + "telefono = '" + telefono + "', "
                    + "direccion = '" + direccion + "' "
                    + "WHERE id ='1'");
            Update.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
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

    public static void Configuracion_asiento_compra_buscar() {
        try {
            PreparedStatement ps = conexion.prepareStatement("select * from configuracion_asiento_compra ");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                PreparedStatement ps2 = conexion.prepareStatement(""
                        + "select (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) AS cuenta "
                        + "from cuenta where id_cuenta = '" + rs.getInt("contado") + "' ");
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    Configuracion.jTextField_contado.setText(rs2.getString("cuenta"));
                }
                ps2 = conexion.prepareStatement(""
                        + "select (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) AS cuenta "
                        + "from cuenta where id_cuenta = '" + rs.getInt("credito") + "' ");
                rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    Configuracion.jTextField_credito.setText(rs2.getString("cuenta"));
                }
                ps2 = conexion.prepareStatement(""
                        + "select (nv1 || '.' || nv2 || '.' || nv3 || '.' || nv4 || '.' || nv5 || ' ' || cuenta ) AS cuenta "
                        + "from cuenta where id_cuenta = '" + rs.getInt("pagares") + "' ");
                rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    Configuracion.jTextField_pagare.setText(rs2.getString("cuenta"));
                }
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

    public static void Cliente_Guardar(String ruc, String direccion, String email, String nombre, String telefono) {
        try {
            if (id_cliente == 0) {
                PreparedStatement ps = conexion.prepareStatement("select max(id_cliente) from cliente");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_cliente = rs.getInt(1) + 1;
                }

                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?,?)");
                st2.setInt(1, id_cliente);
                st2.setString(2, ruc);
                st2.setString(3, nombre);
                st2.setString(4, direccion);
                st2.setString(5, telefono);
                st2.setString(6, email);
                st2.setInt(7, 0);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement Update = conexion.prepareStatement("UPDATE cliente "
                        + "SET nombre = '" + nombre + "', "
                        + "ruc = '" + ruc + "', "
                        + "telef = '" + telefono + "', "
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

    public static void Banco_Guardar(String nombre) {
        try {
            if (id_banco == 0) {
                PreparedStatement ps = conexion.prepareStatement("select max(id_banco) from banco");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_banco = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO banco VALUES(?,?,?)");
                st2.setInt(1, id_banco);
                st2.setString(2, nombre);
                st2.setInt(3, 0);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement Update = conexion.prepareStatement("UPDATE banco "
                        + "SET banco = '" + nombre + "' "
                        + "WHERE id_banco ='" + id_banco + "'");
                Update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void Cuenta_bancaria_Guardar(String nombre, String numero) {
        try {
            if (id_cuenta_bancaria == 0) {
                PreparedStatement ps = conexion.prepareStatement("select max(id_cuenta_bancaria) from cuenta_bancaria");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_cuenta_bancaria = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO cuenta_bancaria VALUES(?,?,?,?,?)");
                st2.setInt(1, id_cuenta_bancaria);
                st2.setString(2, nombre);
                st2.setString(3, numero);
                st2.setInt(4, cuenta_bancaria_id_banco);
                st2.setInt(5, 0);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement Update = conexion.prepareStatement("UPDATE cuenta_bancaria "
                        + "SET nombre = '" + nombre + "', "
                        + "numero = '" + numero + "', "
                        + "id_banco = '" + cuenta_bancaria_id_banco + "' "
                        + "WHERE id_cuenta_bancaria ='" + id_cuenta_bancaria + "'");
                Update.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void Tipo_pago_Guardar(String tipo) {
        try {
            if (id_tipo_pago == 0) {
                PreparedStatement ps = conexion.prepareStatement("select max(id_tipo_pago) from tipo_pago");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_tipo_pago = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO tipo_pago VALUES(?,?)");
                st2.setInt(1, id_tipo_pago);
                st2.setString(2, tipo);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } else {
                PreparedStatement Update = conexion.prepareStatement("UPDATE tipo_pago "
                        + "SET tipo_pago = '" + tipo + "' "
                        + "WHERE id_tipo_pago ='" + id_tipo_pago + "'");
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

//    public static void Configuracion_guardar(String empresa, String ruc, String direccion, String telefono) {
//        PreparedStatement Update = conexion.prepareStatement("UPDATE configuracion "
//                + "SET empresa = '" + empresa + "', "
//                + "ruc = '" + ruc + "', "
//                + "telefono = '" + telefono + "', "
//                + "direccion = '" + direccion + "' ");
//        Update.executeUpdate();
//        JOptionPane.showMessageDialog(null, "Actualizado correctamente");
//    }
    public static void Cuentas_delete() {
        try {
            PreparedStatement Update = conexion.prepareStatement("UPDATE cuenta "
                    + "SET borrado = '1' "
                    + "where id_cuenta = '" + id_cuenta + "' ");
            Update.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    static void Timbrado_guardar(String timbrado, Date vencimiento) {

        try {
            PreparedStatement ps = conexion.prepareStatement("select max(id_timbrado) from timbrado");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                proveedor_id_timbrado = rs.getInt(1) + 1;
            }
            PreparedStatement st2 = conexion.prepareStatement("INSERT INTO timbrado VALUES(?,?,?,?)");
            st2.setInt(1, proveedor_id_timbrado);
            st2.setInt(2, id_proveedor);
            st2.setLong(3, Long.parseLong(timbrado));
            st2.setDate(4, util_Date_to_sql_date(vencimiento));
            st2.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void Recibo_de_dinero_proveedor_guardar(String proveedor, String dinero, String concepto, Date fecha, String recibo) {
        try {
            PreparedStatement ps = conexion.prepareStatement("select max(id_recibo_dinero_proveedores) from recibo_dinero_proveedores");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id_recibo_dinero_proveedores = rs.getInt(1) + 1;
            }
            PreparedStatement st2 = conexion.prepareStatement("INSERT INTO recibo_dinero_proveedores VALUES(?,?,?,?,?,?)");
            st2.setInt(1, id_recibo_dinero_proveedores);
            st2.setInt(2, recibo_dinero_proveedores_id_proveedor);
            st2.setDate(3, util_Date_to_sql_date(fecha));
            st2.setLong(4, Long.parseLong(dinero.replace(".", "")));
            st2.setString(5, concepto);
            st2.setLong(6, Long.parseLong(recibo));

            st2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    static void Depositos_bancarios_guardar(String comprobante, String importe, Date fecha) {
        try {
            if (id_deposito_bancario == 0) {

                PreparedStatement ps = conexion.prepareStatement("select max(id_deposito_bancario) from deposito_bancario");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_deposito_bancario = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO deposito_bancario VALUES(?,?,?,?,?,?,?)");
                st2.setInt(1, id_deposito_bancario);
                st2.setLong(2, Long.parseLong(comprobante.replace(".", "")));
                st2.setDate(3, util_Date_to_sql_date(fecha));
                st2.setLong(4, Long.parseLong(importe.replace(".", "")));
                st2.setInt(5, depositos_bancarios_id_cuenta_bancaria);
                st2.setLong(6, 0);
                st2.setLong(7, 0);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");

            } else {
                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE deposito_bancario "
                        + " SET monto ='" + Long.parseLong(importe.replace(".", "")) + "',"
                        + " fecha ='" + util_Date_to_sql_date(fecha) + "',"
                        + " numero ='" + Long.parseLong(comprobante.replace(".", "")) + "',"
                        + " id_cuenta_bancaria ='" + depositos_bancarios_id_cuenta_bancaria + "' "
                        + " WHERE id_deposito_bancario = '" + id_deposito_bancario + "'");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public synchronized static String getSepararMiles(String txtprec) {
        String valor = txtprec;

        int largo = valor.length();
        if (largo > 10) {
            valor = valor.substring(largo - 11, largo - 9) + "." + valor.substring(largo - 9, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 9) {
            valor = valor.substring(largo - 10, largo - 9) + "." + valor.substring(largo - 9, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 8) {
            valor = valor.substring(largo - 9, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 7) {
            valor = valor.substring(largo - 8, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 6) {
            valor = valor.substring(largo - 7, largo - 6) + "." + valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 5) {
            valor = valor.substring(largo - 6, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 4) {
            valor = valor.substring(largo - 5, largo - 3) + "." + valor.substring(largo - 3, largo);
        } else if (largo > 3) {
            valor = valor.substring(largo - 4, largo - 3) + "." + valor.substring(largo - 3, largo);
        }
        txtprec = valor;
        return valor;
    }

    static void Cheque_guardar(String numero, String importe, Date fecha, String descripcion) {
        try {
            if (id_cheque == 0) {

                PreparedStatement ps = conexion.prepareStatement("select max(id_cheque) from cheque");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_cheque = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO cheque VALUES(?,?,?,?,?,?,?,?,?)");
                st2.setInt(1, id_cheque);
                st2.setInt(2, cheques_id_cuenta_bancaria);
                st2.setInt(3, cheques_id_proveedor);
                st2.setLong(4, Long.parseLong(numero.replace(".", "")));
                st2.setLong(5, Long.parseLong(importe.replace(".", "")));
                st2.setDate(6, util_Date_to_sql_date(fecha));
                st2.setString(7, descripcion);
                st2.setInt(8, 0);
                st2.setInt(9, 0);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");

            } else {
                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE cheque "
                        + " SET id_cuenta_bancaria ='" + cheques_id_cuenta_bancaria + "',"
                        + " fecha ='" + util_Date_to_sql_date(fecha) + "',"
                        + " numero ='" + Long.parseLong(numero.replace(".", "")) + "',"
                        + " importe ='" + Long.parseLong(importe.replace(".", "")) + "',"
                        + " id_proveedor ='" + cheques_id_proveedor + "',"
                        + " id_cuenta_bancaria ='" + cheques_id_cuenta_bancaria + "' "
                        + " WHERE id_cheque = '" + id_cheque + "'");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    static void Transferencia_guardar(String numero, String importe, Date fecha, String descripcion) {
        try {
            if (id_transferencia == 0) {

                PreparedStatement ps = conexion.prepareStatement("select max(id_transferencia) from transferencia");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_transferencia = rs.getInt(1) + 1;
                }
                PreparedStatement st2 = conexion.prepareStatement("INSERT INTO transferencia VALUES(?,?,?,?,?,?,?,?)");
                st2.setInt(1, id_transferencia);
                st2.setInt(2, transferencia_id_cuenta_bancaria);
                st2.setLong(3, Long.parseLong(numero.replace(".", "")));
                st2.setLong(4, Long.parseLong(importe.replace(".", "")));
                st2.setDate(5, util_Date_to_sql_date(fecha));
                st2.setString(6, descripcion);
                st2.setInt(7, 0);
                st2.setInt(8, transferencia_id_proveedor);
                st2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");

            } else {
                PreparedStatement st = conexion.prepareStatement(
                        " UPDATE transferencia "
                        + " SET id_cuenta_bancaria ='" + transferencia_id_cuenta_bancaria + "',"
                        + " fecha ='" + util_Date_to_sql_date(fecha) + "',"
                        + " numero ='" + Long.parseLong(numero.replace(".", "")) + "',"
                        + " importe ='" + Long.parseLong(importe.replace(".", "")) + "',"
                        + " id_proveedor ='" + transferencia_id_proveedor + "',"
                        + " id_cuenta_bancaria ='" + cheques_id_cuenta_bancaria + "' "
                        + " WHERE id_transferencia = '" + id_transferencia + "'");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    static void Imprimir_libro_banco(Date desde, Date hasta, String cuenta_bancaria) {
        try {
            int id = 0;
            long saldo = 0;
            Statement stAuxiliar = conexion.createStatement();
            stAuxiliar.executeUpdate("truncate table imprimir_libro_banco");
////        Saldo inicial bancario
            PreparedStatement ps = conexion.prepareStatement(""
                    + "select sum(monto) from deposito_bancario "
                    + "where fecha < '" + desde + "' "
                    + "and id_cuenta_bancaria = '" + libro_banco_id_cuenta_bancaria + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                saldo = saldo + rs.getLong(1);
            }

            ps = conexion.prepareStatement(""
                    + "select SUM(importe) from cheque "
                    + "inner join proveedor on proveedor.id_proveedor = cheque.id_proveedor "
                    + "where fecha < '" + desde + "' "
                    + "and id_cuenta_bancaria = '" + libro_banco_id_cuenta_bancaria + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                saldo = saldo - rs.getLong(1);
            }

            ps = conexion.prepareStatement(""
                    + "select * from transferencia "
                    + "where fecha < '" + desde + "' "
                    + "and id_cuenta_bancaria = '" + libro_banco_id_cuenta_bancaria + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                saldo = saldo - rs.getLong(1);
            }

            id = id + 1;
            PreparedStatement stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_libro_banco VALUES(?,?,?,?,?,?,?)");
            stUpdateProducto.setInt(1, id);
            stUpdateProducto.setDate(2, util_Date_to_sql_date(desde));
            stUpdateProducto.setString(3, "-");
            stUpdateProducto.setLong(4, 0);
            stUpdateProducto.setLong(5, 0);
            stUpdateProducto.setLong(6, saldo);
            stUpdateProducto.setString(7, "SALDO ANTERIOR");
            stUpdateProducto.executeUpdate();

            //fin saldo inicial bancario
            ps = conexion.prepareStatement(""
                    + "select * from deposito_bancario "
                    + "where fecha >= '" + desde + "' and fecha <= '" + hasta + "' "
                    + "and id_cuenta_bancaria = '" + libro_banco_id_cuenta_bancaria + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                id = id + 1;
                stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_libro_banco VALUES(?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setDate(2, rs.getDate("fecha"));
                stUpdateProducto.setString(3, rs.getString("numero"));
                stUpdateProducto.setLong(4, 0);
                stUpdateProducto.setLong(5, rs.getLong("monto"));
                stUpdateProducto.setLong(6, 0);
                stUpdateProducto.setString(7, "DEPOSITO BANCARIO");
                stUpdateProducto.executeUpdate();
            }
            ps = conexion.prepareStatement(""
                    + "select * from cheque "
                    + "inner join proveedor on proveedor.id_proveedor = cheque.id_proveedor "
                    + "where fecha >= '" + desde + "' and fecha <= '" + hasta + "' "
                    + "and id_cuenta_bancaria = '" + libro_banco_id_cuenta_bancaria + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                id = id + 1;
                stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_libro_banco VALUES(?,?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setDate(2, rs.getDate("fecha"));
                stUpdateProducto.setString(3, rs.getString("numero"));
                stUpdateProducto.setLong(4, rs.getLong("importe"));
                stUpdateProducto.setLong(5, 0);
                stUpdateProducto.setLong(6, 0);
                stUpdateProducto.setString(7, "CHEQUE ");
                stUpdateProducto.setString(8, rs.getString("nombre").trim());
                stUpdateProducto.executeUpdate();
            }
            ps = conexion.prepareStatement(""
                    + "select * from transferencia "
                    + "inner join proveedor on proveedor.id_proveedor = transferencia.id_proveedor "
                    + "where fecha >= '" + desde + "' and fecha <= '" + hasta + "' "
                    + "and id_cuenta_bancaria = '" + libro_banco_id_cuenta_bancaria + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                id = id + 1;
                stUpdateProducto = conexion.prepareStatement("INSERT INTO imprimir_libro_banco VALUES(?,?,?,?,?,?,?,?)");
                stUpdateProducto.setInt(1, id);
                stUpdateProducto.setDate(2, rs.getDate("fecha"));
                stUpdateProducto.setString(3, rs.getString("numero"));
                if (rs.getLong("importe") > 0) {
                    stUpdateProducto.setLong(4, 0);
                    stUpdateProducto.setLong(5, (rs.getLong("importe")));
                } else {
                    stUpdateProducto.setLong(4, rs.getLong("importe") * -1);
                    stUpdateProducto.setLong(5, 0);
                }
                stUpdateProducto.setLong(6, 0);
                stUpdateProducto.setString(7, "TRANSFERENCIA BANCARIA");
                stUpdateProducto.setString(8, rs.getString("nombre").trim());
                stUpdateProducto.executeUpdate();
            }
            saldo = 0;
            Statement st12 = conexion.createStatement();
            ResultSet result2 = st12.executeQuery(""
                    + "SELECT * FROM imprimir_libro_banco "
                    + "order by fecha ASC, id ");
            while (result2.next()) {
                saldo = saldo + result2.getLong("saldo_actual") - result2.getLong("debito") + result2.getLong("credito");
                PreparedStatement Update2 = conexion.prepareStatement(""
                        + "UPDATE imprimir_libro_banco "
                        + "SET saldo_actual = '" + saldo + "' "
                        + "WHERE id ='" + result2.getLong("id") + "'");
                Update2.executeUpdate();
            }
            Map parametros = new HashMap();
            parametros.put("desde", desde);
            parametros.put("hasta", hasta);
            parametros.put("empresa", empresa);
            parametros.put("cuenta", cuenta_bancaria);

            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path + "libro_banco.jasper");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
