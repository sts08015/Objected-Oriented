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
		System.out.println("å �����Դϴ�.");
		System.out.println("���� : " + this.title);
		System.out.println("���� : " + this.price);
	}
	
	void borrowed() {
		this.borrow = true;
	}
	void returned() {
		this.borrow = false;
	}
}
