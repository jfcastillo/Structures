package colecciones;

public class ListaEnlazadaSimple<T> implements IList<T>{
	private NodoEnlazadoSimple<T> primer;
	private int longitud;

	public ListaEnlazadaSimple() {
		
	}

	@Override
	public boolean agregar() {
		
		return false;
	}

	@Override
	public boolean asignar(T elem) {
		if (primer == null) {
			primer.setInfo(elem);
		}
		else {
			NodoEnlazadoSimple<T> nodoAux = primer;
			while (nodoAux.getSiguiente() != null) {
				nodoAux = nodoAux.getSiguiente();				
			}
			NodoEnlazadoSimple<T> nodoAgregar = new NodoEnlazadoSimple<T>(elem);
			nodoAux.setSiguiente(nodoAgregar);
			longitud++;
		}
		return false;
	}

	@Override
	public boolean eliminar(T elem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T eliminar(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int longitud() {
		// TODO Auto-generated method stub
		return longitud;
	}

	@Override
	public boolean estaElemento(T elem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int buscar(T elem) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T obtenerElemento(int pos) {
		int c = 0;
		NodoEnlazadoSimple<T> nodo = null;
		NodoEnlazadoSimple<T> nodoReturn = null;
		if (primer != null) {
			if (pos == 0) {
				nodo = primer;
			}
			else {
				boolean exit = false;
				nodo = primer;
				while (nodo != null && !false) {
					if (pos == c) {
						nodoReturn = nodo;
						exit = true;
					}
					else {
						nodo = nodo.getSiguiente();
						c++;
					}
					
					
				}
			}
		}
		
		
		return nodo.getInfo();
	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		return primer==null;
	}

	@Override
	public boolean eliminarTodos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean asignar(int pos, T elem) {
		// TODO Auto-generated method stub
		return false;
	}

}
