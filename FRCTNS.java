import java.io.IOException;
import java.util.Scanner;

public class FRCTNS {
    public static void main(String[] args) throws IOException {
        Scanner scan= new Scanner(System.in);
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= scan.nextInt();
        long ans=0;
        while (n>0){
//            ans+=(n+1)/2;
            ans+= (int)(Math.log(n+1)/Math.log(2));
            n--;
        }
//        for (int i=n;i>1;i--){
//            for (int j=i-1;j>0;j--){
//                if (((j+1)*i)-(j*(i+1))>0){
//                    int x=((j+1)*i)-(j*(i+1));
//                    if (((j+1)*i)%x==0 &&(j*(i+1))%x==0) ans++;
//                }
//            }
//        }
        System.out.println(ans);
    }
}
