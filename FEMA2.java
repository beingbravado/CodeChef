import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class FEMA2 {
    public static void main(String[] args) throws IOException {
        try{
            //Your Solve
//            Scanner scan= new Scanner(System.in);
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
//            int t= scan.nextInt();
            int t= Integer.parseInt(br.readLine());
            while (t-->0){
                Queue<Integer> q= new PriorityQueue<>();
                String[] nk= br.readLine().split(" ");
                int n= Integer.parseInt(nk[0]);
                int k= Integer.parseInt(nk[1]);
                String str= br.readLine().trim();
                int[] s= new int[n]; int num=0;
                char iron='I', magnet='M', blank='_', sheet=':', block='X' , last='*';
                for (int i=0;i<n;i++){
                    if (str.charAt(i)==sheet)
                        num++;
                    s[i]=num;
                }
                int count=0;
                for (int i=0;i<n;i++){
                    if (str.charAt(i)==iron || str.charAt(i)==magnet){
                        if (q.isEmpty()) {
                            last='*';
                        }

                        if (last=='*'){
                            q.add(i);
                            last=str.charAt(i);
                        } else if (str.charAt(i)==last){
                            q.add(i);
                        } else {
                            while (!q.isEmpty()){
                                if (k+1-(i- q.peek())-(s[i]-s[q.peek()])<=0){
                                    q.remove();
                                } else
                                    break;
                            }
                            if (!q.isEmpty()){
                                if (k+1- Math.abs(i-q.peek())-(s[i]-s[q.peek()]) >0){
                                    count++;
                                    q.remove();
                                }
                            } else {
                                last='*';
                                i--;
                            }
                        }
                    }
                    else if (str.charAt(i)==block){
                        last='*';
                        q.clear();
                    }
                }
                sb.append(count+"\n");
            }
            System.out.println(sb);
        }catch(Exception e){
            return;
        }
    }
}
