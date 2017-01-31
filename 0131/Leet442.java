import java.util.*;
class Leet442{
	public static void main(String[] s){
		int[] nums = {3,2,4,7,4,7,5,4,7,1,2};
		int index = 0;
		List<Integer> list = new ArrayList<>();
		for(int i =0;i<=nums.length-1;i++){
			index = Math.abs(nums[i])-1;
			if(nums[index] < 0) list.add(index+1);
			nums[index] = -nums[index];
		}
		System.out.println("Duplicates:"+list);
	}
}