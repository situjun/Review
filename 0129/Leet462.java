import java.util.*;
public class Leet462{
	public static void main(String[] args){
		int[] nums = {45,1,2,99};
		int count = 0;
		int index1 =0,index2 = nums.length-1;
		Arrays.sort(nums);
		while(index1<=index2) count += nums[index2--] - nums[index1++];
		System.out.println(count);
	}
}