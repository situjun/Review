class RemoveDuplicats{
	//其实可以直接用hashmap统计一下
	public static void main(String[] args){
		int[] arr = {1,1,1,2,3,3,4,4,4,5,6,7,7,7};
		solution(arr);
		for(int i =0;i<=solution(arr)-1;i++){
			System.out.print(arr[i]+","); 
		}
	}
	public static int solution(int[] arr){
		int index1 = 0,index2 = 0;
		if(arr.length >=2 ){
			
			while(index2<=arr.length-1){			
				while(index2>0 && arr[index2] == arr[index2-1]){
					if(index2<=arr.length-2) index2++;
				}
				arr[index1++] = arr[index2++];
				System.out.println(arr[index1]);
			}
		}
		//避免这种情况[1,1,2,2]会导致没有删掉2,2
		if(arr[index1] == arr[index1-1]) index1--;
		return index1;
		
	}
}