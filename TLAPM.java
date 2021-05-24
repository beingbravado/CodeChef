import java.io.*;
import java.util.*;

public class C {
    // public static void 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = 2001;
        int[][] grid = new int[n][n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = i; j >= 0; j--) {
                grid[k++][j] = count++;
                // System.out.print(grid[i][j]);
            }
            // System.out.println();
        }
        // for (int i = 1; i < n; i++) {
        //     int k = i;
        //     for (int j = n-1; j >= 0; j--) {
        //         grid[k++][j] = count++;
        //         // System.out.print(grid[i][j]);
        //     }
        //     // System.out.println();
        // }
        int t = scan.nextInt();
        while (t-- > 0) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            long ans1 = grid[x1 - 1][y1 - 1];
            for (int i = x1; i < x2; i++) {
                ans1 += grid[i][y1 - 1];
                // System.out.println(ans);
            }
            for (int i = y1; i < y2; i++) {
                ans1 += grid[x2 - 1][i];
                // System.out.println(ans);
            }

            long ans2 = grid[x1 - 1][y1 - 1];
            for (int i = y1; i < y2; i++) {
                ans2 += grid[x1 - 1][i];
                // System.out.println(ans);
            }
            for (int i = x1; i < x2; i++) {
                ans2 += grid[i][y2 - 1];
                // System.out.println(ans);
            }
            // System.out.println(ans1 + " " + ans2);
            System.out.println(Math.max(ans1, ans2));
        }
        scan.close();
    }
}
