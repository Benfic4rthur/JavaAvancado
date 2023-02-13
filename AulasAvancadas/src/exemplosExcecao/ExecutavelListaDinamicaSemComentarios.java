package exemplosExcecao;

import javax.swing.JOptionPane;

public class ExecutavelListaDinamicaSemComentarios {
	public static void main(String[] args) {
		try {
			Aluno aluno = null;
			for (int pos = 1; pos <= 2; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Informe a " + pos + "ª disciplina:");
				String notaDisciplina = JOptionPane
						.showInputDialog("Informe a nota em " + nomeDisciplina + " do aluno: ");
				ObjetoDisciplinaComLista discilplinaDaLista = new ObjetoDisciplinaComLista();
				discilplinaDaLista.setDisciplina(nomeDisciplina);
				discilplinaDaLista.setNota(Double.parseDouble(notaDisciplina));
				aluno.getDisciplinas().add(discilplinaDaLista);
			}
			JOptionPane.showMessageDialog(null, aluno.getAlunoAprovado());

		} catch (Exception e) {
			e.printStackTrace();
			for(int pos = 0; pos <= e.getStackTrace().length; pos++) {
				JOptionPane.showMessageDialog(null, "Linha do erro: "+ e.getStackTrace()[pos].getLineNumber()
						+"\n"+"Metodo do erro: "+ e.getStackTrace()[pos].getMethodName()
						+"\n"+"Classe do erro: "+e.getStackTrace()[pos].getClassName());
			}
			JOptionPane.showMessageDialog(null, "Não foi possivel salvar a disciplina e a nota. CAUSA: " + e.getMessage());
		}
	}
}