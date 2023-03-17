package datatype;

public class UseString {

	public static void main(String[] args) {
		// chain of characters or null
		String str1 = "Hello";
		String str2= " world";
		String str3 = "turn this text into camel case";
		System.out.println(str1.concat(str2));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.charAt(4));
		System.out.println(str1.repeat(5));
		System.out.println(str3.length());
		System.out.println();
		

	}

}
