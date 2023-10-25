package Thread_Java.basic;

public class priorityMain {

	public static void main(String[] args) {
		priorityThread thread1 = new priorityThread();
		priorityThread thread2 = new priorityThread();
		
		thread1.setPriority(8);
		thread2.setPriority(2);
		
		thread1.start();
		thread2.start();
	}
	
}
