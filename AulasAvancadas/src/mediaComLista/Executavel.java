package mediaComLista;

import javax.swing.JOptionPane;

import exemplosExcecao.Aluno;
import exemplosExcecao.ObjetoDisciplinaComLista;

public class Executavel {
	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		String sexString = JOptionPane.showInputDialog("Selecione o sexo do aluno (M/F):");
		aluno.setSexo(sexString);
		String nomeString = JOptionPane.showInputDialog("Informe o nome do aluno:");
		aluno.setNome(nomeString);
		String disciplina1 = JOptionPane.showInputDialog("Informe a primeira disciplina:");
		String nota1 = JOptionPane.showInputDialog("Informe a nota em "+ disciplina1 +" do aluno " + aluno.getNome() + ": ");
		String disciplina2 = JOptionPane.showInputDialog("Informe a segunda disciplina:");
		String nota2 = JOptionPane.showInputDialog("Informe a nota em "+ disciplina2 +" do aluno " + aluno.getNome() + ": ");
		String disciplina3 = JOptionPane.showInputDialog("Informe a terceira disciplina:");
		String nota3 = JOptionPane.showInputDialog("Informe a nota em "+ disciplina3 +" do aluno " + aluno.getNome() + ": ");
		String disciplina4 = JOptionPane.showInputDialog("Informe a quarta disciplina:");
		String nota4 = JOptionPane.showInputDialog("Informe a nota em "+ disciplina4 +" do aluno " + aluno.getNome() + ": ");
		
		
		ObjetoDisciplinaComLista disciplinaComLista1 = new ObjetoDisciplinaComLista();
		disciplinaComLista1.setDisciplina(disciplina1);
		disciplinaComLista1.setNota(Double.parseDouble(nota1));
		//vai no objeto aluno e pega a lista criada e usa o add pra passar por parametro
		//as informações recebidas na lista que acabou de ser criada acima
		aluno.getDisciplinas().add(disciplinaComLista1);
		
		ObjetoDisciplinaComLista disciplinaComLista2 = new ObjetoDisciplinaComLista();
		disciplinaComLista2.setDisciplina(disciplina2);
		disciplinaComLista2.setNota(Double.parseDouble(nota2));
		
		aluno.getDisciplinas().add(disciplinaComLista2);
		
		ObjetoDisciplinaComLista disciplinaComLista3 = new ObjetoDisciplinaComLista();
		disciplinaComLista3.setDisciplina(disciplina3);
		disciplinaComLista3.setNota(Double.parseDouble(nota3));
		
		aluno.getDisciplinas().add(disciplinaComLista3);
		
		ObjetoDisciplinaComLista disciplinaComLista4 = new ObjetoDisciplinaComLista();
		disciplinaComLista4.setDisciplina(disciplina4);
		disciplinaComLista4.setNota(Double.parseDouble(nota4));
		
		aluno.getDisciplinas().add(disciplinaComLista4);
		
		//pergunta se o usuário quer calcular as médias
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da média?");
		// se a resposta for sim (0), ele entra no if que faz o calculo
		if (resposta == 0) {
			// se o sexo for informado como M ou m, cairá neste if
			JOptionPane.showMessageDialog(null, aluno.getAlunoAprovado());
		} else {
			// caso o usuário clique em não (1) ou cancelar(3), ele irá cair nesta condição
			JOptionPane.showMessageDialog(null,
					"Foram informados nome do aluno e notas, mas não foi solicitado o calculo de média");
		}
	}

}