package assignmentPackage;

import java.util.Scanner;

public class EvenOrOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = obj.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}
}
