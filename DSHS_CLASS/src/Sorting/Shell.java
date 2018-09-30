package Sorting;

public class Shell {
	void swap(int[] a,int i,int j) {
		int tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	void shellSort(int[] a) {
		int N = a.length;
		int h = 4;
		while(h>=1){
			for(int i=h;i<N;i++) {
				for(int j=i;j>=h;j-=h) {
					if(a[j-h]>a[j]) swap(a,j-h,j);
					else break;
				}
			}
			h/=2;
		}
			
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
