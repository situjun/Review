import java.util.*;
class Leetc442{
	//Key point:用负号来表示已经访问过一次
	public static void main(String[] s){
		List<Integer> list = new ArrayList<>();
		int[] nums = {4,2,4,7,1,3,8,3,1};
		for(int i =0;i<=nums.length-1;i++){
			if(nums[Math.abs(nums[i])-1] < 0) list.add(Math.abs(nums[i]));
			nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
		}
		System.out.println(list);
	}
}