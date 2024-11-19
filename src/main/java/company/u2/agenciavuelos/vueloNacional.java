
package company.u2.agenciavuelos;

/**
 *
 * @author camper
 */
public class vueloNacional extends vuelo{
    public vueloNacional(String claseAsiento) {
        super("Nacional", claseAsiento);
    }

    @Override
    public double calcularCostoBase() {
        if ("Económica".equals(claseAsiento)) {
            return 100;  // Costo para un vuelo nacional en clase económica
        } else if ("Ejecutiva".equals(claseAsiento)) {
            return 250;  // Costo para un vuelo nacional en clase ejecutiva
        }
        return 0;
    }
    
}
