package SortingAlgorithm;

public class Merge {
	
	public void merge(int[] a,int[] b,int low,int mid,int high) {
		int i = low;
		int j = mid + 1;
		for(int k = low;k<=high;k++) {
			if(i>mid) b[k] = a[j++];
			else if(j>high) b[k] = a[i++];
			else if(a[i] < a[j]) b[k] = a[i++];
			else b[k] = a[j++];
		}
		for(int k=low;k<=high;k++) a[k] = b[k]; // 주의 !
	}
	
	public void divide(int[] a,int[] b,int low,int high) {
		// if(high < low + buff) insertionsort  return;// 성능 향상 1
		if(high<=low) return;
		int mid = (high+low)/2;
		divide(a,b,low,mid);
		divide(a,b,mid+1,high);
		// if(a[mid] < a[mid+1]) return;  // 성능향상 2
		merge(a,b,low,mid,high);
	}
	
	public void sort(int[] a) {
		int[] b = new int[a.length];
		divide(a,b,0,a.length-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {55,34,1,35,999,1};
		
		Merge m = new Merge();
		
		m.sort(arr);
		
		for(int i: arr) {
			System.out.println(i);
		}

	}

}