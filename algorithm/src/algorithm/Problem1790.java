package algorithm;

import java.util.Scanner;

public class Problem1790 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		String s = "";
		
		for (int i = 1; i <= N; i++) {
			s = s + i;
		}
		
		s = s.substring(k-1, k);
		
		System.out.println(s);
	}
}
