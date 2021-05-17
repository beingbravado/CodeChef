import java.util.ArrayList;
import java.util.Scanner;

public class XOXO {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int k= scan.nextInt();
            int x= scan.nextInt();
            ArrayList<Integer> list= new ArrayList<>();
            for (int i=1; i<=Math.sqrt(n); i++)
            {
//                if (n%i==0)
//                {
//                    // If divisors are equal, print only one
//                    if (n/i == i)
//                        System.out.print(" "+ i);
//
//                    else // Otherwise print both
//                        System.out.print(i+" " + n/i + " " );
//                }
            }

            boolean ans= false;
            int a= (int)Math.sqrt(k);
            int b= k/a;
            int num= a+b;
            int z= k-a*b;
//            System.out.println(z);
            while (z>1){
                a= (int)Math.sqrt(z);
                b= z/a;
                num+= a+b;
                z-= a*b;
            }
            System.out.println(num);
            if (num<=n || n>k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
