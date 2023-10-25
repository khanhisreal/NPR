package Thread_Java.basic;

public class priorityThread extends Thread {

	public void run() {
		for (int i = 6; i > 0; i = i - 2) {
			System.out.println("Thread " + Thread.currentThread().getName() + " count: " + i);
		} 
		System.out.println("Thread " + Thread.currentThread().getName() + " completed");
	} 

}
