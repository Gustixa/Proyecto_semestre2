/**
 * Clase Ropa Clase que hereda de Donativo
 * 
 * @author Luis Montenegro
 * @since
 * @version 1.0
 */

public class Ropa extends Donativo {
    // Cambiar a protected en caso de herencia.
    private String tipoPrenda;
    private int paraEdad;

    /**
     * Constructor de la clase Ropa
     * 
     * @param direccion  variable que almacena la direccion donde se va a recoger la
     *                   donacion
     * @param cantidad   variable donde se almacena la cantidad del producto que se
     *                   va a donar
     * @param tipoPrenda nos indica el tipo de prenda que se esta donando (pantalon,
     *                   camisa, etc)
     * @param paraEdad   nos indica para que edad es la prenda donada
     */
    public Ropa(String[] detalles_producto) {
        super(Integer.parseInt(detalles_producto[0]), Integer.parseInt(detalles_producto[2]));
        this.tipoPrenda = detalles_producto[1];
        this.paraEdad = Integer.parseInt(detalles_producto[4]);
    }

    /**
     * Getter para la variable tipoPrenda
     * 
     * @return
     */
    public String getTipoPrenda() {
        return tipoPrenda;
    }

    /**
     * Getter para la variable paraEdad
     * 
     * @return
     */
    public int getParaEdad() {
        return paraEdad;
    }

    private void guaradar_info() {
        Archivos guardar = new Archivos();

    }
}
