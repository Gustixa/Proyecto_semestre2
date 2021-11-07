import java.io.IOException;

/**
 * Método que realiza las conexiones necesarias para poder obtener y devolver la
 * inforamción necesario según sea el caso. Esta es la clase Controlador,
 * siguiendo la metodología M-V-C
 * 
 * @author Josúe Argueta, Melanie Maldonado y Esteban Donis
 * @since
 * @version 1.0
 */
public class Principal {
    // Cambiar de tipo global a local, en caso de ser necesario.
    private static Interaccion vista = new Interaccion();

    /**
     * Metodo principal del programa, aqui es donde se corren todos los programas
     * 
     * @param args: String[]
     */
    public static void main(String[] args) throws IOException, InterruptedException {

        byte opcion = 0;
        // Modificar el valor según sea la modificación futura.
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        vista.bienvenida();
        do {
            opcion = vista.seleccion(Byte.parseByte("4"), "Menu donativos");
            // Agregar mas opciones segun se considere
            switch (opcion) {
            case 1:
                // Donativo de comida.
                donacion("Alimentos");

                break;
            case 2:
                // Donativo de vestimenta.
                donacion("Vestuario");
                break;
            case 3:
                // Donativo en efectivo.
                donacion("dinero");
                break;
            default:
                // Salir del menu principal.
                vista.despedida();
                break;
            }
        } while (opcion != 4);
    }

    /**
     * Metodo que nos sirve para definir que tipo de donacion se hara
     * 
     * @param donacion: String
     */
    private static void donacion(String nombre_archivo) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Donativo tipo;
        if (nombre_archivo.equals("Alimentos")) {
            // Obtener los productos que se requiere y sean donador
            seleccion_producto(nombre_archivo);
        } else if (nombre_archivo.equals("Vestuario")) {
            seleccion_producto(nombre_archivo);
        }
    }

    private static void seleccion_producto(String nombre_archivo) {
        Archivos donativos = new Archivos();
        int cantidad_productos = donativos.leer_CSV(nombre_archivo); // Retoran la cantidad de los productos
        int donativo_seleccion = vista.verificacion_productos(cantidad_productos);
        String producto = donativos.donativo_detalle(donativo_seleccion, "producto", nombre_archivo);
        System.out.println(producto);

    }
}