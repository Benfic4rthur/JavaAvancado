package mediaComLista;
//importar o pacote JOptionPane
import javax.swing.JOptionPane;

import exemplosExcecao.Aluno;
import exemplosExcecao.ObjetoDisciplinaComLista;
//cria a classe
public class ExecutavelListaDinamica {
	//cria a classe main (principal ou classe mãe)
	public static void main(String[] args) {
		//instancia o objeto aluno (classe aluno)
		Aluno aluno = new Aluno();
		//recebe o sexo do aluno pelo usuário
		String sexString = JOptionPane.showInputDialog("Selecione o sexo do aluno (M/F):");
		//seta o sexo do aluno com o valor da variavel acima que recebeu ele
		//seta na classe aluno, por isso aluno.setSexo(valor da variavel que recebeu do usuario)
		aluno.setSexo(sexString);
		//mesma situação que a de cima, só que com nome
		String nomeString = JOptionPane.showInputDialog("Informe o nome do aluno:");
		aluno.setNome(nomeString);
		//cria um for com uma variavel pos (posição) recebendo o valor 1
		//até que pos seja menos ou igual a 4 ele vai acrescentar +1 em pos
		for(int pos = 1; pos <= 4; pos++) {
			//pede para que o usuario informe a disciplina, aqui começa o dinamismo, 4 viraram 1 linha
			String nomeDisciplina = JOptionPane.showInputDialog("Informe a "+pos+"ª disciplina:");
			//pede que o usuario informe a nota
			String notaDisciplina = JOptionPane.showInputDialog("Informe a nota em "+ nomeDisciplina +" do aluno " + aluno.getNome() + ": ");
			//instancia um objeto disciplina da classe ObjetoDisciplinaComLista
			ObjetoDisciplinaComLista discilplinaDaLista = new ObjetoDisciplinaComLista();
			//no objeto rescem instanciado ele inclui o valor de disciplina recebido pelo usuario
			discilplinaDaLista.setDisciplina(nomeDisciplina);
			//same thing para nota
			discilplinaDaLista.setNota(Double.parseDouble(notaDisciplina));
			//aqui ele adiciona esses valores recebidos no objeto acima na lista, com o objeto
			//praticamente o add injeta o objeto na lista
			aluno.getDisciplinas().add(discilplinaDaLista);
		}
		//pergunta se o usuário quer calcular as médias
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da média?");
		// se a resposta for sim (0), ele entra no if que faz o calculo
		if (resposta == 0) {
			//aqui ele apresenta a média que foi calculada na classe Aluno
			//e passada com o objeto aluno(referencia)
			JOptionPane.showMessageDialog(null, aluno.getAlunoAprovado());
			//se não
		} else {
			// caso o usuário clique em não (1) ou cancelar(3), ele irá cair nesta condição
			JOptionPane.showMessageDialog(null,
					"Foram informados nome do aluno e notas, mas não foi solicitado o calculo de média");
		}
	}
}