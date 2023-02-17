package aprendendoThreads;

import javax.swing.JOptionPane;

public class ExemploThreadEmParalelo {
	public static void main(String[] args) throws InterruptedException {
		int escolhe = JOptionPane.showConfirmDialog(null, "Deseja enviar emails por mala direta?");
		if (escolhe == 0) {
			new Thread() {
				public void run() {
					for (int pos = 0; pos < 10; pos++) {
						System.out.println("Envio E-mail " + (pos + 1));
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {

							int resposta = JOptionPane.showConfirmDialog(null,
									"A do envio da mala direta foi interrompida. Deseja continuar de onde parou?");
							if (resposta == JOptionPane.NO_OPTION) {
								break;
							}
						}
					}
				}
			}.start();
			JOptionPane.showMessageDialog(null, "Disparando emails para os clientes");
			int escolhe2 = JOptionPane.showConfirmDialog(null, "Deseja enviar os xmls para os clientes??");
			if (escolhe2 == 0) {
				new Thread() {
					public void run() {
						for (int pos = 0; pos < 10; pos++) {
							System.out.println("Envio Xml " + (pos + 1));
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {

								int resposta = JOptionPane.showConfirmDialog(null,
										"A execução da thread foi interrompida. Deseja continuar de onde parou?");
								if (resposta == JOptionPane.NO_OPTION) {
									break;
								}
							}
						}
					}
				}.start();
			}
			if (escolhe2 == 0) {
				JOptionPane.showMessageDialog(null, "Disparando xmls para os clientes");
				JOptionPane.showMessageDialog(null, "Envio dos emails e xmls chegou ao fim.");
			}else {
				{
						JOptionPane.showMessageDialog(null, "Envio de emails chegou ao fim.");
				}
			}
		}
	}
}