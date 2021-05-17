import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Integer.highestOneBit;

public class HXOR {
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb= new StringBuilder();
            int t= Integer.parseInt(br.readLine());
            while (t-->0){
                String[] s1= br.readLine().split(" ");
                int n= Integer.parseInt(s1[0]);
                int x= Integer.parseInt(s1[1]);
                String[] s2= br.readLine().split(" ");
                Integer[] a= new Integer[n];
                for (int i=0;i<n;i++) a[i]= Integer.parseInt(s2[i]);
//                boolean reps= false;
                for (int i=0;i<n-1;i++){
                    if (a[i]==0) {
                        continue;
                    }
                    while (a[i]>0){
                        int j= i+1;
                        int p= highestOneBit(a[i]);
                        while (j<n){
                            int num= a[j]^p;
                            if (num<a[j]){
//                                reps= true;
                                break;
                            }
                            j++;
                        }
                        if (j==n) j--;
                        a[i]= a[i]^p;
                        a[j]= a[j]^p;
                        x--;
//                        System.out.println(i+" "+j+"    "+p);
                        if (x==0) break;
                    }
                    if (x==0) break;
                }
//                if (x%2==1 && !reps && n>2 && x>0){
                if (n==2 && x%2==1){
                    a[n-2]= a[n-2]^1;
                    a[n-1]= a[n-1]^1;
                }
                for (int i=0;i<n;i++) sb.append(a[i]+" ");
                sb.append("\n");
            }
            System.out.println(sb);
        } catch(Exception t) {
            // you got the exception. Now what??
        }
    }
}
