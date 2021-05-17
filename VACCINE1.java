import java.io.IOException;
import java.util.Scanner;

public class VACCINE1 {
    public static void main(String[] args) throws IOException {
        try{
            Scanner scan= new Scanner(System.in);
//            int t= scan.nextInt();
//            while (t-->0){
                int d1= scan.nextInt();
                int v1= scan.nextInt();
                int d2= scan.nextInt();
                int v2= scan.nextInt();
                int p= scan.nextInt();
                int sum=0, ans=1;
                for (int i=1;i<=p;i++){
                    if (i>=d1) sum+=v1;
                    if (i>=d2) sum+=v2;
                    if (sum>=p) break;
                    ans++;
                }
                System.out.println(ans);
//            }
        }catch(Exception t){
            // you got the exception. Now what??
        }
    }
}
