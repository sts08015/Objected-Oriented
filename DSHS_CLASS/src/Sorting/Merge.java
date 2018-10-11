package Sorting;

public class Merge {
	void sort(int[] arr) {
		int[] b = new int[arr.length];
		divide(arr,b,0,arr.length-1);
	}
	void divide(int[] arr,int[] brr,int low,int high) {
		if(low>=high) return;
		int mid = (low+high)/2;	
		divide(arr,brr,low,mid);
		divide(arr,brr,mid+1,high);
		merge(arr,brr,low,mid,high);
	}
	void merge(int[] arr,int[] brr,int low,int mid,int high) {
		int i = low;
		int j = mid+1;
		for(int k = low;k<=high;k++) {
			if(i>mid) brr[k] = arr[j++];
			else if(j>high) brr[k] = arr[i++];
			else if(arr[i] > arr[j]) brr[k] = arr[j++];
			else  brr[k] = arr[i++];
		}
		
		for(int k = low;k<=high;k++) {
			arr[k] = brr[k];
		}
	}
	public static void main(String[] args) {
		Merge m = new Merge();
		int[] arr = {1,1,2,23135,5246,223421,6211,134};
		m.sort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
