import java.util.Scanner;

public class DECODEIT {
    public static void main(String[] args) {
        try{
            Scanner scan= new Scanner(System.in);
            int t= scan.nextInt();
            while (t-->0){
                int n= scan.nextInt();
                StringBuilder s= new StringBuilder();
                String[] a= scan.next().split("");
                char aa= 'a';
                for (int i=0;i<n;i+=4){
                    StringBuilder b= new StringBuilder();
                    for (int j=i;j<i+4;j++){
                        b.append(a[j]);
                    }
                    int num= Integer.parseInt(b.toString(),2);
                    char ans= (char)(aa+num);
                    s.append(ans);
//                    System.out.println("**"+num);
                }
                System.out.println(s);
            }
//            System.out.println(sb);
        } catch(Exception t) {
            // you got the exception. Now what??
        }
    }
}
