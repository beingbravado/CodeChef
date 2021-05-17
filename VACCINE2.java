import java.io.IOException;
import java.util.Scanner;

public class VACCINE2 {
    public static void main(String[] args) throws IOException {
        try{
            Scanner scan= new Scanner(System.in);
            int t= scan.nextInt();
            while (t-->0){
                int n= scan.nextInt();
                int d= scan.nextInt();
                Integer[] a= new Integer[n];
                int x=0, y=0;
                for (int i=0;i<n;i++) {
                    a[i]= scan.nextInt();
                    if (a[i]>=80 || a[i]<=9) x++;
                    else y++;
                }
                System.out.println(((x+d-1)/d)+(y+d-1)/d);
            }
        }catch(Exception t){
            // you got the exception. Now what??
        }
    }
}
