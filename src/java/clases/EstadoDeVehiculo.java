package clases;

public class EstadoDeVehiculo {
    
    private int idEstadoDeVehiculo;
    private String estadoVehiculo;

    public EstadoDeVehiculo(int idEstadoDeVehiculo, String estadoVehiculo) {
        this.idEstadoDeVehiculo = idEstadoDeVehiculo;
        this.estadoVehiculo = estadoVehiculo;
    }

    public EstadoDeVehiculo() {
        this.idEstadoDeVehiculo = 0;
        this.estadoVehiculo = null;
    }

    public int getIdEstadoDeVehiculo() {
        return idEstadoDeVehiculo;
    }

    public void setIdEstadoDeVehiculo(int idEstadoDeVehiculo) {
        this.idEstadoDeVehiculo = idEstadoDeVehiculo;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }
    
    
}
