import java.util.*;
public class Main {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int up = 1;
    	int down = 1;
    	for(int i=1; i<=n; i++) {
    		up *= i;
    	}
    	for(int i=1; i<=k; i++) {
    		down *= i;
    	}
    	for(int i=1; i<=n-k; i++) {
    		down *= i;
    	}
    	System.out.println(up/down);
    }
}
    