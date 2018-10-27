package algorithm;

import java.util.Scanner;

public class Problem5585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int gs = 1000 - sc.nextInt();
		int count = 0;

		while (gs > 0) {
			for (int i = 0; i < coin.length; i++) {
				count += gs / coin[i];
				gs = gs % coin[i];
			}
		}
		System.out.println(count);
	}

}
