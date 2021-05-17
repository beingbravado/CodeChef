import java.util.Arrays;
import java.util.Scanner;

public class COVID19B {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0)
        {
            int n= scan.nextInt();
            int[] arr=new int[n];
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]= scan.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                int m=arr[i];
                int c=1;
                for(int j=0;j<i;j++)
                {
                    if(m<arr[j] && j+arr[j]<=i+m)
                        c++;
                }
                for(int j=i+1;j<n;j++)
                {
                    if(m>arr[j] && m+i<=j+arr[j])
                    {
                        c++;
                    }
                }
                a[i]=c;
            }
            Arrays.sort(a);
            System.out.println(a[0]+" "+a[n-1]);
        }
    }
}


//public class COVID19B {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        int t= Integer.parseInt(br.readLine());
//        while (t-->0){
//            int n= Integer.parseInt(br.readLine());
//            int[] array= new int[n];
//            String[] s= br.readLine().split(" ");
//            for (int i=0;i<n;i++){
//                array[i]= Integer.parseInt(s[i]);
//            }
//            int[] myArray= new int[n];
//            for (int i=0;i<n;i++){
//                myArray[i]=array[i]+i;
//            }
//
//            int min=1, max=1;
//            for (int i=1;i<n;i++){
//                if (myArray[i]==myArray[i-1])
//                    min++;
//                else
//                    break;
//            }
//            for (int i=n-2;i>=0;i--){
//                if (myArray[i]==myArray[i+1])
//                    max++;
//                else break;
//            }
//            System.out.println(min+" "+max);
//        }
//    }
//}

