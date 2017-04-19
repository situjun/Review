import java.util.*;
public class Solution {
	long min = (long)Integer.MAX_VALUE;
	
	public static void main(String[] args){
		
		System.out.println(new Solution().nextGreaterElement(12)+"");
	}
	public  void helper(List<Integer> list,int[] arr,boolean[] used,int item,int n){
		if(list.size() == arr.length){
			long num = 0;
			for(int i =0;i<=list.size()-1;i++){
				num = num*10+list.get(i);
			}
			if(num>(long)n){
				if(num<min) min = num;
			}
		} else {
			for(int i =0;i<=arr.length-1;i++){
				if(used[i]) continue;
				list.add(arr[i]);
				//item = item*10+arr[i];
				used[i] = true;
				helper(list,arr,used,item,n);
				used[i] = false;
				//item = item/10;
				list.remove(list.size()-1);
			}
		}
	}
	public  int nextGreaterElement(int n) {
		min++;
		System.out.println(min+1+"");
        long max = Integer.MAX_VALUE;
        long res = 0;
        int[] arr = new int[(n+"").length()];
		boolean[] used = new boolean[arr.length];
		int tmp = n,index = 0;
		while(tmp != 0){
			arr[index++] = tmp%10;
			tmp /= 10;
		}
        Arrays.sort(arr);
		helper(new ArrayList<Integer>(),arr,used,0,n);
		res = min;
        if(min == Integer.MAX_VALUE) return -1;
        if(res<=max){
            if(res <= n){
				//System.out.println(res+"");
                return -1;
            } else {
                return (int)res;
            }
        } else {
            if((long)n+1<=max) return n+1;
            else return -1;
        }
        
    }
    public static String reverseWords(String s) {
		//return new StringBuilder(s.substring(0,s.length())).reverse().toString();
		if(s == null || s.length() == 0) return "";
        String[] arr = new StringBuilder(s.substring(0,s.length())).reverse().toString().split(" ");
		String res = "";
		for(int i = arr.length-1;i>=0;i--){
			res = res + arr[i] + " ";
		}
		return res.trim();
		/***
		if(s == null || s.length() == 0) return "";
        s = s.trim();
        int index1 = 0,index2 = 0;
        String result = "";
        
        for(int i =0;i<=s.length()-1;i++){
            if(s.charAt(i) == ' '){
                if(i>index1){
                    result = result+new StringBuilder(s.substring(index1,i)).reverse().toString();
                    index1 = i+1;
                }
                
            }
        }
        if(index2 == 0) return s;
        result = result+new StringBuilder(s.substring(index1,s.length())).reverse().toString();
        return result;
		
		***/
    }
}