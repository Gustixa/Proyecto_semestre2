import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Clase que sirve para poder tener registro de los donativos que se requieren
 * por parte de los donantes.
 * 
 * @author Josúe Samuel Argueta Hernández
 * @since 1.0, 17/10/2021
 * @version 1.0
 */

public class Archivos {
    private ArrayList<ArrayList<String>> programas;

    public int leer_CSV() {
        // StringBuilder sb = new StringBuilder();
        programas = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("Archivos\\Productos.csv");
        try {
            // Tratar de leer el archivo segun su ruta.
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            // Lectura linea por linea del archivo.
            while ((linea = br.readLine()) != null) {
                // Almcancenar los valores en el arreglo, serparandolos con coma.
                String[] datosDeLinea = linea.split(",");
                ArrayList<String> datos_temporal = new ArrayList<String>();
                // Agregar los campos del arreglo al arreglo dinamico temporal.
                for (String dato : datosDeLinea) {
                    datos_temporal.add(dato);
                }
                // Agregarlos al arreglo dinamico principal.
                programas.add(datos_temporal);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        // Mostrar los programas del archivo de una manera mas amena para el usuario.
        System.out.println("\n----PROGRAMAS 'INSTALADOS'----\n");
        for (int i = 0; i < programas.size(); i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println((i + 1) + ". " + programas.get(i).get(0) + " --- " + programas.get(i).get(1)
                        + " --- " + programas.get(i).get(2));
            }
        }
        return programas.size();
    }

    /**
     * Método que crea el archivo en la ruta indicada. NO UTILIZAR EN EL PROGRAMA,
     * ESTE METODO SOLO SE IMPLEMENTO PARA CREAR EL ARCHIVO. Se agregó al diseño
     * original, solo para poder crear el archivo de manera "sistemática".
     * 
     * @exception IOExcpetion, si se llega a interrumpir la posibilidad de localizar
     *                         el archivo.
     */
    public void crear() {
        File archivo;
        try {
            // ruta archivos
            archivo = new File("Archivos\\Productos.csv");
            // Verificar si existe
            if (archivo.exists()) {
                System.out.println("el arhcivo ya existe");
            } else if (archivo.createNewFile()) {// crear en caso de no existir
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException exception) {// Throwable, excepcion padre (general) de todas las excepciones.
            System.err.println("No se ha creado el archivo");
        }
    }

    /**
     * Este metodo esta abierto a modificaciones, por lo tanto, se pude quitar y
     * agregar funcionalidades. Asi mismo, si se considera que no es util, se puede
     * elimiar.
     * 
     * @param programa_seleccion: int
     * @return palabra: String
     */
    public String programa(int programa_seleccion, String detalle) {
        String palabra = "";
        programas = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("Archivos\\Programas.csv");
        try {
            // Tratar de leer el archivo segun su ruta.
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            // Lectura linea por linea del archivo.
            while ((linea = br.readLine()) != null) {
                // Almcancenar los valores en el arreglo, serparandolos con coma.
                String[] datosDeLinea = linea.split(",");
                ArrayList<String> datos_temporal = new ArrayList<String>();
                // Agregar los campos del arreglo al arreglo dinamico temporal.
                for (String dato : datosDeLinea) {
                    datos_temporal.add(dato);
                }
                // Agregarlos al arreglo dinamico principal.
                programas.add(datos_temporal);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        // retornar el programa que seleccionó el usuario.
        for (int i = 0; i < programas.size(); i++) {
            for (int j = 0; j < 1; j++) {
                int obtencion = programa_seleccion - 1; // Variable local para obtener el programa exacto.
                if ((obtencion < 0) || (obtencion > programas.size())) {
                    System.err.println("DEBE INGRESAR UNA DE LAS OPCIONES DE PROGRAMAS INSTALADOS.");
                } else {

                    if (detalle == "programa") {
                        palabra = programas.get(obtencion).get(0);
                    } else if (detalle == "espacio memoria") {
                        palabra = programas.get(obtencion).get(1);
                    } else if (detalle == "ciclo reloj") {
                        palabra = programas.get(obtencion).get(2);
                    }
                }
            }
        }
        return palabra;

    }

}