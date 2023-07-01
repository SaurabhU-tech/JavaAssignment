package assignmentPackage;

public class TestInterface implements Itf, Itf2 {
	
	public void show() {
		System.out.println("This is interface topic");
	}
	
	public void myCar() {
		System.out.println("I have McLaren");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface obj = new TestInterface();
		obj.show();
		obj.myCar();
	}

}
