package exemploVetorAluno;

import javax.swing.JOptionPane;

public class Executavel {
	public static void main(String[] args) {
		String login = JOptionPane.showInputDialog("Digite seu login:");
		String senha = JOptionPane.showInputDialog("Digite sua senha:");
		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			CadastroAluno novoCadastroAluno = new CadastroAluno();
			novoCadastroAluno.cadAluno();
		} else {
			JOptionPane.showMessageDialog(null, "Login e senha não reconhecidos");
		}
	}
}