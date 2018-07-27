package fight;

public class hero {
	public String name;
	public int health = 100;
	public int attack;
	
	public hero(String name) {
		this.name = name;
	}
	
	public void punch() {
		System.out.println(name +"의 펀치 직격!! 공격력: " + attack);
	}
	
}
