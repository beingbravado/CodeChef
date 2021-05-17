import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Scanner;

public class Pizza {
    private static int mod= 1000000007;
    public static void main(String[] args) throws IOException {
//        Scanner scan= new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        Integer[] a= new Integer[n];
        for (int i=0;i<n;i++){
            a[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        int x= n/4, z=n-3;
        long ans=0;
        while (x-->0){
            ans+=a[z];
            z-=3;
            ans%=mod;
        }
        System.out.println(ans);
    }
}
