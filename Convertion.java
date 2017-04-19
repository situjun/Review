class Convertion{
	public static void main(String[] args){
		int num = -1;
		System.out.println(num+"");
		System.out.println(toHex(num)+"");
		System.out.println(Integer.toString(num,16));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toOctalString(num));
		System.out.println(toOctal(num));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(toBinary(num)+"");
		//return Integer.toString(num, 7);
	}
	
	    
    public static String toHex(int num) {
		char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 15)] + result; 
            num = (num >>> 4);
        }
        return result;
    }
	public static String toBinary(int num) {
		char[] map = {'0','1'};
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 1)] + result; 
            num = (num >>> 1);
        }
        return result;
    }
	public static String toOctal(int num) {
		char[] map = {'0','1','2','3','4','5','6','7'};
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 7)] + result; 
            num = (num >>> 3);
        }
        return result;
    }
	
}