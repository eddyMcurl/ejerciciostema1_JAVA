package txt;

import java.util.Scanner;

public class throwsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			
		System.out.println("Ingresa nuro 1");
		int a=scanner.nextInt();
		System.out.println("Ingresa nuro 1");
		int b=scanner.nextInt();
		DividePorCero(a, b);
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Solo se aceptan numeros "+e.getMessage());
		}
		
		
	}
	public static void  DividePorCero(int a, int b) throws ArithmeticException {
		int resultado;
		
		try {
			resultado=a/b;
			System.out.println("Divicion es : "+resultado);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Nose puede hacer eso "+e.getMessage());
		}
		
	}
}
