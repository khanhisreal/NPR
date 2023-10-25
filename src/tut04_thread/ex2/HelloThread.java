package tut04_thread.ex2;

public class HelloThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int index = 1;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(" - HelloThread is running " + index++);
			
			try {
				Thread.sleep(1030);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println(" ==> HelloThread stopped");
	}
}
