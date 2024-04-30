import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int cnt = -1;
    	for(int i=0; i<2000 ; i++) {
    		if((n-5*i)>=0 && (n-5*i)%3==0) {
    			cnt = (n-5*i)/3 + i;
    			break;
    		}
    	}
    	for(int i=0; i<2000 ; i++) {
    		if((n-3*i)>=0 && (n-3*i)%5==0) {
    			cnt = (n-3*i)/5 + i;
    			break;
    		}
    	}
    	System.out.println(cnt);
    }
}