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
		while(true) {
			while(i<=high && p>=a[i]) i++;
			while(j >= pivot && p<a[j]) j--;
			if(i>=j) break;
			swap(a,i,j);
		}
		swap(a,pivot,j);
		return j;
	}
	public static void main(String[] args) {
		int[] arr = {-1,4,5,2,0,1,9,8,7,3,6};
		Quick q = new Quick();
		q.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
