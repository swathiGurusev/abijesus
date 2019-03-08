import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
class Count

{
   
    public static void main(String[] args) {
		String s= "java";
		HashMap<String, Integer> counter = new HashMap();
		for(char c : s.toCharArray()){
			String str="";
			if(!counter.containsKey(str))
                        {
				counter.put(str, 1);
			}else{
				counter.put(str, counter.get(str)+1);
			}
		}
		System.out.println(counter);
	}
}
