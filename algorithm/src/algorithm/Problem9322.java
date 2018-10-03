package algorithm;

import java.util.Scanner;

public class Problem9322 {

	public static void main(String[] args) {
		int cnt = 0;
		int n = 0;

		Scanner sc = new Scanner(System.in);

		cnt = sc.nextInt();

		while (cnt-- > 0) {
			n = sc.nextInt();

			String[][] word = new String[3][n + 1];
			int[] index = new int[n + 1];

			for (int j = 0; j < 3; j++) {
				for (int i = 0; i < n; i++) {
					word[j][i] = sc.next();
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (word[0][i].equals(word[1][j])) {
						index[j] = i;
					}
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (index[j] == i) {
						System.out.print(word[2][j] + " ");
					}
				}
			}

			System.out.println();
		}

	}

}
