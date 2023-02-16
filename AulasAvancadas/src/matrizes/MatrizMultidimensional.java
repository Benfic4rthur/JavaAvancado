package matrizes;

public class MatrizMultidimensional {
	public static void main(String[] args) {
	  //int notas[] = new int[1]; isso é um array
		int notas[][] = new int[2][4]; //isso é uma matriz
		
		notas[0][0] = 90;
		notas[0][1] = 80;
		notas[0][2] = 70;
		notas[0][3] = 60;
		
		notas[1][0] = 70;
		notas[1][1] = 80;
		notas[1][2] = 90;
		notas[1][3] = 100;

		for(int poslinha = 0; poslinha < notas.length; poslinha++) { //percorre as linhas
			System.out.println("================================================");
			                                   //↓aqui ele vai pegar a posição da linha e o tamanho do array de linhas
			for(int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {//percorre as colunas
				System.out.println("matriz " +notas[poslinha][poscoluna]);
				
			}
		}
	}
}