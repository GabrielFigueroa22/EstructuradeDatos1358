package com.mycompany.listadobleligada;
/**
 *
 * @author angel
 * * @param <T>
 */
public class ListaDobleLigada {
    aplicaciondemetodo cabeza;
    int rozmiar;
    public ListaDobleLigada() {
        this.cabeza = null;
        this.rozmiar = 0;
    }
    public boolean estaVacia() {
        return this.cabeza == null;
    }
    public int getRozmiar() {
        return rozmiar;
    }
    public void agregarAlFinal(String valor) {
        aplicaciondemetodo Nuevo = new aplicaciondemetodo(valor);
        if (this.estaVacia()) {
            this.cabeza = Nuevo;
        } else {
            aplicaciondemetodo Aux = this.cabeza;
            while (Aux.getSiguiente() != null) {
                Aux = Aux.getSiguiente();
                Nuevo.setAnterior(Aux);
            }
            Aux.setSiguiente(Nuevo);
            Aux = null;
            Nuevo = null;
        }
    }
    public void agregarAlInicio(String valor) {
        aplicaciondemetodo Aux = new aplicaciondemetodo(valor);
        if (this.estaVacia()) {
            this.cabeza = Aux;
        } else {
            Aux.setSiguiente(cabeza);
            cabeza = Aux;
        }
    }
    public void agregarDespuesDe(int posición, String valor) {
        aplicaciondemetodo Aux = new aplicaciondemetodo(valor);
        aplicaciondemetodo Tem = this.cabeza;
        for (int contador = 1; contador <= posición - 1; contador++) {
            Tem = Tem.getSiguiente();
        }
        Aux.setSiguiente(Tem.getSiguiente());
        Tem.setSiguiente(Aux);
        Tem.setAnterior(Tem.getAnterior());
    }
    public void eliminar(int posición) {
        aplicaciondemetodo Aux = cabeza;
        if (this.estaVacia()) {
            System.out.println("Lista vacia, llénala primero alcornoque");
        } else {
            if (posición > cabeza.toString().length()) {
                System.out.println("La posición introducida no existe en esta lista, alcornoque");
            } else {
                for (int contador = 1; contador < posición - 1; contador++) {
                    Aux = Aux.getSiguiente();
                }
            }
        }
        Aux.setSiguiente(Aux.getSiguiente().getSiguiente());
        Aux.setAnterior(Aux.getAnterior());
    }
    public void eliminarElPrimero() {
        aplicaciondemetodo Aux = cabeza;
        if (this.estaVacia()) {
            cabeza = Aux;
        } else {
            cabeza = Aux.getSiguiente();
        }
    }

    public void eliminarElFinal() {
        aplicaciondemetodo Aux = cabeza;
        if (this.estaVacia()) {
            cabeza = Aux;
        } else {
            while (Aux.getSiguiente().getSiguiente() != null) {
                Aux = Aux.getSiguiente();
            }
            Aux.setSiguiente(null);
        }
    }

    public int buscarValor(String valor) {
        aplicaciondemetodo Aux = cabeza;
        int posición = 1;
        if (this.estaVacia()) {
            System.out.println("No hay valor, la cadena está vacía.");
        } else {
            while (Aux.getDato() != valor) {
                Aux = Aux.getSiguiente();
                posición++;
            }
        }
        return posición;
    }

    public void actualizarValor(String valor, String actualizado) {
        aplicaciondemetodo Aux = cabeza;
        while (Aux.getDato() != valor) {
            Aux = Aux.getSiguiente();
        }
        Aux.setDato(actualizado);
    }

    public void transversal() {
        aplicaciondemetodo nodo_actual = this.cabeza;
        while (nodo_actual != null) {
            System.out.print(nodo_actual);
            nodo_actual = nodo_actual.getSiguiente();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ListaDobleLigada Cabeza = new ListaDobleLigada();
        Cabeza.agregarAlFinal(18);
        Cabeza.agregarAlFinal(1);
        Cabeza.agregarAlFinal(27);
        Cabeza.agregarAlFinal(20);
        Cabeza.agregarAlFinal(500);
        Cabeza.transversal();
        Cabeza.eliminarElFinal();
        Cabeza.actualizarValor(1, 1818);
        Cabeza.transversal();
        Cabeza.eliminarElPrimero();
        Cabeza.transversal();
        Cabeza.eliminar(2);
        Cabeza.transversal();
        Cabeza.agregarDespuesDe(1, 18);
        Cabeza.transversal();
        Cabeza.agregarAlFinal(27);
        Cabeza.agregarAlInicio(2);
        Cabeza.transversal();
        System.out.println(Cabeza.buscarValor(27));
    }

    private void agregarAlFinal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void actualizarValor(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void agregarDespuesDe(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void agregarAlInicio(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean buscarValor(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

