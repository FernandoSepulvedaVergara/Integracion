package clases;

import java.sql.Date;

public class Reservacion {
    private int idReservacion;
    private Vehiculo vehiculo;
    private Date fechaEntrega;
    private Date fechaDevolucion;
    private int idComprobante;
    private EstadoReservacion estadoReservacion;
    private String usuarioRut;

    public Reservacion(int idReservacion, Vehiculo vehiculo, Date fechaEntrega, Date fechaDevolucion, int idComprobante, EstadoReservacion estadoReservacion, String usuarioRut) {
        this.idReservacion = idReservacion;
        this.vehiculo = vehiculo;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
        this.idComprobante = idComprobante;
        this.estadoReservacion = estadoReservacion;
        this.usuarioRut = usuarioRut;
    }

    public Reservacion() {
        this.idReservacion = 0;
        this.vehiculo = null;
        this.fechaEntrega = null;
        this.fechaDevolucion = null;
        this.idComprobante = 0;
        this.estadoReservacion = null;
        this.usuarioRut = null;    
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public EstadoReservacion getEstadoReservacion() {
        return estadoReservacion;
    }

    public void setEstadoReservacion(EstadoReservacion estadoReservacion) {
        this.estadoReservacion = estadoReservacion;
    }

    public String getUsuarioRut() {
        return usuarioRut;
    }

    public void setUsuarioRut(String usuarioRut) {
        this.usuarioRut = usuarioRut;
    }
    
    
}
