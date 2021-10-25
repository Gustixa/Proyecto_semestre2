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
    public String mal_dato() {
        String mal_dato = "DEBE INGRESAR UN VALOR QUE SEA NUMÉRICO";
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
    private void menu_inicio() {
        System.out.println("\nSELECCIONE UNA DE LAS OPCIONES DEL MENU\n");
        System.out.println("1. Donativo de comida.");
        System.out.println("2. Donativo de vestimenta.");
        System.out.println("3. Donativo monetario.");
        System.out.println("4. Salir");
    }
    /**
     * Método para desplegar las opciones a donar para alimentos
     */

    private void menu_alimentos(){
        String alimentos_esenciales = "-Frijol\n -Arroz\n -Aceite\n -Harina\n -Sal\n -Azúcar\n -Pasta\n";
        String otros_alimentos = "-Enlatados\n -Cereales\n -Otros";
        String advertencia = "POR FAVOR TOMAR EN CUENTA DE NO DONAR LÁCTEOS, ALIMENTOS PERECEDEROS," + "PRODUCTOS DE GRANJA O ENVASADOS EN " + 
        "ENVASES DE VIDRIO";
        System.out.println(alimentos_esenciales);
        System.out.println(otros_alimentos);
        System.out.println(advertencia);
    }
    
    /**
     * Método para desplegar productos de aseo ya sea personal o doméstico
     */

    private void productos_de_aseo(){
        String productos_aseo = "-Pasta dental\n -Papel higénico\n -Pañales\n -Shampoo\n -Jabón\n -Desodorante\n ";
    }


    /**
     * Método que sirve para poder obtener un valor correcto por parte del usuario
     * en base a las opciones proveidas.
     * 
     * @return seleccion: byte
     */
    public byte seleccion(byte valor, String menu) {
        byte seleccion = 0;
        boolean pasar = false;
        do {
            // Modificar los numeros de comparacion, segun las opciones de los metodos
            if (menu.equals("Alimentos")) {

                // Se muestran las opciones de donacion que tiene el usuario.
            } else if (menu.equals("Menu donativos")) {
                menu_inicio();
            }
            try {
                seleccion = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la opción que desea realizar: "));
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

    /**
     * Metodo que pide la cantidad del donativo que desea realizar la persona.
     * 
     * @param valor: byte
     * @return datos: String[]
     */
    public String[] cantidad(String valor) {
        boolean correcto = false;
        int selecto = 0;
        String[] datos = new String[3];
        //por si se hace alimento
        if (valor.equals("comida")) {

            menu_alimentos();
            datos[0] = JOptionPane.showInputDialog("Ingrese qué alimento desea donar");
            
        //por si es vestimenta
        } else if (valor.equals("ropa")) {


            datos[0] = JOptionPane.showInputDialog("Ingrese el tipo de prenda que se va a donar");

            do {
                try {

                    selecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para qué edad es la prenda"));
                    datos[1] = String.valueOf(selecto);
                    correcto = true;

                } catch (NumberFormatException exc) {
                    System.out.println(mal_dato());
                }
            } while (!correcto);

        //por si se hace monetario
        } else if (valor.equals("dinero")) {
            
            datos[0] = JOptionPane.showInputDialog("Ingrese su tarjeta");
            do {
                try {
                    selecto = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a donar"));
                    datos[1] = String.valueOf(selecto);
                    correcto = true;
                } catch (NumberFormatException exc) {
                    System.out.println(mal_dato());
                }
            } while (!correcto);

        }
        return datos;
    }

    /**
     * Este metodo sirve para verificar que, la persona opte por una de las opciones
     * que se le presentan y que su selección este en rango a las mismas, es decir,
     * si se le muestran 3 opciones, no puede pedir menos o más de ello.
     * 
     * @param valor: int
     * @return
     */
    public int verificacion_productos(int valor) {
        return 0; // Modificar al valor que se desea retornar.
    }
}