package com.mycompany.tablashash;

/**
 *
 * @author angel
 * @param <K>
 * @param <V>
 */
public class Nodo<K, V> {
    private K key;
    private V value;
    private Nodo<K, V> next;

    /**
     * @param key
     * @param value
     */
    public Nodo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @param key
     * @param value
     * @param next
     */
    public Nodo(K key, V value, Nodo<K, V> next) {
        this(key, value);
        this.next = next;
    }

    public Nodo<K, V> getNext() {
        return next;
    }

    /**
     * @param next
     */
    public void setNext(Nodo<K, V> next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "|" + this.value + "Siguiente:";
    }

    public String printAll() {
        if (this.next == null) {
            return this.toString() + null;
        }
        return this.toString() + this.getNext().printAll();
    }
}
