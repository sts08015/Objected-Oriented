package Chapter_6;

public class Singleton {
	private Singleton() {}
	private static Singleton singleton;
	static {
		singleton = new Singleton();
	}
	static Singleton getInstance() {
		return singleton;
	}
	
	public static void main(String[] args) {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		if(a == b) System.out.println("singleton!!!!");
		else System.out.println("not singleton!!!!");

	}
}
