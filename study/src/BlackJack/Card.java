package BlackJack;

public class Card {
	
	public Pattern pattern;
	public int num;
	public String denomination;  
	
	
	public Card(Pattern pattern,int num,String denomination) {
		this.pattern = pattern;
		this.num = num;
		this.denomination = denomination;
	}
	
	public int getPoint(int num) {
		switch(num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			return num;
		case 11:
		case 12:
		case 13:
			return 10;
		default:
			return 0;
		}
	}
	
	public String getDenomination(String denomination) {
	//	case
	return "a";
	}
	
}
