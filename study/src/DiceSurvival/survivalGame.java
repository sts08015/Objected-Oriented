package DiceSurvival;

import java.util.*;

public class survivalGame {
	static List<String> animal = Arrays.asList("Áã","¼Ò","¹ü","Åä³¢","¿ë","¹ì","¸»"
			,"¾ç","¿ø¼şÀÌ","´ß","°³","µÅÁö");
	static List<dice> Dice = new ArrayList<dice>();
	
	public static void main(String[] args) {
		for(int i=0;i<12;i++) {
			Dice.add(new dice(animal.get(i),i+4));
		}
		//System.out.println(Dice.size());
		//for(dice i : Dice) System.out.println(i.name + ' ' + i.num);
		//List<String> check = new ArrayList<String>();
		
		while(Dice.size() > 1) {
			System.out.println("»ıÁ¸ ÁÖ»çÀ§ ¼ö ");
			System.out.println("--------------");
			System.out.println(Dice.size());
			
			for(int i=0;i<Dice.size();i++) {
				int number = (int)(Math.random() * Dice.get(i).num);
				//check.add(Dice.get(i).name);
				if(number %2 == 1) {
					System.out.println(Dice.get(i).name + "´ÔÀÌ »ç¸ÁÇÏ¼Ì½À´Ï´Ù.");
					Dice.remove(i--);
				}
				if(Dice.size() == 1) break;
			}
		}
		System.out.println("--------------");
		System.out.println("ÃÖÁ¾ ½ÂÀÚ");
		System.out.println(Dice.get(0).name + ' ' + Dice.get(0).num);
		System.out.println("--------------");
		
		/*for(String i: check) {
			System.out.println(i);
		}*/
	}
	

}
