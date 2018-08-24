package SortingAlgorithm;

public class Quick_Median {
	public void swap(int[] a,int i,int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public void sort(int[] a) {
		quick(a,0,a.length-1);
	}
	public void quick(int[] a,int begin,int end) {
		if(end<=begin) return;
		int j = partition(a,begin,end);
		quick(a,begin,j-1);
		quick(a,j+1,end);
	}
	public int partition(int[] a,int begin,int end) {
		int mid = (end+begin)/2;
		int left = begin;
		int right = end;
		while(left<right) {
			while(a[left]<=a[mid] && left<right) left++;
			while(a[right]>a[mid] && left<right) right--;
			//if(left>=right) break;
			if(left<right)swap(a,left,right);
		}
		swap(a,mid,right);
		return right;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Quick q = new Quick();
		q.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
