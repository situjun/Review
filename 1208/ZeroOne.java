class ZeroOne{
	public static void main(String[] s){
		int[] weight = {2,2,6,5,4};
		int[] value = {6,3,5,4,6};
		int length = weight.length;
		int limit = 10;
		int[][] F= new int[length+1][limit+1];
		for(int i=1;i<=length;i++){
			for(int j=1;j<=limit;j++){
				if(j<weight[i-1]) F[i][j] = F[i-1][j];
				else F[i][j] = Math.max(F[i-1][j],F[i-1][j-weight[i-1]]+value[i-1]);
			}
		}
		System.out.println("The max value is:"+F[length][limit]);
		System.out.println("Matrix is:");
		for(int i = 1;i<=length;i++){
			for(int j=1;j<=limit;j++){
				System.out.print(F[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}