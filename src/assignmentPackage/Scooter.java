package assignmentPackage;

public class Scooter extends Abstraction1 {
	
	void start() {
		System.out.println("Scooter start with kick");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.start();
		Scooter s = new Scooter();
		s.start();
	}

}
