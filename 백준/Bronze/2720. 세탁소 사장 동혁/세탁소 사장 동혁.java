import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[] {25,10,5,1};
        
        for(int i=0; i<n; i++) {
        	int cntarr[] = new int[4];
        	int a = sc.nextInt();
        	
        	for(int j=0; j<4; j++) {
        		
        		if(a>=arr[j]) {
        			cntarr[j] += a/arr[j];
        			a %= arr[j];
        		}
        		
        		System.out.print(cntarr[j] + " ");
        	}
        	
        	System.out.println();
        }
        
        
    }
}