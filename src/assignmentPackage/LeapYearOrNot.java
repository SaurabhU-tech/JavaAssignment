package assignmentPackage;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = obj.nextInt();
		if (year % 400 == 0) {
			System.out.println("Leap year");
		} else if(year % 100 == 0) {
			System.out.println("Not a Leap year");
		} else if(year % 4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a Leap year");
		}
	}

}
