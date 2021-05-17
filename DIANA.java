//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class DIANA {
//    static class Pair implements Comparable<Pair>
//    {
//        int x,y;
//        Pair(int x,int y)
//        {
//            this.x=x;
//            this.y=y;
//        }
//        @Override
//        public int compareTo(Pair pop) {
//            return Integer.compare(x,pop.x);
//        }
//    }
//    public static void main(String[] args) throws IndexOutOfBoundsException {
//        Scanner scan= new Scanner(System.in);
//        int t= scan.nextInt();
//        while (t-->0) {
//            int n = scan.nextInt();
//            long sum=0;
//            int[] a= new int[n];
//            int[] b= new int[n];
//            for (int i=0;i<n;i++) {
//                a[i]= scan.nextInt();
//            }
//            for (int i=0;i<n;i++) {
//                b[i]= scan.nextInt();
//            }
//            ArrayList<Pair> list= new ArrayList<>();
//            for (int i=0;i<n;i++)
//            {
//                Pair p =new Pair(a[i],b[i]);
//                list.add(p);
//            }
//            Collections.sort(list);
//			for (int i=0;i<n;i++)
//			System.out.println(list.get(i).x+" "+list.get(i).y);
//            long p=0;
//            long s=0;
////            for(int i=0;i<n;i++)
////            {
////                s+=list.get(i).x;
////                if(s<=n)
////                {
////                    p+=list.get(i).x*list.get(i).y;
////                }
////            }
//            for(int i=0;i<n;i++)
//            {
//                s+=list.get(i).x;
//                if(s<=n)
//                {
//                    p+=list.get(i).x*list.get(i).y;
//                }
//                else
//                {
//                    if(s!=n)
//                    {
//                        s=s-list.get(i).x;
//                        p+=(n-s)*list.get(i).y;
//                        break;
//                    }
//                }
//
//            }
//            System.out.println(p);
//
////            System.out.println(sum);
//        }
//    }
//}
