import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int t = Integer.parseInt(br.readLine());
    	boolean[] isPrime = new boolean[1_000_001];
    	for(int i=0; i<1_000_001; i++) {
    		isPrime[i] = true;
    	}
    	isPrime[0] = isPrime[1] = false;
    	for(int i=2; i<1_000_001; i++) {
    		if(isPrime[i]) {
    			for(int j= i*2; j<1_000_001; j+=i) {
    				isPrime[j] = false;
    			}
    		}
    	}
		
    	for(int i=0; i<t; i++) {
    		int cnt = 0;
    		int n = Integer.parseInt(br.readLine()); 
    		for(int j=0; j<=n/2; j++) {
    			if(isPrime[j]) {
    				if(isPrime[n-j]) {
    					cnt ++;
    				}
    			}
    		}
    		sb.append(cnt + "\n");
    	}
    	System.out.println(sb);
    	
    }
}