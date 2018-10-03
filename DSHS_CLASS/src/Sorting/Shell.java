package Sorting;

public class Shell {
	void shellSort(int[] a) {
		int h = 3;
		int N = a.length;
		while(h>0) {
			for(int i=h;i<N;i++) {
				for(int j=i;j>0;j-=h) {
					if(a[j] < a[j-h]) swap(a,j,j-h);
					else break;
				}
			}
			h/=2;
		}
	}
	void swap(int[] a,int i,int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public static void main(String[] args) {
		int[] arr = {1,5,2,8,9,3,7,6};
		
		Shell s = new Shell();
		
		s.shellSort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
