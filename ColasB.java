package com.mycompany.colas;
import com.mycompany.SB2;
/**
 *
 * @author Gabriel
 */
public class ColasB {
    public static void main(String[] args) {
        SB2<String> abordo = new SB2(7);
        abordo.enqueue(4, "Profesionista");
        abordo.enqueue(2, "Infantes");
        abordo.enqueue(4, "Albañil");
        abordo.enqueue(3, "Mujeres");
        abordo.enqueue(2, "Personas adultas 3ra edad");
        abordo.enqueue(1, "Niñas");
        abordo.enqueue(3, "Hombres");
        abordo.enqueue(4, "Vigilante");
        abordo.enqueue(5, "Capitan");
        abordo.enqueue(4, "Ayudantes");
        //Vamos a evacuarlos hasta que la cola este vacía
        while(!abordo.isEmpty()){
            System.out.printf("Del barco han salido %n", abordo.dequeue());
        }
    }
}
