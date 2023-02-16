package entendendoArraysEVetores;

public class ArrayVetores {
	public static void main(String[] args) {
		/* Array pode ser de todos os tipos de dados e objetos tambem */
		// array sempre deve ter uma quantidade de posições estipulada
		double notas[] = new double[5];
		// ou poderia ser double[] notas = new double[4];
		notas[0] = 9.8;
		notas[1] = 11.5;
		notas[2] = 9.2;
		notas[3] = 6.3;
		notas[4] = 8.3;
		/*
		 * fomas de impressão dos dados do Array, sem dinamismo
		 * System.out.println("nota 1: "+notas[0]);
		 * System.out.println("nota 2: "+notas[1]);
		 * System.out.println("nota 3: "+notas[2]);
		 * System.out.println("nota 4: "+notas[3]); 
		 * ou
		 * System.out.print("nota 1: "+notas[0]+", ");
		 * System.out.print("nota 2: "+notas[1]+", ");
		 * System.out.print("nota 3: "+notas[2]+", ");
		 * System.out.print("nota 4: "+notas[3]);
		 */
		// forma de impressão dos dados do array dinamicamente
		// o (pos+1) é utilizado pois a primeira posição inicialmente é zero, mas para
		// ficar de acordo é utilizado o +1 para subir uma posição
		// notas.lenght pega o tamanho de dados do array, para que o for seja dinamico e
		// sem dados informados manualmente pelo dev

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("nota " + (pos + 1) + ": " + notas[pos]);
		}

	}
}