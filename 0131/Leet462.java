import java.util.*;
class Leet462{
	public static void main(String[] args){
		int[] nums = {88,1,2,3,23};
		Arrays.sort(nums);
		int index1 = 0,index2 = nums.length-1,result = 0;
		while(index1<=index2) result += nums[index2--] - nums[index1++];
		System.out.println("+ or -:Step: "+result);
	}
}