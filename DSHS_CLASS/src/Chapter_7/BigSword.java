package Chapter_7;

public class BigSword extends Sword{
	@Override
	public void swingSword() {
		System.out.println("���׷��̵� Į�� �ֵθ���.");
	}
	@Override
	public void setPower() {
		this.power = 200;
		System.out.println("���׷��̵� Į�� �����Ǿ����ϴ�.");	
	}
}
