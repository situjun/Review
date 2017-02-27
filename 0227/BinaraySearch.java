class BinaraySearch{
	public static void main(String[] as){
		int target = 155;
		int[] nums = {1,2,3,4,5,6,6,7,8,9,11,12,13,14,14,15};
		System.out.println("Index : "+new BinaraySearch().helper(target,nums,0,nums.length-1));
	}
	public int helper(int target,int[] nums,int start,int end){
		int mid = (start+end)/2;
		while(start<=end){
			//System.out.println(nums[mid]+"");
			if(nums[mid] == target) return mid;
			else if(nums[mid]<target) return helper(target,nums,mid+1,end);
			else return helper(target,nums,start,mid-1);
		}
		return -1;
	}
}