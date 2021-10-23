/**
 * Clase Alimento Hereda de Donativo
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Alimentos extends Donativo {
    // Cambiar a protected en caso de herencia.
    private String tipo; // para el tipo de alimento.
    private int caducidad;// Tiempo que tiene antes de vencer.

    /**
     * Constructor de la clase Alimentos
     * 
     * @param direccion:     String
     * @param cantidad:      int
     * @param tipo:          String
     * @param caducidad:     int
     */
    public Alimentos(String direccion, int cantidad, String tipo, int caducidad) {
        super(direccion, cantidad);
        this.tipo = tipo;
        this.caducidad = caducidad;
    }

    /**
     * Metodo que retorna el tipo de alimento.
     * 
     * @return tipo: String
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo que retorna el tiempo de caducidad.
     * 
     * @return caducidad: int
     */
    public int getCaducacion() {
        return caducidad;
    }
}