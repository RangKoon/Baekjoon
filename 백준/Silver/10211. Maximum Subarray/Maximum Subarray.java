import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int t = Integer.parseInt(br.readLine());
    	for(int i=0; i<t; i++) {
    		int n = Integer.parseInt(br.readLine());
    		String[] input = br.readLine().split(" ");
    		int[] arr = new int[n+1];
    		int[] sum = new int[n+1];
    		for(int j=1; j<n+1; j++) {
    			arr[j] = Integer.parseInt(input[j-1]);
    			sum[j] = sum[j-1] + arr[j];
    		}
    		int max = -1_000_000;
    		for(int j=n; j>=1; j--) {
    			for(int k=0; k<j; k++) {
    				if(max < (sum[j]-sum[k]))
    					max = sum[j] - sum[k];
    			}
    			
    		}
    		System.out.println(max);
    	}
    }
}