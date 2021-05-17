// Ishika ka solution chapa tha.**** wrong solution

import java.util.Arrays;
import java.util.Scanner;

public class ARRGAME {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
            int max1=0,max2=0,count=0;
            int index = -1;
            for (int i=1;i<n;i++){
                if (a[i]==0){
                    if (a[i-1]==0){
                        count++;
                    }
                    else
                        count=1;
                } else {
                    if (count>max1){
                        max1=Math.max(count,max1);
                        index=i;
                    }
                    count=0;
                }
            }
            for (int i=1;i<n;i++){
                if (a[i]==0){
                    if (a[i-1]==0){
                        count++;
                    }
                    else
                        count=1;
                } else {
                    if (count>max2){
                        if (i!=index){
                            max2=Math.max(count,max2);
                        }
                    } else {
                        count=0;
                    }
                }
            }
            System.out.println(max1);
            System.out.println(max2);
            if (2*max2<max1){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
