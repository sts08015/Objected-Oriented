package BookStore;

import java.util.*;

public class BookStoreExample {
	static List<books> storage = new ArrayList<books>();
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("총 책의 권수를 입력하세요");
		int num = scn.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println("책들의 정보를 입력하세요");
			String title = scn.next();
			int price = scn.nextInt();
			storage.add(new books(title,price));
		}
		
		// 뭘 추가할까?  ㅠㅠ
	}

}
