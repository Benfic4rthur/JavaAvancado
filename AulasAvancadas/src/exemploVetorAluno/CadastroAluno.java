package exemploVetorAluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CadastroAluno {
	public void cadAluno() {

		String alunoscadastraveis = JOptionPane.showInputDialog("Quantos alunos deseja cadastrar?");
		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int quantidade = 1; quantidade <= Integer.parseInt(alunoscadastraveis); quantidade++) {
			Aluno aluno = new Aluno();
			String sexString = JOptionPane.showInputDialog("Selecione o sexo do " + quantidade + "º aluno (M/F):");
			aluno.setSexo(sexString);
			String nomeString = JOptionPane.showInputDialog("Informe o nome do " + quantidade + "º aluno:");
			aluno.setNome(nomeString);
			for (int pos = 1; pos <= 3; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Informe a " + pos + "ª disciplina:");
				String notaDisciplina = JOptionPane
						.showInputDialog("Informe a nota em " + nomeDisciplina + " do aluno " + aluno.getNome() + ": ");
				Disciplinas discilplinaDaLista = new Disciplinas();
				discilplinaDaLista.setDisciplina(nomeDisciplina);

				aluno.getDisciplinas().add(discilplinaDaLista);
			}
			int remove = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if (remove == 0) {
				int continuaRemoverInteger = remove;
				int posicao = 1;
				while (continuaRemoverInteger == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover 1, 2 ou 3?");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuaRemoverInteger = JOptionPane.showConfirmDialog(null,
							"Deseja continuar removendo disciplinas?");
				}
			}
			alunos.add(aluno);
		}
		int vermediaaluno = JOptionPane.showConfirmDialog(null,
				"Deseja visualizar a média de um aluno antecipadamente?");
		if (vermediaaluno == 0) {
			String alunovermedia = JOptionPane
					.showInputDialog("Digite o nome do aluno que deseja ver a média antecipadamente:");
			for (Aluno aluno2 : alunos) {
				if (aluno2.getNome().equalsIgnoreCase(alunovermedia)) {
					JOptionPane.showMessageDialog(null, aluno2.getAlunoAprovado());
					break;
				}
			}
		}
		int alunoremover = JOptionPane.showConfirmDialog(null, "Deseja remover um aluno da lista?");
		if (alunoremover == 0) {
			String alunoremovernome = JOptionPane
					.showInputDialog("Digite o nome do aluno que deseja remover da lista?");
			for (Aluno aluno3 : alunos) {
				if (aluno3.getNome().equalsIgnoreCase(alunoremovernome)) {
					JOptionPane.showMessageDialog(null,
							"o aluno " + aluno3.getNome() + " foi removido da lista de alunos!");
					alunos.remove(aluno3);
					break;
				}
			}
		}
		int mediaalunos = JOptionPane.showConfirmDialog(null, "Deseja visualizar a média dos alunos?");
		if (mediaalunos == 0) {
			for (Aluno aluno4 : alunos) {
				JOptionPane.showMessageDialog(null, aluno4.getAlunoAprovado());
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Você escolheu por não ver as médias dos alunos, obrigado por utilizar o nosso sistema!");
		}
	}
}