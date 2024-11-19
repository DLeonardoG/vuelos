
package company.u2.agenciavuelos;

/**
 * Esto mero ambiente@Camper
 */
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reserva reserva = null;

        while (true) {
            System.out.println("\n*** Sistema de Gestión de Reservas de Vuelo ***");
            System.out.println("1. Crear nueva reserva");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Ver costo total");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:  // Este crea una nueva reserva.............
                    System.out.print("Ingrese tipo de vuelo (Nacional/Internacional): ");
                    String tipoVuelo = scanner.nextLine();
                    System.out.print("Ingrese clase de asiento (Económica/Ejecutiva): ");
                    String claseAsiento = scanner.nextLine();
                    System.out.print("Ingrese cantidad de pasajeros: ");
                    int cantidadPasajeros = scanner.nextInt();

                    // Crea los vuelos por opcciones del usuario......................
                    vuelo vuelo = null;
                    if ("Nacional".equalsIgnoreCase(tipoVuelo)) {
                        vuelo = new vueloNacional(claseAsiento);
                    } else if ("Internacional".equalsIgnoreCase(tipoVuelo)) {
                        vuelo = new vueloInternacional(claseAsiento);
                    }

                    if (vuelo != null) {
                        reserva = new Reserva(vuelo, cantidadPasajeros);
                        System.out.println("Reserva creada.");
                    } else {
                        System.out.println("Tipo de vuelo no válido.");
                    }
                    break;

                case 2:  // Se realiza una vez creada la reserva, para finalizarla ó...............
                    if (reserva != null) {
                        reserva.realizarReserva();
                    } else {
                        System.out.println("Primero debe crear una reserva.");
                    }
                    break;

                case 3:  // Canacela la reserva que se va creando hasta el momento
                    if (reserva != null) {
                        reserva.cancelarReserva();
                    } else {
                        System.out.println("Primero debe crear una reserva.");
                    }
                    break;

                case 4:  // Ver el costo de la reserva actual generada...................
                    if (reserva != null && reserva.isRealizada()) {
                        System.out.println("El costo total de la reserva es: $" + reserva.calcularCostoTotal());
                    } else {
                        System.out.println("Debe realizar la reserva antes de ver el costo.");
                    }
                    break;

                case 5:  // Salir............
                    System.out.println("Gracias por usar el sistema.");
                    return;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}

