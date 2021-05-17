import java.util.Arrays;
import java.util.Scanner;

public class EQDIV {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int k= scan.nextInt();
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            long[] a= new long[n];
            if (k==1){
                long x=0,y=0;
                x+=n;
                a[n-1]=1;
                boolean con= true;
                for (int i=n-2;i>=0;i--){
                    if (con){
                        y+=i+1;
                        a[i]=0;
                        if (i>0){
                            y+=i;
                            i--;
                            a[i]=0;
                        }
                        con= false;
                    } else {
                        x+=i+1;
                        a[i]=1;
                        if (i>0){
                            x+=i;
                            i--;
                            a[i]=1;
                        }
                        con= true;
                    }
                }
                sb.append(Math.abs(x-y));
                sb.append('\n');
            } else {
                long x=0,y=0;
                x+= Math.pow(n,k);
                a[n-1]=1;
                for (int i=n-2;i>=0;i--){
                    if (x>y){
                        y+= Math.pow(i+1,k);
                        a[i]=0;
                    } else {
                        x+= Math.pow(i+1,k);
                        a[i]=1;
                    }
                }
                sb.append(Math.abs(x-y));
                sb.append('\n');
            }
            for (int i=0;i<n;i++){
                sb.append(a[i]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
