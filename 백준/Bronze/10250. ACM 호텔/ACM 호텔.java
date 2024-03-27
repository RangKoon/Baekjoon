import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
        	int h = sc.nextInt();
        	int m = sc.nextInt();
        	int n = sc.nextInt();
        	
        	int cnt = 0;
        	
        	for(int j=1; j<=m; j++) {
        		for(int k=1; k<=h; k++) {
        			cnt++;
        			if(cnt==n) {
        				if(j>=10)
        	        		System.out.println(k+""+j);
        				else
        					System.out.println(k+"0"+j);
        				break;
        				
        			}
        		}
        	}
        		
        }
    }
}