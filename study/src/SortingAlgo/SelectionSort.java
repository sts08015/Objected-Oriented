package SortingAlgo;

public class SelectionSort extends Sorting{
	void sort(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			int min = i;
			for(int j = i;j<arr.length;j++) {
				if(arr[min] > arr[j]) min = j;
			}
			swap(arr,min,i);
		}
	}
	public static void main(String[] args) {
		int[] a = {1,4,2,4,6,63,2232,688,74};
		SelectionSort s = new SelectionSort();
		s.sort(a);
		for(int i : a) System.out.printf("%d ",i);
	}

}
