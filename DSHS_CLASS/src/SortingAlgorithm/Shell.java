package SortingAlgorithm;

public class Shell {
	
	public void shellSort(int[] a) {
		int N = a.length;
		int h = N/2;  // 전처리 과정 
		while(h>=1) {
			for(int i=0;i<h;i++) {
				for(int j=i+h;j<N;j+=h) {
					int tmp = a[j];
					int k = j-h;
					while(k>=i && a[k]>tmp) {  // h 간격으로 shell 정렬
						a[k+h] = a[k];
						k-=h;
					}
					a[k+h] = tmp;
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
