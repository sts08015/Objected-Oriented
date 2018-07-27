package BookStore;

public class books {
	String title;
	boolean borrow = false;
	int price;
	
	books(String title,int price){
		this.title = title;
		this.price = price;
	}
	
	void info() {
		System.out.println("책 정보입니다.");
		System.out.println("제목 : " + this.title);
		System.out.println("가격 : " + this.price);
	}
	
	void borrowed() {
		this.borrow = true;
	}
	void returned() {
		this.borrow = false;
	}
}
