package com.mycompany.listadobleligada;
/**
 *
 * @author angel
 * @param <T>
 */
public class aplicaciondemetodo<T> {

    private T datos;
    private aplicaciondemetodo<T> Siguiente;
    private aplicaciondemetodo<T> Anterior;

    //Constructores
    public aplicaciondemetodo() {
    }
    public aplicaciondemetodo(T dat) { 
        this.datos = dat;
    }
    public aplicaciondemetodo(T dat, aplicaciondemetodo<T> desp, aplicaciondemetodo<T> prev) {
        this.datos = dat;
        this.Siguiente = desp;
        this.Anterior = prev;
    }
    public aplicaciondemetodo<T> getSiguiente() {
        return Siguiente;
    }
    public void setSiguiente(aplicaciondemetodo<T> desp) {
        this.Siguiente = desp;
    }
    public aplicaciondemetodo<T> getAnterior(){
        return Anterior;
    } 
    public void setAnterior(aplicaciondemetodo<T> prev){
        this.Anterior = prev;
    }
    public T getDato() {
        return datos;
    }
    public void setDato(T dat) {
        this.datos = dat;
    }
    @Override
    public String toString() {
        return "|" + datos + "| <-> ";
    }
    public String mostrarTodo() {
        return "[Anterior = " + this.getAnterior() + "]<-> [Dato = " + datos + "] <-> [Siguiente = " + this.getSiguiente() + "]";
    }
}


    
    

