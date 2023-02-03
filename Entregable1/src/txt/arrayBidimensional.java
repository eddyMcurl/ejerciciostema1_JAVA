package txt;

public class arrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]numeros = {{1,2},{3,4},{5,6}};
		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros[i].length;j++) {
				System.out.println("Posicion X: "+(i+1)+" Posicion Y: "+(j+1)+" = "+numeros[i][j]);
			}
		}
				
	}

}
