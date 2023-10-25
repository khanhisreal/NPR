package Thread_Java.basic;

public class mainClass {
	public static void main(String[] args) {
		basicThread thread1 = new basicThread();
		basicThread thread2 = new basicThread();
		
		thread1.start();
		thread2.start();
		
		for(int i = 1; i <=5; i++) {
			System.out.println("Main thread count: " + i);
		}
	}
}
