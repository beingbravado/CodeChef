import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan= new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int[] a= new int[n];
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
            int[] b= new int[10];
            for (int i=0;i<10;i++){
                b[i]=0;
            }
            for (int i=0;i<n;i++){
                b[a[i]-1]++;
            }
            int maxNo=0;
            for (int i=0;i<10;i++){
                if (map.containsKey(b[i])){
                    int value= map.get(b[i]);
                    map.put(b[i],++value);
                    maxNo= Math.max(maxNo,value);
                } else {
                    map.put(b[i]+1,1);
                }
            }
            int ans=0 ;
            for (HashMap.Entry mapElement : map.entrySet()) {
                int key = (int)mapElement.getKey();
                int val = map.get(key);
                if (val==maxNo){
                    ans= Math.min(ans,key);
                }
            }
            System.out.println(ans);
        }
        br.close();
    }
}
