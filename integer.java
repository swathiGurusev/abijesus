import java.util.Scanner;
class NumberDigits {

    public static void main(String[] args) {

        int count = 0, num = 548;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println(count);
    }
}
