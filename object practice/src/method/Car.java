package method;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=0;i<50;i+=10) {
			//this.setSpeed(i);
			//speed=i;
			setSpeed(i);
			System.out.println(model + "speed : " + speed);
		}
	}
}
