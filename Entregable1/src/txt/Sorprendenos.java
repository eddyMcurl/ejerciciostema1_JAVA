package txt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorprendenos {
	/*
	 * Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, 
	 * excepciones, un HashMap y un ArrayList, LinkedList o array.
	 */
	static ArrayList<String> listaEstudianteStrings = new ArrayList<>();
	static File listaEstudiantesFile = new File("D:\\listaEstudiantes.txt");
	
	static final int contraseñaAdmin= 123;
	static final String nombreAdminString ="admin";
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//PROGRAMA QUE BUSCA MENU QUE MUESTRE MENU DE LISTA DE ESTUDIANTES EN CONSOLA O FICHEROS Y PERMITA INGRESAR
		//MAS ESTUDIANTES SOLO SIENDO ADMIN O DOCENTE
		
		listaEstudianteStrings.add("JORGE LUNA");
		listaEstudianteStrings.add("JUAN CUBITO");
		listaEstudianteStrings.add("MARIO MENDOZA");
		

		int respuesta;
		
		do {
			System.out.println("MENU");
			
			System.out.println("1- INGRESAR COMO DOCENTE Y AGREGAR ESTUDIANTE NUEVO ");
			System.out.println("2- MOSTRAR EN CONSOLA LISTA ESTUDIANTES");
			System.out.println("3- CREAR UN ARCHIVO CON LISTA DE ESTUDIANTES");
			
						
			respuesta=scanner.nextInt();
			MenuSwitch(respuesta);

		}while (respuesta!=0);
		
		System.out.println("Programa fianlizo");

	}
		public static void MenuSwitch(int respuesta)   {

			
			String nombreString;
			int contraseña;
			switch (respuesta) {
			case	 1:
				System.out.println("ESTIMADO DOCENTE INGRESE NOBRES Y CONTRASEÑA DE ADMINISTRADOR");
				System.out.println("NOMBRE");
				nombreString=scanner.next();
				System.out.println("CONTRASEÑA");
				contraseña=scanner.nextInt();
				if(nombreString.equalsIgnoreCase(nombreAdminString)&& contraseña==contraseñaAdmin) {
					AñadirEstudiante();
				}else {
					System.out.println("DATOS INCORRECTOS");
					System.out.println("FIN");
				}
				break;
			case 2:
				System.out.println("LISTA ESTUDIANTES");
				listaEstudiantes();
				break;
			case 3:
				System.out.println("GENERANDO FICHERO");
				crearfichero();
				break;
		
			default:
				System.out.println("NO HAS INGRESADO UNA DE LAS OPCIONES DE MENU");
				System.out.println("FIN");
				break;
			}
		}
		
		public static void AñadirEstudiante() {
			Scanner sc= new Scanner(System.in);
			String nombreDELnuevo;
			System.out.println("NOMBRE DEL ESTUDIANTE");
			
			nombreDELnuevo=sc.nextLine();
			listaEstudianteStrings.add(nombreDELnuevo);
			System.out.println("ESTUDIANTE AÑADIDO");
			
			
		}
		public static void listaEstudiantes() {
			for (String nombreString : listaEstudianteStrings) {
				System.out.println(nombreString);
			}
		}
		public static void crearfichero()  {
			
			
			try {
				PrintStream probamos = new PrintStream (listaEstudiantesFile);
				for(int i=0;i<listaEstudianteStrings.size();i++) {
					probamos.print(listaEstudianteStrings.get(i).toString()+"\n");
				}
				probamos.close();
				InputStream lecturadeFichero = new FileInputStream(listaEstudiantesFile);
				byte [] a = lecturadeFichero.readAllBytes();
				lecturadeFichero.close();
				
				OutputStream copiaFicherOutputStream = new FileOutputStream("D:\\copiadelistaEstudinates.txt");
				copiaFicherOutputStream.write(a);
				copiaFicherOutputStream.close();
				System.out.println("GENERADO BUSQYE EN SU DISCO D:\\ ");
				
			} catch (Exception e) {
					System.out.println("ERROR EN METODO AÑADIR ESTUDIANTE "+e.getMessage());
				} 
		}
}
