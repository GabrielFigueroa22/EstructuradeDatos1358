package arregloadt_1;
import java.util.ArrayList;
/**
 *
 * @author angel
 */
public class ArregloADT_1 {
    /**
     * @param args 
     */
    public static void main(String[] args) {
    }
    private int tamanio;
    ArrayList<Object> datos;

    public ArregloADT_1 (int tamanio) {
        this.datos = new ArrayList(this.tamanio);
        this.tamanio = tamanio;
        System.out.println("Dimensiones del arreglo = " + tamanio + "casillas");
        
        for(int i=0; i<tamanio; i++) {
            datos.add(null);
        }
        System.out.println(datos);
    }
    public int getTamanio() {
        return datos.lastIndexOf(datos);
    }
    public void setElemento(int indice, Object elemento) {
        datos.get(indice);
        }
    public void limpiar(){
        for (int i=0; i< tamanio; i++){
            datos.set(i, null);
        }
    }
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return datos.toString();
    }
}

