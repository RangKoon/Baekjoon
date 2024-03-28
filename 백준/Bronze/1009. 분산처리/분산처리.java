import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int answer = 1;
        	
        	for(int j=0; j<b; j++) {
        		answer *= a;
        		answer %= 10;
        	}
        	if(answer == 0)
        		System.out.println("10");
        	else
        		System.out.println(answer);
        }
        
    }
}