class ZeroOnePack{
	public static void main(String[] s){
		int[] value = {6,3,5,4,6};
		int[] weight = {2,2,6,5,4};
		int itemLengh = value.length;
		int limit = 10;
		int[][] F = new int[itemLengh+1][limit+1];
		for(int i=0;i<=itemLengh;i++){
			F[i][0] = 0;
		}
		for(int i =0;i<=limit;i++){
			F[0][i] = 0;
		}
		for(int i=1;i<=itemLengh;i++){
			for(int j=1;j<=limit;j++){
				if(j<weight[i-1]){
					F[i][j] = F[i-1][j];
				} else {
					F[i][j] = Math.max(F[i-1][j],F[i-1][j-weight[i-1]]+value[i-1]);
				}
			}
		}
		System.out.println("Item Matrix");
		for(int i=0;i<=itemLengh;i++){
			
			for(int j=0;j<=limit;j++){
				System.out.print(F[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}