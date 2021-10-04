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
     * @param args
     */
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
                    donacion("comida");
                    break;
                case 2:
                    // Donativo de vestimenta.
                    donacion("ropa");
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
        }
    }

    /**
     * Metodo que nos sirve para definir que tipo de donacion se hara
     * @param donacion
     */
    private static void donacion(String donacion) {
        String[] datos;
        Donativo tipo;
        //Con los ifs verificamos que tipo de donacion se hara
        if (donacion.equals("comida")) {
            datos = vista.cantidad(donacion);//Luego de que se define, se obtienen los datos y se crea un objeto con los datos
            tipo = new Alimentos(datos[0], Integer.parseInt(datos[1]), datos[2], Integer.parseInt(datos[3]), Boolean.parseBoolean(datos[4]));
            vista.exito();
        } else if (donacion.equals("ropa")) {
            datos = vista.cantidad(donacion);
            tipo = new Ropa(datos[0], Integer.parseInt(datos[1]), datos[2], Integer.parseInt(datos[3]));
            vista.exito();
        } else if (donacion.equals("dinero")) {
            datos = vista.cantidad(donacion);
            tipo = new Dinero(datos[0], Integer.parseInt(datos[1]), Boolean.parseBoolean(datos[2]));
            vista.exito();
        }
    }

}