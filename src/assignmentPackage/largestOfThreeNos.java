package assignmentPackage;

public class largestOfThreeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2000, b = 300, c = 4500;
		if(a > b) {
			if(a > c) {
				System.out.println("a is gretest");
			} else {
				System.out.println("c is gretest");
			} 
		} 
		else if(b > c) {
				System.out.println("b is gretest");
			} else {
				System.out.println("c is greatest");
		}
	}
}
