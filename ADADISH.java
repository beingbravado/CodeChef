import java.util.Arrays;
import java.util.Scanner;

public class ADADISH {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] c= new int[n];
            for (int i=0;i<n;i++) c[i]= scan.nextInt();
            Arrays.sort(c);
            int x=0,y=0;
            while (n-->0){
                if (x<y){
                    x+=c[n];
                } else {
                    y+=c[n];
                }
            }
            System.out.println(Math.max(x,y));
        }
    }
}
