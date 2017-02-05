import java.util.*;
class Permutations2{
	static Permutations2 instance = new Permutations2();
	public static void main(String[] s){
		int[] arr = {2,1,2,3};
		boolean[] used = new boolean[arr.length];
		Arrays.sort(arr);
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> item = new ArrayList<>();
		instance.helper(list,item,arr,used);
		for(List<Integer> i:list) System.out.println(i);
	}
	public void helper(List<List<Integer>> list,List<Integer> item,int[] nums,boolean[] used){
		if(item.size() == nums.length){
			list.add(new ArrayList<>(item));
		}
		for(int i =0;i<=nums.length-1;i++){
			if(used[i] || i >0 && nums[i] == nums[i-1] && !used[i-1]){
				continue;
			}
			item.add(nums[i]);
			used[i] = true;
			helper(list,item,nums,used);
			used[i] = false;
			item.remove(item.size()-1);
		}
	}
}