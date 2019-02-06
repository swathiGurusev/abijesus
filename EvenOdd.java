import java.util.Scanner;


class EvenOdd
{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
 try {
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
       

        if(num % 2 == 0)
            System.out.println(num + " even");
        else
            System.out.println(num + " odd");
        }
        catch (Exception ex)
        {
                      System.out.println("invalid ");
    }
}
}

