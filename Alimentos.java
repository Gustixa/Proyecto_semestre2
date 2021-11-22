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

    /**
     * Constructor de la clase Alimentos
     * 
     * @param cantidad:  int
     * @param tipo:      String
     * @param caducidad: int
     */
    public Alimentos(String[] detalles_producto) {
        super(Integer.parseInt(detalles_producto[0]), Integer.parseInt(detalles_producto[2]));
        this.tipo = detalles_producto[1];
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
     * 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     */

}