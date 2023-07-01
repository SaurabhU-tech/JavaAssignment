package assignmentPackage;

public class primeUpToHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		//int num = 2;
		for (int i = 2; i <= 99; i++) {
			for (int j = 2; j < i; j++) {
				if(i%j == 0) {
					temp += 1;
				}
			}
			if(temp == 0) {
				System.out.print(" "+i); //"No is prime number "+
			} //else {
				//System.out.println("Prime Number");
			//}
			temp = 0;
		}
	}

}
