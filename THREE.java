import java.io.BufferedReader;
import java.io.InputStreamReader;

public class THREE {
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb= new StringBuilder();
            int t= Integer.parseInt(br.readLine());
            while (t-->0){
//                int n= Integer.parseInt(br.readLine());
                char[] a= br.readLine().trim().toCharArray();
                int[] x= new int[26];
                int n=a.length, ans=0;
                for (int i=0;i<26;i++){
                    x[i]=0;
                }
                for (int i=0;i<n;i++){
                    x[a[i]-'a']++;
                }

                int p=0, s=0;
                for (int i=0;i<26;i++){
                    p+= x[i]/2;
                    s+= x[i]%2;
                }
                if (p<=s){
                    ans+= p;
                } else {
                    ans= s;
                    p-=s;
                    ans+= p*2/3;
                }
                System.out.println(ans);
            }
//            System.out.println(sb);
        } catch(Exception t) {
            // you got the exception. Now what??
        }
    }
}
