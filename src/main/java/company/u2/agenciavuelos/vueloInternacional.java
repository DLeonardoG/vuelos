
package company.u2.agenciavuelos;

/**
 *
 * @author camper
 */
public class vueloInternacional extends vuelo {
    
    public vueloInternacional(String claseAsiento) {
        super("Internacional", claseAsiento);
    }

    @Override
    public double calcularCostoBase() {
        if ("Económica".equals(claseAsiento)) {
            return 300;
        } else if ("Ejecutiva".equals(claseAsiento)) {
            return 600;  // Costo para un vuelo internacional en clase ejecutiva
        }
        return 0;
    }
    
}
