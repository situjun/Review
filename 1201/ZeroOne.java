class ZeroOne{
	public static void main(String[] args){
		int[] weight = {4,2,6,5,3};
		int[] value = {5,2,6,4,3};
		int length = weight.length;
		int limit = 15;
		int[][] F = new int[length+1][limit+1];
		for(int i=1;i<=length;i++){
			for(int j=1;j<=limit;j++){
				if(weight[i-1]>j){
					F[i][j] = F[i-1][j];
				} else {
					F[i][j] = Math.max(F[i-1][j],F[i-1][j-weight[i-1]]+value[i-1]);
				}
			}
		}
		for(int i=1;i<=length;i++){
			System.out.print("\n");
			for(int j=1;j<=limit;j++){
				System.out.print(F[i][j]+",");
			}
			
		}
	}
}