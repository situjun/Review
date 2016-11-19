class MergeSorting{
	static int[] arr = {5,4,3,1,9,8,2,4,7,15,21,11,51,44};
	static int[] tmp = new int[arr.length];
	
	public static void main(String[] args){
		MergeSort(0,arr.length-1);
		for(int i:arr){
			System.out.print(i+"\t");
		}
	}
	public static void Merge(int low,int center,int high){
		int index0 = low;
		int index1 = center+1;
		int index2 = low;
		while(index0<=center && index1<=high){
			if(arr[index0]<arr[index1]) tmp[index2++] = arr[index0++];
			else tmp[index2++] = arr[index1++];
		}
		while(index0<=center){
			tmp[index2++] = arr[index0++];
		}
		while(index1<=high){
			tmp[index2++] = arr[index1++];
		}
		//Key Point:此时index2 == high+1。
		//所以while(low<=index2)是错误的，没有=
		while(low<index2){
			
			//Key Point:
			//arr[low] = tmp[low++];执行过程，参照着tmp[index2++] = arr[index0++]等思考
			arr[low] = tmp[low++];
		}
	}
	public static void MergeSort(int low,int high){
		if(low<high){
			int center = (low+high)/2;
			MergeSort(low,center);
			MergeSort(center+1,high);
			Merge(low,center,high);
		}
	}
}