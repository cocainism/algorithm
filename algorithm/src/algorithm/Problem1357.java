package algorithm;

import java.util.Scanner;

public class Problem1357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(rev(rev(n) + rev(m)));

	}

	//Reverce
	public static int rev(int x) {

		StringBuffer sb = new StringBuffer();
		while (x > 0) {

			sb.append(x % 10);
			x /= 10;
		}

		return Integer.parseInt(sb.toString());
	}
}