
package CalculadoraPostfix;
import java.util.Vector;
import java.util.EmptyStackException;

/**
 * Implementación de la interfaz Stack utilizando la clase Vector de Java.
 *
 * @param <T> El tipo de elementos que contendrá la pila.
 */
public class VectorStack<T> implements Stack<T> {
    // Almacena los elementos de la pila.
    private Vector<T> elements = new Vector<>();

    /**
     * Agrega un elemento a la parte superior de la pila.
     *
     * @param item El elemento que se va a agregar a la pila.
     */
    @Override
    public void push(T item) {
        elements.add(item);
    }

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     *
     * @return El elemento en la parte superior de la pila.
     * @throws EmptyStackException Si la pila está vacía.
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return El elemento en la parte superior de la pila.
     * @throws EmptyStackException Si la pila está vacía.
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.lastElement();
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Devuelve el número de elementos en la pila.
     *
     * @return El tamaño de la pila.
     */
    @Override
    public int size() {
        return elements.size();
    }
}
