/**
 * Clase Donativo Clase madre que le hereda a Alimentos, Dinero y Ropa
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Donativo {
    protected int cantidad;

    /**
     * Constructor de la clase Donativo
     * 
     * @param cantidad:  int
     */
    public Donativo(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo que devuelve la cantidad del donativo.
     * 
     * @return cantidad: int
     */
    public int getCantidad() {
        return cantidad;
    }

}
