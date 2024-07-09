import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n+1];
        arr[0] = 1;
        for(int i=1; i<=n; i++) {
        	int t = 0;
        	for(int j=i-1; j>=0; j--) {
        		arr[i] += arr[t] * arr[j];
        		t ++;
        	}
        }
        System.out.println(arr[n]);
    }   
}       
        
        
        
        
        
        
        
        
        
        
        