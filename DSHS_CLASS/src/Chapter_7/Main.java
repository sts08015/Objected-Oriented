package Chapter_7;

public class Main {

	public static void main(String[] args) {
		Player p = new Player();
		Sword s = new Sword();
		p.setSword(s);
		for(int i = 0;i<10;i++) {
			p.setLevel(i);
			System.out.println(p.getLevel());
			if(i>5) {
				Sword b = new BigSword();
				p.setSword(b);
			}
			p.doSword();
			p.getSword().setPower();
			p.getSword().swingSword();
			System.out.println(p.getSword().getPower());
		}
	}

}
