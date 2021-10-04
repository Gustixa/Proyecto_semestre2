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
        System.out.println("El fin de esta iniciativa es unir los esfuerzos de"
                + "personas y/u organizaciones que quieran ayudar a personas de pocos recursos, y poder distribuir"
                + "dicha ayuda a todas las personas que la necesiten.");
    }

    /**
     * Método que muestra un mensaje de "ERROR" en cuánto se ingresa un valor de
     * tipo no numérico.
     * 
     * @return mal_dato: String
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

    public void exito(){
        System.out.println("SU DONACION SE AGREGO CON EXITO");
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
                
            } else if (menu.equals("Principal")) {
                menu_inicio();
            }
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

    /**
     * Metodo que pide la cantidad del donativo que desea realizar la persona.
     * 
     * @param valor: byte
     * @return respueta: int
     */
    public String[] cantidad(String valor) {
        boolean correcto = false;
        int selecto = 0;
        String[] datos = new String[5];
        if (valor.equals("comida")) {
            datos[0] = JOptionPane.showInputDialog("Ingrese la direccion donde se puede recoger el donativo");
            do{
                try {
                    selecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alimento a donar"));
                    datos[1] = String.valueOf(selecto);
                    correcto = true;
                } 
                catch (NumberFormatException exc) {
                    System.out.println(mal_dato());
                }
            } while(!correcto);
            datos[2] = JOptionPane.showInputDialog("Ingrese el tipo de alimento");
            do{
                try {
                    selecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos dias le falta para que caduque el producto"));
                    datos[3] = String.valueOf(selecto);
                    correcto = true;
                } 
                catch (NumberFormatException exc) {
                    System.out.println(mal_dato());
                }
            } while(!correcto);
            datos[4] = JOptionPane.showInputDialog("Ingrese 'si' si el alimento se necesita refrigerar");
            


        } else if (valor.equals("ropa")) {

            datos[0] = JOptionPane.showInputDialog("Ingrese la direccion donde se puede recoger el donativo");
            do{
                try {
                    selecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ropa a donar"));
                    datos[1] = String.valueOf(selecto);
                    correcto = true;
                } 
                catch (NumberFormatException exc) {
                    System.out.println(mal_dato());
                }
            } while(!correcto);

            do {
                try {

                    selecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de prenda que se va a donar"));
                    datos[2] = String.valueOf(selecto);
                    correcto = true;
                    
                } catch (NumberFormatException exc) {
                    System.out.println(mal_dato());
                }
            } while (!correcto);
            datos[3] = JOptionPane.showInputDialog("Ingrese para que edad seria la prenda a donar");

        } else if (valor.equals("dinero")) {

            datos[0] = JOptionPane.showInputDialog("Ingrese la direccion donde se puede recoger el donativo");
            do {
                try {
                    selecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a donar"));
                    datos[1] = String.valueOf(selecto);
                    correcto = true;
                } 
                catch (NumberFormatException exc) {
                    System.out.println(mal_dato());
                }
            } while(!correcto);
            datos[2] = JOptionPane.showInputDialog("Ingrese si la donacion es en efectivo o por tranferencia bancaria");

        }
        return datos;
    }

}