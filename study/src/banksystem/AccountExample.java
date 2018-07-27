package banksystem;

import java.util.*;

public class AccountExample {
	
	private static Scanner scn = new Scanner(System.in);
	private static Account[] accountArray = new Account[100];
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("--------------");
			System.out.println("1.���� ���� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------");
			System.out.println("���� > ");
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
		System.out.print("�ý��� ����");
	}
	private static void createAccount() {
		System.out.print("���¹�ȣ : ");
		String ano = scn.next();
		System.out.print("�̸� : ");
		String name = scn.next();
		System.out.print("�ʱ��Աݾ�: ");
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
		System.out.println("���¸��");
		for(Account i:accountArray) {
			if(i!=null) {
				System.out.println(i.getAno()+ ' ' + i.getName() + ' ' + i.getBalance());
			}
		}
	}
	
	private static void deposit() {
		while(true) {
			System.out.println("����");
			System.out.println("--------------");
			System.out.print("���¹�ȣ : ");
			String ano = scn.next();
			
			Account chk = findAccount(ano);
			
			if(chk!=null) {
				System.out.println("���ݾ� : ");
				int money = scn.nextInt();
				chk.setBalance(chk.getBalance() + money);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;
			}
			else {
				System.out.println("���°� �����ϴ�!!");
			}
		}
	}
	private static void withdraw() {
		while(true) {
			System.out.println("���");
			System.out.println("--------------");
			System.out.print("���¹�ȣ : ");
			String ano = scn.next();
			
			Account chk = findAccount(ano);
			
			if(chk!=null) {
				System.out.println("��ݾ� : ");
				int money = scn.nextInt();
				chk.setBalance(chk.getBalance() - money);
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				break;
			}
			else {
				System.out.println("���°� �����ϴ�!!");
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