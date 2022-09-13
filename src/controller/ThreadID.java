package controller;

public class ThreadID extends Thread {
	private int idThread;

	public ThreadID(int idThread) {
		this.idThread = idThread;
	}
	
	public void run() {
		System.out.println(idThread);
	}
}
