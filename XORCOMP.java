import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class XORCOMP {
    public static void main(String[] args) throws IOException {
        Scanner scan= new Scanner(System.in);
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= scan.nextInt();
        while (t-->0){
            long x= scan.nextLong();
            long y= scan.nextLong();
            long n= scan.nextLong();
            long z=0;
            for (int i=0;i<=n;i++){
                if ((x^i)<(y^i)) z++;
            }
            System.out.println(z);
        }
    }
}
