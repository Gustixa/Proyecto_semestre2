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
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Implementación del método entrega producto, de la interfaz Entrega. Devuelve
     * un toString
     */
    @Override
    public String entrega_producto() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Constructor de la clase Donativo
     * 
     * @param cantidad: int
     */
    public Donativo(int cantidad, int zona) {
        this.cantidad = cantidad;
        zonaADejar = zona;
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

    /**
     * 
     * @return
     */
    public int getZonaADejar() {
        return zonaADejar;
    }

    /**
     * 
     * @param zonaADejar
     */
    public void setZonaADejar(int zonaADejar) {
        this.zonaADejar = zonaADejar;
    }
}
