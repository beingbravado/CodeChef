import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CLOSCHEF {
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

                int zero = 0, one = 0, mone = 0, count = 0, mcount = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == 0)
                        zero++;
                    else if (a[i] == 1)
                        one++;
                    else if (a[i] == -1)
                        mone++;
                    else {
                        if (a[i] > 1)
                            count++;
                        else
                            mcount++;
                    }
                }
                if (count + mcount > 1)
                    sb.append(0 + "\n");
                else {
                    if (n <= 2)
                        sb.append(1 + "\n");
                    else if (mone > 1 && one == 0)
                        sb.append(0 + "\n");
                    else if (mcount > 0 && mone != 0)
                        sb.append(0 + "\n");
                    else if (count > 0 && mone != 0)
                        sb.append(0 + "\n");
                    else
                        sb.append(1 + "\n");
                }
            }
            System.out.println(sb);
        } catch (Exception t) {
            // you got the exception. Now what??
        }
    }
}
