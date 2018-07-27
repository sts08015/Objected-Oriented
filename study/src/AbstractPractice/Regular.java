package AbstractPractice;

public class Regular extends Employee{
	public int salary;
	
	public Regular(String name,int age,int salary) {
		super(name,age);
		this.salary = salary;
	}
	
	@Override
	public double pay() {
		return this.salary;
	}
	@Override
	public void print() {
		display();
		System.out.println("고정급 : " + pay() + "원");
	}
}
