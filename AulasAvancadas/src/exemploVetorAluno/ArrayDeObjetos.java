//este exemplo não possui dinamismo algum
package exemploVetorAluno;

public class ArrayDeObjetos {
	public static void main(String[] args) {

		//criamos o aluno
		Aluno aluno = new Aluno();
		aluno.setSexo("M");
		aluno.setNome("Arthur Benfica");
		//criamos a primeira disciplina
		Disciplinas disciplina = new Disciplinas();
		disciplina.setDisciplina("java");
		//criamos as notas da disciplina
		double[] notas = { 100.0, 75.9, 89.8 };
		disciplina.setNota(notas);
		//enviamos as notas para a disciplina
		aluno.getDisciplinas().add(disciplina);

		//criamos a segunda disciplina
		Disciplinas disciplina2 = new Disciplinas();
		disciplina2.setDisciplina("JS");
		//criamos as notas da segunda disciplina
		double[] notas2 = { 75.9, 83.6, 99.9 };
		disciplina2.setNota(notas2);
		//enviamos as notas para a disciplina
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno[] arrayAlnuos = new Aluno[1]; //cria um array de alunos
		arrayAlnuos[0] = aluno; //passa o valor de aluno para o array criado acima, na primeira posição
		for(int pos = 0; pos < arrayAlnuos.length; pos++) { //cria um for para percorrer o array
			System.out.println("o nome do aluno é "+ arrayAlnuos[pos].getNome());//teste para imprimir o nome do aluno
			//o for a baixo é um exemplo mais complicado de for, vai instaciar disciplinas e vai pegar a posição
			//informada do arrayAlunos para recuperar as disciplinas daquele aluno ou seja,
			//abre o objeto disciplinas e busca as disciplinas daquele aluno em especifico, não pega nada de informação
			//de nenhum outro aluno
			for(Disciplinas d : arrayAlnuos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é "+d.getDisciplina());
				//O for abaixo já sabe a posição da disciplina e vai coletar as notas que foram informadas para esta disciplina
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("Nota "+(posnota+1)+"ª : " + d.getNota()[posnota]);
				}
			}
		}
	}
}