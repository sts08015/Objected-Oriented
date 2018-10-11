package SortingAlgorithm;

public class LSD {
	public static void sort(int[] a) {
		int N = a.length;
		int R = 10; 
		int[] t = new int[N];// 보조배열
		for (int k = 10; k <= 1000; k *= 10) {
			int[] startIndex = new int[R + 1];
			for (int i = 0; i < N; i++)
				startIndex[(a[i] % k) / (k / 10) + 1]++; // 빈도수 계산

			for (int r = 0; r < R; r++)
				startIndex[r + 1] += startIndex[r]; // 시작 인덱스 저장
			/*
			 * 3은 startIndex[3]에서 시작
			 */

			for (int i = 0; i < N; i++) // t배열에 채워넣기
				t[startIndex[(a[i] % k) / (k / 10)]++] = a[i];
			// 3을 채워넣었으면 startIndex 1 증가시켜주기
			for (int i = 0; i < N; i++) // 배열 복사
				a[i] = t[i];
		}
	}

	public static void main(String[] args) {
		int[] a = { 251, 430, 301, 540, 551, 401, 2, 10, 124, 22, 204, 115 };
		sort(a);
		for (int i : a)
			System.out.println(i);
	}

}
