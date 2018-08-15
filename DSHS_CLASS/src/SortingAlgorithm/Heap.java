package SortingAlgorithm;

public class Heap {
	public void swap(int[] a,int x,int y) {
		int tmp;
		tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}
	public void sort(int[] a) {
		int heapsize = a.length-1;
		for(int i= heapsize/2;i>0;i--)  // max heap 만드는 과정 
			downheap(a,i,heapsize);
		while(heapsize>1) {
			swap(a,1,heapsize--);
			downheap(a,1,heapsize);			
		}
		
	}
	public void downheap(int[] a,int p,int heapsize) {
		while(2*p<=heapsize) {
			int s = 2*p;
			if(s<heapsize && a[s] < a[s+1]) s++;
			if(a[p] > a[s]) break;
			swap(a,p,s);
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