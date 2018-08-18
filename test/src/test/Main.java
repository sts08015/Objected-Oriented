package test;

import java.util.*;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public void sort(int[] a) {
		quick(a, 0, a.length - 1);
	}

	public void quick(int[] a, int begin, int end) {
		if (end <= begin)
			return;
		int j = partition(a, begin, end);
		quick(a, begin, j - 1);
		quick(a, j + 1, end);
	}

	public int partition(int[] a, int begin, int end) {
		int mid = (end + begin) / 2;
		int left = begin;
		int right = end;
		while (true) {
			while (a[left] <= a[mid] && left < right)
				left++;
			while (a[right] > a[mid] && left < right)
				right--;
			if (left >= right)
				break;
			swap(a, left, right);
		}
		swap(a, mid, right);
		return right;
	}

	public static void main(String[] args) {
		int a = scn.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			int n = scn.nextInt();
			arr[i] = n;
		}
		Main m = new Main();
		// arr = new int[] {1,2,3,4,5};
		m.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
}
