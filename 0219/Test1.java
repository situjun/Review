import java.util.*;
public class Test1{
    static int count =  0;
	public static void main(String[] args){
		//System.out.println(new Test1().countArrangement(4)+"");
		
        int arr[] = {1, 0, 1,1,0};
        int size = arr.length;
		System.out.println(new Test1().maxLen(arr)+"");
	}
	// Returns largest subarray with equal number of 0s and 1s
    int maxLen(int nums[]) 
    {
		if(nums == null || nums.length == 0) return 0;
        int sum[] = new int[nums.length];
		sum[0] = nums[0] == 0? -1 : 1;
		for(int i=1; i < sum.length; i++){
			sum[i] = sum[i-1] + (nums[i] == 0? -1 : 1);
		}
		Map<Integer,Integer> pos = new HashMap<Integer,Integer>();
		int maxLen = 0;
		int i = 0;
		for(int s : sum){
			if(s == 0){
				maxLen = Math.max(maxLen, i+1);
			}
			if(pos.containsKey(s)){
				maxLen = Math.max(maxLen, i-pos.get(s));
			}else{
				pos.put(s, i);
			}
			i++;
		}
		return maxLen;
    }
	
	
    public static int countArrangement(int N) {
        List<Integer> list = new ArrayList<>();
		if(N==0) return 0;
        int[] arr = new int[N];
        for(int i =1;i<=N;i++) arr[i-1] = N;
        boolean[] used = new boolean[N];
        helper(list,N,used);
        return count;
    }
    public static void helper(List<Integer> list,int target,boolean[] used){
        if(list.size() == target){
			
            count++;
			System.out.println(list);
        } else {
            for(int i = 1;i<=target;i++){
                if(used[i-1]) continue;
                if((list.size()+1)%i == 0 || i%(list.size()+1) == 0){
                    list.add(i);
                    used[i-1] = true;
                    helper(list,target,used);
                    used[i-1] = false;
                    list.remove(list.size()-1);
                }
            }
        }
    }
	public static int findMaxLength(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
        int length = nums.length,max = 1;
        int[] arr1 = new int[length];
        int[] arr2 = new int[length];
        arr1[0] = 1;
        arr2[0] = 1;
		System.out.print(arr1[0]+",");
        for(int i = 1;i<=length-1;i++){
            if(nums[i] >= nums[i-1]) arr1[i] = arr1[i-1]+1;
            else arr1[i] = 1;
			System.out.print(arr1[i]+",");
            max = Math.max(max,arr1[i]);
        }
		System.out.println("");
		System.out.print(arr2[0]+",");
        for(int i = 1;i<=length-1;i++){
            if(nums[i] <= nums[i-1]) arr2[i] = arr2[i-1]+1;
            else arr2[i] = 1;
			System.out.print(arr2[i]+",");
            max = Math.max(max,arr2[i]);
        }
		System.out.println("");
        return max;
    }
}