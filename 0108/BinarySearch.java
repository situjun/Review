class BinarySearch{
	//binary search recursion version
	public static void main(String[] args){
		int[] arr = {1,2,3,5,6,7,8,9,10,11};
		int target = 4;
		//既然他不存在状态码是-1，就应该是默认了整个数组是非负的
		System.out.println("Target = "+ target+",index = " +search(arr,target,0,arr.length));
	}
	public static int search(int[] arr,int target,int low,int high){
		int status = -1;
		if(low<=high){
			int mid = (low+high)/2;
			if(arr[mid] == target){
				status = mid;
			} else if(arr[mid] < target){
				status = search(arr,target,mid+1,high);
			} else {
				status = search(arr,target,low,mid-1);
			}
		//因为二分法只是对一半进行递归，所以它是线性向下的。
		//而归并排序不一样，它有可能是非平衡树结构，所以它return时容易考虑复杂了....
		}
		return status;
	}
}