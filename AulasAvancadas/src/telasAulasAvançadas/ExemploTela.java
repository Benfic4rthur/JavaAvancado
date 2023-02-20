package telasAulasAvançadas;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class ExemploTela extends JDialog {
	
	private static final long serialVersionUID = 1L;

	private JPanel jpanel = new JPanel(new GridBagLayout());
	private JLabel descricaoHora = new JLabel("Busca data atual:"); 
	private JLabel dataEscolhidaJLabel = new JLabel("Digite a data:");
	private JLabel dataCalculadaJLabel = new JLabel("Data Calculada:");
	private JTextField mostraTempo = new JTextField();
	private JTextField dataEscolhidaField = new JTextField();
	private JTextField mostraDataCalculada = new JTextField();
	private JButton jButton = new JButton("Calcula"); 

	private Runnable thread1 = new Runnable() {
		@Override
		public void run() {
			while (true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()));
				try { 
					Thread.sleep(1000); 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private ActionListener acaoBotao = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String dataAtualString = mostraTempo.getText();
			String dataString = dataEscolhidaField.getText();
			LocalDate dataAtual = LocalDate.parse(dataAtualString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			LocalDate dataEscolhida = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			int diasUteis = 0;
			while (dataAtual.isBefore(dataEscolhida)) {
				if (dataAtual.getDayOfWeek() != DayOfWeek.SATURDAY && dataAtual.getDayOfWeek() != DayOfWeek.SUNDAY) {
					diasUteis++;
				}
				dataAtual = dataAtual.plusDays(1);
			}
			
			mostraDataCalculada.setText(String.format("%d dias úteis", diasUteis));
		}
	};

	public void init() {
		jpanel.add(descricaoHora, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		jpanel.add(mostraTempo, new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		jpanel.add(dataEscolhidaJLabel, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		jpanel.add(dataEscolhidaField, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		jpanel.add(jButton, new GridBagConstraints(0, 2, 2, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		jpanel.add(dataCalculadaJLabel, new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		jpanel.add(mostraDataCalculada, new GridBagConstraints(1, 3, 1, 1,0, 0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		
		jButton.addActionListener(acaoBotao);

		setContentPane(jpanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);

		Thread t1 = new Thread(thread1);
		t1.start();
	}
	private Thread thread1Time;
	public ExemploTela() {
		setTitle("calculadora dias uteis");
		setSize(new Dimension(240, 300)); 
		setLocationRelativeTo(null);
		setResizable(false);
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0; 
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2; 
		gridBagConstraints.insets = new Insets(5, 10, 5, 5); 
		gridBagConstraints.anchor = GridBagConstraints.WEST; 
		descricaoHora.setPreferredSize(new Dimension(200, 25)); 
		jpanel.add(descricaoHora, gridBagConstraints); 
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; 
		mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()));
		mostraTempo.setEditable(false);
		jpanel.add(mostraTempo, gridBagConstraints);
		gridBagConstraints.gridy++; 
		dataEscolhidaJLabel.setPreferredSize(new Dimension(200, 25)); 
		jpanel.add(dataEscolhidaJLabel, gridBagConstraints); 
		dataEscolhidaField.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; 
		jpanel.add(dataEscolhidaField, gridBagConstraints);
		gridBagConstraints.gridy++; 
		dataCalculadaJLabel.setPreferredSize(new Dimension(200, 25)); 
		jpanel.add(dataCalculadaJLabel, gridBagConstraints); 
		mostraDataCalculada.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; 
		mostraDataCalculada.setEditable(false);
		jpanel.add(mostraDataCalculada, gridBagConstraints);
		gridBagConstraints.gridy++; 
		
	
		gridBagConstraints.gridwidth = 1;
		jButton.addActionListener(acaoBotao);

		jButton.setPreferredSize(new Dimension(92, 25)); 
		gridBagConstraints.gridy++; 
		jpanel.add(jButton, gridBagConstraints); 

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { 
				thread1Time = new Thread(thread1); 
				thread1Time.start(); 
			}
		});
		add(jpanel, BorderLayout.WEST);
		setVisible(true);
	}
}