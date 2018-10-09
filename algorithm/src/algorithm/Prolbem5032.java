package algorithm;

import java.util.Scanner;

public class Prolbem5032 {

	public static void main(String[] args) {
		int e = 0;
		int f = 0;
		int c = 0;
		int bottle = 0;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);

		e = sc.nextInt();
		f = sc.nextInt();
		c = sc.nextInt();

		bottle = e + f;

		while (bottle >= c) {
			cnt += bottle / c;
			bottle = (bottle % c) + (bottle / c);
		}
		
		System.out.println(cnt);
	}
}

