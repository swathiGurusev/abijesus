

import java.util.Scanner;
 class Largest 
{
    
    public static void main(String[] args) 
    {
        int num1, num2, num3, result, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        num1 = scanner.nextInt();
        System.out.println(" ");
        num2 = scanner.nextInt();
                
        System.out.println(" ");
        num3 = scanner.nextInt();
        scanner.close();
        temp = num1>num2 ? num1:num2;
        result = num3>temp ? num3:temp;
        System.out.println(" "+result);
    }
}
