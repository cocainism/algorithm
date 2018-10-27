package algorithm;

import java.util.Scanner;

public class Problem1138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] result = new int[N];

		for (int i = 0; i < N; i++) {
			int left = sc.nextInt();

			for (int j = 0; j < N; j++) {
				if (left == 0 && result[j] == 0) {
					result[j] = i + 1;
					break;
				} else if (result[j] == 0) {
					left--;
				}

			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(result[i]);
		}
	}

}
