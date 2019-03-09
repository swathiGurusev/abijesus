import java.util.*;
import java.lang.*;
class product
{
   public static void main(String args[])
   {
        Scanner sj= new Scanner(System.in);
        int n1 = sj.nextInt();
        int n2 = sj.nextInt();
        int product=n1*n2,f=0;
        for(int i=1;i<=Math.max(n1,n2);i++)
        {
            if(i*i==product)
            {
                f=1;
            }
        }
           if(f==1)
           {
               System.out.print("yes");
           }
           else
           {
                System.out.print("no");
           }
   }
} 
