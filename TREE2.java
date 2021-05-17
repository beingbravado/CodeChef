import java.util.Arrays;
import java.util.Scanner;

public class TREE2 {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
            Arrays.sort(a);
            int ans= 0, lastNum= 0;
            for (int i=0;i<n;i++){
                if (lastNum<a[i]){
                    ans++;
                    lastNum=a[i];
                }
            }
            System.out.println(ans);
        }
    }
}