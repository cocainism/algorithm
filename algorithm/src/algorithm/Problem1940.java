package algorithm;

import java.util.Scanner;

public class Problem1940 {

	public static void main(String[] args) {
		int N = 0;
		int M = 0; 
		int count = 0; // 만들수 있는 갑옷 갯수

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		int[] no = new int[N]; //갑옷재료 고유번호
	
		for (int i = 0; i < N; i++) {
			no[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				if(no[i] + no[j] == M){
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
