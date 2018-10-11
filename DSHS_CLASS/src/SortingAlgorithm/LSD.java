package SortingAlgorithm;

public class LSD {
	public static void sort(int[] a) {
		int N = a.length;
		int R = 10; 
		int[] t = new int[N];// �����迭
		for (int k = 10; k <= 1000; k *= 10) {
			int[] startIndex = new int[R + 1];
			for (int i = 0; i < N; i++)
				startIndex[(a[i] % k) / (k / 10) + 1]++; // �󵵼� ���

			for (int r = 0; r < R; r++)
				startIndex[r + 1] += startIndex[r]; // ���� �ε��� ����
			/*
			 * 3�� startIndex[3]���� ����
			 */

			for (int i = 0; i < N; i++) // t�迭�� ä���ֱ�
				t[startIndex[(a[i] % k) / (k / 10)]++] = a[i];
			// 3�� ä���־����� startIndex 1 ���������ֱ�
			for (int i = 0; i < N; i++) // �迭 ����
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
