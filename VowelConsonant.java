
import java.util.Scanner;
class VowelConsonant 
{

   public static void main(String[ ] arg)
   {
	boolean isVowel=false;;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a character : ");
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
	   System.out.println(ch+"  Vowel");
	}
	else {
	   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println(ch+"  Consonant");
	   else
		System.out.println("Invalid ");		
        }
   }
}
