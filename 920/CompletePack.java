class CompletePack{
	public static void main(String[] s){
		int[] value = {6,3,5,4,6};
		int[] weight = {2,2,6,5,4};
		int limit= 10;
		int[] F = new int[limit+1];
		int dataLength = value.length;
		//init F[] to 0 
		for(int i=0;i<=limit;i++){
			F[i] = 0;
		}
		//其实应该考虑上一次的F[i],和F[i-1],F[i-weight[j]]+value[j] 这三个的大小，但是因为F[i-weight[j]]+value[j]肯定大于F[i-1]
		//(比如i=3时,F[3]可以=F[3-weight[0]]+val[0]=F[1]+val[0]。此时F[1]=0,就相当于F[2]后没放入元素，所以省略了和F[i-1]的比较)
		for(int i=0;i<=limit;i++){
			for(int j=0;j<=dataLength-1;j++){
				if(i>=weight[j]){
					F[i] = Math.max(F[i],F[i-weight[j]]+value[j]);
				}
			}
		}
		System.out.print("Each Weight Max Value \n");
		for(int i:F){
			System.out.print(i+",");
		}
	}
}