package com.mycompany.proyectoedd1358;

import java.util.*;
/**
 *
 * @author gabriel
 */
public class LkList {
    public static void main(String args[]) {
        LinkedList<String> lklist = new LinkedList<>();
            lklist.add("primerpunto");
            lklist.add("tercerpunto");
            lklist.add("quintopunto");
            lklist.add("segundopunto");
            lklist.add("cuartopunto");
            lklist.addFirst("1erpunto");
            lklist.addLast("findepuntos");

            System.out.println("la lista ligada posterior a agregar los puntos: " + lklist);
            System.out.println("relacion de lista ligada: " + lklist);
            System.out.println("tamaño: " + lklist.size() );

            if (lklist.contains("cualquier punto aleatorio")){
                System.out.println("se encontro el punto tomado");
            } else{
                System.out.println("no se encontro el punto, reintente");
            }

            Object punto = lklist.get(0);
            Object punto2 = lklist.get(0);
            System.out.println("punto pricipal: " + punto);
            lklist.set(0, "intercambio de puntos");
            System.out.println("nuevo resultado: " + punto2);

            lklist.removeFirst();
            lklist.removeLast();
            System.out.println("La lista ligada posterior a eliminar el primer y último punto: " + lklist);

            lklist.add(0, "punto nuevo");
            lklist.remove(2);
            lklist.indexOf("punto2");
            lklist.set(4, "punto nuevo");
            System.out.println("lista ligada: " + lklist); 
            System.out.println("lugar del punto2");
            System.out.println("la lista ligada posee nuevos datos");
            System.out.println(lklist);

            lklist.removeAll(lklist);
            System.out.println("se elimino el contenido de la lista ligada");
            lklist.add(0, "se elimino la mayoria del contenido de la lista ligada");
            System.out.println(lklist.toString());
    }
}
