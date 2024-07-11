import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for(int i=0; i<n+1; i++) {
        	arr[i] = -1;
        }
        if(n==1)
        	System.out.println("-1");
        else if(n==2) 
        	System.out.println("1");
        else if(n==3)
        	System.out.println("-1");
        else if(n==4)
        	System.out.println("2");
        else if(n==5)
        	System.out.println("1");
        else if(n==6)
        	System.out.println("3");
        else if(n==7)
        	System.out.println("2");
        else if(n==8)
        	System.out.println("4");
        else if(n==9)
        	System.out.println("3");
        else if(n==10)
        	System.out.println("2");
        else {
	        	arr[2] = 1;
	        	arr[4] = 2;
	        	arr[5] = 1;
	        	arr[6] = 3;
	        	arr[7] = 2;
	        	arr[8] = 4;
	        	arr[9] = 3;
	        	arr[10] = 2;
	        for(int i=11; i<n+1; i++) {
	        	if(arr[i-2] <= arr[i-5]) {
	        		arr[i] = arr[i-2] + 1;
	        	}
	        	else {
	        		arr[i] = arr[i-5] + 1;
	        	}
	        }
	        System.out.println(arr[n]);
        }
    }   
}          