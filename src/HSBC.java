
public class HSBC extends Bank {

	public void Deposit(int A) {
		
		balance += A;
		
	}

	@Override
	public void Withdraw(int B) {
		if (B < balance) {
		balance -= B;
		}
		else {
			System.out.println("Insufficent funds!");
		}
		
	}

	@Override
	public void Balance() {
		
		System.out.println(balance);
		
	}
	
	
}
