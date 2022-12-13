package com.mycompany.proyectoedd1358;

import java.util.*;
/**
 *
 * @author gabriel
 */
public class ArList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); 
            list.add("primerpunto");
            list.add("segundopunto");
            list.add(2, "tercerpunto");
            list.add("cuartopunto");

            System.out.println("El enlistado contiene los siguientes puntos: " + list);

            list.clear();
            System.out.println("El enlistado contiene los siguientes puntos posterior a la limpieza(): " + list);

            Iterator<String> itr=list.iterator();
            while(itr.hasNext()){
            System.out.println(itr.next());
            }
            
            list.add("segundopunto");
            int fin = list.lastIndexOf("segundopunto");
            System.out.println("El segundo punto tiene un valor de: " + fin);

            Object Dup = list.clone();        
            System.out.println("Objeto duplicado: " + Dup);

            Boolean rev = list.isEmpty();
            System.out.println("verificacion si se encuetra vacio el array: " + rev);

            int post = list.indexOf("segundopunto");
            System.out.println("la referencia del indice de segundopunto es: " + post);

            Boolean objeto = list.contains("quintopunto");
            System.out.println("revision si el quintopunto se encuentra dentro: " + objeto);

            String it = list.get(0);
            System.out.println("El item en el índice 0 es: " + it);

            list.remove(0);
            list.remove("tercerpunto");
            list.remove(2);

            System.out.println("lista final: " + list);
                System.out.println("tamaño: " + list.size());

    }
}
