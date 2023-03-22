package ConstructorPKG;

public class Constructor {
	// global variable
	int     age   = 20;
	double height =5.7;
	String race   ="Asian";
	String first  ="Abu";
	String last	  ="Yousuf";
	

	Constructor(int i){
		// local variable
		int myage = age;
		System.out.println(myage);
		
	}
	Constructor(String s, String q, String d){
		String myFirst = "Abu";
		String myLast = "Yousuf";
		String myRace=  "Asian";
		System.out.println(myFirst + myLast + myRace);
		
	}	
	
	
	
	

}
