package pilhaEFilaParaThread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread { // para usar thread tem que extender de Thread

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}

	@Override
	public void run() {
		
		while (true) {
			Iterator<ObjetoFilaThread> iteracao = pilha_filha.iterator();
			synchronized (iteracao) {// bloquear o acesso a esta lista por outros processos
				// no caso garante que apenas a thread iteracao tenha acesso a este
				// processamento
				while (iteracao.hasNext()) { // enquanto houverem dados na lista ira processar
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
					System.out.println("------------------------------------------------");
					System.out.println(processar.getEmailString());
					System.err.println(processar.getNomeString());
					iteracao.remove();
					try {
						Thread.sleep(200);// dar um tempo para uma descarga de memoria
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
			try {
				Thread.sleep(1000); // da um tempo para limpeza de memoria
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}