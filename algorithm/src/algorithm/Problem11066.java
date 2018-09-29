package algorithm;

import java.util.Scanner;

public class Problem11066 {

	    static int total[] = new int[502];
	    static int cost[][] = new int[502][502];
	    final static int INF = 987654321;
	    
	    public static void main(String[] args) throws Exception  {
	    	
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt(); //반복할 횟수
	        
	        for (int l = 0; l < T; l++) { //T만큼 반복
				
	            int n = sc.nextInt(); //장의 수
	            for (int i = 1; i <= n; i++) {
	                int num;
	                num = sc.nextInt();
	                total[i] = total[i - 1] + num; //전체 장 수
	                
	                System.out.println("total[i] = " + total[i] );
	            }
	            
	            for (int k = 1; k < n; k++) {
	                for (int i = 1; i <= n - k; i++) {
	                    cost[i][i + k] = INF;
	                    
	                    for (int j = i; j < i + k ; j++) {
	                        cost[i][i + k] = Math.min(cost[i][i + k], cost[i][j] + cost[j+1][i + k]);
	                    }
	                    cost[i][i + k] += total[i + k] - total[i - 1];
	                }
	            }
	            System.out.println(cost[1][n]);
	        } //for end
	    }
	}