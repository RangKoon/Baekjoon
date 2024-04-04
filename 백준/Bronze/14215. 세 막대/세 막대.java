import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	        
	    int arr[] = new int[] {a,b,c};
	      
	    Arrays.sort(arr);
	     
	    if(arr[2]>=arr[0]+arr[1])
	    	arr[2] -= arr[2]-(arr[0]+arr[1])+1;
	       
       System.out.println(arr[0]+arr[1]+arr[2]);
	    
    }
}