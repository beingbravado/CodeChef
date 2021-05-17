import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ADAMAT {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0){
            int n= Integer.parseInt(br.readLine());
            int[][] array= new int[n][n];
            for (int i=0;i<n;i++){
                String[] s= br.readLine().split(" ");
                for (int j=0;j<n;j++){
                    array[i][j]= Integer.parseInt(s[j]);
                }
            }
            int[] myArray= new int[n];
            for (int i=0;i<n;i++){
                myArray[i]= array[0][i];
            }
            int count=0;
            for (int i=1;i<n;i++){
                if ((myArray[i]!=i+1 && myArray[i-1]==i) || (myArray[i]==i+1 && myArray[i-1]!=i))
                    count++;
            }
            if (myArray[1]!=2)
                count--;
            if (myArray[n-1]!=n)
                count++;
            System.out.println(count);
        }
    }
}
