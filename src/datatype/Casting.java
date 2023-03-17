package datatype;

public class Casting {

	public static void main(String[] args) {
		// byte -short- char- int- long- float- double
		// java takes care of up casting (widening)
		
		int a =10;
		int b=3;
		double c =a/b;
		System.out.println(c);
		
		double d =10;
		double e=3;
		double f =d/e;
		System.out.println(f);
 // down-casting  should be done by manually (narrowing)
		double g =10;
		double h=3;
		int i =(int) (g/h);
		System.out.println(i);
		
		int j=1;
		double k=j;
	System.out.println(k);
	
	double l= 1.25;
	int m=(int) l;
	System.out.println(m);
		
	}

}
