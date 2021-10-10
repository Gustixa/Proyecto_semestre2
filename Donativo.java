/**
 * Clase Donativo Clase madre que le hereda a Alimentos, Dinero y Ropa
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Donativo {
    protected String direccion;
    protected int cantidad;

    /**
     * Constructor de la clase Donativo
     * 
     * @param direccion: String
     * @param cantidad:  int
     */
    public Donativo(String direccion, int cantidad) {
        this.direccion = direccion;
        this.cantidad = cantidad;
    }

    /**
     * Metodo que devuelve la direccion.
     * 
     * @return direccion: String
     */
    public String getDireccion() {
        return direccion;
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
