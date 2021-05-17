import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BULBS {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0){
            String[] s= br.readLine().split(" ");
            int n= Integer.parseInt(s[0]);
            int k= Integer.parseInt(s[1]);
            String str= br.readLine();
            int[] array= new int[n];

            int zero=0, x=0, z=0, leftZero=0, rightZero=0, pair=0;
            for (int i=0;i<n;i++){
                if (str.charAt(i)=='0'){
                    zero++;
                }
            }
//            System.out.println(zero);
            for (int i=0;i<n;i++){
                if (str.charAt(i)=='0'){
                    leftZero++;
                } else {
                    z=i;
                    break;
                }
            }
//            System.out.println(leftZero);
            for (int i=z;i<n;i++){
                if (str.charAt(i)=='0'){
                    if (i>0){
                        if (str.charAt(i-1)=='1'){
                            pair=1;
                        } else {
                            pair++;
                        }
                    }
                } else if (i>0){
                    array[x++]=pair;
                    pair=1;
                }
            }
            for (int i=n-1;i>=0;i--){
                if (str.charAt(i)=='0'){
                    rightZero++;
                } else {
                    break;
                }
            }
//            System.out.println(rightZero);
            Arrays.sort(array);

            if (k%2==1 && (rightZero>0 && leftZero==0) || (rightZero==0 && leftZero>0)){
                    if (leftZero > rightZero){
                        zero -= leftZero;
                        leftZero = 0;
                    } else {
                        zero -= rightZero;
                        rightZero = 0;
                    }
//                    zero-= Math.max(leftZero,rightZero);
                    k--;
//                    array[x++]= Math.min(leftZero,rightZero);
            }
            k = (k+1)/2;
            x = n-1;
            while (k-->0){
                if (array[x]>rightZero && array[x]>leftZero) {
                    zero-= array[x--];
                } else {
                    if (leftZero > rightZero){
                        zero -= leftZero;
                        leftZero = 0;
                    } else {
                        zero -= rightZero;
                        rightZero = 0;
                    }
                }
            }
            System.out.println(zero);
        }
    }
}
