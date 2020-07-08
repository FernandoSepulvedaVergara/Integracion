package clases;

public class EstadoReservacion {
    private int idEstadoReservacion;
    private String estadoReservacion;

    public EstadoReservacion(int idEstadoReservacion, String estadoReservacion) {
        this.idEstadoReservacion = idEstadoReservacion;
        this.estadoReservacion = estadoReservacion;
    }

    public EstadoReservacion() {
        this.idEstadoReservacion = 0;
        this.estadoReservacion = null;
    }

    public int getIdEstadoReservacion() {
        return idEstadoReservacion;
    }

    public void setIdEstadoReservacion(int idEstadoReservacion) {
        this.idEstadoReservacion = idEstadoReservacion;
    }

    public String getEstadoReservacion() {
        return estadoReservacion;
    }

    public void setEstadoReservacion(String estadoReservacion) {
        this.estadoReservacion = estadoReservacion;
    }
    
    
}
