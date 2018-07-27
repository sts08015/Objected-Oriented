package method;

public class ComuterExample {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		int[] ans = {1,2,3};
		int result1 = com1.sum1(ans);
		System.out.println(result1);
		
		Computer com2 = new Computer();
		int result2 = com2.sum2(1,2,3,4);
		System.out.println(result2);
	}

}
