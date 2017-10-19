
public class Santander extends Bank {

	double interest = 0.25;
	
	@Override
	public void Deposit(int A) {
		
		double added_interest = interest * balance;
		
		balance += (A + added_interest);
		
	}

	@Override
	public void Withdraw(int B) {
		
		balance -= B;
		
	}

	@Override
	public void Balance() {
		
		System.out.println(balance);
		
	}
	
	
	

}
