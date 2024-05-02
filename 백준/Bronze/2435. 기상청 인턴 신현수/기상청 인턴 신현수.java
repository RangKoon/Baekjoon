import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
    	int n = Integer.parseInt(input[0]);
    	int k = Integer.parseInt(input[1]);
    	int[] arr = new int[n+1];
    	int[] sum = new int[n+1];
    	String[] input1 = br.readLine().split(" ");
    	for(int i=1; i<n+1; i++) {
    		arr[i] = Integer.parseInt(input1[i-1]);
    		sum[i] = sum[i-1] + arr[i];
    	}
    	int max = -10_000;
    	for(int i=k; i<n+1; i++) {
    		if(max < sum[i] - sum[i-k])
    			max = sum[i] - sum[i-k];
    	}
    	System.out.println(max);
    }
}