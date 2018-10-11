package Sorting;

public class Insertion {
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
	void insertion(int[] a) {
		int N = a.length;
		for(int i = 1;i<N;i++) {
			for(int j = i;j>0;j--) {
				if(a[j]<a[j-1]) swap(a,j,j-1);
				else break;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {2,3,5,17,9,10,27,89};
		Insertion i = new Insertion();
		i.insertion(a);
		i.prtArr(a);
	}

}
