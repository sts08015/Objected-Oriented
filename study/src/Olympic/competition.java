package Olympic;

import java.util.*;

public class competition {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("���� ������ ���� �Է����ÿ�");
		int n = scn.nextInt();
		Country[] country = new Country[n];
		for(int i=0;i<n;i++) {
			String name;
			int gold,silver,bronze;
			System.out.println(i+1 + "��° ������ ������ �Է��ϼ���");
			name = scn.next();
			gold = scn.nextInt();
			silver = scn.nextInt();
			bronze = scn.nextInt();
			country[i] = new Country(name,gold,silver,bronze);
			country[i].check();
		}
		for(int i=0;i<20;i++) {
			int a = (int)(Math.random() * n);
			country[a].gold++;
			a = (int)(Math.random() * n);
			country[a].silver++;
			a = (int)(Math.random() * n);
			country[a].bronze++;
		}
		Arrays.sort(country);
		
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------");
		System.out.println("���� ����");
		System.out.println("-----------------");
		
		for(Country i : country) {
			i.check();
		}
		
	}

}
