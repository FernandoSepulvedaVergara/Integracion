package clases;

public class Vehiculo {
    
    private String patente;
    private TipoDeVehiculo tipoDeVehiculo;
    private EstadoDeVehiculo estadoDeVehiculo;
    private String marca;
    private String modelo;

    public Vehiculo(String patente, TipoDeVehiculo tipoDeVehiculo, EstadoDeVehiculo estadoDeVehiculo, String marca, String modelo) {
        this.patente = patente;
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.estadoDeVehiculo = estadoDeVehiculo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo() {
        this.patente = null;
        this.tipoDeVehiculo = null;
        this.estadoDeVehiculo = null;
        this.marca = null;
        this.modelo = null;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public TipoDeVehiculo getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(TipoDeVehiculo tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public EstadoDeVehiculo getEstadoDeVehiculo() {
        return estadoDeVehiculo;
    }

    public void setEstadoDeVehiculo(EstadoDeVehiculo estadoDeVehiculo) {
        this.estadoDeVehiculo = estadoDeVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
