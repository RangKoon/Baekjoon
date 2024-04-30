import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int numarr[] = new int[n+1];
    	for(int i=1; i<numarr.length; i++) {
    		numarr[i] = sc.nextInt();
    	}
    	int sumarr[] = new int[n+1];
    	sumarr[0] = 0;
    	for(int i=1; i<=n; i++) {
    		sumarr[i] = sumarr[i-1] + numarr[i];
    	}
    	
    	for(int i=0; i<m; i++) {
    		int k = sc.nextInt();
    		int l = sc.nextInt();
    		System.out.println(sumarr[l] - sumarr[k-1]);
    	}
    }
}