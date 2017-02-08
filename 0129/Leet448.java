//Leetcode 448 review
import java.util.*;
public class Leet448{
	public static void main(String[] a){
		int[] nums = {3,3,3,2,6,8,6,4,5};
		List<Integer> list = new ArrayList<>();
		list = new Leet448().solution(nums);
		//Arrays.asList(nums)  只会返回一个引用，因为是将nums当做了一个整体看待--->因为nums是int基础类型数组，如果是Integer[] 就没有问题了.....
		
		System.out.println("Original Array:");
		for(int i:nums) System.out.print(i+" ");
		System.out.print("\n");
		System.out.println(list);
	}
	public List<Integer> solution(int[] nums){
		//index --> arr[index] = -1 .因为原数组均大于0
		List<Integer> list = new ArrayList<>();
		int[] inf = new int[nums.length];
		//Key point:
		//下面的写法有问题，如果后面的数字变为-1，那么当遍历到后面的数字时nums[i]中的i就是-1了，错误
		//for(int i =0;i<=nums.length-1;i++) nums[nums[i]-1] = -1;
		for(int i =0;i<=nums.length-1;i++) inf[nums[i]-1] = -1;
		for(int i =0;i<=nums.length-1;i++) {
			if(inf[i] != -1) list.add(i+1);
		}
		return list;
	}
}
