import java.util.*;
import java.lang.*;
class factorsnumbers
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int num = in.nextInt();
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
System.out.print(i+"  ");
}
}
}
} 
