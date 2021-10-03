/**
 * Método que realiza las conexiones necesarias para poder obtener y devolver la
 * inforamción necesario según sea el caso. Esta es la clase Controlador,
 * siguiendo la metodología M-V-C
 * 
 * @author
 * @since
 * @version 1.0
 */
public class Principal {
    // Cambiar de tipo global a local, en caso de ser necesario.
    private static Interaccion vista = new Interaccion();
    private static Donativo tipo;

    public static void main(String[] args) {
        vista.bienvenida();
        byte opcion = 0;
        // Modificar el valor según sea la modificación futura.
        while (opcion != 4) {
            opcion = vista.seleccion(Byte.parseByte("4"), "Principal");
            // Agregar mas opciones segun se considere
            switch (opcion) {
                case 1:
                    // Donativo de comida.
                    alimentos();
                    break;
                case 2:
                    // Donativo de vestimenta.
                    vestimenta();
                    break;
                case 3:
                    // Donativo en efectivo.
                    monetario();
                    break;
                default:
                    // Salir del menu principal.
                    vista.despedida();
                    break;
            }
        }
    }

    private static void alimentos() {
        int cantidad = vista.cantidad("comida");
        // tipo = new Alimentos(direccion, cantidad);
    }

    private static void vestimenta() {
        int cantidad = vista.cantidad("ropa");
        // tipo = new Ropa(direccion, cantidad);
    }

    private static void monetario() {
        int cantidad = vista.cantidad("dinero");
        // tipo = new Dinero(direccion, cantidad);
    }
}