import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int[] fib = new int[2_000_003]; 
    	
    	fib[999_997] = 2;
    	fib[999_998] = -1;
    	fib[999_999] = 1;
    	fib[1_000_000] = 0;
    	fib[1_000_001] = 1;
    	fib[1_000_002] = 1;
    	fib[1_000_003] = 2;
    	for(int i=4; i<1_000_001; i++) {
    		fib[1_000_000 + i] = fib[1_000_000 + i - 1] + fib[1_000_000 + i - 2];
    		fib[1_000_000 + i] %= 1_000_000_000;
    		if(i % 2 == 0) {
    			fib[1_000_000 - i] = -fib[1_000_000 + i];    	
    		}
    		else {
    			fib[1_000_000 - i] = fib[1_000_000 + i];
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	if(fib[1_000_000 + n] > 0) {
    		sb.append("1\n");
    	}
    	else if(fib[1_000_000 +  n] == 0) {
    		sb.append("0\n");
    	}
    	else {
    		sb.append("-1\n");
    	}
    	if(fib[1_000_000 +  n] < 0) {
    		sb.append(-fib[1_000_000 +  n]);
    	}
    	else {
    		sb.append(fib[1_000_000 +  n]);
    	}
    	System.out.println(sb);
    }   
}   