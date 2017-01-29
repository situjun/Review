//Permutations Duplicates
import java.util.*;
public class Permutations{
	public static void main(String[] args){
		int[] nums = {1,2,2,3};
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> item = new ArrayList<>();
		boolean[] used = new boolean[nums.length];
		new Permutations().helper(list,item,nums,used);
		for(List<Integer> i:list) System.out.println(i);
	}
	public void helper(List<List<Integer>> list,List<Integer> item,int[] nums,boolean[] used){
		if(item.size() == nums.length){
			list.add(new ArrayList<>(item));
		} else {
			for(int i = 0;i<=nums.length-1;i++){
				if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
				item.add(nums[i]);
				used[i] = true;
				helper(list,item,nums,used);
				used[i] = false;
				item.remove(item.size()-1);
			}
		}
	}
}