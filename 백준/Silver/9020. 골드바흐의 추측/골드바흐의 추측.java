import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int t = Integer.parseInt(br.readLine());
    	boolean[] isPrime = new boolean[10001];
    	for(int i=0; i<10001; i++) {
    		isPrime[i] = true;
    	}
    	isPrime[0] = isPrime[1] = false;
    	for(int i=2; i<10001; i++) {
    		if(isPrime[i]) {
    			for(int j= i*2; j<10001; j+=i) {
    				isPrime[j] = false;
    			}
    		}
    	}
    	
    	int num1 = 0;
    	int num2 = 0;
		
    	for(int i=0; i<t; i++) {
    		int n = Integer.parseInt(br.readLine()); 
    		for(int j=0; j<=n/2; j++) {
    			if(isPrime[j]) {
    				if(isPrime[n-j]) {
    					num1 = j;
    					num2 = n-j;
    				}
    			}
    		}
    		sb.append(num1 + " " + num2 + "\n");
    	}
    	System.out.println(sb);
    	
    }
}