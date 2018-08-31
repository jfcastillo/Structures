package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;

import colecciones.IList;
import colecciones.IStack;
import colecciones.List;

public class Main {
	
	

	public Main() {
	}
	/**
	 * Show in console if the string is balanced
	 * @param m
	 */
	public static void balancedStrings(String  m) {
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
	/**
	 * Read the file testCase.txt and execute the method balancedStrings
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void readFile() throws FileNotFoundException, IOException  {
		String ms = "";
		FileReader fr = new FileReader("files/testCases.txt");
		BufferedReader br = new BufferedReader(fr);
		while ((ms = br.readLine()) != null) {
			balancedStrings(ms);			
		}
		br.close();
		
	}

	public static void main(String[] args) {
		Main m = new Main();
		
		try {
			readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin");
		
		
		
			
		

	}

}
