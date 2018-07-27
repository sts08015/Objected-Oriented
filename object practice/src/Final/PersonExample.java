package Final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("12121","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";  수정 불가 
		//p1.ssn = "234322";
		p1.name = "을지문덕";
	}

}
