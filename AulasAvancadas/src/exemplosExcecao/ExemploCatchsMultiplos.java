package exemplosExcecao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploCatchsMultiplos {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno();
			File fil = new File("Files.txt");
			Scanner imagemScanner = new Scanner(fil);
			String sexString = JOptionPane.showInputDialog("Selecione o sexo do aluno (M/F):");
			aluno.setSexo(sexString);
			String nomeString = JOptionPane.showInputDialog("Informe o nome do aluno:");
			aluno.setNome(nomeString);
			for (int pos = 1; pos <= 2; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Informe a " + pos + "ª disciplina:");
				String notaDisciplina = JOptionPane
						.showInputDialog("Informe a nota em " + nomeDisciplina + " do aluno " + aluno.getNome() + ": ");
				ObjetoDisciplinaComLista discilplinaDaLista = new ObjetoDisciplinaComLista();
				discilplinaDaLista.setDisciplina(nomeDisciplina);
				discilplinaDaLista.setNota(Double.parseDouble(notaDisciplina));
				aluno.getDisciplinas().add(discilplinaDaLista);
			}
			JOptionPane.showMessageDialog(null, aluno.getAlunoAprovado());
		} catch (NumberFormatException e) {
			StringBuilder saidaBuilder = new StringBuilder();
			for(int pos = 0; pos < e.getStackTrace().length; pos++) {
			saidaBuilder.append("Não foi possivel salvar a disciplina e a nota. CAUSA: "+e.getMessage());
			saidaBuilder.append("\n Linha do erro: "+ e.getStackTrace()[pos].getLineNumber());
			saidaBuilder.append("\n Metodo do erro: "+ e.getStackTrace()[pos].getMethodName());
			saidaBuilder.append("\n Classe do erro: "+e.getStackTrace()[pos].getClassName());
			saidaBuilder.append("\n Classe de erro: "+e.getClass().getName());
			}
			JOptionPane.showMessageDialog(null, saidaBuilder.toString()); 
			}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel salvar os dados - CAUSA: " + e.getMessage());
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel encontrar a imagem - CAUSA: " + e.getMessage());
		}
	}
}