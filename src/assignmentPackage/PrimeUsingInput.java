package assignmentPackage;

import java.util.Scanner;

public class PrimeUsingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = obj.nextInt();
		
		for(int i = 2; i <= num; i++) {
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					temp += 1;
				}
			}
			if (temp == 0) {
				System.out.print(" "+i);
			}
			temp = 0;
		}
	}

}
