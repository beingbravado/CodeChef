import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DIFSTR {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                String[] s1 = br.readLine().split(" ");
                int n = Integer.parseInt(s1[0]);
                // String[] s2 = br.readLine().split(" ");
                String[] str = new String[n];
                HashSet<String> set = new HashSet<>();
                char[] ans = new char[n];
                for (int i = 0; i < n; i++) {
                    str[i] = br.readLine().trim();
                    set.add(str[i]);
                    ans[i] = '0';
                }
                StringBuilder res = new StringBuilder();
                boolean con = true;
                for (int i = 0; i < n; i++) {
                    con = true;
                    res = new StringBuilder();
                    for (int j = 0; j < n; j++)
                        res.append(ans[j]);
                    if (set.contains(res.toString()))
                        con = false;
                    if (con)
                        break;
                    ans[i] = '1';
                }
                if (!con) {
                    ans[n - 1] = '1';
                    res = new StringBuilder();
                    for (int j = 0; j < n; j++)
                        res.append(ans[j]);
                }
                sb.append(res.toString() + "\n");
            }
            System.out.println(sb);
        } catch (Exception t) {
            // you got the exception. Now what??
        }
    }
}
