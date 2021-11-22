/**
 * Clase Alimento Hereda de Donativo
 * 
 * @author Luis Montenegro, Samuel Argueta.
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
        super(detalles_producto[0], detalles_producto[2]);
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
     * Método que modifica el tipo de daontivo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método que alamacena todo la información en un archivo.
     */
    private void guardar() {
        String[] data = new String[3];
        data[0] = tipo;
        data[1] = cantidad;
        data[2] = zonaADejar;
        new Archivos().almacenar_data("Doanciones", data);
    }

}