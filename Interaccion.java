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
        System.out.println("BIENVENIDO AL SISTEMA DE DONACIONES\n");
        System.out.println("El fin de esta iniciativa es unir los esfuerzos de\n"
                + "personas y/u organizaciones que quieran ayudar a personas \n"
                + "de pocos recursos y poder distribuir dicha ayuda a aquellos\n" + "que la necesiten.\n");
    }

    /**
     * Método que muestra un mensaje de "ERROR" en cuánto se ingresa un valor de
     * tipo no numérico.
     * 
     * @return mal_dato: String
     */
    public void mal_dato() {
        System.err.println("DEBE INGRESAR UN VALOR QUE SEA NUMÉRICO");
    }

    /**
     * Método que muestra un mensaje de "ERROR" en cuánto se ingresa un valor que no
     * esta en las opcioens proveídas.
     */
    public void fuera_de_rango() {
        System.err.println("DEBE INGRESAR UN VALOR QUE SE ENCUENTRE EN LAS OPCIONES");
    }

    /**
     * 
     */
    public void exito() {
        System.out.println("SU DONACION SE AGREGÓ CON ÉXITO");
    }

    /**
     * Método que muestra un mensaje de despedida al usuario en cuanto deje el
     * sistema.
     */
    public void despedida() {
        System.out.println("MUCHAS GRACIAS POR SU INTERÉS!");
    }

    /**
     * Método que muestra las opciones que estarán disponibles para la personas
     */
    private int menu_inicio() {
        String[] opciones_principales = { "Donativo de comida.", "Donativo de vestimenta.", "Donativo monetario.",
                "Otro donativo", "Salir" };
        System.out.println("\nSELECCIONE UNA DE LAS OPCIONES DEL MENU\n");
        for (int i = 0; i < opciones_principales.length; i++) {
            System.out.println((i + 1) + "." + opciones_principales[i]);
        }
        return opciones_principales.length;
    }

    /**
     * 
     * @return
     */
    private int zonas_entrega() {
        String[] zonas = { "1", "2", "6", "10", "15" };
        System.out.println("\nSELECCIONE UNA DE LAS OPCIONES\n");
        for (int i = 0; i < zonas.length; i++) {
            System.out.println((i + 1) + "." + zonas[i]);
        }
        return zonas.length;
    }

    /**
     * 
     * @return
     */
    private int edades_vestimenta() {
        String[] edades_rango = { "0-5", "6-10", "11-15", "20-25", "mayor a 25" };
        System.out.println("\nSELECCIONE UNA DE LAS OPCIONES\n");
        for (int i = 0; i < edades_rango.length; i++) {
            System.out.println((i + 1) + "." + edades_rango[i]);
        }
        return edades_rango.length;
    }

    /**
     * Metodo que sirve para adquirir los detalles necesarios para poder tomar en
     * cuenta el producto y crear un objeto del mismo tipo.
     */
    public String[] detalles_donativo(String producto, String nombre_archivo) {
        String[] detalles = new String[5];
        String[] zonas = { "1", "2", "6", "10", "15" };
        String[] edades_rango = { "0-5", "6-10", "11-15", "20-25", "mayor a 25" };
        byte zona = 0;

        if (nombre_archivo.equals("Alimentos")) {
            detalles[0] = verificacion_datos_especificos(
                    "Ingrese la cantidad de libras/litros que va a donar de " + producto, "Entero");
            detalles[1] = producto;
            zona = seleccion_opciones_menu("Zonas");
            detalles[2] = zonas[zona - 1];
            detalles[3] = "Alimentos";

        } else if (nombre_archivo.equals("Vestuario")) {
            detalles[0] = verificacion_datos_especificos("Ingrese la cantidad de " + producto + " que va a donar de ",
                    "Entero");
            detalles[1] = producto;
            zona = seleccion_opciones_menu("Zonas");
            detalles[2] = zonas[zona - 1];
            detalles[3] = "Ropa";
            byte edades = seleccion_opciones_menu("Edades vestimenta");
            detalles[4] = edades_rango[edades - 1];
        } else if (nombre_archivo.equals("Dinero")) {
            System.out.println("PUEDE REALIZAR EL PAGO EN EL SIGUIENTE NUMERO DE CUENTA: 234-232-523");
        }
        return detalles;
    }

    /**
     * Método que sirve para repetir n cantidad de veces, en caso se necesario, la
     * entrada del producto, en caso de ser numerico.
     * 
     * @param mensaje: String, mensaje a mostrarle al usuario para realizar una
     *                 acción.
     * @param tipo:    String, tipo de dato que se requiere verificar (entero u
     *                 decimal)
     * 
     * @return dato_a_verificar: String, dato ya limpio y aceptable.
     */
    private String verificacion_datos_especificos(String mensaje, String tipo) {
        boolean pasar = false;
        String dato_a_verificar = "";
        do {
            dato_a_verificar = JOptionPane.showInputDialog(mensaje);
            pasar = verificacion_numeros(dato_a_verificar, tipo);
        } while (!pasar);
        return dato_a_verificar;
    }

    /**
     * Método que sirve para verificar que la entrada del detalle del producto es
     * meramente numérico, en caso de no serlo, el metodo
     * verificaciщт_datos_especificos seguirá pidiendo el dato.
     * 
     * @param dato: String, entrada del usuario.
     * @param tipo: String, tipo entero u decimal.
     * 
     * @return numero: boolena, verificador si seguir o para el requerimiento
     *         repetido del dato.
     */
    private boolean verificacion_numeros(String dato, String tipo) {
        boolean numero = false;
        int comprobacion = 0;
        float comprobacion_2 = 0.0f;
        try {
            if (tipo.equals("Entero")) {
                comprobacion = Integer.parseInt(dato);
                numero = true;
            } else if (tipo.equals("Decimal")) {
                comprobacion_2 = Float.parseFloat(dato);
                numero = true;
            }
        } catch (NumberFormatException e) {
            mal_dato();
        }
        return numero;
    }

    /**
     * Este metodo sirve para verificar que, la persona opte por una de las opciones
     * que se le presentan y que su selección este en rango a las mismas, es decir,
     * si se le muestran 3 opciones, no puede pedir menos o más de ello. En este
     * caso, se enfoca que su selección se base en los productos que se desean y se
     * donen.
     * 
     * @param valor: int
     * @return
     */
    public int verificacion_seleccion_productos(int rango) {
        boolean pasar = false;
        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
                if (opcion < 0 || opcion > rango) {
                    fuera_de_rango();
                } else {
                    pasar = true;
                }
            } catch (NumberFormatException e) {
                mal_dato();
            }

        } while (!pasar);
        return opcion;
    }

    /**
     * Este método sirve para verificar si se seleccionó una de las opciones validas
     * de un menú que de acciones que puede realizar el usuario.
     */
    public byte seleccion_opciones_menu(String opciones) {
        boolean pasar = false;
        byte opcion = 0;
        int opciones_rango = 0;
        do {
            // En caso de haber mas menu, agragar mas condicionales.
            if (opciones.equals("Menu donativos")) {
                opciones_rango = menu_inicio();
            } else if (opciones.equals("Zonas")) {
                opciones_rango = zonas_entrega();
            } else if (opciones.equals("Edades vestimenta")) {
                opciones_rango = edades_vestimenta();
            }
            try {
                opcion = Byte.parseByte(JOptionPane.showInputDialog("Ingrese una de las opciones"));
                if (opcion < 0 || opcion > opciones_rango) {
                    fuera_de_rango();
                } else {
                    pasar = true;
                }
            } catch (NumberFormatException e) {
                mal_dato();
            }

        } while (!pasar);
        return opcion;
    }
}