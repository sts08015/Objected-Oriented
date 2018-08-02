package SortingPractice;

import java.util.*;

public class Country implements Comparable<Country>{
	public String name;
	public int money;
	public int population;
	
	public static final Comparator<Country> BYMONEY = new By_Money();
	
	public Country(String name,int money,int population) {
		this.name = name;
		this.money = money;
		this.population = population;
	}
	
	@Override
	public int compareTo(Country a) {
		return money - a.money;
	}
	
	public static class By_Money implements Comparator<Country>{
		@Override
		public int compare(Country a,Country b) {
			return a.name.compareTo(b.name);
		}
	}
}
