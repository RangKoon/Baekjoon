import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[] {500,100,50,10,5,1};
        int cash = 1000-n;
        int cnt = 0;
        
        for(int i=0; i<arr.length; i++) {
        	if(cash>=arr[i]) {
        		cnt += cash/arr[i];
        		cash %= arr[i];
        	}
        	
        }
	    
        System.out.println(cnt);
    }
}