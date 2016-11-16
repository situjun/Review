class ZeroOnePack{
	public static void main(String[] args){
		int[] weight = {2,2,6,5,4};
		int[] value = {6,3,5,4,6};
		int limit = 10;
		int number = weight.length;
		int[][] F = new int[number+1][limit+1];
		//print which item be selected
		String[][] items = new String[number+1][limit+1];
		for(int i=0;i<=number;i++){
			F[i][0] = 0;
		}
		for(int i=0;i<=limit;i++){
			F[0][i] = 0;
		}
		
		for(int i=0;i<=number;i++){
			items[i][0] = "";
		}
		for(int i=0;i<=limit;i++){
			items[0][i] = "";
		}

		
		for(int j=1;j<=limit;j++){
			for(int i=1;i<=number;i++){
				if(j<weight[i-1]){
					F[i][j] = F[i-1][j];
					items[i][j] = items[i-1][j];
				} else {
					F[i][j] = Math.max(F[i-1][j],F[i-1][j-weight[i-1]]+value[i-1]);
					if(F[i][j] == F[i-1][j]) items[i][j] = items[i-1][j];
					else items[i][j] += weight[i-1]+",";
				}
			}
		}
		for(int i=1;i<=number;i++){
			for(int j=1;j<=limit;j++){
				System.out.print(F[i][j]+"\t");
			}
			System.out.print("\n");
		}
		//System.out.println("The items are "+items[number][limit]);
	}
}