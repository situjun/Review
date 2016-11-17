class MergeSorting{
	//Key point
	//int[] 需要在方法外声称为static。如果不声称为static，就要传数组
	static int[] arr = {99,66,45,234,14,6,523,43276,61,12,54,3,2,1,11};
	static int[] tmp = new int[arr.length];
	//main 只能是static 方法
	//否则会报错如下
	/***
	Error: Main method is not static in class MergeSorting, please define the main method as:
	public static void main(String[] args)
	**/
	public static void main(String[] args){
		
		//int[] arr = {99,66,45,234,14,6,523,43276,61,12,54,3,2,1,11};
		//int[] tmp = new int[arr.length];
		MergeSort(0,arr.length-1);
		System.out.println("Result:");
		for(int i:arr){
			System.out.print(i+"\t");
		}
	}
	//Key point
	//MergeSort 必须声明为static，因为main方法是static方法，而static方法只能调用static方法。
	//否则会报错如下
	/***
	MergeSorting.java:9: error: non-static method MergeSort(int,int) cannot be referenced from a static context
                MergeSort(0,arr.length-1);
	**/
	public static void MergeSort(int low,int high){
		if(low < high){
		
			int center = (low+high)/2;
			MergeSort(low,center);
			MergeSort(center+1,high);
			Merge(low,center,high);
		}
	}
	//Key point
	//Merge 必须声明为static，因为main方法是static方法，而static方法及其中的方法只能调用static方法。
	public static void Merge(int low,int center,int high){
		int index0 = low;
		int index1 = center+1;
		int index2 = low;
		while(index0<=center && index1<= high){
			if(arr[index0]<arr[index1]) tmp[index2++] = arr[index0++];
			else tmp[index2++] = arr[index1++];
		}
		while(index0<=center){
			tmp[index2++] = arr[index0++];
		}
		while(index1<=high){
			tmp[index2++] = arr[index1++];
		}
		for(int i=low;i<=high;i++){
			arr[i] = tmp[i];
		}
	}
	
}