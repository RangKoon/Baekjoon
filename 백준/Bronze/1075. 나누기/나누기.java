import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int cnt = 0;
        
        for(int i=0; i<100; i++) {
        	if((((n/100) * 100)+cnt) % f==0)
        		break;
        	cnt ++;
        }
        if(cnt<10)
        	System.out.println("0" +cnt);
        else
        	System.out.println(cnt);
    }
}