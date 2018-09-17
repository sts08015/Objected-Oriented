package Chapter_6;

import java.util.*;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}
			else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주 : ");
		String name = scanner.next();
		System.out.print("초기입금액 : ");
		int x = scanner.nextInt();
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
		Account a = new Account(ano,name,x);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = a;
				break;
			}	
		}
	}
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌 목록");
		System.out.println("--------------");
		for(Account i : accountArray) {
			if(i == null) break;
			System.out.printf("%s  %s  %d\n", i.getAno(),i.getOwner(),i.getBalance());
		}
	}
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		Account a = findAccount(ano);
		if(a!=null) {
			System.out.print("예금액 : ");
			int x = scanner.nextInt();
			a.setBalance(a.getBalance()+x);
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
		else System.out.println("결과 : 계좌번호가 없습니다.");
		
	}
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		Account a = findAccount(ano);
		if(a!=null) {
			System.out.print("출금액 : ");
			int x = scanner.nextInt();
			a.setBalance(a.getBalance()-x);
			System.out.println("결과 : 출금이 성공되었습니다.");
		}
		else System.out.println("결과 : 계좌번호가 없습니다.");
		
	}
	private static Account findAccount(String ano) {
		for(Account i: accountArray) {
			if(i.getAno().equals(ano)) return i;
		}
		return null;
	}
}
