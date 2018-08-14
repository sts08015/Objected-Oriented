package Recursion;

public class Factorial {
	
	int fac(int n) {
		if(n == 1) return 1;
		return n*fac(n-1);
	}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.fac(4));
	}

}
