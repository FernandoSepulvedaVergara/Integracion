package controlador;

import clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class controladorLoginRegister {
    
    public static String[] ValidarUsuarioProveedor(Connection cnx,String email, String contraseña)
    {
        String sql = "select * from usuario WHERE EMAIL = '"+email+"' and \"CONTRASEÑA\" = '"+contraseña+"'";       
        Statement st = null;
        ResultSet rs = null;
    
        try {
            st = cnx.createStatement();
            rs = st.executeQuery(sql);
            String[] resultado = new String[8];
            while (rs.next()) {                
            resultado[0] = rs.getString(1);
            resultado[1] = rs.getString(2);
            resultado[2] = rs.getString(3);
            resultado[3] = rs.getString(4);
            resultado[4] = rs.getString(5);
            resultado[5] = rs.getString(6);
            resultado[6] = rs.getString(7);
            resultado[7] = rs.getString(8);
        }                          
        return resultado;  
        }  
    catch (SQLException e) 
        {
        System.out.println("Error al obtener datos \n" + e.getMessage());
        return null;
        }        
    }
    
    public static String[] RegistrarNuevoUsuario(Connection cnx,Usuario nuevoUsuario)
    {
        String[] resultado = new String[2];
        try {
            PreparedStatement pst = cnx.prepareStatement("insert into usuario "
                    + "VALUES(?,?,?,?,?,?,?,?)");
            pst.setString(1, nuevoUsuario.getRut());
            pst.setString(2, nuevoUsuario.getNombre());
            pst.setString(3, nuevoUsuario.getApellidoPaterno());
            pst.setString(4, nuevoUsuario.getApellidoMaterno());
            pst.setInt(5, nuevoUsuario.getTelefono());
            pst.setString(6, nuevoUsuario.getEmail());
            pst.setString(7, nuevoUsuario.getContraseña());
            pst.setInt(8, nuevoUsuario.getIdTipoDeUsuario());
            pst.execute();
            resultado[0] = "True";
            resultado[1] = "Usuario guadado con éxito";
        } catch (SQLException ex) {
            resultado[0] = "False";
            resultado[1] = "Error al guardar nuevo usuario";
        }        
        return resultado;
    }
}
