import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RESTORE {
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int t= Integer.parseInt(br.readLine());
        while (t-->0){
            int n= Integer.parseInt(br.readLine());
            int[] a= new int[n];
            int[] b= new int[n];
            String[] s= br.readLine().split(" ");
            for (int i=0;i<n;i++){
                b[i]= Integer.parseInt(s[i]);
                a[i]= n+1-i;
            }
            for (int i=0;i<n;i++){
                if (b[i]>i+1){
                    a[i]=a[b[i]-1];
                }
            }
            for (int i=0;i<n;i++){
                sb.append(a[i]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
