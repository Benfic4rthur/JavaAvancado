// este bloco de codigo é responsavel por cadastrar disciplinas e notas de um aluno cujo nome e sexo foram informados manualmente via codigo

package exemploVetorAluno; // declaração do pacote que o codigo faz parte

import javax.swing.JOptionPane; // importação da classe JOptionPane

public class ArrayComExceptionSemNotaNegativa { // classe ExceptionComTratamento
	public static void main(String[] args) { // método main
		Aluno aluno = new Aluno(); // instancia um objeto aluno
		aluno.setNome("Arthur Benfica"); // seta o nome do aluno
		String saida = ""; // declaração de uma string para armazenar a saida

		try { // bloco Try/Catch utilizado para tratar erros
			String qtdmaterias = JOptionPane.showInputDialog("Quantas matérias deseja cadastrar?"); 
			// pede ao usuário a quantidade de materias a serem cadastradas
			int materias = Integer.parseInt(qtdmaterias); 
			// converte a string qtdmaterias para inteiro e armazena em materias
			for (int pos = 0; pos < materias; pos++) { // loop para percorrer a quantidade de materias
				Disciplinas disciplina = new Disciplinas(); // instancia um objeto disciplina
				String materia = JOptionPane.showInputDialog("Digite a " + (pos + 1) + "ª Disciplina:");
				// pede ao usuário a disciplina
				disciplina.setDisciplina(materia); // seta a disciplina na classe Disciplinas
				double[] notas = new double[3]; // cria um vetor de double com 3 posições
				for (int posi = 0; posi < notas.length; posi++) { // loop para percorrer as 3 notas
					boolean validInput = false; // cria uma variavel booleana para controlar o loop interno
					while (!validInput) { // loop para validar a entrada de dados
						try { // bloco try/catch para tratar erros
							String valor = JOptionPane.showInputDialog( // pede para o usuário a nota
									"Digite a " + (posi + 1) + "ª nota de " + disciplina.getDisciplina());
							double nota = Double.parseDouble(valor);
							if (nota < 0) { //cria um if que informa um erro de nota menor que 0
								JOptionPane.showMessageDialog(null, "A nota deve ser maior ou igual a zero.", "Erro",
										JOptionPane.ERROR_MESSAGE);
							} else {
								notas[posi] = nota;
								validInput = true; // muda o valor da variavel booleana para sair do loop interno
							}
						} catch (NumberFormatException e) { // caso o usuário digite uma string em vez de um double
							int opcao = JOptionPane.showConfirmDialog(null, "Valor inválido! Deseja tentar novamente?",
									"Erro", JOptionPane.YES_NO_OPTION); // pede ao usuário se deseja tentar novamente
							if (opcao == JOptionPane.NO_OPTION) { // caso a opção seja não
								throw e; // lança a exception
							}
						}
					}
				}
				disciplina.setNota(notas);
				aluno.getDisciplinas().add(disciplina);
			}

			saida = saida + "nome do aluno: " + aluno.getNome() + "\n";
			saida = saida + "---------DISCIPLINAS DO ALUNO----------" + "\n";

			for (Disciplinas d : aluno.getDisciplinas()) { // loop para percorrer o vetor de disciplinas da classe Aluno

				saida = saida + "\n"; // adiciona uma quebra de linha no que será mostrado para o usuário
				saida = saida + "Disciplina: " + d.getDisciplina() + "\n";
				// adiciona ao que será mostrado para o usuário o nome da disciplina

				double somanotas = 0.0; // cria uma variavel para armazenar a soma das notas
				double notamaxima = 0.0; // cria uma variavel para armazenar a nota maxima
				double notaminima = 0.0; // cria uma variavel para armazenar a nota minima
				for (int pos = 0; pos < d.getNota().length; pos++) { // loop para percorrer o vetor de notas da
																		// disciplina
					saida = saida + "Nota " + (pos + 1) + ": " + d.getNota()[pos] + "\n";
					// adiciona ao que será mostrado para o usuário a nota
					somanotas += d.getNota()[pos]; // soma todas as notas
					double media = somanotas / d.getNota().length; // calcula a média das notas
					// notas.length - 1 faz com que a média seja impressa sempre após o ultimo
					// elemento do for
					if (pos == d.getNota().length - 1) { // caso a posição seja a ultima
						saida = saida + "A média das notas é: " + String.format("%.2f", media) + "\n";
						// adiciona ao que será mostrado para o usuário a média
					}
					if (pos == 0) { // caso a posição seja a primeira execução
						notamaxima = d.getNota()[pos]; // armazena a nota maxima

					} else { // caso a posição seja diferente da primeira
						if (d.getNota()[pos] > notamaxima) { // caso a nota seja maior que a nota maxima
							notamaxima = d.getNota()[pos]; // armazena a nota maxima
						}
					}
					// Verifica a posição do vetor
					if (pos == 0) {
						// Atribui a variável notaminima o valor da posição 0 do vetor
						notaminima = d.getNota()[pos];

						// Caso a posição seja diferente de 0
					} else {
						// Compara se o valor da posição do vetor é menor que a variável notamaxima
						if (d.getNota()[pos] < notaminima) {
							// Atribui a variável notaminima o valor da posição do vetor
							notaminima = d.getNota()[pos];
						}
					}
				}
				// Atribui a variável saida os valores das variáveis notaminima e notamaxima
				saida = saida + "A maior nota em  " + d.getDisciplina() + " foi " + notamaxima + " e a menor nota foi "
						+ notaminima + "\n";
			}
			// Apresenta a variável saida na tela
			JOptionPane.showMessageDialog(null, saida);
		} // Caso ocorra algum erro
		catch (Exception e) {
			// Apresenta uma mensagem na tela
			int opcao = JOptionPane.showConfirmDialog(null, "Ocorreu um erro! Deseja continuar de onde parou?", "Erro",
					JOptionPane.YES_NO_OPTION);
			// Caso a opção seja sim
			if (opcao == JOptionPane.YES_OPTION) {
				// Chama o main novamente para continuar a execução
				main(args);
				// Caso a opção seja não
			} else {
				// Apresenta uma mensagem na tela
				JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário.");
			}
		}
	}
}