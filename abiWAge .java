import java.io.*;
import java.util.*; 
  
class abiWAge 
{ 
    public static void main(String[] args) 
    { 
       
		Scanner sc=new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
		System.out.println("Enter The Number Of Terms:");
		int N=sc.nextInt();
		String str="";
		int i=0;
		System.out.println("Enter The Inputs:");
		
		
		while(i<N)
		{
		str=sc.next();
        al.add(str);
		i++;
		}
        
		Collections.sort(al); 
  
        
        System.out.println(al); 
    } 
}   
