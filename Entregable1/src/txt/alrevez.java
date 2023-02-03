package txt;

public class alrevez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
		 */
		
		String saludo="hola mundo";
		char cadenaALrevezString=' ';
		char caracter =' ';
		System.out.println(saludo.length());
		for(int i=saludo.length()-1;i>=0;i--) {
			cadenaALrevezString= saludo.charAt(i);
			System.out.print(cadenaALrevezString);
		}
		System.out.println();
		System.out.println("fin");
	}

}
