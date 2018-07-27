package test;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] num = new int[n];
		int [] chk = new int[24];
		for(int i=0;i<n;i++) {
			num[i] = scn.nextInt();
			chk[num[i]]++;
		}
		for(int i=1;i<24;i++) {
			System.out.print(chk[i]+" ");
		}
	}
}
