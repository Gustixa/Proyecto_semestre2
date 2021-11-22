/**
 * Clase Ropa Clase que hereda de Donativo
 * 
 * @author Luis Montenegro, Samuel Argueta
 * @since
 * @version 1.0
 */

public class Ropa extends Donativo {
    // Cambiar a protected en caso de herencia.
    private String tipoPrenda;
    private String paraEdad;

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
        super(detalles_producto[0], detalles_producto[2]);
        this.tipoPrenda = detalles_producto[1];
        this.paraEdad = detalles_producto[4];
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
    public String getParaEdad() {
        return paraEdad;
    }

    /**
     * Método que alamacena todo la información en un archivo.
     */
    private void guardar() {
        String[] data = new String[4];
        data[0] = tipoPrenda;
        data[1] = cantidad;
        data[2] = zonaADejar;
        data[3] = paraEdad;
        new Archivos().almacenar_data("Doanciones", data);
    }
}
