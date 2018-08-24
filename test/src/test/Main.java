package test;

import java.util.*;

public class Main {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = scn.nextInt();
		int m = scn.nextInt();
		boolean chk = true;
		int k = 1;
		while(chk) {
			if(m%a == 0) {
				chk = false;
				System.out.print((int)m/a);
			}
			
		}
	}
}
