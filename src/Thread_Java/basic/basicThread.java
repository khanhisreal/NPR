package Thread_Java.basic;

import java.util.Iterator;

/**
 * @author Khanh A thread is the smallest unit of execution within the program.
 *         It is an independent process of an execution. Java allows us to
 *         perform multiple tasks concurrently
 */
public class basicThread extends Thread {
	// ex
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread " + Thread.currentThread().getName() + " count: " + i);
		}
	}
}
