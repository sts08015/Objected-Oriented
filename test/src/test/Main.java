package test;

import java.util.*;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		while (n-- > 0) {
			int k = scn.nextInt();
			arr.add(k);
			// System.out.println(k);
		}
		// for(int i: arr) System.out.println(i);
		Collections.sort(arr);
		// System.out.println(arr.size());
		for (int i = 0; i < arr.size(); i++)
			System.out.printf("%d ", arr.get(i));
	}
}
