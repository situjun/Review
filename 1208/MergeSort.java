class MergeSort{
	public static void main(String[] args){
		int[] arr = {8,5,6,7,77,1,2,5,4,3,2,5,55,11,7};
		int[] tmp = new int[arr.length];
		Sorting(arr,tmp,0,arr.length-1);
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
		while(index1<=mid && index2<= high){
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