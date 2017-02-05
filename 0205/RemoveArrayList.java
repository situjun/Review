import java.util.*;
class RemoveArrayList{
	public static void main(String[] args){
		//删除ArrayList中大于10的元素
		List<Integer> list = new ArrayList<>();
		int[] arr = {1,4,6,1,4,22,33,10,7};
		//list = Arrays.asList(arr);
		//Key point:asList返回的AbstractList未实现ArrayList的add和remove方法
		for(int i:arr){
			list.add(i);
		}
		for(int i =0;i<=list.size()-1;i++){
			//list.remove(i); remove的是i索引位置的值，如果要remove i这个数，需要list.remove(new Integer(i));
			if(list.get(i) >= 10) list.remove(i);
		}
		System.out.println(list);
	}
}