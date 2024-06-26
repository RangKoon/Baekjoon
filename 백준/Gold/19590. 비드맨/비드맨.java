import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        
        long sum = 0;
        long max = 0;
        
        for (int i=0; i<n; i++) {
        	if (max < arr[i])max = arr[i];
        }  
        
        for (int i=0; i<n; i++) 
        	sum += arr[i];
   
        sum -= max;
        
        if(n == 1) {
        	System.out.println(arr[0]);
        	System.exit(0);
        }
        
        if(max >= sum)
    		System.out.println(max-sum);
    	else {
    		if((max+sum)%2==0)
    			System.out.println("0");
    		else
    			System.out.println("1");
    	}
        
    }
}