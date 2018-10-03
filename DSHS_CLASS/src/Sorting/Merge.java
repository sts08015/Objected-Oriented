package Sorting;

public class Merge {
	void sort(int[] a) {
		int[] b = new int[a.length];
		divide(a,b,0,a.length-1);
	}
	void divide(int[] a,int[] b,int low,int high) {
		if(high<=low) return;
		int mid = (low+high)/2;
		divide(a,b,low,mid);
		divide(a,b,mid+1,high);
		merge(a,b,low,mid,high);
	}
	void merge(int[] a,int[] b,int low,int mid,int high) {
		int i = low;
		int j = mid+1;
		for(int k = low;k<=high;k++) {
			if(i>mid) b[k] = a[j++];
			else if(j>high) b[k] = a[i++];
			else if(a[i] > a[j]) b[k] = a[j++];
			else b[k] = a[i++];
		}
		for(int k = low;k<=high;k++) {
			a[k] = b[k];
		}
	}
	public static void main(String[] args) {
		Merge m = new Merge();
		int[] arr = {1,2,23135,5246,223421,6211,134};
		m.sort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
