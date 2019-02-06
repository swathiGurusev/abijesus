
package PositiveNegative;
import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

       int  number = 3;

        // true if number is less than 0
        if (number < 0)
            System.out.println(number + " is a negative .");

        // true if number is greater than 0
        else if ( number > 0)
            System.out.println(number + " is a positive .");

        // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");
    }
}
