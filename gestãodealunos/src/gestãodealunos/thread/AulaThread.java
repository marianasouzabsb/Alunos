package gestãodealunos.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		//Transformando a Thread em um objeto
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNotas = new Thread(thread2);
		threadNotas.start();
		
		System.out.println("Fim thread");
		JOptionPane.showMessageDialog(null, "Sistema executando");
		// start liga a thread que fica processando
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(1000);
					System.out.println("Envios de Nota fiscal " + (i + 1));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(1000);
					System.out.println("envio de e-mails " + (i + 1));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
}
