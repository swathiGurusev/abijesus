import java.util.Scanner;

public class abiASRemoval 
{
     public static void main(String[] args)
     {
        Scanner in=new Scanner(System.in);
        String S=in.nextLine();
        S=S.replaceAll(" ", "");
         System.out.println(S);
     }
}
