import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            int a = (int)(str.charAt(i)-'0');
            int b = a*a*a*a*a;
            sum += b;
        }
        System.out.println(sum);
     }
}