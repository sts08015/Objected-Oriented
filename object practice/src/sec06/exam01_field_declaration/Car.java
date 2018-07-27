package sec06.exam01_field_declaration;

public class Car {
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	int gas;
	
	Car() {
	}
	Car(String company) {
		this(company,"은색",250);
	}
	Car(String company,String color){
		this(company,color,250);
	}
	Car(String company,String color,int maxSpeed){
		this.company = company;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("No gas");
			return false;
		}
		System.out.println("Left");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("gogo gas left : " + gas);
				gas-=1;
			}
			else {
				System.out.println("stop");
				return;
			}
		}
	}
}
