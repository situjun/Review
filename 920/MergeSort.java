class MergeSort{
	public static void main(String[] args){
		int[] data = {99,66,45,234,14,6,523,43276,61,12,54,3,2,1,11};
		int[] tmp = new int[data.length];
		//blow is wrong,data.length ArrayIndexOutOfBoundsException
		//recursion(data,tmp,0,data.length);
		
		recursion(data,tmp,0,data.length-1);
		for(int i:data){
			System.out.print(i+",");
		}
	}
	public static void recursion(int[] data,int[] tmp,int left,int right){
		if(left<right){
			int center = (left+right)/2;
			recursion(data,tmp,left,center);
			recursion(data,tmp,center+1,right);
			merge(data,tmp,left,center,right);
		}
	}
	public static void merge(int[] data,int[] tmp,int left,int leftEnd,int right){
		int index1 = left;
		int index2 = leftEnd+1;
		int index3 = left;
		System.out.println(",left="+left+",leftEnd"+leftEnd+",right"+right+",index1"+index1+",index2"+index2+",index3"+index3);
		while(index1 <= leftEnd && index2 <= right){
			if(data[index1] < data[index2]){
				tmp[index3++] = data[index1++];
			} else {
				tmp[index3++] = data[index2++];
			}
		}
		while(index1<=leftEnd){
			tmp[index3++] = data[index1++];
		}
		while(index2<=right){
			tmp[index3++] = data[index2++];
		}
		for(int i=left;i<=right;i++){
			data[i] = tmp[i];
		}
	}
	
	
	
	
	
	
	
}