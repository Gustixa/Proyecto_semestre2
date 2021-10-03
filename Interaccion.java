import javax.swing.JOptionPane;

/**
 * Clase que funciona para la Interaccion con el usuario, siendo la Vista en la
 * métodologia M-V-C
 * 
 * @author Josúe Samuel Argueta Hernández.
 * @since
 * @version 1.0
 */

public class Interaccion {
    /**
     * Método que muestra un mensaje de bienvenida al usuario.
     */
    public void bienvenida() {
        System.out.println("BIENVENIDO AL SISTEMA DE DONACIONES");
    }

    /**
     * Método que muestra un mensaje de "ERROR" en cuánto se ingresa un valor de
     * tipo no numérico.
     * 
     * @return
     */
    public String mal_dato() {
        String mal_dato = "DEBE INGRESAR UN VALOR QUE SEA NUMERICO";
        return mal_dato;
    }

    /**
     * Método que muestra un mensaje de "ERROR" en cuánto se ingresa un valor que no
     * esta en las opcioens proveídas.
     */
    public String fuera_de_rango() {
        String fuera_rango = "DEBE INGRESAR UN VALOR QUE SE ENCUENTRE EN LAS OPCIONES";
        return fuera_rango;
    }

    /**
     * Método que muestra un mensaje de despedida al usuario en cuanto deje el
     * sistema.
     */
    public void despedida() {
        System.out.println("MUCHAS GRACIAS POR SU INTERES!");
    }

    /**
     * Método que muestra las opciones que estarán disponibles para la personas
     */
    private void menu_inicio() {
        System.out.println("");
        System.out.println("1. Donativo de comida.");
        System.out.println("2. Donativo de vestimenta.");
        System.out.println("3. Donativo en efectivo.");
        System.out.println("4. Salir");
    }

    /**
     * Método que muestra las opciones correspondiente una vez se haya seleccionada
     * una opcion principal.
     */
    private void menu_opciones() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    /**
     * Método que sirve para poder obtener un valor correcto por parte del usuario
     * en base a las opciones proveidas.
     * 
     * @return seleccion: byte
     */
    public byte seleccion(byte valor) {
        byte seleccion = 0;
        boolean pasar = false;
        do {
            // Modificar los numeros de comparacion, segun las opciones de los metodos
            if (valor == 4) {
                menu_inicio();
            } else if (valor == 5) {
                menu_opciones();
            }
            // cambiar este metodo al que corresponde con las opciones que se presentaran.
            // cantidad_memoria();
            try {
                seleccion = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la cantidad de una de las opciones"));
                // Modificar el valor el cual se verifica que este en rango (1-5)
                if ((seleccion < 1) || (seleccion > valor)) {
                    System.out.println(fuera_de_rango());
                } else {
                    pasar = true;
                }
            } catch (NumberFormatException exception) {
                System.err.println(mal_dato());
            }
        } while (!pasar);

        return seleccion;
    }

    public int cantidad(byte valor) {
        int respuesta = 0;
        if (valor == 1) {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del comida que desea donar"));
        } else if (valor == 2) {
            respuesta = Integer
                    .parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vestimentas que desea donar"));
        } else if (valor == 3) {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea donar."));
        }
        return respuesta;
    }
}