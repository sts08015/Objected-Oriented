package AccessModifier;
//import kr.hs.ts.test2.Car;
public class Car {

	private int speed;
	
	public int getSpeed(int a, String b) {
		return speed;
	}
	

	public void setSpeed(int speed) {
		if(speed<0) this.speed = 0;
		else this.speed = speed;
	}

	public static void main(String[] args) {

		System.out.println("dddd");
	}
// kr.hs.ts.test2.Car avantte = new kr.hs.ts.test2.Car();
// 이런식으로 써줘야 함 

}
