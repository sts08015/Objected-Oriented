package SortingPractice;

import java.util.*;

public class ProblemExample {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("������ ������ �Է��ϼ���");
		int n = scn.nextInt();
		Problem[] arr = new Problem[n];
		for(int i=0;i<n;i++) {
			int id;
			int difficulty;
			String subject;
			System.out.print("������ȣ : ");
			id = scn.nextInt();
			System.out.print("���̵� (1~100) : ");
			difficulty = scn.nextInt();
			System.out.print("���� : ");
			subject = scn.next();
			arr[i] = new Problem(id,difficulty,subject);
		}
		
		System.out.println("������ȣ�� ����");
		Arrays.sort(arr);
		for(Problem i : arr) System.out.println(i.id);
		System.out.println("--------------");
		System.out.println("���̵��� ����");
//		Arrays.sort(arr, new Comparator<Problem>() {
//			public int compare(Problem a,Problem b) {
//				return a.difficulty - b.difficulty;
//			}
//		});
		Arrays.sort(arr, Problem.WITH_DIFFICULTY);
		for(Problem i : arr) System.out.println(i.id);
		System.out.println("--------------");
		System.out.println("�������� ����");
		Arrays.sort(arr, Problem.WITH_SUBJECT);
		for(Problem i : arr) System.out.println(i.id);
		System.out.println("--------------");
		
	}

}
