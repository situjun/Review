import java.util.*;
class CompletePack{
	public static void main(String[] s){
		ArrayList<String> list = new ArrayList<String>();
		
		int[] weight = {4,2,6,5,3};
		int[] value = {5,2,6,4,3};
		int length = weight.length;
		int limit = 10;
		int[] F = new int[limit+1];
		for(int i=0;i<=limit;i++){
			list.add(i,new String(""));
		}
		for(int i = 1;i<=length;i++){
			String item = "";
			for(int j =1;j<=limit;j++){
				if(j<weight[i-1]){
					F[j] = F[j];
				}else{
					int tmp = F[j];
					F[j] = Math.max(F[j],F[j-weight[i-1]]+value[i-1]);
					if(tmp != F[j]){
						//Key point:
						/**
						How to remove a Int value from arrayList
						remove(Object o)
						remove(int index)
						That means that list.remove(1) 
						removes the object at position 1 and remove(new Integer(1)) removes the "first occurrence" of the specified element from this list.
						*/
						item = list.get(j-weight[i-1]);
						item = item+weight[i-1]+",";
						//Key point:ArrayList set value
						list.set(j,item);
						//System.out.println(i+"...."+j+"qwqw"+item);
					} else {
						
					}
				}
			}
			
		}
		System.out.println("The list is :");
		for(int i:F){
			System.out.print(i+",");
		}
		System.out.print("\n");
		
		int count = 0;
		for(String ss:list){
			System.out.println("Weight = "+(count++)+" items are:"+ss);
		}
	}
}