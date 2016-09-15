class MergeSort{
	public  static void main(String[] ags){
		int[] input = {1,2,5,88,4,1,0,2,55,45,21,11,31,11,9,8};
		int[] tmp = new int[input.length];
		recursion(input,tmp,0,input.length-1);
		for(int i:tmp){
			System.out.print(i+",");
		}
	}
	public static void recursion(int[] input,int[] tmp,int left,int right){
		//if(input[left] < input[right]){
		if(left<right){
			recursion(input,tmp,left,(left+right)/2);
			recursion(input,tmp,(left+right)/2+1,right);
			int index1 = left,index2 = (left+right)/2+1,index3 = left;
			while(index1<=(left+right)/2 && index2<=right){
				if(input[index1]<input[index2]){
					tmp[index3++] = input[index1++];
				} else {
					tmp[index3++] = input[index2++];
				}
			}
			while(index1<=(left+right)/2){
				tmp[index3++] = input[index1++];
			}
			while(index2<=right){
				tmp[index3++] = input[index2++];
			}
			//very important!!!!应该在临时数组内排好序后，把数据放回原数组中
			for(int i=left;i<=right;i++){
				input[i] = tmp[i];
			}
		}
	}
}