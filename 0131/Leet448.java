import java.util.*;
class Leet448{
	public static void main(String[] s){
		int[] nums = {2,1,5,6,3,2,5};
		int index = 0;
		List<Integer> list = new ArrayList<>();
		for(int i =0;i<=nums.length-1;i++){
			index = Math.abs(nums[i])-1;
			nums[index] = nums[index]<0?nums[index]:-nums[index];
		}
		for(int i = 0;i<=nums.length-1;i++){
			if(nums[i]>0)list.add(i+1);
		}
		System.out.println("Disapppearded num:"+list);
	}
}