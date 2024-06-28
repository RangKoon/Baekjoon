import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        double n = sc.nextDouble();
        double up = 1;
        double down = 1;
        
        for(double j=k-1; j>(k-n); j--) {
        	up *= j;
        }
        for(double j=2; j<=n-1; j++) {
        	down *= j;
        }
        System.out.printf("%.0f", up/down);    
    }
}