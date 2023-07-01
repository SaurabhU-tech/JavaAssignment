package assignmentPackage;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long f1 = 0, f2 = 1, temp;
		System.out.print(f1+" "+f2);
		for (int i = 0; i < 30; i++) {
			temp = f1 + f2;
			f1 = f2;
			f2 = temp;
			System.out.print(" "+temp);
		}
	}

}
