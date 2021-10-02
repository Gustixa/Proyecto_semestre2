/**********************************
 * Clase Ropa
 * Clase que hereda de Donativo
 *********************************/
public class Ropa extends Donativo{

    String tipoPrenda;
    int paraEdad;

    //Constructor
    public Ropa(String direccion, int cantidad){
        super(direccion,cantidad);
    }

    //Getters
    public String getTipoPrenda(){
        return tipoPrenda;
    }
    public int getParaEdad(){
        return paraEdad;
    }
}
