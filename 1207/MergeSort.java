class MergeSort{
	public static void main(String[] args){
		int[] arr = {9,8,1,2,2,55,12,87,111,1,0,5,6,7,6,81};
		int length = arr.length;
		int[] tmp = new int[length];
		//Key point:注意整个递归过程可以当成一个整体，所以不用担心深层数组改变却不会改变外层数组的问题
		Sorting(arr,tmp,0,length-1);
		System.out.println("Result:");
		for(int i:arr){
			System.out.print(i+",");
		}
	}
	public static void Sorting(int[] arr,int[] tmp,int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			Sorting(arr,tmp,low,mid);
			Sorting(arr,tmp,mid+1,high);
			Merge(arr,tmp,low,mid,high);
		}
	}
	public static void Merge(int[] arr,int[] tmp,int low,int mid,int high){
		int index1 = low;
		int index2 = mid+1;
		int index3 = low;
		while(index1<=mid && index2<=high){
			if(arr[index1]<=arr[index2]) tmp[index3++] = arr[index1++];
			else tmp[index3++] = arr[index2++];
		}
		while(index1<=mid){
			tmp[index3++] = arr[index1++];
		}
		while(index2<=high){
			tmp[index3++] = arr[index2++];
		}
		while(low<=high){
			arr[low] = tmp[low++];
 		}
	}
}