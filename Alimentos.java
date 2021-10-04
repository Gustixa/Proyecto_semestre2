/**
 * Clase Alimento Hereda de Donativo
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Alimentos extends Donativo {
    // Cambiar a protected en caso de herencia.
    private String tipo;
    private int caducidad;
    private boolean refrigeracion;

    /**
     * Constructor de la clase Alimentos
     * @param direccion variable que almacena la direccion donde se va a recoger la donacion
     * @param cantidad variable donde se almacena la cantidad del producto que se va a donar
     * @param tipo nos indica el tipo de alimento que se va a donar
     * @param caducidad nos indica la cantidad de dias que le quedan al producto
     * @param refrigeracion nos indica si el producto requiere de refrigeracion
     */
    public Alimentos(String direccion, int cantidad, String tipo, int caducidad, boolean refrigeracion) {
        super(direccion, cantidad);
        this.tipo = tipo;
        this.caducidad = caducidad;
        this.refrigeracion = refrigeracion;
    }

    /**
     * Getter de la variable tipo
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Getter de la variable caducacion
     * @return
     */
    public int getCaducacion() {
        return caducidad;
    }

    /**
     * Getter de la variable refrigeracion
     * @return
     */
    public boolean getRefrigeracion() {
        return refrigeracion;
    }
}