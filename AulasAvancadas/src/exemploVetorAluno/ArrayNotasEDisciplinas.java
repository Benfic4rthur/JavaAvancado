package exemploVetorAluno;

public class ArrayNotasEDisciplinas {
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
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota "+(pos+1)+":"+d.getNota()[pos]);
			}
		}
	}

}