import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ODDARY {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                String[] s1 = br.readLine().split(" ");
                int n = Integer.parseInt(s1[0]);

                int[] a = new int[n];
                int k = 3, flag = 0;
                a[0] = 1;
                sb.append(a[0]);
                for (int i = 1; i < n; i++) {
                    if (i == n - 1 && n == 3)
                        a[i] = 1;
                    else if (flag == 0) {
                        a[i] = a[i - 1] + 1;
                        if (a[i] == k) {
                            flag = 1;
                            k++;
                        }
                    } else {
                        a[i] = a[i - 1] - 1;
                        if (a[i] == 1)
                            flag = 0;
                    }
                    sb.append(" " + a[i]);
                }

                sb.append("\n");
            }
            System.out.println(sb);
        } catch (Exception t) {
            // you got the exception. Now what??
        }
    }
}
