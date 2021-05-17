import java.util.Arrays;
import java.util.Scanner;

public class WATMELON {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
//            boolean ans= true;
//            for (int i=0;i<n;i++){
//                if (a[i]>=0){
//                    if (a[i]%(i+1)!=0){
//                        ans= false;
//                        break;
//                    }
//                } else {
//                    ans= false;
//                    break;
//                }
//            }
            int sum=0;
            for (int i=0;i<n;i++){
                sum+=a[i];
            }
            if (sum>=0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
