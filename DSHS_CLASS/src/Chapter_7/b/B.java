package Chapter_7.b;

import Chapter_7.a.*;

public class B extends A{
	public B() {
		this.a = 100;
	}
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		System.out.println(b.b);
		//System.out.println(b.c);
	}
}
