/***************************************
 * Clase Alimento Hereda de Donativo
 **************************************/

public class Alimentos extends Donativo {
    // Cambiar a protected en caso de herencia.
    private String tipo;
    private int caducidad;
    private boolean refrigeracion;

    // Constructor
    public Alimentos(String direccion, int cantidad, String tipo, int caducidad, boolean refrigeracion) {
        super(direccion, cantidad);
        this.tipo = tipo;
        this.caducidad = caducidad;
        this.refrigeracion = refrigeracion;
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