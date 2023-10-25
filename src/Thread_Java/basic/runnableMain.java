package Thread_Java.basic;

public class runnableMain {
	public static void main(String[] args) {
		runnableInterface thread1 = new runnableInterface();
		runnableInterface thread2 = new runnableInterface();
		
		Thread th1 = new Thread(thread1);
		Thread th2 = new  Thread(thread2);
		
		th1.start();
		th2.start();
	}
}
