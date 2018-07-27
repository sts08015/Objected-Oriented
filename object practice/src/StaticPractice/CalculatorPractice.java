package StaticPractice;

public class CalculatorPractice {
public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		int a = Calculator.plus(1,2);
		int b = Calculator.minus(5,10);
		int c= calc1.plus(10, 9);
		//calc1.pi = 1;                         수정 가능 
		//System.out.println(Calculator.pi);
		System.out.println(a);
		System.out.println(b);
	}
}
