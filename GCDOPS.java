import java.util.Arrays;
import java.util.Scanner;

public class GCDOPS {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] b= new int[n];
            for (int i=0;i<n;i++){
                b[i]= scan.nextInt();
            }
            boolean ans= true;
            for (int i=0;i<n;i++){
                if ((i+1)%b[i]!=0){
                    ans= false;
                    break;
                }
            }

            if (ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
