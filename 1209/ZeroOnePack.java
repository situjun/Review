class ZeroOnePack{
	public static void main(String[] args){
		int[] weight = {2,1,6,5,4};
		int[] value = {3,2,5,4,6};
		int length = weight.length;
		int limit = 10;
		int[][] F= new int[length+1][limit+1];
		//ArrayList 存储items是不明智的选择，很麻烦
		//ArrayList<String> list = new ArrayList<String>();
		String[][] list = new String[length+1][limit+1];
		for(int i=0;i<=length;i++){
			for(int j=0;j<=limit;j++){
				list[i][j] = "";
			}
		}
		for(int i=1;i<=length;i++){
			String item = "";
			for(int j =1;j<=limit;j++){
				if(j<weight[i-1]){
					F[i][j] = F[i-1][j];
					list[i][j] = list[i-1][j];
				} else {
					F[i][j] = Math.max(F[i-1][j],F[i-1][j-weight[i-1]]+value[i-1]);
					if(F[i][j] == F[i-1][j]) list[i][j] = list[i-1][j];
					else list[i][j] = list[i-1][j-weight[i-1]]+weight[i-1]+",";
				}
			}
		}
		System.out.println("The items weight are :"+list[length][limit]+"and the max value is "+F[length][limit]);
	}
}