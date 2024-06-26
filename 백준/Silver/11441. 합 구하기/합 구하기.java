import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	String[] s1 = br.readLine().split(" ");
    	int[] arr = new int[n+1];
    	int[] sum = new int[n+1];
    	for(int i=1; i<n+1; i++) {
    		arr[i] = Integer.parseInt(s1[i-1]);
    	}
    	for(int i=1; i<n+1; i++) {
    		sum[i] = sum[i-1] + arr[i];
    	}
    	int m = Integer.parseInt(br.readLine());
    	for(int i=0; i<m; i++) {
    		String[] s = br.readLine().split(" ");
    		int[] arr1 = new int[2];
    		arr1[0] = Integer.parseInt(s[0]);
    		arr1[1] = Integer.parseInt(s[1]);
    		System.out.println(sum[arr1[1]] - sum[arr1[0]-1]);
    	}
    }
}