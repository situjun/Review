class CompletePack{
	public static void main(String[] args){
		int[] weight = {4,2,6,5,3};
		int[] value = {5,2,6,4,3};
		int limit = 10;
		int[] F = new int[limit+1];
		for(int i=1;i<=weight.length;i++){
			for(int j=1;j<=limit;j++){
				if(j>=weight[i-1]) F[j] = Math.max(F[j],F[j-weight[i-1]]+value[i-1]);
			}
		}
		System.out.println("The max value is"+F[limit]);
	}
}