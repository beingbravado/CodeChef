import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class EQDIFFER {
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

                HashMap<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < n; i++)
                    map.put(a[i], map.getOrDefault(a[i], 0) + 1);
                int count = 0;
                for (int x : map.keySet())
                    count = Math.max(count, map.get(x));

                // if (n <= 2)
                // count = n;
                if (count <= 2)
                    sb.append(Math.max(0, n - 2) + "\n");
                else
                    sb.append((n - count) + "\n");
            }
            System.out.println(sb);
        } catch (Exception t) {
            // you got the exception. Now what??
        }
    }
}
