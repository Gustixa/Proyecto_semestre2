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

    //Constructor
    public Donativo(String direccion, int cantidad){
        this.direccion = direccion;
        this.cantidad = cantidad;
    }

    //Getters
    public String getDireccion(){
        return direccion;
    }

    public int getCantidad(){
        return cantidad;
    }

}
