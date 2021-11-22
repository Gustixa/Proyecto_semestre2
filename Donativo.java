import java.util.ArrayList;

/**
 * Clase Donativo Clase madre que le hereda a Alimentos, Dinero y Ropa
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Donativo implements Envio, Entrega {
    protected String zonaADejar;
    protected String cantidad;
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
    public Donativo(String cantidad, String zona) {
        this.cantidad = cantidad;
        this.zonaADejar = zona;
    }

    /**
     * Metodo que devuelve la cantidad del donativo.
     * 
     * @return cantidad: int
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Método que devuelve la cantidad del producto a donar.
     * 
     * @param cantidad
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Método que devuelve la zona en donde se deben dejar los proudctos.
     * 
     * @return
     */
    public String getZonaADejar() {
        return zonaADejar;
    }

    /**
     * Método que modifica el valor de la zona a dejar el producto.
     * 
     * @param zonaADejar
     */
    public void setZonaADejar(String zonaADejar) {
        this.zonaADejar = zonaADejar;
    }

    /**
     * Método que altera el valor de la cantidad de los productos.
     */
    public void setCantidad_producto(int producto_recivido) {
        this.cantidad_productos += producto_recivido;
    }

    /**
     * Método que devuelve el valor de la cantidad de los productos
     */
    public int getCantidad_producto() {
        return this.cantidad_productos;
    }

}
