import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MINNOTES {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                String[] s1 = br.readLine().split(" ");
                int n = Integer.parseInt(s1[0]);
                String[] s2 = br.readLine().split(" ");
                int[] a = new int[n];
                for (int i = 0; i < n; i++)
                    a[i] = Integer.parseInt(s2[i]);
                sb.append("\n");
            }
            System.out.println(sb);
        } catch (Exception t) {
            // you got the exception. Now what??
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }
}
