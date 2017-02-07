public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0) return 0;
        int result = 0;
        for(int i = 0;i<=timeSeries.length-1;i++) result += duration>=timeSeries[i]-timeSeries[i-1]?timeSeries[i]-timeSeries[i-1]:duration;
        return result+duration;
    }
}