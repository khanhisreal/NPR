package Thread_Java.basic;

public class runnableInterface implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		int i = 10;
		while (i > 0) {
			Thread currentThread = Thread.currentThread();
			System.out.println("Thread " + currentThread.getName() + " count: " + i);
			i--;
		}
	}

}
