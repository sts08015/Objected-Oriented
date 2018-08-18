import java.util.*;

public class Main {
	static Scanner scn = new Scanner(System.in);
	public void swap(int[] a,int i,int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public void sort(int[] a) {
		quick(a,0,a.length-1);
	}
	public void quick(int[] a,int low,int high) {
		if(high <= low) return;
		int j = partition(a,low,high);
		quick(a,low,j-1);
		quick(a,j+1,high);
	}
	public int partition(int[] a,int pivot,int high) {
		int i = pivot +1;
		int j = high;
		int p  = a[pivot];
		while(i<=j) {
			while(i<=high && p>=a[i]) i++;  // while Áß¿ä !!
			while(j >= pivot && p<a[j]) j--;
			if(i<=j) swap(a,i,j);
		}
		swap(a,pivot,j);
		return j;
	}
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		Main m = new Main();
		m.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}

}
