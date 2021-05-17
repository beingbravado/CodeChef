import java.io.IOException;
import java.util.Scanner;

public class POSPREFS {
    public static void main(String[] args) throws IOException {
        try{
            Scanner scan= new Scanner(System.in);
            StringBuilder sb= new StringBuilder();
            int t= scan.nextInt();
            while (t-->0){
                int n= scan.nextInt();
                int k= scan.nextInt();
                if(k*2>n){
                    k=n-k;
                    for (int i=1;i<=n;i++){
                        if (i%2==1 && k>0){
                            sb.append((-1)*i+" ");
                            k--;
                        } else {
                            sb.append(i+" ");
                        }
                    }
                } else {
                    for (int i=1;i<=n;i++){
                        if (i%2==0 && k>0){
                            sb.append(i+" ");
                            k--;
                        } else {
                            sb.append((-1)*i+" ");
                        }
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }catch(Exception t){
            // you got the exception. Now what??
        }
    }
}
