package Sorting;

public class Selection {
	void prtArr(int[] a) {
		for(int i: a) {
			System.out.printf("%d ",i);
		}
	}
	void swap(int[] a,int i,int j) {
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	void selectionSort(int[] a) {
		for(int i = 0;i<a.length;i++) {
			int min = i;
			for(int j = i;j<a.length;j++) {
				if(a[min]>a[j]) min = j;
			}
			swap(a,min,i);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {7,10,2,3,9,8,22,17};
		Selection s = new Selection();
		s.selectionSort(a);
		s.prtArr(a);
	}

}
