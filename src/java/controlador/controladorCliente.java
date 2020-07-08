package controlador;

import clases.Comprobante;
import clases.EstadoDeVehiculo;
import clases.EstadoReservacion;
import clases.Reservacion;
import clases.TipoDeVehiculo;
import clases.Vehiculo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class controladorCliente {
    public static Vehiculo[] GetVehiculosDisponibles(Connection cnx)
    {
        String sql = "select e.ESTADO, v.PATENTE, v.MARCA, v.MODELO, t.\"TIPO_DE_VEHÍCULO\" from \"VEHÍCULO\" v join \"TIPO_DE_VEHÍCULO\" t on (v.\"TIPO_DE_VEHÍCULO_ID_TIPO_DE_VEHÍCULO\" = t.\"ID_TIPO_DE_VEHÍCULO\") join ESTADO e on (v.ESTADO_ID_ESTADO = e.ID_ESTADO) WHERE e.ID_ESTADO = 1"; 
        String sqlCount = "select count(*) from \"VEHÍCULO\" v join \"TIPO_DE_VEHÍCULO\" t on (v.\"TIPO_DE_VEHÍCULO_ID_TIPO_DE_VEHÍCULO\" = t.\"ID_TIPO_DE_VEHÍCULO\") join ESTADO e on (v.ESTADO_ID_ESTADO = e.ID_ESTADO) WHERE e.ID_ESTADO = 1";
        Statement st = null;
        ResultSet rs = null;
        Vehiculo[] resultado = null;
        int indiceArray=0;        
        
        try{
            st = cnx.createStatement();
            rs = st.executeQuery(sqlCount);
            
            while(rs.next()){
            indiceArray = rs.getInt(1);
                }              
            }
        catch (SQLException e) 
        {
            System.out.println("Error al obtener cantidad de filas \n" + e.getMessage());
        }        
    try {
            st = cnx.createStatement();
            rs = st.executeQuery(sql);                  
            resultado = new Vehiculo[indiceArray];
            
            int count = 0;
            while(rs.next()){
                Vehiculo vehiculo = new Vehiculo();   
                    EstadoDeVehiculo estadoDeVehiculo = new EstadoDeVehiculo();
                    estadoDeVehiculo.setEstadoVehiculo(rs.getString(1));
                vehiculo.setEstadoDeVehiculo(estadoDeVehiculo);
                vehiculo.setPatente(rs.getString(2)); 
                vehiculo.setPatente(rs.getString(3)); 
                vehiculo.setPatente(rs.getString(4)); 
                    TipoDeVehiculo tipoDeVehiculo = new TipoDeVehiculo();
                    tipoDeVehiculo.setTipoDeVehiculo(rs.getString(5));
                vehiculo.setTipoDeVehiculo(tipoDeVehiculo);
                resultado[count] = vehiculo;
                count = count + 1;                
            }
            return resultado;
        }  
        catch (SQLException e) 
        {
            System.out.println("Error al obtener datos \n" + e.getMessage());
        }
    return resultado;
    }
    
    public static String[] ReservarVehiculo(Connection cnx, Reservacion reservacion)
    {  
        String[] resultado = new String[2];
        try {        
            CallableStatement cst = cnx.prepareCall("{call ReservarVehiculo(?,?,?,?)}");  
            cst.setString(1, reservacion.getVehiculo().getPatente());
            cst.setDate(2, reservacion.getFechaEntrega());
            cst.setDate(3, reservacion.getFechaDevolucion());
            cst.setString(4, reservacion.getUsuarioRut());
                        
            cst.execute();
            resultado[0] = "True";
            resultado[1] = "Reservación exitosa";
            return resultado;
        }   
        catch (SQLException ex)        
        {
            resultado[0] = "False";
            resultado[1] = "Error en guardar reservación";
            return resultado;
        }
    }
    
    public static Reservacion[] GetReservaciones(Connection cnx, String rut)
    {
        String sql = "select e.ESTADO_RESERVACION, r.ID_RESERVACION, v.PATENTE, v.MARCA, v.MODELO, t.\"TIPO_DE_VEHÍCULO\", r.FECHA_ENTREGA, r.FECHA_DEVOLUCION, r.COMPROBANTE_ID_COMPROBANTE from RESERVACIONES r join \"VEHÍCULO\" v on (r.\"VEHÍCULO_PATENTE\" = v.PATENTE) join ESTADO_DE_RESERVACION e on (r.ESTADO_DE_RESERVACION_ID_ESTADO_RESERVACION = e.ID_ESTADO_RESERVACION) join \"TIPO_DE_VEHÍCULO\" t on (v.\"TIPO_DE_VEHÍCULO_ID_TIPO_DE_VEHÍCULO\" = t.\"ID_TIPO_DE_VEHÍCULO\") WHERE USUARIO_RUT = '"+rut+"'"; 
        String sqlCount = "select count(*) from RESERVACIONES r join \"VEHÍCULO\" v on (r.\"VEHÍCULO_PATENTE\" = v.PATENTE) join ESTADO_DE_RESERVACION e on (r.ESTADO_DE_RESERVACION_ID_ESTADO_RESERVACION = e.ID_ESTADO_RESERVACION) join \"TIPO_DE_VEHÍCULO\" t on (v.\"TIPO_DE_VEHÍCULO_ID_TIPO_DE_VEHÍCULO\" = t.\"ID_TIPO_DE_VEHÍCULO\") WHERE USUARIO_RUT = '"+rut+"'";
        Statement st = null;
        ResultSet rs = null;
        Reservacion[] resultado = null;
        int indiceArray=0;        
        
        try{
            st = cnx.createStatement();
            rs = st.executeQuery(sqlCount);
            
            while(rs.next()){
            indiceArray = rs.getInt(1);
                }              
            }
        catch (SQLException e) 
        {
            System.out.println("Error al obtener cantidad de filas \n" + e.getMessage());
        }        
    try {
            st = cnx.createStatement();
            rs = st.executeQuery(sql);                  
            resultado = new Reservacion[indiceArray];
            
            int count = 0;
            while(rs.next()){
                Reservacion reservacion = new Reservacion();   
                    EstadoReservacion estadoReservacion = new EstadoReservacion();
                    estadoReservacion.setEstadoReservacion(rs.getString(1));
                reservacion.setEstadoReservacion(estadoReservacion);
                reservacion.setIdReservacion(rs.getInt(2));
                    Vehiculo vehiculo = new Vehiculo();
                    vehiculo.setPatente(rs.getString(3));
                    vehiculo.setMarca(rs.getString(4));
                    vehiculo.setModelo(rs.getString(5));
                        TipoDeVehiculo tipoDeVehiculo = new TipoDeVehiculo();
                        tipoDeVehiculo.setTipoDeVehiculo(rs.getString(6));
                    vehiculo.setTipoDeVehiculo(tipoDeVehiculo);
                reservacion.setVehiculo(vehiculo);
                reservacion.setFechaEntrega(rs.getDate(7));
                reservacion.setFechaDevolucion(rs.getDate(8));
                reservacion.setIdComprobante(rs.getInt(9));
                resultado[count] = reservacion;
                count = count + 1;                
            }
            return resultado;
        }  
        catch (SQLException e) 
        {
            System.out.println("Error al obtener datos \n" + e.getMessage());
            resultado = null;
        }
    return resultado;
    }
    
    public static Comprobante[] GetComprobantes(Connection cnx, String rut)
    {
        String sql = "select c.ID_COMPROBANTE, r.ID_RESERVACION, r.\"VEHÍCULO_PATENTE\",r.FECHA_ENTREGA, r.FECHA_DEVOLUCION, r.USUARIO_RUT from RESERVACIONES r join COMPROBANTE c on (r.COMPROBANTE_ID_COMPROBANTE = c.ID_COMPROBANTE) WHERE r.USUARIO_RUT = '"+rut+"'"; 
        String sqlCount = "select count(*) from RESERVACIONES r join COMPROBANTE c on (r.COMPROBANTE_ID_COMPROBANTE = c.ID_COMPROBANTE) WHERE r.USUARIO_RUT = '"+rut+"'";
        Statement st = null;
        ResultSet rs = null;
        Comprobante[] resultado = null;
        int indiceArray=0;        
        
        try{
            st = cnx.createStatement();
            rs = st.executeQuery(sqlCount);
            
            while(rs.next()){
            indiceArray = rs.getInt(1);
                }              
            }
        catch (SQLException e) 
        {
            System.out.println("Error al obtener cantidad de filas \n" + e.getMessage());
        }        
    try {
            st = cnx.createStatement();
            rs = st.executeQuery(sql);                  
            resultado = new Comprobante[indiceArray];
            
            int count = 0;
            while(rs.next()){
                Comprobante comprobante = new Comprobante();   
                comprobante.setIdComprobante(rs.getInt(1));
                comprobante.setIdReservacion(rs.getInt(2));
                comprobante.setPatente(rs.getString(3));
                comprobante.setFechaEntrega(rs.getDate(4));
                comprobante.setFechaDevolucion(rs.getDate(5));
                comprobante.setUsuarioRut(rs.getString(6));
                resultado[count] = comprobante;
                count = count + 1;                
            }
            return resultado;
        }  
        catch (SQLException e) 
        {
            System.out.println("Error al obtener datos \n" + e.getMessage());
            resultado = null;
        }
    return resultado;
    }
}
