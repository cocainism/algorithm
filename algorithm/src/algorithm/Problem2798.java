package algorithm;

import java.util.Scanner;

public class Problem2798 {
	public static void main(String[] args) {

		int N = 0; // 카드장수
		int M = 0; // 블랙잭 숫자
		int threeCardPoint = 0;

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		int[] card = new int[N];

		for (int i = 0; i < card.length; i++) {
			card[i] = sc.nextInt();
		}

		for (int i = 0; i < card.length - 2; i++) {
			for (int j = i + 1; j < card.length - 1; j++) {
				for (int k = i + 2; k < card.length; k++) {
					if (card[i] + card[j] + card[k] <= M && M - (card[i] + card[j] + card[k]) < M - threeCardPoint) {
						threeCardPoint = card[i] + card[j] + card[k];
					}
				}
			}
		}

		System.out.println(threeCardPoint);
	}
}