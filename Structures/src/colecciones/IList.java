package colecciones;

public interface IList<T> {	
	void add(T elem);
//	void add(int pos, T elem);
	void remove(T elem);
	int size();
	boolean exist(T elem);
	int buscar(T elem);
	T get(int pos);
	boolean isEmpty();
	boolean eliminarTodos();
}
