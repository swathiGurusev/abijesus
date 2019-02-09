import java.util.*; 
import java.lang.*; 
import java.io.*; 
import java.util.Scanner;
 
public class Palindrome {

    public static void main(String[] args) {

        int num = 1281, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println( "yes");
        else
            System.out.println( "no");
    }
}
