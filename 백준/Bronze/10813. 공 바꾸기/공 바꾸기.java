import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tmp = 0;
        int[] ball = new int[n];
        
        for(int i = 0; i<n; i++){
          ball[i] = i+1;
        }
        for(int i = 0; i<m; i++){
          int a = sc.nextInt();
          int b = sc.nextInt();
          tmp = ball[a-1];
          ball[a-1] = ball[b-1];
          ball[b-1] = tmp;
          }
        for(int i=0; i<n; i++){
          System.out.print(ball[i]+ " ");
        }
     }
}