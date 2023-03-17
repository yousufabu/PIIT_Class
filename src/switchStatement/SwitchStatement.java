package switchStatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		String day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the day");
		day =sc.nextLine();
		switch (day) {
		case "Mon":
			System.out.println("School");
			break;
		case "Tue":
			System.out.println("review java");
			break;
		case "Wed":
			System.out.println("codeLab");
			break;
		case "Thu":
			System.out.println("gym");
			break;
		case "Fri":
			System.out.println("assignment");
			break;
		case "Sat":
			System.out.println("java");
			break;
		case "Sun":
			System.out.println("holiday");
			break;
			default:
				System.out.println("invalid day");
		}
	}

}
