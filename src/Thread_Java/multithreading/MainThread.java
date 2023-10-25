package Thread_Java.multithreading;

public class MainThread {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount(); 
		
		WithdrawThread wife = new WithdrawThread("wife", 10000000, bank);
		wife.start();
		
		WithdrawThread husband = new WithdrawThread("husband", 15000000, bank);
		husband.start();
		System.out.println("End");
	}
}
