import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        while(true) {
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        
	        int arr[] = new int[] {a,b,c};
	        
	        Arrays.sort(arr);
	        
	        if(a==0 && b==0 && c==0)
	        	break;
	        else if(arr[2]>=arr[0]+arr[1])
	        	System.out.println("Invalid");
	        else if(a==b && b==c)
	        	System.out.println("Equilateral");
	        else if(a==b || a==c || b==c)
	        	System.out.println("Isosceles");
	        else
	        	System.out.println("Scalene");
	        	
        }
       
    }
}