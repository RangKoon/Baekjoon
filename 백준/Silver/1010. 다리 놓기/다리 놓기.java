import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
	        double n = sc.nextDouble();
	        double m = sc.nextDouble();
		        double up = 1;
		        double down = 1;
		        
		        for(double j=m; j>(m-n); j--) {
		        	up *= j;
		        }
		        for(double j=2; j<=n; j++) {
		        	down *= j;
		        }
		        System.out.printf("%.0f", up/down);
		        System.out.println();
        }
    }
}