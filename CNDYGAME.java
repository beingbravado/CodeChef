import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CNDYGAME {
    private static int mod=1000000007;
    public static void main(String[] args) throws IOException {
        try{
            //Your Solve
            Scanner scan= new Scanner(System.in);
//            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int t= scan.nextInt();
//            int t= Integer.parseInt(br.readLine());
            while (t-->0){
//                int n= Integer.parseInt(br.readLine());
                int n= scan.nextInt();
//                String[] s= br.readLine().trim().split(" ");
                long[] a= new long[n];
                long[] sum= new long[n+1];
                for (int i=0;i<n;i++){
//                    a[i]= Long.parseLong(s[i]);
                    a[i]= scan.nextInt();
                }
                long maxSum=0;
                sum[0]=0;
                boolean take= true;
                if(a[0]==1){
                    maxSum=1;
                    for (int i=0;i<n;i++){
                        sum[i+1]=maxSum;
                    }
                    take= false;
                } else {
                    for (int i=0;i<n;i++){
                        maxSum+=a[i];
                        if (i<n-2){
                            if (a[i]%2==0 && a[i+1]==1){
                                maxSum-=1;
                            } else if (a[i]%2==1 && a[i+1]>1){
                                maxSum-=1;
                            }
                        } else if (i==n-2){
                            if (a[i]%2==1){
                                maxSum-=1;
                            }
                        } else if (i==n-1){
                            if (a[i]%2==0){
                                maxSum-=1;
                            }
                        }
                        sum[i+1]=maxSum;
                    }
                }
                maxSum= maxSum%mod;
//                int q= Integer.parseInt(br.readLine());
                int q= scan.nextInt();
                while (q-->0) {
//                    long r= Long.parseLong(br.readLine());
                    long r= scan.nextLong();
                    long ans= 0;
                    int k= (int) r%n;
                    ans+= sum[k]%mod;
                    if (take){
                        if (k==0){
                            if(a[n-1]%2==0)
                                ans++;
                        }
                        else if (k>0)
                        {
                            if (a[k-1]%2==1) {
                                ans++;
                                if (k>1){
                                    if (a[k-2]%2==0 && a[k-1]==1){
                                        ans++;
                                    }
                                }
                            } else {
                                if (k<n){
                                    if (a[k]==1){
                                        ans++;
                                    }
                                }
                            }
                        }
                    }
                    else {
                        if (k==1 && r/n>0 && n>1){
                            ans--;
                        }
                    }
                    ans+= ((maxSum%mod)*((r/n)%mod))%mod;
                    sb.append(ans%mod + "\n");
                }
            }
            System.out.println(sb);
        }catch(Exception e){
            return;
        }
    }
}
