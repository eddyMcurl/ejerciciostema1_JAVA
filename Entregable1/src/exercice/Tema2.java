package exercice;

import java.util.Scanner;

public class Tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese precio");
		double precio=scanner.nextDouble();
		Iva(precio);
	}
	public static void Iva(double precio) {
		double iva=precio*0.21;
		double total=precio+iva;
		System.out.println("EL PRECIO CON IVA ES: "+ total);
	}
}
