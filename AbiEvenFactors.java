import java.util.Scanner;


 class AbiEvenFactors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        for(int i=2;i<=N;i+=2)
        {
            if(N%i==0)
                System.out.print(i+" ");
        }
    }
}
