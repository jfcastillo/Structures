//package colecciones;
//
//public class Stack<T> {
//	private Node<T> start;
//	private int size;
//	
//
//	public Stack() {
//		start = null;
//		size = 0;
//	}
//	public boolean isEmpty() {
//		return start == null;
//	}
//	public int getSize() {
//		return size;
//	}
//	public void push(T elem) {
//		Node<T> nodo = new Node<T>(elem);
//		nodo.setInfo(elem);
//		
//		if (isEmpty()) {
//			start = nodo;
//		}
//		else {
//			nodo.setSiguiente(start);
//			start = nodo;
//		}
//		size++;
//	}
//	public void pop() {
//		if (!isEmpty()) {
//			start = start.getNext();
//			size--;
//			
//		}
//	}
//	public T top() throws Exception{
//		if (!isEmpty()) {
//			return start.getInfo();
//		}
//		else {
//			throw new Exception("The stack is empty");
//		}
//	}
//
//}
