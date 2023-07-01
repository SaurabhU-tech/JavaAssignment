package assignmentPackage;

public class Inheritance3 extends Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call static
		System.out.println(Inheritance1.d);
		System.out.println(Inheritance1.add2());
		
		//call no-static
		Inheritance3 obj3 = new Inheritance3();
		System.out.println(obj3.b);
		System.out.println(obj3.add());
	}

}
