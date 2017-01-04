class ZeroOnePack{
	public static void main(String[] args){
		int[] weight = {2,1,6,5,4};
		int[] value = {3,2,5,4,6};
		int limit = 10;
		int length = weight.length;
		int[][] F = new int[length+1][limit+1];
		String[][] result = new String[length+1][limit+1];
		for(int i=0;i<=length;i++){
			result[i][0] = "";
		}
		for(int i=0;i<=limit;i++){
			result[0][i] = "";
		}
		for(int i= 1;i<=limit;i++){
			for(int j =1;j<=length;j++){
				if(i<weight[j-1]){
					F[j][i] = F[j-1][i];
					result[j][i] = result[j-1][i];
				} else {
					F[j][i] = Math.max(F[j-1][i],F[j-1][i-weight[j-1]]+value[j-1]);					
					result[j][i] = F[j][i] == F[j-1][i]?result[j-1][i]:result[j-1][i-weight[j-1]]+","+weight[j-1];
				}

			}
		}
		System.out.println("The max value is "+F[length][limit]+" and the weights are "+result[length][limit]);
	}
}