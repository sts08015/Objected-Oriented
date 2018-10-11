package Sorting;

public class LSD {
	static void sort(int[] arr) {
		int N = arr.length;
		int R = 10;
		int[] t = new int[N];
		for(int k = 10;k<=1000;k*=10) {
			int[] startindex = new int[R+1];
			for(int i = 0;i<N;i++) startindex[(arr[i]%k)/(k/10) +1]++;
			for(int r = 0;r<R;r++) startindex[r+1] += startindex[r];
			for(int i = 0;i<N;i++) t[startindex[(arr[i]%k)/(k/10)]++] = arr[i];
			for(int i = 0;i<N;i++) arr[i] = t[i];
		}
	}
	public static void main(String[] args) {
		int[] a = { 251, 430, 301, 540, 551, 401, 2, 10, 124, 22, 204, 115 };
		sort(a);
		for (int i : a)
			System.out.println(i);
	}
}
