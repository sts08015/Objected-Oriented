package SortingPractice;

import java.util.*;

public class CountrySort {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("국가의 개수를 입력하시오 : ");
		int n = scn.nextInt();
		Country[] a = new Country[n];
		
		for(int i=0;i<n;i++) {
			String name = scn.next();
			int money = scn.nextInt();
			int population = scn.nextInt();
			a[i] = new Country(name,money,population);
		}
		
		Arrays.sort(a);  //Comparable 방법
		
		Arrays.sort(a,Country.BYMONEY);  // Comparator 방법 1
		
		Arrays.sort(a, new Comparator<Country>() {  //Comparator 방법 2
			@Override
			public int compare(Country a,Country b) {
				return a.population - b.population;
			}
		});
		
	}

}
