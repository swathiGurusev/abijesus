import java.util.Scanner;
import java.util.Arrays;
 class Minimum {

   
    public static void main(String[] args) 
   {
       int mini, n, i;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
     int ints[] = {30,5,7,4,10};
      Arrays.sort(ints);

int min = ints[0];
int max = ints[ints.length - 1];
	   
       System.out.print(+min); 
   }
}
