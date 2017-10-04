/**
 *
 * @author Yo
 */
public class Queue {

    private Nodo cabeza; //el primer elemento de la lista
    private int tamanio;

    public Queue() {
        iniciarLista();
    }

    public void enqueue(Object elemento) {

        if (cabeza == null) {
            cabeza = new Nodo(elemento);
        } else {
            Nodo temporal = cabeza;
            Nodo nuevo = new Nodo(elemento);
            nuevo.enlazarSiguiente(temporal);
            cabeza = nuevo;
        }
        tamanio++;
    }

    public int getSize() {
        return tamanio;
    }

    public Object dequeue() {
        int contador = 0; 
        Nodo temporal = cabeza; 

        while (contador < getSize() - 1) {
            temporal = temporal.obtenerSiguiente(); 
            contador++;
        }

        tamanio--;
        return temporal.obtenerElemento();
    }
    public Object front(){
        int contador = 0; //inicializo el contador en 0
        Nodo temporal = cabeza; // cargo en un nodo temporal la cabeza de la lista para comenzar la iteracion

        while (contador < getSize()) {
            temporal = temporal.obtenerSiguiente(); // hara la iteracion hasta que
            contador++; //incremento mi contador
        }

        return temporal.obtenerElemento();
    }

    public boolean estaVacia() {

        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    private void iniciarLista() {
        this.cabeza = null; // iniciamos la lista vacía
        this.tamanio = 0; //indica que esta vacia la lista
    }
}
