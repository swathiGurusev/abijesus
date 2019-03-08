import java.util.Scanner;
import java.util.Arrays;
 class Numeric 
{

    public static void main(String[] args) 
    {

        String string = "12345.15";
        boolean numeric = true;

        try 
        {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e)
        {
            numeric = false;
        }

        if(numeric)
            System.out.println(" yes");
        else
            System.out.println(" No");
    }
}
