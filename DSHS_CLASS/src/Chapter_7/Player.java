package Chapter_7;

public class Player {
	private int level;
	private Sword sword;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Sword getSword() {
		return sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	public void doSword() {
		if(sword instanceof Sword) {
			System.out.println("±×³É Ä®");
		}
		else {
			System.out.println("¾÷±×·¹ÀÌµåÄ®");
		}
	}
	
}
