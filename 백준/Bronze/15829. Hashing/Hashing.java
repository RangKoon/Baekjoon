import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        long mul = 1;
        long sum = 0;
        for(int i=0; i<n; i++) {
        	int a = s.charAt(i)-'a'+1;
        	sum+= a*mul;
        	
        	mul *= 31;
        }
        System.out.println(sum);
    }
}