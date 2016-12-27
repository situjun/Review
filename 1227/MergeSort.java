class MergeSort{
	public static void main(String [] args){
		int[] arr = {1,5,1,1,11,55,66,432,64,2,7,0,0,9876,0,4,7,21};
		//Sorting(arr,0,arr.length-1);
		Sorting(arr);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
	public static void Sorting(int[] arr){
		Sorting(arr,0,arr.length-1);
	}
	public static void Sorting(int[] arr,int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			//Key point:
			//果然和想的一样，如果变量从外部传入内部调用的方法后，内部改变变量也会影响到变量本身（不用static变量，如本例中的arr普通数组，Sorting内改变了数组的值，但依然影响到了
			//arr数组本身）。
			//Key point 2:但是如果是内部方法内自己生成的变量，那么则不会影响到外部变量，且每次调用方法时值都不会相互影响。
			//如index1,index2,index3变量。每次调用完成后他们都不会对后续产生影响。
			Sorting(arr,low,mid);
			Sorting(arr,mid+1,high);
			Merge(arr,low,mid,high);
		}
	}
	public static void Merge(int[] arr,int low,int mid,int high){
		int index1 = low,index2 = mid+1,index3 = low;
		int[] tmp = new int[arr.length];
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