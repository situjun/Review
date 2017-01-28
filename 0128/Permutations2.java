import java.util.*;
class Permutations2{
	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> item = new ArrayList<>();
		new Permutations2().helper(list,item,nums);
		for(List<Integer> i:list) System.out.println(i);
	}
	public void helper(List<List<Integer>> list,List<Integer> item,int[] nums){
		if(item.size() == nums.length){
			list.add(new ArrayList<>(item));
		} else {
			for(int i:nums){
				if(item.contains(i)) continue;
				item.add(i);
				helper(list,item,nums);
				item.remove(item.size()-1);
			}
		}
	}
}