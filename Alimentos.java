/***************************************
 * Clase Alimento
 * Hereda de Donativo
 **************************************/

public class Alimentos extends Donativo{

    String tipo;
    int caducidad;
    boolean refrigeracion;

    //Constructor
    public Alimentos(String direccion, int cantidad){
        super(direccion,cantidad);
    }

    //Getters 
    public String getTipo(){
        return tipo;
    }
    public int getCaducacion(){
        return caducidad;
    }
    public boolean getRefrigeracion(){
        return refrigeracion;
    }
}