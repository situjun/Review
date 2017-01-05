class MergeSort{
	public static void main(String[] args){
		int[] arr = {55,1,2,77,5,66,4,21,12,13,24,13,0,9,5,88};
		int length = arr.length;
		int[] tmp = new int[length];
		Sort(arr,tmp,0,length-1);
		System.out.println("The order is ");
		for(int i:arr){
			System.out.print(i+",");
		}
	}
	public static void Sort(int[] arr,int[] tmp,int low,int high){
		if(low<high){
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