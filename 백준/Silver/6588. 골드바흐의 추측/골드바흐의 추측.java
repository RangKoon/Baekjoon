import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
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
    	
    	while(true) {
    		int num1 = 0;
        	int num2 = 0;
    		int n = Integer.parseInt(br.readLine());
    		if(n==0)
    			break;
    		for(int j=0; j<=n/2; j++) {
    			if(isPrime[j]) {
    				if(isPrime[n-j]) {
    					num1 = j;
    					num2 = n-j;
    					sb.append(n + " = " + num1 + " + " + num2 + "\n");
    					break;
    				}
    			}
    		}
    	}
    	
    	System.out.println(sb);
    	
    }
}