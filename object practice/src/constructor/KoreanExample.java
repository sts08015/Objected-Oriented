package constructor;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("���ڹ�","1212");
		Korean k2 = new Korean("���ڹ�","01010");
		
		System.out.println(k1.nation+k1.name+k1.ssn);
		System.out.println(k2.nation+k2.name+k2.ssn);
	}

}
