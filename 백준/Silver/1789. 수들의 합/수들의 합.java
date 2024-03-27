import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long s = sc.nextLong();
        long sum = 0;
        long cnt = 0;
        
        for(int i=1; ;i++) {
        	sum += i;
        	cnt++;
        	if(sum>s) {
        			cnt --;
            		break;
            		
        	}
        	
        }
        
        System.out.println(cnt);
    }
}