package algorithm;

import java.util.Scanner;

public class Problem1712 {

	public static void main(String[] args) {
		int fixedCost      = 0; // 고정비용
		int cost 		   = 0; // 한대 생산 비용
		int price          = 0; // 한대 가격
		int breakEvenPoint = -1; // 손익분기점

		Scanner sc = new Scanner(System.in);

		fixedCost = sc.nextInt();
		cost = sc.nextInt();
		price = sc.nextInt();

		if (price - cost <= 0) {
			System.out.println(breakEvenPoint);
		} else {
			breakEvenPoint = fixedCost / (price - cost) + 1;

			System.out.println(breakEvenPoint);
		}

	}

}
