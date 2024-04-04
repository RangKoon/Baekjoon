import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        
        for(int i=1; i<=n; i++) {
        	int asd = i;
        	while(asd>0) {
        		
        		
	        	if((asd%10)%3==0) {
	        		 cnt ++;
	        		 if(asd%10==0)
	        			 cnt --;
	        	}
	        		
	        	asd /=10;
	        	
        	}
        }
        
        System.out.println(cnt);
        
        
        
        
    }
}