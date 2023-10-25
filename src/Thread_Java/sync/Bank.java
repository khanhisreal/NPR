package Thread_Java.sync;

public class Bank {

	long balance = 20;

	public synchronized boolean checkAccountBalance(long withDrawAmount) {
		try {
			Thread.sleep(2001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (withDrawAmount <= balance) {
			return true;
		}

		return false;
	}

	public synchronized void withdraw(String threadName, long withdrawAmount) {
		System.out.println(threadName + " wants to withdraw: " + withdrawAmount);

		if (checkAccountBalance(withdrawAmount)) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			balance -= withdrawAmount;
			System.out.println(threadName + " withdrew successfully: " + withdrawAmount);
		} else {
			System.out.println(threadName + " withdraws error!");
		}

		System.out.println(threadName + " sees balance: " + balance);
	}

}
