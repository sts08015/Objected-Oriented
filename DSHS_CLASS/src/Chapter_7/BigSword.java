package Chapter_7;

public class BigSword extends Sword{
	@Override
	public void swingSword() {
		System.out.println("업그레이드 칼을 휘두른다.");
	}
	@Override
	public void setPower() {
		this.power = 200;
		System.out.println("업그레이드 칼이 장착되었습니다.");	
	}
}
