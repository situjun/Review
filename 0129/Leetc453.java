import java.util.*;
class Leetc453{
	public static void main(String[] s){
		int[] nums = {5,7,33,1,99};
		int count = 0,min = 0;
		Arrays.sort(nums);
		min = nums[0];
		for(int i:nums) count += i-min;
		System.out.println("Step: "+count);
	}
}