package SortingPractice;

import java.util.*;

public class CountrySort {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("������ ������ �Է��Ͻÿ� : ");
		int n = scn.nextInt();
		Country[] a = new Country[n];
		
		for(int i=0;i<n;i++) {
			String name = scn.next();
			int money = scn.nextInt();
			int population = scn.nextInt();
			a[i] = new Country(name,money,population);
		}
		
		Arrays.sort(a);  //Comparable ���
		
		Arrays.sort(a,Country.BYMONEY);  // Comparator ��� 1
		
		Arrays.sort(a, new Comparator<Country>() {  //Comparator ��� 2
			@Override
			public int compare(Country a,Country b) {
				return a.population - b.population;
			}
		});
		
	}

}
