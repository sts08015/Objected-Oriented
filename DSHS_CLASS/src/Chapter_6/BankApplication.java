package Chapter_6;

import java.util.*;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-------------------");
			System.out.print("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("������ : ");
		String name = scanner.next();
		System.out.print("�ʱ��Աݾ� : ");
		int x = scanner.nextInt();
		
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
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
		System.out.println("���� ���");
		System.out.println("--------------");
		for(Account i : accountArray) {
			if(i == null) break;
			System.out.printf("%s  %s  %d\n", i.getAno(),i.getOwner(),i.getBalance());
		}
	}
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("����");
		System.out.println("--------------");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		Account a = findAccount(ano);
		if(a!=null) {
			System.out.print("���ݾ� : ");
			int x = scanner.nextInt();
			a.setBalance(a.getBalance()+x);
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
		}
		else System.out.println("��� : ���¹�ȣ�� �����ϴ�.");
		
	}
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		Account a = findAccount(ano);
		if(a!=null) {
			System.out.print("��ݾ� : ");
			int x = scanner.nextInt();
			a.setBalance(a.getBalance()-x);
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
		}
		else System.out.println("��� : ���¹�ȣ�� �����ϴ�.");
		
	}
	private static Account findAccount(String ano) {
		for(Account i: accountArray) {
			if(i.getAno().equals(ano)) return i;
		}
		return null;
	}
}
