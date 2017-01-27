import java.util.*;
class Permutations{
	public static void main(String[] args){
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> item = new ArrayList<>();
		int[] nums = {1,2,3,4};
		new Permutations().helper(list,item,nums);
		for(List<Integer> i:list){
			System.out.println(i);
		}
	}
	public void helper(List<List<Integer>> list,List<Integer> item,int[] nums){
		if(item.size() == nums.length){
			list.add(new ArrayList<>(item));
		} else {
			for(int i = 0;i<=nums.length-1;i++){
				if(!item.contains(nums[i])){
					item.add(nums[i]);
					helper(list,item,nums);
					item.remove(item.size()-1);
				} else {
					continue;
				}
			}
		}
	}
}