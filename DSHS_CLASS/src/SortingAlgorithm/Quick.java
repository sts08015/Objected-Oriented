package SortingAlgorithm;

public class Quick {
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
		int[] arr = {17556 ,41199, 6029, 6873, 13469, 42633, 68088 ,8999};
		Quick q = new Quick();
		q.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
