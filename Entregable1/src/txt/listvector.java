package txt;

import java.util.Vector;

public class listvector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
		 */
		Vector<Integer> lista= new Vector<>();
		
		lista.add(1);//0
		lista.add(2);//1
		lista.add(3);//2
		lista.add(4);//3
		lista.add(5);//4
		
		System.out.println("DATOS DEL VECTOR: "+lista);
		
		lista.remove(1);
		lista.remove(1);
		
		System.out.println("DATOS DEL VECTOR SIN EL 2do Y 3er ELEMENTO"+lista);
		
		
	}

}
