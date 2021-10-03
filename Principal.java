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
    private static Interaccion vista = new Interaccion();

    public static void main(String[] args) {
        vista.bienvenida();
        byte opcion = 0;
        // Modificar el valor según sea la modificación futura.
        while (opcion != 4) {
            opcion = vista.seleccion(Byte.parseByte("3"));
            // Agregar mas opciones segun se considere
            switch (opcion) {
                case 1:
                    // Donativo de comida.

                    break;
                case 2:
                    // Donativo de vestimenta.

                    break;
                case 3:
                    // Donaitvo en efectivo.

                    break;
                default:
                    // Salir del menu principal.
                    vista.despedida();
                    break;
            }
        }
    }
}