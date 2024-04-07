import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
       
        char arr[][] = new char[n][n];
        
        for(int i=0; i<n; i++) {
        	String s = sc.next();
        	for(int j=0; j<n; j++) {
        		arr[i][j] = s.charAt(j);
        	}
        }
        
        int larm = 0;
        int rarm = 0;
        int hurry = 0;
        int lleg = 0;
        int rleg = 0;
        int a = 0;
        int b = 0;
        
        loop1 : for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(arr[i][j]=='*') {
        			a += i;
        			b += j;
        			for(int k=0; k<b; k++) { 
        				if(arr[a+1][k]=='*') 
        					larm ++;
        			}
        			for(int k=b+1; k<n; k++) { 
        				if(arr[a+1][k]=='*')
        					rarm ++;
        			}
        			for(int k=a+2; k<n; k++) {
        				if(arr[k][b]=='*')
        					hurry ++;
        			}
        			for(int k=a+2+hurry; k<n; k++) {
        				if(arr[k][b-1]=='*')
        					lleg ++;
        			}
        			for(int k=a+2+hurry; k<n; k++) {
        				if(arr[k][b+1]=='*')
        					rleg ++;
        			}
        			break loop1;
        		}
        	}
        }
        
        System.out.println((a+2) + " " + (b+1));
        System.out.println(larm + " " + rarm + " " + hurry + " " + lleg + " " + rleg);
    }
}