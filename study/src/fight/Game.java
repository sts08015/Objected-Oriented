package fight;

import java.util.*;

public class Game {
	
	static Scanner scn = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main(String[] args) {
		System.out.println("������ �̸��� �Է��Ͻÿ�");
		String name = scn.next();
		System.out.println("��� ������ �̸��� �Է��Ͻÿ�");
		String op = scn.next();
		
		hero me = new hero(name);
		hero opp = new hero(op);
		
		int att = (int)(Math.random()*10)+1;  // ��ȣ ���� 
		me.attack = att;
		att = (int)(Math.random()*10)+1;
		opp.attack = att;
		
		while(me.health>0 && opp.health>0) {
			boolean a = random.nextBoolean();
			if(a) {
				me.punch();
				opp.health -= me.attack;
			}
			else {
				opp.punch();
				me.health -= opp.attack;
			}
			try {
			      Thread.sleep(100);
			    } catch (InterruptedException e) { }

		}
		if(me.health <= 0) System.out.println(op+"�¸�!!");
		else System.out.println(name+"�¸�!!");
		
	}

}
