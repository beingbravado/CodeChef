import java.util.Scanner;

public class SSO {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            long[] a= new long[n];
            long sum=0;
            for (int i=0;i<n;i++){
                a[i]= scan.nextLong();
                sum+=a[i];
            }
            for (int i=0;i<n;i++){
                sum= sum|a[i];
            }
            System.out.println(sum);
        }
    }
}
