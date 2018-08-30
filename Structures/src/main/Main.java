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
		lista.add(0);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.remove(4);
		System.out.println(lista.get(0));		
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		System.out.println(lista.get(3));
//		System.out.println(lista.get(4));
		
			
		

	}

}
