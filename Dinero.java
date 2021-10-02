/*************************************
 * Clase Dinero
 * Clase que hereda de Donativo
 ************************************/
public class Dinero extends Donativo {

    boolean efectivo;

    //Constructor
    public Dinero(String direccion, int cantidad){
        super(direccion,cantidad);
    }

    //Getter
    public boolean getEfectivo(){
        return efectivo;
    }
    
    
}

