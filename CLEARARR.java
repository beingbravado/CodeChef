import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CLEARARR {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                String[] s1 = br.readLine().split(" ");
                int n = Integer.parseInt(s1[0]);
                int k = Integer.parseInt(s1[1]);
                int x = Integer.parseInt(s1[2]);
                String[] s2 = br.readLine().split(" ");
                int[] a = new int[n];
                for (int i = 0; i < n; i++)
                    a[i] = Integer.parseInt(s2[i]);

                long ans = 0;
                Arrays.sort(a);
                int index = n - 2;
                for (; index >= 0 && k > 0; index -= 2, k--) {
                    long temp = a[index] + a[index + 1];
                    if (temp < x)
                        break;
                    else
                        ans += x;
                }
                for (int i = 0; i < index + 2; i++)
                    ans += a[i];
                sb.append(ans + "\n");
            }
            System.out.println(sb);
        } catch (Exception t) {
            // you got the exception. Now what??
        }
    }
}
