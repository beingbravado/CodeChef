import java.io.IOException;
import java.util.Scanner;

public class EVENPSUM {
    public static void main(String[] args) throws IOException {
        try{
            Scanner scan= new Scanner(System.in);
            int t= scan.nextInt();
            while (t-->0){
                int a= scan.nextInt();
                int b= scan.nextInt();
                System.out.println((a/2)*(b/2)+((a+1)/2)*((b+1)/2));
            }
        }catch(Exception t){
            // you got the exception. Now what??
        }
    }
}
