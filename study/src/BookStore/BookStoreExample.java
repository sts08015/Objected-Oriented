package BookStore;

import java.util.*;

public class BookStoreExample {
	static List<books> storage = new ArrayList<books>();
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("�� å�� �Ǽ��� �Է��ϼ���");
		int num = scn.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println("å���� ������ �Է��ϼ���");
			String title = scn.next();
			int price = scn.nextInt();
			storage.add(new books(title,price));
		}
		
		// �� �߰��ұ�?  �Ф�
	}

}
