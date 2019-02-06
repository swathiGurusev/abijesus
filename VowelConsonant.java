
import java.util.Scanner;
class VowelConsonant 
{

   public static void main(String[ ] arg)
   {
	boolean isVowel=false;;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter char : ");
	char ch=scanner.next().charAt(0); 
	scanner.close();
	switch(ch)
	{
	   case 'a' :
	   case 'e' :
    	   case 'i' :
	   case 'o' :
	   case 'u' :
	  isVowel = true;
	}
	if(isVowel == true) {
	   System.out.println("Vowel");
	}
	else {
	   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Consonant");
	   else
		System.out.println("Invalid ");		
        }
   }
}
