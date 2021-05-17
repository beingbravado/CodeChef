import java.util.Scanner;

public class SPLITIT {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
//            int[] a= new int[n];
//            for (int i=0;i<n;i++){
//                a[i]= scan.nextInt();
//            }
            String s= scan.next();
            boolean ans= false;
            for (int i=0;i<n-1;i++){
                if (s.charAt(n-1)==s.charAt(i)){
                    ans= true;
                    break;
                }
            }

            if (ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
