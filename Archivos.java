import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Clase que sirve para poder tener registro de los donativos que se requieren
 * por parte de los donantes.
 * 
 * @author Josúe Samuel Argueta Hernández
 * @since 1.0, 17/10/2021
 * @version 1.0
 */

public class Archivos {
    private ArrayList<ArrayList<String>> donativos;

    /**
     * Clase que funciona para mostrarle al usuario las opciones que tiene para
     * donar. Retoran la cantidad de productos que se aceptan (por ejemplo, leche,
     * arroz y frijoes = tamaño de 3) esto, para que no escoja un valor fuera de
     * rango.
     * 
     * @param nombre_archivo: String
     * @return donativos.size()
     */
    public int leer_CSV(String nombre_archivo) {
        // StringBuilder sb = new StringBuilder();
        donativos = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("Archivos\\" + nombre_archivo + ".csv");
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
                donativos.add(datos_temporal);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        if (nombre_archivo.equals("Alimentos")) {
            // Mostrar los donativos del archivo de una manera mas amena para el usuario.
            System.out.println("\n----DONATIVOS NECESITADOS----\n");
            for (int i = 0; i < donativos.size(); i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.println((i + 1) + ". " + donativos.get(i).get(0) + " --- " + donativos.get(i).get(1));
                }
            }
        } else if (nombre_archivo.equals("Vestuario")) {
            System.out.println("\n----DONATIVOS NECESITADOS----\n");
            for (int i = 0; i < donativos.size(); i++) {
                System.out.println((i + 1) + ". " + donativos.get(i).get(0));
            }
        }

        return donativos.size();
    }

    /**
     * Método que crea el archivo en la ruta indicada. NO UTILIZAR EN EL PROGRAMA,
     * ESTE METODO SOLO SE IMPLEMENTO PARA CREAR EL ARCHIVO. Se agregó al diseño
     * original, solo para poder crear el archivo de manera "sistemática".
     * 
     * @param nombre_archivo: String
     * @exception IOExcpetion, si se llega a interrumpir la posibilidad de localizar
     *                         el archivo.
     */
    public void crear_archivo(String nombre_archivo) {
        File archivo;
        try {
            // ruta archivos
            archivo = new File("Archivos\\" + nombre_archivo + ".csv");
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
    public String donativo_detalle(int donativo_seleccion, String detalle, String nombre_arhivo) {
        String palabra = "";
        donativos = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("Archivos\\" + nombre_arhivo + ".csv");
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
                donativos.add(datos_temporal);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        // retornar el producto que seleccionó el usuario.
        for (int i = 0; i < donativos.size(); i++) {
            for (int j = 0; j < 1; j++) {
                int obtencion = donativo_seleccion - 1; // Variable local para obtener el producto exacto.
                if ((obtencion < 0) || (obtencion > donativos.size())) {
                    System.err.println("DEBE INGRESAR UNO DE LOS DONATIVOS DISPONIBLES.");
                } else {

                    if (detalle == "producto") {
                        palabra = donativos.get(obtencion).get(0);
                        // } else if (detalle == "espacio memoria") {
                        // palabra = donativos.get(obtencion).get(1);
                        // } else if (detalle == "ciclo reloj") {
                        // palabra = donativos.get(obtencion).get(2);
                    }
                }
            }
        }
        return palabra;
    }

    /**
     * Método para almacenar la información de los donativos recibidos.
     */
    public void almacenar_data(String nombre_archivo, String[] data) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombre_archivo + ".csv"));
            bw.write(data + "\n");
            bw.close();
        } catch (IOException e) {
            System.err.println("No se pudo abrir el arhcivo. " + e.getMessage());
        }

    }

}