package Sorting;

public class Heap {
	void swap(int[] a,int i,int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	void sort(int[] arr) {
		int N = arr.length-1;
		for(int i = N/2;i>0;i--) {
			downheap(arr,i,N);
		}
		while(N>1) {
			swap(arr,1,N--);
			downheap(arr,1,N);
		}
	}
	void downheap(int[] arr,int p,int heapsize) {
		while(2*p<=heapsize) {
			int s = 2*p;
			if(arr[p] >arr[s]) break;
			if(s<heapsize && arr[s] < arr[s+1]) s++;
			swap(arr,p,s);
			p = s;
		}
	}
	public static void main(String[] args) {
		int[] arr = {0x7fffffff,1,4,5,9,8,3,2,7,6};
		Heap h = new Heap();
		h.sort(arr);
		
		for(int i : arr) {
			if(i!=0x7fffffff)
				System.out.println(i);
		}
	}
}
