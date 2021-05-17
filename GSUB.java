import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class GSUB {
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int t= Integer.parseInt(br.readLine());
        while (t-->0){
            String[] s1= br.readLine().split(" ");
            int n= Integer.parseInt(s1[0]);
            int q= Integer.parseInt(s1[1]);
            String[] s2= br.readLine().split(" ");
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i]= Integer.parseInt(s2[i]);
            }
            int num=1;
            for (int i=1;i<n;i++){
                if (a[i]!=a[i-1]) {
                    num++;
                }
            }
            while (q-->0){
                String[] s3= br.readLine().split(" ");
                int x= Integer.parseInt(s3[0])-1;
                int y= Integer.parseInt(s3[1]);
                if(x<n-1)
                {
                    if(a[x]!=a[x+1])
                    {
                        if(y==a[x+1])
                        {
                            num--;
                        }
                    }
                    else
                    {
                        if(y!=a[x+1])
                        {
                            num++;
                        }
                    }
                }
                if(x>0)
                {
                    if(a[x]!=a[x-1])
                    {
                        if(y==a[x-1])
                        {
                            num--;
                        }
                    }
                    else
                    {
                        if(y!=a[x-1])
                        {
                            num++;
                        }
                    }
                }
                a[x]=y;
                sb.append(num+"\n");
            }
        }
        System.out.println(sb);
    }
}
