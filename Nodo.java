/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Nodo {
    private Object elemento;
    private Nodo siguiente;

    public Nodo(Object elemento) {
        this.elemento = elemento;
        this.siguiente = null; //no tiene enlace a ningun elemento
    }

    public void enlazarSiguiente(Nodo nodo) {
        this.siguiente = nodo;

    }

    public Nodo obtenerSiguiente() {
        return this.siguiente;
    }

    public Object obtenerElemento() {
        return this.elemento;
    }

    @Override
    public String toString() {
        return "NodoDoble{" + siguiente + '}';
    }
}
