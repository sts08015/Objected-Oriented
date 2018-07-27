public class Hello {
	static String test = "Hello world";
	int age;
	String name;
	Hello(int age){
		this(age,"FisMA");
	}
	Hello(int age,String name){
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		Hello a = new Hello(18);
		System.out.println(a.age+" " + a.name + ' ' + Hello.test);
	}
}
