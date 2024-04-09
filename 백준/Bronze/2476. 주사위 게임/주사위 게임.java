import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum[] = new int[n];
        
        for(int i=0; i<n; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	
        	if(a==b && b==c) 
        		sum[i] += 10000 + (1000 * a);
        	else if(a==b || a==c) 
        		sum[i] += 1000 + (100 * a);
        	else if(b==c)
        		sum[i] += 1000 + (100 * b);
        	else {
        		if(a>b && a>c)
        			sum[i] += 100 * a;
        		else if(b>a && b>c)
        			sum[i] += 100 * b;
        		else if(c>a && c>b)
        			sum[i] += 100 * c;
        	}
        }
        int max = 0;
        
        for(int i=0; i<n; i++) {
        	if(sum[i]>max)
        		max = sum[i];
        }
        
        System.out.println(max);
    }
}