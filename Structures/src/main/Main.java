package main;

import java.util.ArrayList;

import colecciones.IList;
import colecciones.IStack;
import colecciones.List;

public class Main {
	
	

	public Main() {
	}
	
	public void balancedStrings(String  m) {
		boolean r = false;
		IStack<Character> stackP = new List();
		IStack<Character> stackC = new List();
		IStack<Character> stackK = new List();
		boolean exit = false;
		for (int i = 0; i < m.length() && !exit; i++) {
			if (m.charAt(i) == '(') {
				stackP.push('(');
			}
			else if (m.charAt(i) == ')') {
				if (!stackP.isEmpty()) {
					stackP.pop();
				}
				else {
					stackP.push(')');
					exit = true;
				}
			}
			else if (m.charAt(i) == '[') {
				stackC.push('[');
			}
			else if (m.charAt(i) == ']') {
				if (!stackC.isEmpty()) {
					stackC.pop();				
				}
				else {
					stackC.push(']');
					exit = true;
				}
			}
			else if (m.charAt(i) == '{') {
				stackK.push('{');
			}
			else if (m.charAt(i) == '}') {
				if (!stackK.isEmpty()) {
					stackK.pop();				
				}
				else {
					stackK.push('}');
					exit = true;
				}
			}
			
		}
		r = stackP.isEmpty() && stackC.isEmpty() && stackK.isEmpty();
		
		System.out.println(r);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.balancedStrings("][[[[]]");
		
		
		
			
		

	}

}
