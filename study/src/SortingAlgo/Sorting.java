package SortingAlgo;

public class Sorting {
	void swap(int[] a,int i,int j) {
		int tmp = a[i];
		a[i]=a[j];
		a[j] = tmp;
	}
}