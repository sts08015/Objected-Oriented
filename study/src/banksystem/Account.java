package banksystem;

public class Account {
	// 필드
	private String ano;
	private String name;
	private int balance;
	
	// 생성자
	public Account(String ano,String name,int balance) {
		this.ano = ano;
		this.name = name;
		this.balance = balance;
	}
	
	// getter, setter
	public String getAno() {
		return ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
