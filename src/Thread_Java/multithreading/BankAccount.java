package Thread_Java.multithreading;

public class BankAccount {
	long amount = 20000000;

	public boolean checkAccountBalance(long withDrawAmount) {

		try {
			Thread.sleep(2001);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		if (withDrawAmount < amount) {
			return true;
		}

		return false;
	}

	public void withdraw(String threadName, long withdrawAmount) {
		System.out.println(threadName + " sees balance: " + amount);
		System.out.println(threadName + " wants to withdraw " + withdrawAmount);

		if (checkAccountBalance(withdrawAmount)) {

			try {
				Thread.sleep(2001);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			amount -= withdrawAmount;
			System.out.println(threadName + " withdrew successfully: " + withdrawAmount);
			System.out.println(threadName + "'s account balance: " + amount);
		}

		System.out.println(threadName + "'s account balance: " + amount);
	}

}
