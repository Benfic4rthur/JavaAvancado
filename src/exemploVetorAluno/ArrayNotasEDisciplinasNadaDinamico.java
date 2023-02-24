package exemploVetorAluno;

public class ArrayNotasEDisciplinasNadaDinamico {
	public static void main(String[] args) {
		//este exemplo não possui dinamismo algum
		//criamos o aluno
		Aluno aluno = new Aluno();
		aluno.setSexo("M");
		aluno.setNome("Arthur Benfica");
		//criamos a primeira disciplina
		Disciplinas disciplina = new Disciplinas();
		disciplina.setDisciplina("java");
		//criamos as notas da disciplina
		double[] notas = {100.0, 75.9, 89.8};
		disciplina.setNota(notas);
		//enviamos as notas para a disciplina
		aluno.getDisciplinas().add(disciplina);
		
		//criamos a segunda disciplina
		Disciplinas disciplina2 = new Disciplinas();
		disciplina2.setDisciplina("JS");
		//criamos as notas da segunda disciplina
		double[] notas2 = {75.9, 83.6, 99.9};
		disciplina2.setNota(notas2);
		//enviamos as notas para a disciplina
		aluno.getDisciplinas().add(disciplina2);
			
		//imprime o nome do aluno
		System.out.println("nome do aluno: "+aluno.getNome());
		System.out.println("---------DISCIPLINAS DO ALUNO----------");
		//criamos um for para percorrer a lista de disciplinas
		for (Disciplinas d : aluno.getDisciplinas()) {
			//buscamos o nome da disciplina
			System.out.println("");
			System.out.println("Disciplina: "+d.getDisciplina());
			System.out.println("Notas da disciplina: "+d.getDisciplina());
			//buscamos as notas da disciplina
			double somanotas = 0.0;
			double notamaxima = 0.0;
			double notaminima = 0.0;
			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + (pos + 1) + ":" + d.getNota()[pos]);
				somanotas += d.getNota()[pos];
				double media = somanotas / d.getNota().length;
				// notas.length - 1 faz com que a média seja impressa sempre após o ultimo elemento do for
				if (pos == d.getNota().length - 1) {
					System.out.println("A média das notas é: " + media);
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
			System.out.println("A maior nota em  "+d.getDisciplina()+" é "+notamaxima);
			System.out.println("A menor nota em  "+d.getDisciplina()+" é "+notaminima);
			
		}
	}

}