package colecciones;

public class Stack<T> {
	private NodoEnlazadoSimple<T> start;
	private int size;
	

	public Stack() {
		start = null;
		size = 0;
	}
	public boolean isEmpty() {
		return start == null;
	}
	public int getSize() {
		return size;
	}
	public void push(T elem) {
		NodoEnlazadoSimple<T> nodo = new NodoEnlazadoSimple<T>(elem);
	}

}
