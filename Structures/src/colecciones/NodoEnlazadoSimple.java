package colecciones;

public class NodoEnlazadoSimple<P> {
	
	private NodoEnlazadoSimple<P> siguiente;
	private P info;
	
	public NodoEnlazadoSimple(P elem){
		info = elem;
	}
	public boolean NodoEnlazadoSimple() {
		return true;
	}
	public NodoEnlazadoSimple<P> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoEnlazadoSimple<P> siguiente) {
		this.siguiente = siguiente;
	}
	public P getInfo() {
		return info;
	}
	public void setInfo(P info) {
		this.info = info;
	}
	
	
}
