
package company.u2.agenciavuelos;


public abstract class vuelo {
    protected String tipoVuelo;  
    protected String claseAsiento;  
    protected double costoBase;  

    public vuelo(String tipoVuelo, String claseAsiento) {
        this.tipoVuelo = tipoVuelo;
        this.claseAsiento = claseAsiento;
        this.costoBase = calcularCostoBase();
    }

    public abstract double calcularCostoBase();

    public double calcularCostoTotal(int cantidadPasajeros) {
        return costoBase * cantidadPasajeros;
    }

    // Getters y Setters
    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public String getClaseAsiento() {
        return claseAsiento;
    }

    public double getCostoBase() {
        return costoBase;
    }
    
}
