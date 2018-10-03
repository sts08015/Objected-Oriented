package Chapter_7;

public class Sword {
	protected int power = 0;
	public void swingSword() {
		System.out.println("보통 칼을 휘두른다.");
	}
	public int getPower() {
		return power;
	}
	public void setPower() {
		this.power = 200;
		System.out.println("보통 칼이 장착되었습니다.");
	}
	
}
