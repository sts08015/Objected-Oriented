package test;

import java.util.*;

public class Main {
	static Scanner scn = new Scanner(System.in);
	public void swap(int[] a,int i,int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public void sort(int[] a) {
		int j = 
	}
	public int partition(int[] a,int begin,int end) {
		
	}
	public static void main(String[] args) {
		int a = scn.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			int n = scn.nextInt();
			arr[i] = n;
		}
		Main m = new Main();
		//arr[0] = -111111;
		m.sort(arr);

		for (int i=0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
}
