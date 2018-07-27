package banksystem;

import java.util.*;

public class AccountExample {
	
	private static Scanner scn = new Scanner(System.in);
	private static Account[] accountArray = new Account[100];
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("--------------");
			System.out.println("1.계좌 생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------");
			System.out.println("선택 > ");
			int num = scn.nextInt();
			System.out.println("--------------");
			
			switch(num) {
			case 1:
				createAccount();
				break;
			case 2:
				printAccount();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.print("시스템 종료");
	}
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String ano = scn.next();
		System.out.print("이름 : ");
		String name = scn.next();
		System.out.print("초기입금액: ");
		int balance = scn.nextInt();
		Account account = new Account(ano,name,balance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
	}
	
	private static void printAccount() {
		System.out.println("계좌목록");
		for(Account i:accountArray) {
			if(i!=null) {
				System.out.println(i.getAno()+ ' ' + i.getName() + ' ' + i.getBalance());
			}
		}
	}
	
	private static void deposit() {
		while(true) {
			System.out.println("예금");
			System.out.println("--------------");
			System.out.print("계좌번호 : ");
			String ano = scn.next();
			
			Account chk = findAccount(ano);
			
			if(chk!=null) {
				System.out.println("예금액 : ");
				int money = scn.nextInt();
				chk.setBalance(chk.getBalance() + money);
				System.out.println("예금이 완료되었습니다.");
				break;
			}
			else {
				System.out.println("계좌가 없습니다!!");
			}
		}
	}
	private static void withdraw() {
		while(true) {
			System.out.println("출금");
			System.out.println("--------------");
			System.out.print("계좌번호 : ");
			String ano = scn.next();
			
			Account chk = findAccount(ano);
			
			if(chk!=null) {
				System.out.println("출금액 : ");
				int money = scn.nextInt();
				chk.setBalance(chk.getBalance() - money);
				System.out.println("출금이 완료되었습니다.");
				break;
			}
			else {
				System.out.println("계좌가 없습니다!!");
			}
		}
	}
	private static Account findAccount(String ano) {
		for(Account i : accountArray) {
			if(i!=null) {
				if(i.getAno().equals(ano)) {
					return i;
				}
			}
		}
			return null;
	}
}