import java.util.*; 
import java.lang.*; 
import java.io.*; 
import java.util.Scanner;
 

  class Power
 {

    public static void main(String[] args) 
    {

        int base = 5, exponent = 2;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println( result);
    }
}
