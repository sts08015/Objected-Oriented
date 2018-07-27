package sec06.exam01_field_declaration;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("gogo");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gogogogo");
		}
		else {
			System.out.print("need gas");
		}
	}
}
