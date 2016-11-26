class CompletePack{
	public static void main(String[] args){
		int[] weight = {4,2,6,5,3};
		int[] value = {5,2,6,4,3};
		int length = weight.length;
		int limit = 10;
		int[] F = new int[limit+1];
		F[0] = 0;
		for(int i=0;i<=length-1;i++){
			for(int j=1;j<=10;j++){
				//Key point:weight[i]<j 还是weight[i]<=j
				//仔细想一下
				if(weight[i]<=j){
					F[j] = Math.max(F[j],F[j-weight[i]]+value[i]);
				}
			}
		}
		System.out.println("Max value at each weight");
		for(int i=0;i<=limit;i++){
			System.out.print(i+"\t");
		}
		System.out.print("\n");
		for(int i:F){
			System.out.print(i+"\t");
		}
	}
}




