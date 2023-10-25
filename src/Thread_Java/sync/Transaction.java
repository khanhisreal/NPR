package Thread_Java.sync;

public class Transaction implements Runnable{
	String threadName = "";
	long withdrawAmount = 0;
	Bank bankAccount;
	
	public Transaction(String threadName, long withdrawAmount, Bank bankAccount) {
		// TODO Auto-generated constructor stub
		this.threadName = threadName;
		this.withdrawAmount = withdrawAmount;
		this.bankAccount = bankAccount;
	}
	
	@Override
	public void run() {
		bankAccount.withdraw(threadName, withdrawAmount);
	}
	
}
