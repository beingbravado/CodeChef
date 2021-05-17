import java.io.*;

public class CHFNSWAP {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int t= Integer.parseInt(br.readLine());
        while (t-->0){
            long n= Integer.parseInt(br.readLine());
            long sum= n*(n+1)/2;
            if (sum%2==1){
                sb.append(0);
                sb.append("\n");
            }
            else if (n==3){
                sb.append(2);
                sb.append("\n");
            }
            else {
                long a= (long) Math.floor((2*n+1 - Math.ceil((double)Math.sqrt(2*n*n + 2*n + 1)))/(double)2);
                a++;
//                System.out.println(a);
                long ans=a;
                a--;
                if ((double) a*(2*n-a+1)/2==sum/(double)2) {
                    ans += a*(a-1)/2 + (n-a)*(n-a-1)/2 - 1;
                }
                sb.append(ans);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
