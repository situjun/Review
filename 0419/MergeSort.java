class MergeSort{
	public static void main(String[] args){
		int[] arr = {2,4,1,5,7,8,4,3,22,4,656,32,1,1,4,6,3,6,3,8};
		int[] tmp = new int[arr.length];
		new MergeSort().sort(arr,tmp,0,arr.length-1);
		for(int i:arr) System.out.print(i+",");
	}
	public void sort(int[] arr,int[] tmp,int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			//Key:下面这样划分sort两部分sort(arr,tmp,low,mid-1)和sort(arr,tmp,mid,high)会造成无限循环，如 0,1会被划分成 0,-1和0,1 --> 0,1无限循环了
			/***
			sort(arr,tmp,low,mid-1);
			sort(arr,tmp,mid,high);
			merge(arr,tmp,low,mid,high);
			**/
			sort(arr,tmp,low,mid);
			sort(arr,tmp,mid+1,high);
			merge(arr,tmp,low,mid+1,high);
		}
	}
	public void merge(int[] arr,int[] tmp,int low,int mid,int high){
		int index1 = low,index2 = mid,index3 = low;
		while(index1<=mid-1 && index2<=high){
			if(arr[index1]<=arr[index2]) tmp[index3++] = arr[index1++];
			else tmp[index3++] = arr[index2++];
		}
		while(index1<=mid-1) tmp[index3++] = arr[index1++];
		while(index2<=high) tmp[index3++] = arr[index2++];
		while(low<=high) arr[low] = tmp[low++];
	}
}