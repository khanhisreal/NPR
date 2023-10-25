package tut04_thread.ex2;

public class HelloMain {
	public static void main(String[] args) throws InterruptedException {
		int index = 1;
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Main thread is running " + index++);
			//Sleep for more than 1 second
			Thread.sleep(2101);
		}
		
		//run thread
		HelloThread helloThread = new HelloThread();
		helloThread.start();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Main thread is running " + index++);
			//Sleep for more than 1 second
			Thread.sleep(2101);
		}
		System.out.println("===> Main thread stopped");
	}
}

