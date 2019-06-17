public class Slide11_Ex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MinhaThread thread = new MinhaThread("Thread #1", 6);
		MinhaThread thread2 = new MinhaThread("Thread #2", 9);
		MinhaThread thread3 = new MinhaThread("Thread #3", 15);

		Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
		t1.start();
        t2.start();
        t3.start();
	}
}

class MinhaThread implements Runnable {
	private String nome;
	private int limite;

	public MinhaThread(String nome, int limite) {
		this.nome = nome;
		this.limite = limite;
	}

	public void run() {
		for(int i=0; i<limite; i++) {
			System.out.println(nome + " contador " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(nome + " terminou a execu��o!");
	}
}

// a - Provavelmente por que n�o h� synchronized implementado na classe
// b - Ir� modificar intencionalmente a vari�vel
