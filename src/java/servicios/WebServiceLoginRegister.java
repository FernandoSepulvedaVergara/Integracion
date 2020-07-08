package servicios;

import clases.Usuario;
import controlador.controladorLoginRegister;
import conexion.conexion;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WebServiceLoginRegister")
public class WebServiceLoginRegister {

    @WebMethod(operationName = "ValidarUsuario")
    public String[] hello(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        return controladorLoginRegister.ValidarUsuarioProveedor(conexion.getConnection(),email,password);
    }
    
    @WebMethod(operationName = "RegistrarNuevoUsuario")
    public String[] ReservarVehiculo(@WebParam(name = "rut") String rut, @WebParam(name = "nombre") String nombre,
                                     @WebParam(name = "apellidoPaterno") String apellidoPaterno, @WebParam(name = "apellidoMaterno") String apellidoMaterno,
                                     @WebParam(name = "telefono") int telefono, @WebParam(name = "email") String email,
                                     @WebParam(name = "contraseña") String contraseña) {
        
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setRut(rut);
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setApellidoPaterno(apellidoPaterno);
        nuevoUsuario.setApellidoMaterno(apellidoMaterno);
        nuevoUsuario.setTelefono(telefono);
        nuevoUsuario.setEmail(email);
        nuevoUsuario.setContraseña(contraseña);
        return controladorLoginRegister.RegistrarNuevoUsuario(conexion.getConnection(), nuevoUsuario);
    }
}
