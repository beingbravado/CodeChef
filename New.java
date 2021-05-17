import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class New {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner obj= new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            ArrayList<Pair> arr=new ArrayList<>();
            int[] f=new int[n];
            int[] c=new int[n];
//            int sum=0;
            for (int i=0;i<n;i++) {
                f[i]= obj.nextInt();
            }
            for (int i=0;i<n;i++)
                c[i]= obj.nextInt();
            for (int i=0;i<n;i++)
            {
                Pair p =new Pair(f[i],c[i]);
                arr.add(p);
            }
            Collections.sort(arr);
//            for (int i=0;i<n;i++)
//                System.out.println(arr.get(i).x+" "+arr.get(i).y);
            int num=0;
            long ans=0;
            for(int i=0;i<n;i++)
            {
                int s= arr.get(i).x;
                if (num+s>n){
                    s= n-num;
                }
                ans+= (long) s*(arr.get(i).y);
                num+=s;
                if (num==n) break;
            }
            System.out.println(ans);
        }
    }
    static class Pair implements Comparable<Pair>
    {
        int x,y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(Pair o) {
            return Integer.compare(y,o.y);
        }
    }
}