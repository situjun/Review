class MergeSort{
	public static void main(String[] args){
		int[] arr = {3,2,5,2,7,3,2,44,2,27,3};
		int[] tmp = new int[arr.length];
		int low = 0,high = arr.length-1;
		new MergeSort().sort(arr,tmp,low,high);
		for(int i:arr) System.out.print(i+",");
	}
	public void sort(int[] arr,int[] tmp,int low,int high){
		if(low<high){
			int mid = (low+high)>>1;
			sort(arr,tmp,low,mid);
			sort(arr,tmp,mid+1,high);
			merge(arr,tmp,low,mid,high);
		}
	}
	public void merge(int[] arr,int[] tmp,int low,int mid,int high){
		int index1 = low,index2 = mid+1,index3 = low;
		while(index1<=mid && index2 <= high){
			if(arr[index1]<=arr[index2]) tmp[index3++]=arr[index1++];
			else tmp[index3++] = arr[index2++];
		}
		while(index1<=mid)tmp[index3++]=arr[index1++];
		while(index2<=high)tmp[index3++]=arr[index2++];
		while(low<=high)arr[low] = tmp[low++];
	}
	
}