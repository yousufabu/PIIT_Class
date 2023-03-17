package homework;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		//NUMBER 1
		//System.out.println(74+36);
		//NUMBER 2
		//System.out.println(50/3);
		//NUMBER 3
		//System.out.println( -5 + 8 * 6); //a
		//System.out.println( (55+9) % 9);  //b
		//System.out.println( 20 + -3*5 / 8);//c
		//System.out.println( 5 + 15 / 3 * 2 - 8 % 3);//d
		
		// variable
		//NUMBER 1
		//int number1 = 25;
		//int number2 = 5;
		//System.out.println(number1 * number2);
		// NUMBER 2 Write a Java program to swap two variables. 
		/*
		int a = 10;
		int b = 15;
		int temp;

	     temp =a;
	     a = b;
	      b = temp;
	     System.out.println(a);
	     System.out.println(b);
	      **/
		/*
		System.out.println(125 + 24 );
		System.out.println(125 - 24 );
		System.out.println(125 * 24 );
		System.out.println(125 / 24);
		System.out.println(125%24);
		**/
		/*
		for (int i = 1; i<=99; i += 2) {
			System.out.println(i);
		}
		**/
		/*
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            
		
        }
		**/
		/*
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else {
                others++;
            }
        }

        System.out.println("The string is: " + str);
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
		
		**/
		
		/*
		 Scanner input = new Scanner(System.in);
	        System.out.print("Input a string: ");
	        String str = input.nextLine();

	       
	        char[] charArray = str.toCharArray();

	       
	        int start = 0;
	        int end = charArray.length - 1;
	        while (start < end) {
	            char temp = charArray[start];
	            charArray[start] = charArray[end];
	            charArray[end] = temp;
	            start++;
	            end--;
	        }

	        
	        String reversedStr = new String(charArray);

	        System.out.println("Reverse string: " + reversedStr);
		**/
		/*
		 Scanner input = new Scanner(System.in);
	        System.out.print("Input a sentence: ");
	        String sentence = input.nextLine();

	        // split the sentence into words
	        String[] words = sentence.split(" ");

	        // convert each word to camel case
	        StringBuilder camelCaseBuilder = new StringBuilder();
	        for (int i = 0; i < words.length; i++) {
	            String word = words[i];
	            String firstChar = word.substring(0, 1).toUpperCase();
	            String restChars = word.substring(1).toLowerCase();
	            camelCaseBuilder.append(firstChar).append(restChars);
	        }

	        String camelCase = camelCaseBuilder.toString();
	        System.out.println("Camel case: " + camelCase);
	        **/
		
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        int result = number % 2;

        if (result == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        }
	

}
