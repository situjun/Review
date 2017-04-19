import java.util.*;
class Solution{
	public static void main(String[] s){
		System.out.println(new Solution().reverseStr("abcdefg",3));
	}
	public int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
		for(int i = 0;i<=timePoints.size()-1;i++){
			for(int j = i+1;j<=timePoints.size()-1;j++){
				
				if(timePoints.get(i).equals("00:00")){
					min = Math.min(min,helper("24:00",timePoints.get(j)))
				} else if(timePoints.get(i).equals("24:00")){
					min = Math.min(min,helper("00:00",timePoints.get(j)))
				} else {
					min = Math.min(min,helper(timePoints.get(i),timePoints.get(j)))
				}
			}
		}
		return min;
    }
	public int helper(String s1,String s2){
		String time1 = s1;
		String time2 = s2;
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		int difference = date2.getTime() - date1.getTime(); 
		return difference;
	}
}