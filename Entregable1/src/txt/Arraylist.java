package txt;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list =new ArrayList<String>();
		
		list.add("juan");
		list.add("jorge");
		list.add("eddy");
		list.add("zeus");
		
		System.out.println("ELEMENTOS DE ARRAYLIST "+list);
		
		LinkedList<String> listaenlazada = new LinkedList<String>(list);
		
		System.out.println("ELEMENTOS DE LINKEDLIST "+listaenlazada);
		
	}

}
