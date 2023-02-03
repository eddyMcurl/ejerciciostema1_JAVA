package txt;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LECTURA DE TEXTO");
		//File texto = new File("D:\\moribundo.txt");
		try {
		InputStream fichero = new FileInputStream ("D:\\moribundo.txt");
		
			try {
				byte datos[] = new byte [5];
				
				int dato = fichero.read(datos);
				while (dato != -1) {
				System.out.print(datos.toString());
				dato =fichero.read(datos);
				fichero.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("error "+e.getMessage());
			}
			
			
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("idiota ");
		}
		
	}

}
