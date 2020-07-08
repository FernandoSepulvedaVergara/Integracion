package clases;

public class Usuario {
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int telefono;
    private String email;
    private String contraseña;
    private int idTipoDeUsuario;

    public Usuario(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int telefono, String email, String contraseña, int idTipoDeUsuario) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
        this.idTipoDeUsuario = idTipoDeUsuario;
    }

    public Usuario() {
        this.rut = null;
        this.nombre = null;
        this.apellidoPaterno = null;
        this.apellidoMaterno = null;
        this.telefono = 0;
        this.email = null;
        this.contraseña = null;
        this.idTipoDeUsuario = 1;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIdTipoDeUsuario() {
        return idTipoDeUsuario;
    }

    public void setIdTipoDeUsuario(int idTipoDeUsuario) {
        this.idTipoDeUsuario = idTipoDeUsuario;
    }
    
    
    
}
