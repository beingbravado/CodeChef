import java.util.Arrays;
import java.util.Scanner;

public class BOWLERS {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int k= scan.nextInt();
            int l= scan.nextInt();
            int[] a= new int[n];
            int count=1;
            if (n>k*l || (k==1 && n>1)){
                System.out.print(-1);
            } else {
                for (int i=0;i<n;i++){
                    a[i]= count;
                    count++;
                    if (count>k){
                        count=1;
                    }
                }
                for (int i=0;i<n;i++){
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println();
        }
    }
}
