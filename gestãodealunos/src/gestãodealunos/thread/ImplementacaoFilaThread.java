/*Simulação de um sistema com Thread que faz um processamento pessado e demorado
 * que precisa de tempo para descarga de memória.
 * */

package gestãodealunos.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);

	}

	@Override
	public void run() {
		System.out.println("Fila rodando ");
		while (true) {
			synchronized (pilha_fila) { // Bloquear o acesso a esta lista por outro processos.
				Iterator iteracao = pilha_fila.iterator();
				while (iteracao.hasNext()) { // Enquanto houver dados

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
					System.out.println("------------------------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
					// aqui ocorre o processo pode ser envio de emails, nfe.

					iteracao.remove();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			try { // dar tempo para descarga de memoria
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
