class CompletePack{
	static int[] weight = {4,2,6,5,3};
	static int[] value = {5,2,6,4,3};
	static int length = weight.length;
	static int limit = 12;
	static int[] F = new int[limit+1];
	public static void main(String[] args){
		for(int i=0;i<=length-1;i++){
			for(int j=1;j<=limit;j++){
				if(weight[i]>j){
					F[j] = F[j];
				}else {
					F[j] = Math.max(F[j],F[j-weight[i]]+value[i]);
				}
			}
		}
		for(int i:F){
			System.out.print(i+"\t");
		}
	}
}