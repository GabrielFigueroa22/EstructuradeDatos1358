package arregloadt_1;
/**
 *
 * @author angel
 */
public class ArregloADT_2 {

        System.out.println("Tarea 2: ArregloADT");
        ArregloADT_1 arregloADT = new ArregloADT_1(5);
        System.out.println("Dimensiones del arreglo: ");
        System.out.println(arregloADT.getTamanio());
        ArregloADT_1.setelemento(0, "Se refiere a un:");
        ArregloADT_1.setelemento(1, "Arreglo");
        ArregloADT_1.setelemento(2, "Mejorado");
        ArregloADT_1.setelemento(3, "Con");
        ArregloADT_1.setelemento(4, "Objetos");
        System.out.println("Llamando al metodo toString:");
        System.out.println(arregloADT.toString());
        System.out.println("imprimiendo la casilla 4");
        System.out.println(arregloADT.getElemento(4));
        System.out.println("vaciando el arreglo");
        arregloADT.limpiar();
        System.out.println("imprimiendo arreglo vacÃ­o");
        System.out.println(arregloADT.toString());  
    
}
