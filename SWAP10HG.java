import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.highestOneBit;

public class SWAP10HG {
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb= new StringBuilder();
            int t= Integer.parseInt(br.readLine());
            while (t-->0){
                int n= Integer.parseInt(br.readLine());
                char[] a= br.readLine().trim().toCharArray();
                char[] b= br.readLine().trim().toCharArray();
                boolean ans= true;
                int count= 0, x=0, y=0;
                for (int i=0;i<n;i++){
                    if (a[i]!=b[i]){
                        if (a[i]=='1') count++;
                        else count--;
                    }
                    if (count<0){
                        ans= false;
                        break;
                    }
                    if (a[i]=='0') x++;
                    if (b[i]=='0') y++;
                }
//                System.out.println(count);
//                System.out.println(x+" "+y);
                if (ans && count==0) sb.append("YES\n");
                else sb.append("NO\n");
            }
            System.out.println(sb);
        } catch(Exception t) {
            // you got the exception. Now what??
        }
    }
}
