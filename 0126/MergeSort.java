class MergeSort{
	public static void main(String[] args){
		int[] arr = {5,8,2,3,8,2,8,3,4,7,0,5,3,1,7,2,0,52,4};
		new MergeSort().sort(arr);
		for(int i:arr) System.out.print(i+",");
	}
	public void sort(int[] arr){
		int low = 0,high = arr.length-1;
		int[] tmp = new int[arr.length];
		sort(arr,tmp,low,high);
	}
	public void sort(int[] arr,int[] tmp,int low,int high){
		int mid = (low+high)/2;
		if(low<high){
			sort(arr,tmp,low,mid);
			sort(arr,tmp,mid+1,high);
			merge(arr,tmp,low,mid,high);
		}
	}
	public void merge(int[] arr,int[] tmp,int low,int mid,int high){
		int index1 = low,index3 = low,index2 = mid+1;
		while(index1<=mid && index2<=high){
			if(arr[index1] <= arr[index2]) tmp[index3++] = arr[index1++];
			else tmp[index3++] = arr[index2++];
		}
		while(index1<=mid) tmp[index3++] = arr[index1++];
		while(index2<=high) tmp[index3++] = arr[index2++];
		while(low<=high) arr[low] = tmp[low++];
	}
}