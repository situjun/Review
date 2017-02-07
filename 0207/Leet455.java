public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0)return 0;
        Arrays.sort(s);
        Arrays.sort(g);
        int index1 = 0,index2 = 0,result = 0;
        while(index1 <= g.length-1 && index2<=s.length-1){
            if(g[index1] > s[index2]){
                index2++;
                continue;
            }
            result++;
            index1++;
            index2++;
        }
        return result;
    }
}