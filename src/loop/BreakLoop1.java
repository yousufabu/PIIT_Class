package loop;

public class BreakLoop1 {

	public static void main(String[] args) {
		
		String [] ar = {"NYC", "Texas", "NJ", "CA"};
		
		for (int i=0; i<4; i++) {
		System.out.println(ar[i]);
		if (ar[i]=="NYC") {
			System.out.println("1 NYC");
			
		}		
		}
		


	}

}
