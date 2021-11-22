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
     * Metodo que sirve para adquirir los detalles necesarios para poder tomar en
     * cuenta el producto y crear un objeto del mismo tipo.
     */
    public String[] detalles_donativo(String producto, String nombre_archivo) {
        String[] detalles = new String[5];

        if (nombre_archivo.equals("Alimentos")) {
            detalles[0] = verificacion_datos_especificos(
                    "Ingrese la cantidad de libras/litros que va a donar de " + producto, "Entero");
            detalles[1] = producto;
            boolean paso = false;
            while (paso == false){
                try {
                    System.out.println("Recibimos en las zonas 1, 2, 6, 10 y 15");
                    String opcionString = JOptionPane.showInputDialog("Ingrese a que zona va a ir a dejar la donacion");
                    int opcion = Byte.parseByte(opcionString);
                    if (opcion == 1 || opcion == 2 || opcion == 6 || opcion == 10 || opcion == 15){
                        paso = true;
                        detalles[2] = opcionString;
                    }
                    else {
                        System.out.println("Ingrese un valor de los proveidos anteriormente");
                    }
                } catch (Exception e) {
                    System.out.println("Ingrese un valor numerico");
                }
            }
            detalles[3] = "Alimentos";

        } else if (nombre_archivo.equals("Vestuario")) {
            detalles[0] = verificacion_datos_especificos("Ingrese la cantidad de " + producto + " que va a donar de ",
                    "Entero");
            detalles[1] = producto;
            boolean paso = false;
            while (paso == false){
                try {
                    System.out.println("Recibimos en las zonas 1, 2, 6, 10 y 15");
                    String opcionString = JOptionPane.showInputDialog("Ingrese a que zona va a ir a dejar la donacion");
                    int opcion = Byte.parseByte(opcionString);
                    if (opcion == 1 || opcion == 2 || opcion == 6 || opcion == 10 || opcion == 15){
                        paso = true;
                        detalles[2] = opcionString;
                    }
                    else {
                        System.out.println("Ingrese un valor de los proveidos anteriormente");
                    }
                } catch (Exception e) {
                    System.out.println("Ingrese un valor numerico");
                }
            }
            detalles[3] = "Ropa";
            paso = false;
            while (paso == false){
                try {
                    String opcionString = JOptionPane.showInputDialog("¿Para que edad es la ropa a donar?");
                    int opcion = Byte.parseByte(opcionString);
                    if (opcion > 0 && opcion < 25){
                        paso = true;
                        detalles[4] = opcionString;
                    }
                    else {
                        System.out.println("Ingrese un valor entre 0 a 25");
                    }
                } catch (Exception e) {
                    System.out.println("Ingrese un valor numerico");
                }
            }
        } else if (nombre_archivo.equals("Dinero")){
            detalles[0] = verificacion_datos_especificos("Ingrese la cantidad de " + producto + " que va a donar de ",
            "Entero");
            boolean paso = false;
            while (paso == false){
                try {
                    System.out.println("¿Su pago va a ser en efectivo?");
                    String opcionString = JOptionPane.showInputDialog("Ingrese 'si' si su pago sera en efectivo y 'no si no los sera'");
                    if (opcionString.equalsIgnoreCase("si")){
                        paso = true;
                        detalles[1] = "true";
                    } else if (opcionString.equalsIgnoreCase("no")){
                        paso = true;
                        detalles[1] = "false";
                    }
                    else {
                        System.out.println("Ingrese solo si o no, por favor");
                    }
                } catch (Exception e) {
                    System.out.println("Ingrese texto en vez de numeros");
                }
            }
            paso = false;
            while (paso == false){
                try {
                    System.out.println("Recibimos en las zonas 1, 2, 6, 10 y 15");
                    String opcionString = JOptionPane.showInputDialog("Ingrese a que zona va a ir a dejar la donacion");
                    int opcion = Byte.parseByte(opcionString);
                    if (opcion == 1 || opcion == 2 || opcion == 6 || opcion == 10 || opcion == 15){
                        paso = true;
                        detalles[2] = opcionString;
                    }
                    else {
                        System.out.println("Ingrese un valor de los proveidos anteriormente");
                    }
                } catch (Exception e) {
                    System.out.println("Ingrese un valor numerico");
                }
            }
            detalles[3] = "Dinero";
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