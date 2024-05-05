import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	String[] input = br.readLine().split(" ");
    	int n = Integer.parseInt(input[0]);
    	int k = Integer.parseInt(input[1]);
    	boolean[] isPrime = new boolean[n+1];
    	for(int i=0; i<n+1; i++) {
    		isPrime[i] = true;
    	}
    	isPrime[0] = isPrime[1] = false;
    	int cnt = 0;
    	for(int i=2; i<=n; i++) {
    		if(isPrime[i]) {
    			cnt ++; 
    			if(cnt == k) {
    				System.out.println(i);
    				break;
    			}
    			
    			for(int j=i*2; j<=n; j+=i) {
    				if(isPrime[j]==true) {
    					isPrime[j] = false;
    					cnt ++;
    				}
    				if(cnt == k) {
    					System.out.println(j);
    					break;
    				}
    			}
    		}
    	}
    }
}