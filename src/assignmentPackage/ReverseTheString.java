package assignmentPackage;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = obj.next();
		String rev = "";
		int leng = name.length();
		for(int i = leng - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse of "+name+" is "+rev);
	}

}
