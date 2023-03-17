package ParameterMathods;

public class Parameter {

	
		// TODO Auto-generated method stub
		//
		int x =5;
		int y= 3;
	double Radious =7.5;
	double Perimeter = 47.12388980384689d;
	double Area = 176.71458676442586d;
	
		
		void sum(int x, int y) {
			int total =x+y; // implement
		}
		
		//return
		int sub(int x, int y) {
			int total = x-y;
			return total;
		}
		double pi=3.14;
		// circle parameter = 2 * pi * r
		void parameter(double radious) {
			double parameter =2 * pi * radious;
			System.out.println("Parameter of circle is "+ parameter + "Redious is"+ radious);
		}
		
		double area(double radious) {
			double area =pi *(radious*radious);
			return area;
		}
		
		

}
