package entendendoArraysEVetores;

import javax.swing.JOptionPane;

public class NovexemploArrays {
	public static void main(String[] args) {
		/*Array pode ser de todos os tipos de dados e objetos tambem */
		//array sempre deve ter uma quantidade de posições estipulada

		String posicoes = JOptionPane.showInputDialog("Quantas posições nosso array vai ter?");
		double notas[] = new double[Integer.parseInt(posicoes)];
		//este for vai pedir as notas conforme a quantidade informada acima
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Digite a " + (pos + 1) + "ª nota:");
			notas[pos] = Double.valueOf(valor);
		}
		//essa variavel que fará o papel de somar as notas, sempre precisa ser criada fora do for
		double somanotas = 0.0;
		//esse for vai imprimir as notas e a media
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("nota " + (pos + 1) + ": " + notas[pos]);
			somanotas += notas[pos];
			double media = somanotas / notas.length;
			//notas.length - 1 faz com que a média seja impressa sempre após o ultimo elemento do for
			if (pos == notas.length - 1) {
				System.out.println("A média das notas é: " + media);
			}
		}
	}
}