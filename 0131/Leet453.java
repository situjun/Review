class Leet453{
	public static void main(String[] args){
		int min = Integer.MAX_VALUE,sum = 0,result = 0;
		int[] nums = {88,1,2,3,23};
		for(int i:nums){
			if(i<=min) min = i;
			sum += i;
		}
		result = sum - nums.length*min;
		System.out.println("Only Incrementing:Step: "+result);
	}
}