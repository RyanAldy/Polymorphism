
public class DrawMain {

	public static void main(String[] args) {
		
		Drawing D = new Drawing();
		Line L = new Line();
		Circle C = new Circle();
		
		LetsDraw(D);
		LetsDraw(L);
		LetsDraw(C);
		

		
		
	}
	
	public static void LetsDraw(Drawing X) {
		
		X.Draw();
	}
	

}
