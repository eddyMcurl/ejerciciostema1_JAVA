package txt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class copiarTexto {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
		 *  La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
		 */
		/**
		 * Par resolver este ejercicio lo quize resolver de una forma larga creando dos archivos 
		 * en uno le inserte la letra de una cacion y cree otra nada. luego cree el metodo para que reciba dos archivos 
		 * y ahi realizar la copia del primer archivo en el segundo
		 */
		File fichero1 = new File("D:\\Original.txt"); //creo el primer fichero
		try { //esto es para los errores
			
			PrintStream textoOriginal =new PrintStream(fichero1); //prinStream para insertar texto en el fichero
			textoOriginal.println("Dispárame tu adiós al corazón\r\n"
					+ "Ya deja de llorar y vamos dilo\r\n"
					+ "Que te vas, que me dejas, que ya no vale la pena\r\n"
					+ "Intentarlo de nuevo, que murió\r\n"
					+ "Yo sé, tu eres mariposa que vuela, buscando libertad\r\n"
					+ "Y yo un moribundo sin esperanzas, sabiendo que te vas\r\n"
					+ "Y quizás ahora ya no nos queda nada\r\n"
					+ "Pero ahora amor de mi vida si te vas, quiero decirte");
			textoOriginal.close(); //cierro el fichero
			
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No pude crear el fichero 1");
		}
		
		File fichero2 = new File("D:\\copia.txt");//creo el fichero dos donde se copiara el texto del fichero 1
		try {
			
			PrintStream textoCopia = new PrintStream(fichero2);//
			textoCopia.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("No pude crear el texto 2"+e.getMessage());
		}
		
		copiaFichero(fichero1, fichero2);
		System.out.println("FIN");
		
	}
	public static void copiaFichero(File fileIn, File fileOut) throws IOException { //metodo que recibe argumentos de tipo File
		
		
		try {
			InputStream ficheroAux = new FileInputStream(fileIn);
			byte[] texto=ficheroAux.readAllBytes(); //COPIO EL CONTENIDO DEL TEXO
			ficheroAux.close();
			
			PrintStream ficheroaux2 = new PrintStream(fileOut);
			ficheroaux2.write(texto); //COPIO EN EL ARCHIVO EL "TEXTO"
			System.out.println("TODO NICE");
			ficheroAux.close();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("no pude copiar el texto del ficher (ORIGINAL.txt) al fichero (COPIA.txt) "+e.getMessage());
		}
	}
}
