import java.util.Arrays;
import java.util.Scanner;

public class PERMSPL {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
            int odd=0, even=0, sum=0;
            if (n>1){
                for (int i=1;i<n;i++){
                    if (a[i]<a[i-1]){
                        int num=2;
                        while (i+1<n){
                            if (a[++i]<a[i-1])
                                num++;
                        }
                        even+= num/2;
                        odd += num%2;
                        sum+=num;
//                        System.out.println(even+" "+odd);
                    }
                }
            }
//            if (n==1)
//                System.out.println("YES");
//            else if (odd%2==0)
//                System.out.println("YES");
//            else if (odd%2==1 & even%2==0)
//                System.out.println("YES");
//            else
//                System.out.println("NO");

            if (sum%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
