package com.mycompany.tablashash;
/**
 *
 * @author Gabriel
 * @param <K>
 * @param <V>
 */
public class Tabla<K, V> {
  
    private Nodo<K, V> head;
    private Nodo<K, V> tail;
    private int size;

    public boolean isEmpty() {
        return this.head == null;
    }

    public int getSize() {
        return this.size;
    }

    public void add(K key, V value) {
        Nodo<K, V> toAdd = new Nodo(key, value);
        if (this.isEmpty()) {
            this.head = toAdd;
            this.tail = toAdd;
        } else {
            this.tail.setNext(toAdd);
            this.tail = this.tail.getNext();
        }
        this.size++;
    }

    public V get(K key) {
        Nodo<K, V> aux = this.getNodo(key);
        return aux != null ? aux.getValue() : null;
    }

    private Nodo<K, V> getNodo(K key) {
        Nodo<K, V> aux = this.head;
        while(aux.getNext() != null && aux.getKey() != key){ //Mientras siga siendo cierto
            aux = aux.getNext();
        }
        return this.isEmpty()  || aux.getKey() != key ? null : aux;
    }

    public void setValue(K key, V value) {
        Nodo<K, V> aux = this.getNodo(key);
        if (aux != null) {
            aux.setValue(value);
        }
    }

    public V remove(K key) {
        Nodo<K, V> aux = this.head;
        V out = null;
        if (!this.isEmpty()) {
            while (aux.getNext() != null && !(aux.getNext().getKey().equals(key))) {
                aux = aux.getNext();
            }
            
            out = aux.getNext() != null ? aux.getNext().getValue() : null;
            if (aux.getNext() != null) {
                aux.setNext(aux.getNext().getNext());
                this.size--;
            }
        }
        
        return this.isEmpty() || aux.getNext() == null ? null : out;
    }

    @Override
    public String toString() {
        return this.head.printAll();
    }
    
    public static void main(String[] args) {
        Lista<Integer, String> a = new Lista();
        a.add(1, "un");
        a.add(2, "deux");
        a.add(3, "trois");
        a.add(4, "quatre");
        System.out.println(a);
        System.out.println(a.get(5));
        a.setValue(2, "3");
        System.out.println(a.size);
        a.remove(4);
        System.out.println(a.size);
        System.out.println(a.get(2));
        System.out.println(a);
    }
}
