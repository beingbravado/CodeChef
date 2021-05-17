import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            String s= scan.next();
            int ans=0;
//            if(n>1){
//                int x=1, z=0;
//                for(int i=1;i<n;i++){
//                    if(s.charAt(i)==s.charAt(z)){
//                        x++;
//                        ans= Math.max(ans, x);
//                    } else {
//                        x--;
//                    }
////                     if(x==0) z=i;
//                }
//                ans= Math.max(ans, x);
//            }
            int count=0;
            StringBuilder sb = new StringBuilder();
            sb.append(s);
//            char[] c= s.toCharArray();
            for (ans=0;ans<n;){
                char[] c= sb.toString().toCharArray();
                sb= new StringBuilder();
                char x='z';
                for (int i=0;i<c.length;i++){
                    if (c[i]!='*'){
                        if (x=='z'){
                            x= s.charAt(i);
                            c[i]='*';
                            count++;
                        } else if (c[i]!=x){
                            x=c[i];
                            c[i]='*';
                            count++;
                        } else
                            sb.append(c[i]);
                    }
                }
                ans++;
                if (count==n)break;
            }
            System.out.println(ans);
        }
    }
}
