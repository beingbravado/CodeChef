import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ELOMAX {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0){
            String[] string= br.readLine().split(" ");
            int n= Integer.parseInt(string[0]);
            int m= Integer.parseInt(string[1]);
            int[][] a= new int[n][m];
            int[][] b= new int[n][m];
            int[][] c= new int[n][m];
            String[] str= br.readLine().split(" ");
            int[] rating= new int[n];
            for (int i=0;i<n;i++){
                rating[i]= Integer.parseInt(str[i]);
            }

            for (int i=0;i<n;i++){
                String[] row= br.readLine().split(" ");
                for (int j=0;j<m;j++){
                    a[i][j]= Integer.parseInt(row[j]);
                    b[i][j]= rating[i]+a[i][j];
                    c[i][j]= b[i][j];

                    rating[i]+= a[i][j];
                }
                Arrays.sort(b[i]);
            }
            int[] maxRating = new int[n];
            for (int i=0;i<n;i++){
                maxRating[i] = b[i][m-1];
            }

            int[] maxRank = new int[m];
            int[] rankRow = new int[n];
            int[] rankInRow = new int[n];
            for (int i=0;i<m;i++){
                for (int j=0;j<n;j++){
                    rankRow[j]= c[j][i];
                }
                Arrays.sort(rankRow);
                rankInRow[0]=0;
                for (int j=1;j<n;j++){
                    if (rankRow[j-1]==rankRow[j])
                        rankInRow[j]=rankInRow[j-1];
                    else
                        rankInRow[j]=j;
                }
                for (int j=0;j<n;j++){

                }

                int R[] = new int[n];
                for (int j = 0; j < n; j++) {
                    int r = 1, s = 1;

                    for (int k = 0; k < n; k++)
                    {
                        if (k != i && c[i][k] < c[i][j])
                            r += 1;

                        if (k != i && c[i][k] == c[i][j])
                            s += 1;
                    }

                    // Use formula to obtain  rank
                    R[i] = r + (int)(s - 1) / (int) 2;

                }
            }

        }
    }
}
