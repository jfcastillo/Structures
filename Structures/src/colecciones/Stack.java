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
		nodo.setInfo(elem);
		
		if (isEmpty()) {
			start = nodo;
		}
		else {
			nodo.setSiguiente(start);
			start = nodo;
		}
		size++;
	}
	public void pop() {
		if (!isEmpty()) {
			start = start.getSiguiente();
			size--;
			
		}
	}
	public T top() throws Exception{
		if (!isEmpty()) {
			return start.getInfo();
		}
		else {
			throw new Exception("The stack is empty");
		}
	}

}
