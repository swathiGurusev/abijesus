import java.util.*;
class findNumbers
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt(),count=0;
        int search=input.nextInt();
        int arrayNum[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arrayNum[i]=input.nextInt();
            if(arrayNum[i]==search)
            {
                count=1;
            }
        }
        if(count==1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
