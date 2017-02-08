class BinarySearch{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,4,4,4,5,6,8,9,11,15,17,21,32,54,66,78,111,222};
		int target = 7;
		System.out.println("The index is "+search(arr,target));
	}
	public static int search(int[] arr,int target){
		int low = 0,high = arr.length-1;
		while(low<=high){
			int mid = (low+high)>>1;
			if(arr[mid] == target){
				return mid;
			} else if(target < arr[mid]){
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}
}