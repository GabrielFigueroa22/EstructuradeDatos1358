package com.mycompany.proyectoedd1358;

import java.util.Stack;
/**
 *
 * @author gabriel
 */
public class Sklist {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
            pila.push("objeto1");
            pila.push("objeto2");
            pila.push("objeto3");
            pila.push("objeto4");
            pila.push("objeto5");
            pila.push("objeto6");
            pila.push("objeto7");
            System.out.println("pila: " + pila);

            String item = pila.pop();
            System.out.println("objeto borrado: " + item);
            System.out.println("capacidad: " + pila.capacity());
            System.out.println("peek");
            System.out.println(pila.peek());

            if (pila.contains("objeto2")) {
                System.out.println("la pila contiene a objeto6");  
            }else{
                System.out.println("la pila no contiene objeto6");
            }

            System.out.println("obj1th");
            System.out.println("objNth");
            System.out.println(pila.firstElement());
            System.out.println(pila.lastElement());
            System.out.println(pila.toString());

            pila.clear();
            System.out.println("Se vacio la lista por completo");         
    } 
}

