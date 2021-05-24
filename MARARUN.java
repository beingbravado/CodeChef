import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            // long n = scan.nextLong();
            long d = scan.nextInt();
            long x = scan.nextInt();
            long a = scan.nextInt();
            long b = scan.nextInt();
            long c = scan.nextInt();

            long dist = d * x;
            long ans = 0;
            // if (dist >= 10) {
            // if (c - b == 1) {
            // if (b - a == 1) {
            // ans += a * (dist / 10);
            // } else {
            // ans += b * (dist / 21);
            // dist %= 21;
            // ans += a * (dist / 10);
            // }
            // } else {
            // ans += c * (dist / 42);
            // dist %= 42;
            // if (b - a == 1) {
            // ans += a * (dist / 10);
            // } else {
            // ans += b * (dist / 21);
            // dist %= 21;
            // ans += a * (dist / 10);
            // }
            // }
            // }
            if (dist >= 10)
                ans = a;
            if (dist >= 21)
                ans = b;
            if (dist >= 41)
                ans = c;
            System.out.println(ans);
        }
        scan.close();
    }
}
