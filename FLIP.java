import java.util.Scanner;

public class FLIP {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        long k = scan.nextLong();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long l = 0, r = 0;
            for (int j = 0; j <= k; j++) {
                long x = scan.nextLong();
                if (j == k)
                    r = x;
                if (j != k)
                    l += x;
            }
            if (l <= m && r <= 10)
                ans++;
        }
        System.out.println(ans);
        scan.close();
    }
}
