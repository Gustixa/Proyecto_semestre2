/**
 * Clase Donativo Clase madre que le hereda a Alimentos, Dinero y Ropa
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Donativo implements Envio, Entrega {
    protected int zonaADejar;
    protected int cantidad;

    /**
     * Implementación del método envio producto, de la interfaz Envio. Devuelve un
     * toString.
     */
    @Override
    public String envio_producto() {
        return "";
    }

    /**
     * Implementación del método entrega producto, de la interfazz Entrega. Devuelve
     * un toString
     */
    @Override
    public String entrega_producto() {
        return "";
    }

    /**
     * Constructor de la clase Donativo
     * 
     * @param cantidad: int
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

    /**
     * 
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
