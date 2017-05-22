import java.util.*;
public class Pack{
	public static void main(String[] s){
		int[] weight = {2,2,6,5,4};
		int[] value = {6,3,5,4,6};
		int limit = 10;
		int length = weight.length;
		
		int[][] dp = new int[length+1][limit+1];
		for(int i = 1;i<=length;i++){
			for(int j = 1;j<=limit;j++){
				if(j<weight[i-1]) dp[i][j] = dp[i-1][j];
				else dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1]);
			}
		}
		System.out.println("Max value : "+dp[length][limit]);
		
		//Key:不知道为什么，下边这个老出错
		/**
		
		int[][] dp = new int[limit+1][length+1];
		for(int i = 1;i<=limit;i++){
			for(int j = 1;j<=length;j++){
				if(i>=weight[j-1])dp[i][j] = Math.max(dp[i-1][j],dp[i-weight[j-1]][j-1]+value[j-1]);
				else dp[i][j] = dp[i-1][j];
			}
		}
		System.out.println("Max value : "+dp[limit][length]);
		
		**/
		
	}
}