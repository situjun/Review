class CompletePack{
	public static void main(String[] args){
		int[] weight = {2,1,6,5,4};
		int[] value = {3,1,6,4,7};
		int limit = 10;
		int length = value.length;
		int[] F = new int[limit+1];
		String[] list = new String[limit+1];
		for(int i =0;i<=limit;i++){
			list[i] = "";
		}
		for(int i=1;i<=limit;i++){
			for(int j=0;j<=length-1;j++){
				if(weight[j]<=i){
					int tmp = F[i];
					F[i] = Math.max(F[i],F[i-weight[j]]+value[j]);
					if(F[i] != tmp) list[i] = list[i-weight[j]]+weight[j]+",";
				}
			}
		}
		System.out.println("The array max value is : ");
		for(int i=1;i<=limit;i++){
			System.out.print(F[i]+",");
		}
		System.out.print("\n");
		System.out.println("The max value items weight are : "+list[limit]);
	}
}