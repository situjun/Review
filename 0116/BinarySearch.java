class BinarySearch{
	public static void main(String[] args){
		int[] arr = {0,0,0,1,2,3,4,4,4,5,6,7,7,8,8,9};
		int target = -6;
		System.out.println("The target index is "+helper(arr,target,0,arr.length));
	}
	public static int helper(int[] arr,int target,int low,int high){
		if(low<=high){
			int mid = (low+high)/2;
			if(arr[mid] == target) return mid;
			else if(target<arr[mid]) return helper(arr,target,low,mid-1);
			else return helper(arr,target,mid+1,high);
		}
		return -1;
	}
}