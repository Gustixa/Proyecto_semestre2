/***************************************
 * Clase Alimento Hereda de Donativo
 **************************************/

public class Alimentos extends Donativo {
    // Cambiar a protected en caso de herencia.
    private String tipo;
    private int caducidad;
    private boolean refrigeracion;

    // Constructor
    public Alimentos(String direccion, int cantidad) {
        super(direccion, cantidad);
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public int getCaducacion() {
        return caducidad;
    }

    public boolean getRefrigeracion() {
        return refrigeracion;
    }
}