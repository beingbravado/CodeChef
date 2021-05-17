import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SNDMAX {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            long n= scan.nextLong();
            long sum=0;
            for (long i=(n+1)/2;i>0;i=(i+1)/2){
                if (n%i==0){
                    sum+=i;
                }
            }
            if(sum==n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
