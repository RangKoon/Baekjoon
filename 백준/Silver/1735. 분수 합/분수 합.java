import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int f1 = a*d + b*c;
        int f2 = b*d;
        boolean bool = true;
        
        while(bool) {
        	bool = false;
        	
        	for(int i=2; i<30001; i++) {
        		if(f1%i==0 && f2%i==0) {
        			f1 /= i;
        			f2 /= i;
        			bool = true;
        			break;
        		}
        	}
        }
        System.out.println(f1 + " " + f2);
        
    }
}