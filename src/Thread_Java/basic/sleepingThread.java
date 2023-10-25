package Thread_Java.basic;

public class sleepingThread implements Runnable {

	public void run() {
		Thread thread = new Thread();
		for (int i = 10; i > 0; i--) {
			System.out.println(thread.getName() + " thread is counting " + i);
			if(i == 5) {
				try {
					thread.sleep(2001);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(thread.getName() + " stopped");
	}

}
