package main;

import java.util.ArrayList;

import colecciones.IList;
import colecciones.List;

public class Main {
	
	

	public Main() {
	}

	public static void main(String[] args) {
		Main m = new Main();
		IList<Integer> lista = new List();
		lista.add(7);
		System.out.println(lista.obtenerElemento(0));
		
			
		

	}

}
