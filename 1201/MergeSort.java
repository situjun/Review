class MergeSort{
	private static int[] arr = {55,22,11,4,5,1,8,7,1,2,3,1,1,8,9,55,66,77,87,444,1,5,6,4,15};
	private static int length = arr.length;
	private static int[] tmp = new int[length];
	
	public static void main(String[] args){
		Sort(0,length-1);
		for(int i:arr){
			System.out.print(i+"\t");
		}
	}
	public static void Sort(int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			Sort(low,mid);
			Sort(mid+1,high);
			Merge(low,mid,high);
		}
	}
	public static void Merge(int low,int mid,int high){
		int index0 = low;
		int index1 = low;
		int index2 = mid+1;
		while(index1<=mid && index2<= high){
			if(arr[index1]<arr[index2]) tmp[index0++] = arr[index1++];
			else tmp[index0++] = arr[index2++];
		}
		while(index1<=mid){
			tmp[index0++] = arr[index1++];
		}
		while(index2<=high){
			tmp[index0++] = arr[index2++];
		}
		while(low<=high){
			//Key point:
			//arr[low++] = tmp[low]; 这种写法是错的，指针错误。
			//上面的执行书序应该是左边的low自增1后，右边的low此时会等于自增1后的值。
			//也就是说从一开始是从(low+1)开始的循环.
			//Key point:
			//要注意它是(1)先执行完左边的表达式后(2)才开始执行右边的表达式，(3)再执行右边赋值给左的
			arr[low] = tmp[low++];
			//low++;
		}
	}
}