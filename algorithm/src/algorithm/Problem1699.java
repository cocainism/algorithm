package algorithm;

import java.util.Scanner;

public class Problem1699 {

	public static void main(String[] args) {
		int N;
		int[] dp;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		dp = new int[N+1]; //동적 할당을 사용하면 런타임 에러가 났다.
		
		dp[0]=0;
		dp[1]=1;//1
		dp[2]=2;//1+1
		dp[3]=3;//1+1+1
		
		for(int i = 4 ; i < N + 1 ; i ++) {
			int min = i;
			int sqrt = (int)Math.sqrt(i);
			for(int j = 1 ; j<=sqrt; j++) {
				if(min>dp[i-j*j])
					min = dp[i-j*j];
			}
			dp[i] = min + 1;
		}
		System.out.println(dp[N]);

	}

}