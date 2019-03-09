import java.util.Scanner;

class  AbiFirstOccuranceOfK
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        String K=in.next();

        for(int i=0;i<S.length();i++)
        {
            if((int)S.charAt(i)==(int)K.charAt(0)){
                System.out.println(i);
                break;
            }

        }
    }
}
