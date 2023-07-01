package assignmentPackage;

public class MethodOverriding extends Test {
	
	public void display(int a, String s) {
		System.out.println("Dog");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		t.display(23, "dgahha");
		
		MethodOverriding obj = new MethodOverriding();
		obj.display(1, "saurabh");
		obj.display(3, "njv");
	}

}
