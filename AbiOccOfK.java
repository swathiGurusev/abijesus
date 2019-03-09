import java.util.Scanner;


public class AbiOccOfK
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       long N=in.nextLong();
        int K=in.nextInt();
        int count=0;
        while(N!=0)
        {
            if(N%10==K)
                count++;
            N=N/10;
        }
        System.out.println(count);
    }
}
