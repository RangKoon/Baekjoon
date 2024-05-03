import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	String[] input = br.readLine().split(" ");
    	int[] arr = new int[n];
    	int n1 = Integer.parseInt(input[0]);
    	for(int i=1; i<n; i++) {
    		arr[i-1] = Integer.parseInt(input[i]);
    		int first = n1;
    		int last = arr[i-1];
    		
    		if(arr[i-1]==1 || n1==1)
    			System.out.println(n1 + "/" + arr[i-1]);
    		else {
    			for(int j=2; j<=arr[i-1]; j++) {
    				if(n1%j==0 && arr[i-1]%j==0) {
    					first = n1 / j;
    					last = arr[i-1] / j;
    				}
    			}
    			System.out.println(first + "/" + last);
    		}
    	}
    }
}
    