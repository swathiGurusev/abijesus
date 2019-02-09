import java.util.Scanner;
 class multiplyer 
{
   public static void main (String [] args)
   {

      	int multiplesFound = 0; //track how many multiples found
		int currentNumber = 1; //start checking at 1
		do {
			if(currentNumber % 5 == 0)
			{
				multiplesFound++;
				System.out.println(currentNumber);
			}
			currentNumber++;
		} while(multiplesFound<10);
   }
}

   
