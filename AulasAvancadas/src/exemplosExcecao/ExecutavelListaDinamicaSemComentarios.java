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
			//uma função do java para trabalhar com string
			StringBuilder saidaBuilder = new StringBuilder();
			
			//imprime o erro no console
			e.printStackTrace();
			//um for para varrer o array e pegar os erros apresentados informando-os em uma mensagem personalizada
			//este jeito é mais simples
			for(int pos = 0; pos < e.getStackTrace().length; pos++) {
				JOptionPane.showMessageDialog(null, "Não foi possivel salvar a disciplina e a nota. CAUSA: "+e.getMessage()
													+"\n"+ "Linha do erro: "+ e.getStackTrace()[pos].getLineNumber()
													+"\n"+"Metodo do erro: "+ e.getStackTrace()[pos].getMethodName()
													+"\n"+"Classe do erro: "+e.getStackTrace()[pos].getClassName());
			//adiciona os erros ao saidaBuilder para que sejam chamados em uma futura impressão	
			saidaBuilder.append("Não foi possivel salvar a disciplina e a nota. CAUSA: "+e.getMessage());
			saidaBuilder.append("\n Linha do erro: "+ e.getStackTrace()[pos].getLineNumber());
			saidaBuilder.append("\n Metodo do erro: "+ e.getStackTrace()[pos].getMethodName());
			saidaBuilder.append("\n Classe do erro: "+e.getStackTrace()[pos].getClassName());
			
			}
			//imprime os erros adicionados ao saidaBuilder, este jeito é um pouco mais elaborado
			JOptionPane.showMessageDialog(null, saidaBuilder.toString());

		}
	}
}