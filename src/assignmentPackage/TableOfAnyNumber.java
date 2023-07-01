package assignmentPackage;

import java.util.Scanner;

public class TableOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = obj.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(i*num);
		}
	}

}
