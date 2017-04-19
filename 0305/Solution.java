import java.util.*;
public class Solution {
	public static void main(String[] s){
		int[] nums = {1,2,3,4,5};
		int k = 1;
		System.out.println(new Solution().findPairs(nums,k)+"");
	}
    public int findPairs(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1) return 0;
		int count = 0,n = nums.length;
		Map<Integer,Integer> map = new HashMap<>();
		Arrays.sort(nums);
		for (int i = 0; i < n; i++){       
			// See if there is a pair of this picked element
			for (int j = i+1; j < n; j++){
				if (nums[j] - nums[i] == k ){
					map.put(nums[i],nums[j]);
				}	
			}
		}
		return map.size();
		
		/**
		
        int result = 0;
        Arrays.sort(nums);
        int index1 = 0,index2 = 0;
		while(index1 <= nums.length-1 && index2 <= nums.length-1){
			if(nums[index1] - nums[index2] == k){
				 result++;
				 index1++;
			}
			
		}
        return result;
		**/
    }
}