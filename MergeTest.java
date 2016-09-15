class MergeTest{
	public static void main(String[] args){
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		int length = arr.length;
		int[] tmp = new int[length];
		recursion(arr,tmp,0,length-1);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
	//内部调用，貌似必须声明为static function,otherwise it will display " non-static method recursion(int[],int[],int,int) cannot be referenced from a static context"
	public static void merge(int[] arr,int[]tmp,int left,int center,int right){
		int index1 = left,index2 = center+1,index3 = left;
		while(index1 <= center && index2<=right){
			if(arr[index1]<arr[index2]){
				tmp[index3++] = arr[index1++];
			} else {
				tmp[index3++] = arr[index2++];
			}
		}
		while(index1<=center){
			tmp[index3++] = arr[index1++];
		}
		while(index2<=right){
			tmp[index3++] = arr[index2++];
		}
		//very important!!!!应该在临时数组内排好序后，把数据放回原数组中
		for(int i=left;i<=right;i++){
			arr[i] = tmp[i];
		}
	}
	public static void recursion(int[] arr,int[] tmp,int left,int right){
		//if(arr[left]<arr[right]){
		if(left<right){
			int center = (left+right)/2;
			recursion(  arr,tmp,left,center);
			recursion(arr,tmp,center+1,right);
			merge(arr,tmp,left,center,right);
		}
	}
}