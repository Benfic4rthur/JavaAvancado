	package mediaComLista;

	import javax.swing.JOptionPane;

import exemplosExcecao.Aluno;
import exemplosExcecao.ObjetoDisciplinaComLista;

	public class ExecutavelRemovendoUmaDisciplina {
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
			int remove = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if(remove == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina que deseja remover?");
				//instancia o objeto aluno, puxa a lista de disciplinas = aluno.getDisciplinas()
				//diz pra ela que ela tem que remover o valor passado acima pela string = .remove(
				//antes de enviar pro objeto que efetua a remoção converte a string para int = (Integer.valueOf(disciplinaRemover).intValue()
				//como a lista começa em 0 = 1, 1 = 2 e por ai vai, coloca-se o -1 no final = .intValue() -1)
				//para que o sistema volte aos eixos, mas este é o jeito que o professor faria
				aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
				//eu faria assim ↓ e funcionaria da mesma forma 
				/*
				int removeDisciplina = Integer.parseInt(disciplinaRemover) -1;
				aluno.getDisciplinas().remove(removeDisciplina);
				*/
			}
			JOptionPane.showMessageDialog(null, aluno.getAlunoAprovado());
		}
	}