package SortingAlgorithm;

public class Selection {

	public void swap(int[] a, int i,int j) {
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public void selectionSort(int[] a) {
		int N = a.length;
		for(int i=0;i<N;i++) {
			int min = i;
			for(int j=i;j<N;j++) {
				if(a[min]>a[j]) {
					min = j;
				}
			}
			swap(a,i,min);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,6,7,1,2,4};
		Selection s = new Selection();
		
		s.selectionSort(arr);
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
