package clases;

import java.sql.Date;

public class Comprobante {
    private int idComprobante;
    private int idReservacion;
    private String patente;
    private Date fechaEntrega;
    private Date fechaDevolucion;
    private String usuarioRut;

    public Comprobante(int idComprobante, int idReservacion, String patente, Date fechaEntrega, Date fechaDevolucion, String usuarioRut) {
        this.idComprobante = idComprobante;
        this.idReservacion = idReservacion;
        this.patente = patente;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
        this.usuarioRut = usuarioRut;
    }

    public Comprobante() {
        this.idComprobante = 0;
        this.idReservacion = 0;
        this.patente = null;
        this.fechaEntrega = null;
        this.fechaDevolucion = null;
        this.usuarioRut = null;
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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

    public String getUsuarioRut() {
        return usuarioRut;
    }

    public void setUsuarioRut(String usuarioRut) {
        this.usuarioRut = usuarioRut;
    }
}
