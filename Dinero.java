/*************************************
 * Clase Dinero Clase que hereda de Donativo
 ************************************/
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
