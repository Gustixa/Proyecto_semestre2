/**
 * Clase Donativo
 * Clase madre que le hereda a Alimentos, Dinero y Ropa
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
     * @param direccion variable que almacena la direccion donde se va a recoger la donacion
     * @param cantidad variable donde se almacena la cantidad del producto que se va a donar
     */
    public Donativo(String direccion, int cantidad){
        this.direccion = direccion;
        this.cantidad = cantidad;
    }

    /**
     * Getter de la variable direccion
     * @return
     */
    public String getDireccion(){
        return direccion;
    }

    /**
     * Getter de la variable cantidad
     * @return
     */
    public int getCantidad(){
        return cantidad;
    }

}
