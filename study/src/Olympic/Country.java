package Olympic;

public class Country implements Comparable<Country>{
	String name;
	int gold;
	int silver;
	int bronze;
	
	public Country(String name,int gold,int silver,int bronze) {
		this.name = name;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	public void check() {
		int a = point();
		System.out.printf("%s / %d / %d / %d total : %d\n",name,gold,silver,bronze,a);
	}
	public int point() {
		return 3*gold + 2*silver + bronze;
	}
	
	public int compareTo(Country country) {
		if(this.gold > country.gold) return -1;
		else if(this.gold == country.gold) {
			if(this.silver > country.silver) return -1;
			else if(this.silver == country.silver) {
				if(this.bronze > country.bronze) return -1;
				else return 1;
			}
			else return 1;
		}
		else return 1;
	}
}
