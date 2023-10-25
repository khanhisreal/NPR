package tut04_thread.ex1;

public class CountDownThread extends Thread{

	@Override
	public void run() {
		int count = 10;
		for (int i = count; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Time is up");
	}
	
	public static void main(String[] args) {
		CountDownThread thread = new CountDownThread();
		thread.run();
	}
}


