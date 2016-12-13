class CompletePack{
	public static void main(String[] args){
		int[] weight = {2,1,6,5,4};
		int[] value = {3,1,6,4,7};
		int limit = 10;
		int[] F = new int[limit+1];
		String[] list = new String[limit+1];
		for(int i=0;i<=limit;i++){
			F[i] = 0;
			list[i] = "";
		}
		for(int i = 1;i<=limit;i++){
			for(int j =1;j<=value.length;j++){
				if(weight[j-1]<=i){
					int tmp = F[i];
					F[i] = Math.max(F[i],F[i-weight[j-1]]+value[j-1]);
					if(F[i] != tmp) list[i] = list[i-weight[j-1]]+weight[j-1]+",";
				}
			}
		}
		System.out.println("The max value every limit : ");
		for(int i =0;i<=limit;i++){
			System.out.print(F[i]+"\t");
		}
		System.out.print("\n");
		System.out.println("The max value items are : "+list[limit]);
	}
	
}