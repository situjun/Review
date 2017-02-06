class ReverseString{
	public static void main(String[] as){
		StringBuilder sb = new StringBuilder();
		String s = "dkende";
		for(int i = s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}
}