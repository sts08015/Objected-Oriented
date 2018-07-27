package method;

public class Computer {
	int sum1(int[] values) {
		int ans = 0;
		for(int i=0;i<values.length;i++) {
			ans+=values[i];
		}
		return ans;
	}
	
	int sum2(int ... values) {
		int ans = 0;
		for(int i=0;i<values.length;i++) {
			ans+=values[i];
		}
		return ans;
	}
}
