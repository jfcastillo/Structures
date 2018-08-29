package colecciones;

public interface IListaEnlazadaSimple<T> {
	boolean agregar();
	boolean asignar(T elem);
	boolean asignar(int pos, T elem);
	boolean eliminar(T elem);
	T eliminar(int pos);
	int longitud();
	boolean estaElemento(T elem);
	int buscar(T elem);
	T obtenerElemento(int pos);
	boolean estaVacia();
	boolean eliminarTodos();
}
