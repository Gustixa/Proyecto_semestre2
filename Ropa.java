/**
 * Clase Ropa Clase que hereda de Donativo
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Ropa extends Donativo {
    // Cambiar a protected en caso de herencia.
    private String tipoPrenda;
    private int paraEdad;

    // Constructor
    public Ropa(String direccion, int cantidad, String tipoPrenda, int paraEdad) {
        super(direccion, cantidad);
        this.tipoPrenda = tipoPrenda;
        this.paraEdad = paraEdad;
    }

    // Getters
    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public int getParaEdad() {
        return paraEdad;
    }
}
