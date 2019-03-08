import java.util.Scanner;
import java.util.Arrays;
 class Middle
{    
    // Function to find the middle of three number 
    public static int middleOfThree(int a, int b, int c) 
    { 
        // Compare each three number to find  
        // middle number. Enter only if a > b 
        if (a > b)  
        { 
            if (b > c) 
                return b; 
            else if (a > c) 
                return c; 
            else
                return a; 
        } 
        else
        { 
            // Decided a is not greater than b. 
            if (a > c) 
                return a; 
            else if (b > c) 
                return c; 
            else
                return b; 
        } 
    } 
      
    // driver code 
    public static void main(String[] args) 
    { 
        int a = 2, b = 3, c = 4; 
        System.out.println(middleOfThree(a, b, c)); 
    } 
} 
  
