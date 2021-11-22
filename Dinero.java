/**
 * Clase Dinero, su funcion es poder simular un donativo de tipo monetario.
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Dinero extends Donativo {
    // Cambiar a protected en caso de herencia.
    private boolean efectivo;

    /**
     * Constructor de la clase Dinero
     * 
     * @param cantidad: int
     * @param efectivo: boolean
     */
    public Dinero(String[] detalles_producto) {
        super(detalles_producto[0], detalles_producto[2]);
        this.efectivo = Boolean.parseBoolean(detalles_producto[1]);
    }

    /**
     * Metodo que devuelve si es un donativo en efectivo o no.
     * 
     * @return efectivo: boolean
     */
    public boolean getEfectivo() {
        return efectivo;
    }

}
