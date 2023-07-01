package assignmentPackage;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = obj.nextInt();
		System.out.println("Enter a operator");
		String op = obj.next();
		System.out.println("Enter the second number");
		int num2 = obj.nextInt();
		switch(op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("please enter valid operator");
		}
	}

}
