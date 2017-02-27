class MergeSort{
	public static void main(String[] s){
		int[] nums = {1,4,6,8,4,2,5,7,7,4,3,32,2,5,6,5,22,5,7,3,77,42,11};
		int[] tmp = new int[nums.length];
		new MergeSort().sort(nums,tmp,0,nums.length-1);
		for(int i:nums) System.out.print(i+",");
	}
	public void sort(int[] nums,int[] tmp,int low,int high){
		//Key£ºÃ»ÓÐ=,test case 1,1
		if(low<high){
			int mid = (low+high)/2;
			sort(nums,tmp,low,mid);
			sort(nums,tmp,mid+1,high);
			merge(nums,tmp,low,mid,high);
		}
	}
	public void merge(int[] nums,int[] tmp,int low,int mid,int high){
		int index1 = low,index2 = mid+1,index3 = low;
		while(index1<=mid && index2<=high){
			if(nums[index1]<=nums[index2]) tmp[index3++] = nums[index1++];
			else tmp[index3++] = nums[index2++];
		}
		while(index1<=mid) tmp[index3++] = nums[index1++];
		while(index2<=high) tmp[index3++] = nums[index2++];
		while(low<=high){
			nums[low] = tmp[low++];
		}
	}
}