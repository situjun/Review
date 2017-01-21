import java.util.*;
class Permutations{
	public static void main(String[] s){
		int[] arr = {1,2,3,4};
		List<List<Integer>> list = new Permutations().permutate(arr);
		for(List<Integer> i:list) System.out.println(i+"");
	}
	public List<List<Integer>> permutate(int[] arr){
		List<List<Integer>> list = new ArrayList<>();
		helper(list,new ArrayList<>(),arr);
		return list;
	}
	public void helper(List<List<Integer>> list,List<Integer> item,int[] arr){
		if(item.size() == arr.length){
			//new ArrayList<>(item) 只是为了把item的值复制过去生成一个新对象，如果直接add(item)的话，那前前后后add的就永远是那一个对象了
			list.add(new ArrayList<>(item));
		} else {
			for(int i:arr){
				if(!item.contains(i)){
					item.add(i);
					helper(list,item,arr);
					item.remove(item.size()-1);
				}
			}
		}
	}
}