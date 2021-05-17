import java.util.Scanner;

public class HIRINGWO {
    public static int count=0;
    public static long ans=0;
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0) {
            int k= scan.nextInt();
            int x= scan.nextInt();
            int z= x+1;
            for (int i=2;i<(x+1)/2;i++){
                if (x%i==0){
                    if ((x/i)%i!=0){
                        z= Math.min(z, (x/i)+i);
                    }
                }
            }
            long ans= z+Math.max(0,k-2);
            System.out.println(ans);
        }
    }
    public static long solution(int x){
        int a= (int)Math.sqrt(x);
        int b= x/a;
        if (a==1 || b==1)
            return count+=a+b;
        else {
            return solution(a)+solution(b);
        }
    }
}
