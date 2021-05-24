import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int g = scan.nextInt();
            int p = scan.nextInt();
            int[] x = new int[10];
            for (int i = 0; i < 10; i++)
                x[i] = scan.nextInt();
            int max = 0, min = 0;
            long sum = 0;
            for (int i = g; i < 10; i++) {
                sum += x[i];
            }
            min = (int) (sum / p) + 1;
            sum += x[g - 1];
            max = (int) (sum / p);
            if (sum % p > 0) {
                max++;
            }

            System.out.println(min + " " + max);
        }
        scan.close();
    }
}
