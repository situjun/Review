//精简版本MergeSort
class MergeSort{
	public static void main(String[] ars){
		int[] arr = {8,2,3,4,1,2,8,2,6,7,1};
		//调用non-static方法需要实例化
		new MergeSort().sort(arr);
		for(int i:arr) System.out.print(i+",");
	}
	public void sort(int[] arr){
		int low = 0,high = arr.length-1;
		int[] tmp = new int[arr.length];
		sort(arr,tmp,low,high);
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
		int index1 = low,index3 = low,index2 = mid+1;
		while(index1<=mid && index2 <= high){
			if(arr[index1]<=arr[index2]) tmp[index3++] = arr[index1++];
			else tmp[index3++] = arr[index2++];
		}
		while(index1<=mid)tmp[index3++] = arr[index1++];
		while(index2<=high)tmp[index3++] = arr[index2++];
		while(low<=high) arr[low] = tmp[low++];
	}
}