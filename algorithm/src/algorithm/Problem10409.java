package algorithm;

import java.util.Scanner;

public class Problem10409 {

	public static void main(String[] args) {
		int n = 0;
		int T = 0;
		int cnt = 0;
		int totCost = 0;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		T = sc.nextInt();
		
		int[] cost = new int[n];
		
		for (int i = 0; i < cost.length; i++) {
			cost[i] = sc.nextInt();
		}
		
		for (int i = 0; i < cost.length; i++) {
			totCost += cost[i];
			
			if (T > totCost) {
				cnt++;
			} else {
				System.out.println(cnt);
				break;
			}
		}
	}
}
