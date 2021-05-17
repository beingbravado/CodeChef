import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HRSCPMTR {
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb= new StringBuilder();
            int t= Integer.parseInt(br.readLine());
            while (t-->0){
                String[] s1= br.readLine().split(" ");
                int n= Integer.parseInt(s1[0]);
                int m= Integer.parseInt(s1[1]);
                Integer[] a= new Integer[n];
                Integer[] b= new Integer[n];
//                for (int i=0;i<n;i++){
                    String[] s2= br.readLine().split(" ");
                    for (int j=0;j<n;j++){
                        a[j]= Integer.parseInt(s2[j]);
                    }
//                }
//                for (int i=0;i<n;i++){
                    String[] s3= br.readLine().split(" ");
                    for (int j=0;j<m;j++){
                        b[j]= Integer.parseInt(s2[j]);
                    }
//                }

            }
            System.out.println(sb);
        } catch(Exception t) {
            // you got the exception. Now what??
        }
    }
}
