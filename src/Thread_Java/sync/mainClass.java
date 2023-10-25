package Thread_Java.sync;

public class mainClass {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Transaction transaction = new Transaction("Wife", 10, bank);
		Thread thread1 = new Thread(transaction, "wife");
		Transaction transaction2 = new Transaction("Husband", 20, bank);
		Thread thread2 = new Thread(transaction2, "husband");
		thread1.start();
		thread2.start();
	}
}
