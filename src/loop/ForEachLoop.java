package loop;

public class ForEachLoop {

	public static void main(String[] args) {
		int [] array = { 9, 7, 0, 1, 2};
		
		char[] arrayx = {'F','$','&','0'};
		
		
		
		


//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);
//		for (int a: array) {
//			System.out.println(a);
//		}
		
		for (int i=0; i<2; i++) {
			System.out.println(array[i]);
		}
		
		// for each loop work like;
		
		for (char a : arrayx) {
			System.out.println(a);
		}
		
		String [] order= { "birini", "sumucha"};
		
		for (String plate : order) {
			System.out.println(plate);
		}

	}

}
