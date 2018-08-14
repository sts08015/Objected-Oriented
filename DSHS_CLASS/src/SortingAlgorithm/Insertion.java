package SortingAlgorithm;

public class Insertion {
	public void insertionSort(int[] a) {
		int N = a.length;
		for(int i=1;i<N;i++) {
			int tmp = a[i];
			int k = i-1;
			while(k>=0 && a[k]>tmp) {
				a[k+1] = a[k];
				k--;
			}
			a[k+1] = tmp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,6,1,2,9,3,4};
		Insertion x = new Insertion();
		x.insertionSort(arr);
		
		for(int i: arr) {
			System.out.println(i);
		}
		
	}

}
