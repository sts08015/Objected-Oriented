package fight;

import java.util.*;

public class Game {
	
	static Scanner scn = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main(String[] args) {
		System.out.println("영웅의 이름을 입력하시오");
		String name = scn.next();
		System.out.println("상대 영웅의 이름을 입력하시오");
		String op = scn.next();
		
		hero me = new hero(name);
		hero opp = new hero(op);
		
		int att = (int)(Math.random()*10)+1;  // 괄호 주의 
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
		if(me.health <= 0) System.out.println(op+"승리!!");
		else System.out.println(name+"승리!!");
		
	}

}
