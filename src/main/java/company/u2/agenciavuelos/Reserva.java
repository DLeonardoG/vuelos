
package company.u2.agenciavuelos;


public class Reserva {
    private vuelo vuelo;
    private int cantidadPasajeros;
    private boolean realizada;

    public Reserva(vuelo vuelo, int cantidadPasajeros) {
        this.vuelo = vuelo;
        this.cantidadPasajeros = cantidadPasajeros;
        this.realizada = false;
    }

    public void realizarReserva() {
        if (!realizada) {
            realizada = true;
            System.out.println("Reserva realizada con éxito.");
        } else {
            System.out.println("La reserva ya fue realizada.");
        }
    }

    public void cancelarReserva() {
        if (realizada) {
            realizada = false;
            System.out.println("Reserva cancelada con éxito.");
        } else {
            System.out.println("No hay ninguna reserva para cancelar.");
        }
    }

    public double calcularCostoTotal() {
        return vuelo.calcularCostoTotal(cantidadPasajeros);
    }

    public vuelo getVuelo() {
        return vuelo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public boolean isRealizada() {
        return realizada;
    }
}

