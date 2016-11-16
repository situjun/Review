class ZeroOnePack{
	public static void main(String[] args){
		int[] weight = {2,2,6,5,4};
		int[] value = {6,3,5,4,6};
		int number = weight.length;
		int limit = 10;
		int[][] arr = new int[number+1][limit+1];
		for(int i=0;i<=number;i++){
			arr[i][0] = 0;
		}
		for(int i=0;i<=limit;i++){
			arr[0][i] = 0;
		}
		for(int i=1;i<=number;i++){
			for(int j=1;j<=limit;j++){
				if(j-weight[i-1]<0) arr[i][j] = arr[i-1][j];
				else arr[i][j] = Math.max(arr[i-1][j],arr[i-1][j-weight[i-1]]+value[i-1]);
			}
		}
		System.out.println("Matrix:");
		for(int i=1;i<=number;i++){
			for(int j=1;j<=limit;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
}