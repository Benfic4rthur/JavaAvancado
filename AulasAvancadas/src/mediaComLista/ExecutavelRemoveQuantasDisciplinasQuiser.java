package mediaComLista;

import javax.swing.JOptionPane;

import exemplosExcecao.Aluno;
import exemplosExcecao.ObjetoDisciplinaComLista;

public class ExecutavelRemoveQuantasDisciplinasQuiser {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		String sexString = JOptionPane.showInputDialog("Selecione o sexo do aluno (M/F):");
		aluno.setSexo(sexString);
		String nomeString = JOptionPane.showInputDialog("Informe o nome do aluno:");
		aluno.setNome(nomeString);
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Informe a " + pos + "ª disciplina:");
			String notaDisciplina = JOptionPane
					.showInputDialog("Informe a nota em " + nomeDisciplina + " do aluno " + aluno.getNome() + ": ");
			ObjetoDisciplinaComLista discilplinaDaLista = new ObjetoDisciplinaComLista();
			discilplinaDaLista.setDisciplina(nomeDisciplina);
			discilplinaDaLista.setNota(Double.parseDouble(notaDisciplina));
			aluno.getDisciplinas().add(discilplinaDaLista);
		}
		// pergunta ao usuario se ele deseja remover disciplinas
		int remove = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		// 0 = sim
		// se a resposta for 0, irá cair no IF
		if (remove == 0) {
			// CRIA UMA VARIAVEL COM O VALOR 0(SERIA O SIM), PARA QUE EO WHILE FAÇA SENTIDO
			//coloquei ele para receber o remove, já que o remove é o valor de zero do IF
			int continuaRemoverInteger = remove;
			// cria a variavel de posição de remoção
			int posicao = 1;
			// ENTRA EM UM WHILE ENQUANTO O VALOR FOR 0 DO JOPTIONPANE, ELE VAI CONTINUAR
			// REMOVENDO DISCIPLINAS
			while (continuaRemoverInteger == 0) {
				// PERGUNTA QUAL DISCIPLINA QUER REMOVER
				String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover 1, 2, 3 ou 4?");
				// FAZ A REMOÇÃO
				aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao++;
				// PERGUNTA SE DESEJA CONTINUAR, A RESPOSTA JOGA LÁ PRO INICIO DO WHILE DE NOVO
				// 0 = SIM, 1 = NÃO, 2 = CANCELAR = NÃO
				continuaRemoverInteger = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo disciplinas?");
			}
			//if caso o o usário deseje parar de remover
			//nesse caso ele selecionaria não = 1
			if (continuaRemoverInteger == 1) {
				JOptionPane.showMessageDialog(null, aluno.getAlunoAprovado());
			}
			// se não quer remover nenhuma disciplina ele vem para o resultado da média
		} else {
			JOptionPane.showMessageDialog(null, aluno.getAlunoAprovado());
		}
	}
}