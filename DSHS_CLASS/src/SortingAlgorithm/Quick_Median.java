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
		quick(a,end,j+1);
	}
	public int partition(int[] a,int begin,int end) {
		int mid = (end+begin)/2;
		int left = begin;
		int right = end;
		while(true) {
			while(a[left]<=a[mid] && left<right) left++;
			while(a[right]>a[mid] && left<right) right--;
			if(left>=right) break;
		}
		swap(a,mid,right);
		return right;
	}
	public static void main(String[] args) {
		int[] arr = {4,5,2,1,0,9,8,7,3,6};
		Quick q = new Quick();
		q.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
