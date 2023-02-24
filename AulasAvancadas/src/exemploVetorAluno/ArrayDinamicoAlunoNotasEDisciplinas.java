package exemploVetorAluno;

import javax.swing.JOptionPane;

public class ArrayDinamicoAlunoNotasEDisciplinas {
	public static void main(String[] args) {
		try {
			// exemplo completamente dinamico
			// criamos o aluno
			Aluno aluno = new Aluno();
			aluno.setSexo("M");
			aluno.setNome("Arthur Benfica");

			String qtdmaterias = JOptionPane.showInputDialog("Quantas matérias deseja cadastrar?");
			int materias = Integer.parseInt(qtdmaterias);
			for (int pos = 0; pos < materias; pos++) {
				Disciplinas disciplina = new Disciplinas();
				String materia = JOptionPane.showInputDialog("Digite a " + (pos + 1) + "ª Disciplina:");
				disciplina.setDisciplina(materia);
				double[] notas = new double[3]; // criando um novo array para armazenar as notas
				for (int posi = 0; posi < notas.length; posi++) {
					String valor = JOptionPane
							.showInputDialog("Digite a " + (posi + 1) + "ª nota de " + disciplina.getDisciplina());
					notas[posi] = Double.parseDouble(valor);
				}
				disciplina.setNota(notas);
				aluno.getDisciplinas().add(disciplina);
			}
			// imprime o nome do aluno
			System.out.println("nome do aluno: " + aluno.getNome());
			System.out.println("---------DISCIPLINAS DO ALUNO----------");
			// criamos um for para percorrer a lista de disciplinas
			for (Disciplinas d : aluno.getDisciplinas()) {
				// buscamos o nome da disciplina
				System.out.println("");
				System.out.println("Disciplina: " + d.getDisciplina());
				// buscamos as notas da disciplina
				double somanotas = 0.0;
				double notamaxima = 0.0;
				double notaminima = 0.0;
				for (int pos = 0; pos < d.getNota().length; pos++) {
					System.out.println("Nota " + (pos + 1) + ":" + d.getNota()[pos]);
					somanotas += d.getNota()[pos];
					double media = somanotas / d.getNota().length;
					// notas.length - 1 faz com que a média seja impressa sempre após o ultimo
					// elemento do for
					if (pos == d.getNota().length - 1) {
						System.out.println("A média das notas é: " + media);
					}
					if(pos == 0) {
						notamaxima = d.getNota()[pos];
						notaminima = d.getNota()[pos];
						
					}else {
						if(d.getNota()[pos] > notamaxima && d.getNota()[pos]< notaminima ){
							notamaxima = d.getNota()[pos];
							notaminima = d.getNota()[pos];
						}
					}if(pos == 0) {
						
						notaminima = d.getNota()[pos];
						
					}else {
						if(d.getNota()[pos]< notaminima ){
							
							notaminima = d.getNota()[pos];
						}
					}
					
				}System.out.println("A maior nota em  "+d.getDisciplina()+" é "+notamaxima);
				System.out.println("A menor nota em  "+d.getDisciplina()+" é "+notaminima);
				/*
				 * outra forma de calcular a média sem gerar a mesma a cada loop do for
				 * (pouparia processamento) for (int pos = 0; pos < d.getNota().length; pos++) {
				 * System.out.println("Nota " + (pos + 1) + ":" + d.getNota()[pos]); somanotas
				 * += d.getNota()[pos]; } double media = somanotas / d.getNota().length;
				 * System.out.println("A média das notas é: " + media); }*
				 */
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor informado é inválido!");
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Algum valor informado é nulo!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro não tratado: " + e.getMessage());
		}
	}
}