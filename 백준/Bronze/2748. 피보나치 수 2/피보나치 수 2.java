import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
    	long[]fib = new long[91];
    	fib[0] = 0; fib[1] = 1;
    	for(int i=2; i<91; i++) {
    		fib[i] = fib[i-1] + fib[i-2];
    	}
    	System.out.printf("%d", fib[n]);
    	
    }
}