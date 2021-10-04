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

    /**
     * Constructor de la clase Dinero
     * @param direccion variable que almacena la direccion donde se va a recoger la donacion
     * @param cantidad variable donde se almacena la cantidad del producto que se va a donar
     * @param efectivo varible que nos indica si la cantidad sera en efectivo o por transferencia bancaria
     */
    public Dinero(String direccion, int cantidad, boolean efectivo) {
        super(direccion, cantidad);
        this.efectivo = efectivo;
    }

    /**
     * Getter de la variable efectivo
     * @return
     */
    public boolean getEfectivo() {
        return efectivo;
    }

}
