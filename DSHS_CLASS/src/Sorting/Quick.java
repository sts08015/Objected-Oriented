package Sorting;

public class Quick {
	public void swap(int[] a,int i,int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public void sort(int[] a) {
		sort(a,0,a.length-1);
	}
	public void sort(int[] a,int low,int high) {
		if(low>=high) return;
		int j = partition(a,low,high);
		sort(a,low,j-1);
		sort(a,j+1,high);
	}
	public int partition(int[] a,int pivot,int high) {
		int p = a[pivot];
		int i = pivot+1;
		int j = high;
		while(true) {
			while(i<=high && a[p] >= a[i]) i++;
			while(j>=pivot && a[p] < a[j]) j--;
			if(i>=j) break;
			swap(a,i,j);
		}
		swap(a,pivot,j);
		return j;
	}
	public static void main(String[] args) {
		int[] arr = {17556 ,41199, 6029, 6873, 13469, 42633, 68088 ,8999};
		Quick q = new Quick();
		q.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}