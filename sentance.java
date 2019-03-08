import java.lang.*;
import java.util.Scanner;
class sentancecount{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int count = 0;  
String str= sc.nextLine(); 
String[] spl = str.split("[!?.:]+"); 
    count += spl.length; 
    System.out.println(count);
}
}
