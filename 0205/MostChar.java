import java.util.*;
class MostChar{
	public static void main(String[] args){
		String s = "sdfewgdfbwefsdfwefvx";
		int[] arr = new int[26];
		Arrays.fill(arr,0);
		for(int i = 0;i<=s.length()-1;i++){
			arr[s.charAt(i)-'a']++;
		}
		System.out.println(s);
		for(int i = 0;i<=arr.length-1;i++){
			System.out.println(String.valueOf((char)(i+'a'))+","+arr[i]);
		}
	}
}