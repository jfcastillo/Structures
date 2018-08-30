package colecciones;

import sun.util.locale.provider.AuxLocaleProviderAdapter;

public class List<T> implements IList<T>, IStack<T>{
	private Node<T> first;
	private int size;

	public List() {
		first = null;
		size = 0;		
	}

	/**
	 * Add an element at the end of the list
	 */	
	@Override
	public void add(T elem) {
		if (first == null) {
			first = new Node<T>(elem);
			size++;
		}
		else {
			Node<T> nodeAux = first;
			while (nodeAux.getNext() != null) {
				nodeAux = nodeAux.getNext();				
			}
			Node<T> nodeAdd = new Node<T>(elem);
			nodeAux.setNext(nodeAdd);
			size++;
		}

	}
//	@Override
//	public void add(int pos, T elem) {
//		int c = 0;
//		boolean r = false;
//		if (pos > size) {
//			r = false;
//		} else {
//			Node<T> nodeAux = first;
//			while (nodeAux.getNext() != null) {				
//			}
//		}		
//	}

	/**
	 * Search the element to remove
	 * and remove if it exist
	 */
	@Override
	public void remove(T elem) {
		if (exist(elem)) {
			if (first.getInfo() == elem) {
				first = first.getNext();
				size--;
			}
			else {
				Node aux = first;
				while (aux.getNext().getInfo() != elem) {
					aux = aux.getNext();					
				}
//				Node next = aux.getNext().getNext();
//				aux.setNext(next);
				aux.disconectNext();
				size--;
			}			
		}		
	}
	

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean exist(T elem) {
		Node aux = first;
		boolean exist = false;
		if (!isEmpty()) {
			while (aux != null && exist != true) {
				if (aux.getInfo() == elem) {
					exist = true;
				}
				else
				aux = aux.getNext();
				
			}
		}
		
		return exist;
	}

	@Override
	public int buscar(T elem) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int pos) {
		int c = 0;
		Node<T> nodo = null;
		Node<T> nodoReturn = null;
		if (pos >= 0 && pos<size) {
			if (pos == 0) {
				nodoReturn = first;
			}
			else {
				boolean exit = false;
				nodo = first;
//				while (nodo != null && !exit) {
//					if (pos == c) {
//						nodoReturn = nodo;
//						exit = true;
//					}
//					else {
//						nodo = nodo.getNext();
//						c++;
//					}					
//				}
				for (int i = 0; i < pos; i++) {
					nodo = nodo.getNext();
				}
				nodoReturn = nodo;
			}
		}	
		
		return nodoReturn.getInfo();
	}

	@Override
	public boolean isEmpty() {
		return first==null;
	}

	@Override
	public boolean eliminarTodos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
	}

	

}
