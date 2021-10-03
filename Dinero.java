/**
 * Clase Dinero Clase que hereda de Donativo
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Dinero extends Donativo {
    // Cambiar a protected en caso de herencia.
    private boolean efectivo;

    // Constructor
    public Dinero(String direccion, int cantidad, boolean efectivo) {
        super(direccion, cantidad);
        this.efectivo = efectivo;
    }

    // Getter
    public boolean getEfectivo() {
        return efectivo;
    }

}
