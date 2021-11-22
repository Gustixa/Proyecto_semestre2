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
    protected int cantidad_productos = 0;

    /**
     * Implementación del método envio producto, de la interfaz Envio. Devuelve un
     * toString.
     */
    @Override
    public String envio_producto() {
        String texto = "Se esta enviando el producto...";
        return texto;
    }

    /**
     * Implementación del método entrega producto, de la interfaz Entrega. Devuelve
     * un toString
     */
    @Override
    public String entrega_producto() {
        String texto = "Producto entregado!";
        return texto;
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

    /**
     * 
     */
    public void setCantidad_producto(int producto_recivido) {
        this.cantidad_productos += producto_recivido;
    }

    /**
     * 
     */
    public int getCantidad_producto() {
        return this.cantidad_productos;
    }

}
