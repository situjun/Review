class InsertionSort{
	public static void main(String[] s){
		int[] nums = {1,4,6,8,4,2,5,7,7,4,3,32,2,5,6,5,22,5,7,3,77,42,11};
		new InsertionSort().helper(nums);
		for(int i:nums) System.out.print(i+",");
	}
	public void helper(int[] nums){
		int length = nums.length;
		int tmp = 0,j = 0;
		for(int i = 1;i<=length-1;i++){
			tmp = nums[i];
			for(j = i;j>=1;j--){
				if(tmp<nums[j-1]){
					nums[j] = nums[j-1];
				}else {
					//Key:处理前面已经排好序的情况
					break;
				}
			}
			nums[j] = tmp;
		}
	}
}