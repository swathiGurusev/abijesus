import java.util.Scanner;
  class GFG{ 
       
    // Function to find sum of series. 
    static float sumOfAP(float a, float d,  
                                  int n) 
    { 
        float sum = 0; 
        for (int i = 0; i < n; i++) 
        { 
            sum = sum + a; 
            a = a + d; 
        } 
        return sum; 
    } 
      
    // Driver function 
    public static void main(String args[]) 
    { 
        int n = 3; 
        float a = 1, d = 1; 
        System.out.println(sumOfAP(a, d, n)); 
    } 
} 
