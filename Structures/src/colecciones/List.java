package colecciones;

public class List<T> implements IList<T>{
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

	@Override
	public void remove(T elem) {
		if (exist(elem)) {
			if (first.getInfo() == elem) {
				
			}
		}
		
	}
	

	@Override
	public int longitud() {
		// TODO Auto-generated method stub
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
	public T obtenerElemento(int pos) {
		int c = 0;
		Node<T> nodo = null;
		Node<T> nodoReturn = null;
		if (first != null) {
			if (pos == 0) {
				nodo = first;
			}
			else {
				boolean exit = false;
				nodo = first;
				while (nodo != null && !false) {
					if (pos == c) {
						nodoReturn = nodo;
						exit = true;
					}
					else {
						nodo = nodo.getNext();
						c++;
					}
					
					
				}
			}
		}
		
		
		return nodo.getInfo();
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

	

}
