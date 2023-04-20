
package Lab;

abstract class BankAccount{
	
	int account_number;
	double balance;
	
	abstract double deposit();
	abstract double withdraw();
	
}

class CheckingAccount extends BankAccount{
	
   double balance;
	double deposit;
	double withdraw;
	

	public CheckingAccount(double balance , double deposit , double withdraw) {

		this.balance=balance;
		this.deposit=deposit;
		this.withdraw=withdraw;
		
	}

	@Override
	double deposit() {
		
		deposit=balance+deposit;
		return deposit;	
		
	}

	@Override
	double withdraw() {
		
		withdraw=balance - withdraw;
		return withdraw;	
		
	}
	
	
}

public class Abstraction2 {

	public static void main(String[] args) {
		
		
		CheckingAccount acc1 = new CheckingAccount(1000 , 500 , 300);
		System.out.println("Deposit : " + acc1.deposit());
		System.out.println("Withdraw : " + acc1.withdraw());
		
		
		
		

	}

}
