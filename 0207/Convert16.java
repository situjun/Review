class Convert16{
	public static void main(String[] args){
		int num = 855682482;
		String result = "";
		while(num!=0){
			int remain = num%16;
			String tmp = remain >= 10?String.valueOf((char)('a'+remain-10)):remain+"";
			result = tmp+result;
			num = num/16;
		}
		System.out.println(result);
	}
}