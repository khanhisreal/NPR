package Thread_Java.basic;

public class sleepingMain {
	
	public static void main(String[] args) {
		sleepingThread runnable1 = new sleepingThread();
		sleepingThread runnable2 = new sleepingThread();
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
	}
	
}
