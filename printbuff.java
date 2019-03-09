import java.util.*;
import java.lang.*;
 class printbuff
{
    public static void main(String args[])
    {
        Scanner sj=new Scanner(System.in);
        
        String s=sj.nextLine();
        if(s.length()<=100000)
        {
        StringBuffer sb=new StringBuffer(s);
        String s1=sb.reverse().toString();
        System.out.print(s1);
        }
    }
}
