package servicios;

import clases.Comprobante;
import clases.Reservacion;
import clases.Vehiculo;
import com.sun.javafx.geom.Vec2d;
import conexion.conexion;
import controlador.controladorCliente;
import java.sql.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WebServiceCliente")
public class WebServiceCliente {

    @WebMethod(operationName = "GetVehiculosDisponibles")
    public Vehiculo[] GetVehiculosDisponibles() {
        return controladorCliente.GetVehiculosDisponibles(conexion.getConnection());
    }
    
    @WebMethod(operationName = "ReservarVehiculo")
    public String[] ReservarVehiculo(@WebParam(name = "patente") String patente,@WebParam(name = "fechaEntrega") Date fechaEntrega,
                                     @WebParam(name = "fechaDevolucion") Date fechaDevolucion,@WebParam(name = "usuarioRut") String usuarioRut) {
        
        
        Reservacion reservacion = new Reservacion();
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setPatente(patente);
        reservacion.setVehiculo(vehiculo);
        reservacion.setFechaEntrega(fechaEntrega);
        reservacion.setFechaDevolucion(fechaDevolucion);
        reservacion.setUsuarioRut(usuarioRut);
        
        return controladorCliente.ReservarVehiculo(conexion.getConnection(),reservacion);
    }
    
    @WebMethod(operationName = "GetReservaciones")
    public Reservacion[] GetReservaciones(@WebParam(name = "rut") String rut) {
        
        return controladorCliente.GetReservaciones(conexion.getConnection(),rut);
    }
    
    @WebMethod(operationName = "GetComprobantes")
    public Comprobante[] GetComprobantes(@WebParam(name = "rut") String rut) {
        
        return controladorCliente.GetComprobantes(conexion.getConnection(),rut);
    }
}
