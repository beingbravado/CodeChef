import java.util.*;

public class STROPERS {
    public static void main(String[] args) {
        try{
            Scanner scan= new Scanner(System.in);
            int t= scan.nextInt();
            while (t-->0){
                String s= scan.next();
                char[] a= s.toCharArray();
                Set<String> set= new HashSet<>();
                List<String> list = new ArrayList<>();
                StringBuilder sb;
                for (int i=0;i<s.length();i++){
                    sb= new StringBuilder();
                    int one=0, zero=0;
                    for (int j=i;j<s.length();j++){
                        if (a[j]=='1') one++;
                        else zero++;
                        sb.append(a[j]);
                        if (!list.contains(sb.toString())){
                            String x= sb.reverse().toString();
                            sb.reverse();
                            if (!list.contains(x)){
                                list.add(sb.toString());
                            } else {
                                if (one % 2 == 1)
                                    list.add(sb.toString());
                            }
                        }
//                        System.out.print(" "+sb);
                    }
                }
//                System.out.println();
                System.out.println(list.size());
            }
        } catch(Exception t) {
            // you got the exception. Now what??
        }
    }
}
