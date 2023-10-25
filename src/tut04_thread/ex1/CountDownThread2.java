package tut04_thread.ex1;

public class CountDownThread2 implements Runnable{
	
	@Override
	public void run() {
		int count = 10;
		for (int i = count; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Time is up");
	}
	
	public static void main(String[] args) {
		CountDownThread2 countDownThread2 = new CountDownThread2();
		Thread thread = new Thread(countDownThread2);
		thread.start();
	}
}
