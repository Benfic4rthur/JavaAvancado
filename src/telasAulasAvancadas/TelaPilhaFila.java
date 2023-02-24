package telasAulasAvancadas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pilhaEFilaParaThread.ImplementacaoFilaThread;
import pilhaEFilaParaThread.ObjetoFilaThread;

//essa é a classe que contem a tela, isto não é um metodo é uma classe
public class TelaPilhaFila extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel jpanel = new JPanel(new GridBagLayout());// painel de componentes
	private JLabel descricaonome = new JLabel("Nome:"); // cria o label com a descrição da thread 1
	private JTextField nome = new JTextField(); // cria o campo que irá mostrar a hora
	private JLabel descricaoemail = new JLabel("E-mail:"); // cria o label com a descrição da thread 2
	private JTextField email = new JTextField(); // cria o campo que irá mostrar a hora
	private JButton jButton = new JButton("Add lista"); // cria o botão responsavel por startar a thread
	private JButton jButton2 = new JButton("Stop"); // cria o botão responsavel por stopar a thread

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	// ↓ esse é o construtor responsavel por conter as configurações da tela
	public TelaPilhaFila() {// executa o que tiver dentro no momento dá abertura ou execução

		setTitle("tela exemplo threads");// responsavel pelo titulo da tela
		setSize(new Dimension(240, 240)); // responsavel pela dimensão da tela
		setLocationRelativeTo(null);// responsavel por fazer a aparecer no meio do monitor
		setResizable(false);// responsavel por não permitir redimensionar a tela
		// ↑ codigo responsavel praticamente pela configuação de exibição da tela

		// esse é o gerenciador de posicionamento de componentes ↓
		GridBagConstraints gridBagConstraints = new GridBagConstraints();// para utilizar o GridBagConstraints é
																			// necessário inicia-lo como um objeto
		gridBagConstraints.gridx = 0; // responsavel pelas linhas o valor após o igual é responsavel pela posição onde
										// deve iniciar
		gridBagConstraints.gridy = 0; // faz o mesmo só que para colunas
		gridBagConstraints.gridwidth = 2; // modifica o tamanho ocupado para 2
		gridBagConstraints.insets = new Insets(5, 10, 5, 5); // seta as distancias das bordas
		gridBagConstraints.anchor = GridBagConstraints.WEST; // seta a ancoragem a esquerda

		descricaonome.setPreferredSize(new Dimension(200, 25)); // seta as dimensões do label responsavel pela descrição
																// da thread 1
		jpanel.add(descricaonome, gridBagConstraints); // adiciona o label ao painel

		nome.setPreferredSize(new Dimension(200, 25));// seta as dimensões do painel que mostra a hora
		gridBagConstraints.gridy++; // movimenta o campo de texto para a proxima coluna
		jpanel.add(nome, gridBagConstraints);// adiciona o campo que mostra a hora ao painel

		descricaoemail.setPreferredSize(new Dimension(200, 25)); // seta as dimensões do label2 responsavel pela
																	// descrição da thread 2
		gridBagConstraints.gridy++; // movimenta a label para a proxima coluna
		jpanel.add(descricaoemail, gridBagConstraints); // adiciona o label2 ao painel

		email.setPreferredSize(new Dimension(200, 25));// seta as dimensões do painel que mostra a hora
		gridBagConstraints.gridy++; // movimenta o campo de texto para a proxima coluna
		jpanel.add(email, gridBagConstraints);// adiciona o campo que mostra a hora ao painel

		/************************************************************************************************/

		gridBagConstraints.gridwidth = 1;// volta a ser 1 par que fique alinhado

		jButton.setPreferredSize(new Dimension(92, 25)); // seta as dimensões do botão
		gridBagConstraints.gridy++; // movimenta o botão para a proxima coluna
		jpanel.add(jButton, gridBagConstraints); // adiciona o botão ao painel

		jButton2.setPreferredSize(new Dimension(92, 25)); // seta as dimensões do botão
		gridBagConstraints.gridx++; // movimenta o botão para a proxima coluna
		jpanel.add(jButton2, gridBagConstraints); // adiciona o botão ao painel

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // executa o clique no botão start
				if(fila == null) { //cria um if para poder continuar de onde parou ao clicar no stop
					fila = new ImplementacaoFilaThread(); // inicia um novo objeto
					fila.start(); // starta ele de onde parou
				}
				for (int pos = 0; pos < 100; pos++) { //cria um for para que ao clicar em start sejam incluidos quantos objetos estiverem informados
					//para que sejam incluidos
					ObjetoFilaThread filaThread = new ObjetoFilaThread(); // instancia o objeto
					filaThread.setNomeString(nome.getText()); //seta nome pelo valor capturado com getText do campo de nome
					filaThread.setEmailString(email.getText() + (pos + 1)); // faz o mesmo com o campo email
					ImplementacaoFilaThread.add(filaThread); //adiciona na lista
				}
			}
		});

		jButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // executa o clique no botão stop
				fila.stop(); // para a implementação na lista
				fila = null; // mata o objeto
			}
		});

		add(jpanel, BorderLayout.WEST);// aqui adiciona o painel no dialog orientando ele a esquerda com o
										// borderLayout.WEST
		fila.start(); // antes de tudo, starta o objeto
		setVisible(true);// sempre sera o ultimo comando do construtor a ser executavel, ele é quem faz a
							// tela ser visivel verdadeiro ou falso
	}
}