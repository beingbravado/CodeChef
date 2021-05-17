import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class THOUSES {
    static int mod= 1000000007;
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb= new StringBuilder();
            int t= Integer.parseInt(br.readLine());
            while (t-->0){
                String[] s1= br.readLine().trim().split(" ");
                int n= Integer.parseInt(s1[0]);
                long x= Long.parseLong(s1[1]);
                HashMap<Integer, Integer> map= new HashMap<>();

                for (int i=1;i<n;i++){
                    String[] s2= br.readLine().trim().split(" ");
                    int a= Integer.parseInt(s2[0]);
                    int b= Integer.parseInt(s2[1]);

                    map.put(a, map.getOrDefault(a,0)+1);
                }

                long ans=1;
                for (Map.Entry<Integer,Integer> key : map.entrySet() ){
                    long k= (long)(key.getValue());
                    ans+= k*(k+1)/2;
                    ans%=mod;
                }
                ans= ans*x%mod;

                sb.append(ans).append("\n");
            }
            System.out.println(sb);
        } catch(Exception t) {
            // you got the exception. Now what??
        }
    }
}
