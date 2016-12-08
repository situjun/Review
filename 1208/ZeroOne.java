class ZeroOne{
	public static void main(String[] s){
		int[] weight = {2,1,6,5,4};
		int[] value = {3,2,5,4,6};
		int length = weight.length;
		int limit = 10;
		int[][] F= new int[length+1][limit+1];
		String[][] list = new String[length+1][limit+1];
		//Key point:int 数组会默认赋值为0，但是String数组“只会”默认赋值为null，而不是空字符串""。
		//所以String array需要自己初始化为空字符串一下
		for(int i=0;i<=length;i++){
			for(int j=0;j<=limit;j++){
				list[i][j] = "";
			}
		}
		for(int i=1;i<=length;i++){
			String item = "";
			for(int j=1;j<=limit;j++){
				if(j<weight[i-1]){
					F[i][j] = F[i-1][j];
					list[i][j] = list[i-1][j];
				} else {
					int tmp = F[i][j];
					F[i][j] = Math.max(F[i-1][j],F[i-1][j-weight[i-1]]+value[i-1]);
					if(F[i][j] == F[i-1][j]){
						list[i][j] = list[i-1][j];
					} else {
						list[i][j] = list[i-1][j-weight[i-1]]+weight[i-1]+",";
					}
				}
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
		for(int i=0;i<=limit;i++){
			System.out.println("Limit = "+i+" ,items weight are :"+list[length][i]);
		}
	}
}