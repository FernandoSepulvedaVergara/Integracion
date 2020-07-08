package clases;

public class TipoDeVehiculo {
    
    private int idTipoDeVehiculo;
    private String tipoDeVehiculo;

    public TipoDeVehiculo(int idTipoDeVehiculo, String tipoDeVehiculo) {
        this.idTipoDeVehiculo = idTipoDeVehiculo;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public TipoDeVehiculo() {
        this.idTipoDeVehiculo = 0;
        this.tipoDeVehiculo = null;
    }

    public int getIdTipoDeVehiculo() {
        return idTipoDeVehiculo;
    }

    public void setIdTipoDeVehiculo(int idTipoDeVehiculo) {
        this.idTipoDeVehiculo = idTipoDeVehiculo;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }
    
    
}
