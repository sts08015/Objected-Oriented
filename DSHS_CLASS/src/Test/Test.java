package Test;

public class Test {
	static Student st = new Student("Emma");
	public static void main(String[] args) {
		Student st = new Student("Vera");
		Test ts = new Test();
		ts.st = st;
		ts.st.change(st);
		System.out.print(st.name + ", ");
		System.out.print(new Test().st.name);
		String a = "aaa";
		String b = "aaa";
		System.out.println(a==b);
	}

}
class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
	public void change(Student student) {
		student = new Student("David");
	}
}