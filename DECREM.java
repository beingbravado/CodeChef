import java.util.Scanner;

public class DECREM {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0){
            int l= scan.nextInt();
            int r= scan.nextInt();
            if (2*l<=r)
                System.out.println(-1);
            else {
                System.out.println(r);
            }
        }
    }
}
