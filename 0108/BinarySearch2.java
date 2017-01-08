class BinarySearch2{
	public static void main(String[] args){
		int[] arr= {1,2,3,4,6,7,8,11,13,21,46};
		int low = 0,high = arr.length-1,target = 8;
		int mid = 0;
		while(low<=high){
			mid = (low+high)/2;
			if(target == arr[mid]){
				System.out.println("Target = "+target+" index = "+mid);
				break;
			}else if(target>arr[mid]){
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		//return -1;
		System.out.println("Target = "+target+" ,but didn't find");
	}
}