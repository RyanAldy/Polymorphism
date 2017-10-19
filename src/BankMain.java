
public class BankMain {

	public static void main(String[] args) {
		
		System.out.println("HSBC: ") ;
		
		HSBC H = new HSBC();
		// Passing HSBC object into Banking - Polymorphism
		Banking(H);
		
		System.out.println("Santander: ");
		Santander S = new Santander();
		
		Banking(S);

	}

	// Pol
	
	public static void Banking(Bank X) {
		
		X.Deposit(800);
		X.Deposit(950);
		X.Balance();
		
		
		//X.Deposit(1000);
		//X.Balance();
		
		
	}
	
	
}
