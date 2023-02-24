package exemploVetorAluno;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class LoginValido {
	public static void main(String[] args) {
		UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
		String login = JOptionPane.showInputDialog("Digite seu login:");
		JLabel informasenha = new JLabel("Digite e a senha:");
		JPasswordField jpf2 = new JPasswordField();
		String[] opcoes = {"OK", "Cancela"};
		JOptionPane.showOptionDialog(null,
		new Object[]{informasenha, jpf2}, "Senha:",
		JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
		String senha = new String(jpf2.getPassword());
		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			CadastroAluno novoCadastroAluno = new CadastroAluno();
			novoCadastroAluno.cadAluno();
		} else {
			JOptionPane.showMessageDialog(null, "Login e senha não reconhecidos");
		}
	}
}