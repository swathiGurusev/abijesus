import java.util.Scanner;

public class AbiWaysToFormAnumber
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int ways=N/2+1;
        System.out.println(ways);
       }
}
