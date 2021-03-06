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
        mensaje_de_carga("Procesando", 500);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        vista.bienvenida();
        do {
            opcion = vista.seleccion_opciones_menu("Menu donativos");
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
                donacion("Dinero");
                break;
            default:
                // Salir del menu principal.
                vista.despedida();
                break;
            }
        } while (opcion != 5);

    }

    /**
     * Metodo que nos sirve para definir que tipo de donacion se hara
     * 
     * @param donacion: String
     */
    private static void donacion(String nombre_archivo) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        // Obtener los productos que se requiere y sean donador
        if (nombre_archivo.equals("Alimentos")) {
            seleccion_producto(nombre_archivo);
        } else if (nombre_archivo.equals("Vestuario")) {
            seleccion_producto(nombre_archivo);
        } else if (nombre_archivo.equals("Dinero")) {
            seleccion_producto(nombre_archivo);
        }
    }

    /**
     * 
     * @param nombre_archivo
     * @see vista.detalles_donativo, para poder entender como es que funciona la
     *      obtencion de los datos de cada producto.
     * @see donativo_detalle, sirve para poder obtener el producto puntual que se ha
     *      donado.
     */
    private static void seleccion_producto(String nombre_archivo) throws IOException, InterruptedException {
        Archivos donativos = new Archivos();
        String[] detalles_producto = new String[4];
        Donativo tipo_donativo;
        if (nombre_archivo.equals("Alimentos") || nombre_archivo.equals("Vestuario")) {
            int cantidad_productos = donativos.leer_CSV(nombre_archivo); // Retorna la cantidad de los productos
            // verificar si seleccion esta en rango
            int donativo_seleccion = vista.verificacion_seleccion_productos(cantidad_productos);
            String producto = donativos.donativo_detalle(donativo_seleccion, "producto", nombre_archivo);// obtener
                                                                                                         // producto
            // Obtener los detalles del producto, en la comida, seria la cantidad.
            detalles_producto = vista.detalles_donativo(producto, nombre_archivo);
            // Creacion del Objeto que se esta donando.
            if (detalles_producto[3].equals("Alimentos")) {
                tipo_donativo = new Alimentos(detalles_producto);
                tipo_donativo.setCantidad_producto(1);
                int productos_recibidos = tipo_donativo.getCantidad_producto();
                if (productos_recibidos == 20) {
                    tipo_donativo.envio_producto();
                    for (int i = 0; i < 3; i++) {
                        mensaje_de_carga("Enviando", 400);
                    }
                    tipo_donativo.entrega_producto();
                }
            } else if (detalles_producto[3].equals("Ropa")) {
                tipo_donativo = new Ropa(detalles_producto);
                tipo_donativo.setCantidad_producto(1);
                int productos_recibidos = tipo_donativo.getCantidad_producto();
                if (productos_recibidos == 20) {
                    tipo_donativo.envio_producto();
                    for (int i = 0; i < 3; i++) {
                        mensaje_de_carga("Enviando", 400);
                    }
                    tipo_donativo.entrega_producto();
                }
            }
        } else {
            detalles_producto = vista.detalles_donativo("None", nombre_archivo);
            System.out.println(detalles_producto[0]);
        }
    }

    /**
     * Método extra, que sirve para dar un inicio del sistema.
     * 
     * @param mensaje
     * @throws IOException
     * @throws InterruptedException
     */
    private static void mensaje_de_carga(String mensaje, int tiempo) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println(mensaje + ".");
        esperar(tiempo);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println(mensaje + "..");
        esperar(tiempo);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println(mensaje + "...");
        esperar(tiempo);
    }

    /**
     * Metodo para no realizar un cambio tan repentino de la pantalla. Es decir,
     * mantener la pantalla segun el tiempo (en milisegundos) que se le pase como
     * parametro.
     * 
     * @param tiempo_espera: int
     */
    private static void esperar(int tiempo_espera) {
        try {
            Thread.sleep(tiempo_espera);
        } catch (Exception e) {
            System.out.println("Algo salio malo...");
        }
    }
}