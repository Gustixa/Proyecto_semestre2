/**********************************
 * Clase Ropa Clase que hereda de Donativo
 *********************************/
public class Ropa extends Donativo {
    // Cambiar a protected en caso de herencia.
    private String tipoPrenda;
    private int paraEdad;

    // Constructor
    public Ropa(String direccion, int cantidad) {
        super(direccion, cantidad);
    }

    // Getters
    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public int getParaEdad() {
        return paraEdad;
    }
}
