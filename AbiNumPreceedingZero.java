import java.util.Scanner;


class AbiNumPreceedingZero
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
       
       for(int i=0;i<N;i++)
       {
            arr[i]=in.nextInt();
        }
        int k=0;
        if(arr[0]==1)
            k=0;
        for(int i=0;i<N;i++)
        {
            
            if(arr[i]==0)
            {
                for(int j=k;j<i;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                k=i+1;
            }
        }
    }
}
