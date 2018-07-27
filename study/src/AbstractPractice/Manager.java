package AbstractPractice;

public class Manager extends Regular{
	public double incentive;
	
	public Manager(String name,int age,int salary) {
		super(name,age,salary);
	}
	
	@Override
	public double pay() {
		if(super.pay() >= 2500000) {
			   incentive = super.pay() + super.pay() * 0.6;
			  } else if (super.pay() >= 2000000) {
			   incentive = super.pay() + super.pay() * 0.5;
			  } else if (super.pay() < 2000000) {
			   incentive = super.pay() + super.pay() * 0.4;
			  }
			  return incentive;
	}
	
	@Override 
	public void print() {
		display();
		 System.out.println("���ɾ� : " + pay() + "��");
	}
}
