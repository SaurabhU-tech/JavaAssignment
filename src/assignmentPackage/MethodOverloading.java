package assignmentPackage;

public class MethodOverloading {
	
	void animal() {
		System.out.println("Dog");
	}
	
	void animal(int a) {
		System.out.println("Cat");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading Obj = new MethodOverloading();
		Obj.animal(87978979);
		Obj.animal();
	}

}
