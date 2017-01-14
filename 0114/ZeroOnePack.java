class ZeroOnePack{
	public static void main(String[] s){
		int[] weight = {2,2,6,5,4};
		int[] value = {6,3,5,4,6};
		int limit = 10;
		int length = weight.length;
		int[][] F = new int[length+1][limit+1];
		for(int i = 1;i<=length;i++){
			for(int j = 1;j<=limit;j++){
				if(j-weight[i-1]<0)F[i][j] = F[i-1][j];
				else F[i][j] = Math.max(F[i-1][j],F[i-1][j-weight[i-1]]+value[i-1]);
			}
		}
		System.out.println("The max value is "+F[length][limit]);
	}
}