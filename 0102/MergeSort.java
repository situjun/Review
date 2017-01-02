class MergeSort{
	public static void main(String[] args){
		int[] arr = {5,44,7,8,1,22,5,4,1,0,10,998,5,4,88};
		int[] tmp = new int[arr.length];
		Sort(arr,tmp,0,arr.length-1);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
	public static void Sort(int[] arr,int[] tmp,int low,int high){
		if(low<high){
			//Key point:arr 和 tmp 作用域问题，仔细好好想想，貌似没有那么简单
			int mid = (low+high)/2;
			Sort(arr,tmp,low,mid);
			Sort(arr,tmp,mid+1,high);
			Merge(arr,tmp,low,mid,high);
		}
	}
	public static void Merge(int[] arr,int[] tmp,int low,int mid,int high){
		int index1 = low,index2 = mid+1,index3 = low;
		while(index1<=mid && index2 <= high){
			if(arr[index1]<=arr[index2]) tmp[index3++] = arr[index1++];
			else tmp[index3++] = arr[index2++];
		}
		while(index1 <= mid){
			tmp[index3++] = arr[index1++];
		}
		while(index2 <= high){
			tmp[index3++] = arr[index2++];
		}
		while(low<=high){
			arr[low] = tmp[low++];
		}
	}
}