class MergeSort{
	//Key point:
	//I knew the static variable is a single and global variable.So we ignore the single feature,and 
	// wheather non-static variable could be call in static function??
	
	//And the result is :
	//MergeSort.java:10: error: non-static variable arr cannot be referenced from a static context
	static int[] arr = {99,44,77,55,22,1,2,3,8,7,5,41,23,0,5,8,7,9,1,5,0,40};
	static int[] tmp = new int[arr.length];
	public static void main(String[] args){
		sort(0,arr.length-1);
		System.out.println("Result is : ");
		for(int i:arr){
			System.out.print(i+",");
		}
	}
	public static void sort(int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			sort(low,mid);
			sort(mid+1,high);
			merge(low,mid,high);
		}
	}
	public static void merge(int low,int mid,int high){
		int index1 = low;
		int index2 = mid+1;
		int index3 = low;
		while(index1<=mid && index2 <= high){
			if(arr[index1] <= arr[index2]) tmp[index3++] = arr[index1++];
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