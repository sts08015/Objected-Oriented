package exam6;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;
	private String owner;
	private String ano;
	
	public Account() {}
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void setBalance(int balance) {
		if(!(balance < MIN_BALANCE || balance > MAX_BALANCE)) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
		
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
}
