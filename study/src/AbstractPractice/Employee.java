package AbstractPractice;

public abstract class Employee {
	public String name;
	public int age;
	
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract double pay();
	public abstract void print();
	public void display() {
		System.out.println("이름 : " + this.name + "나이 : " + this.age);
	}
}
