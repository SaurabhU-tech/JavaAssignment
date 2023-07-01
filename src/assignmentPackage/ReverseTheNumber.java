package assignmentPackage;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = obj.nextInt();
		int rem, RevNum = 0;
		for( ; num > 0; ) {
			rem = num % 10;
			RevNum = RevNum * 10 + rem;
			num = num / 10;
		}
		System.out.println(RevNum);
	}

}
