package assignmentPackage;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String star = "";
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			star += "*";
			System.out.print(star);
			System.out.println();
		}
	}
}
