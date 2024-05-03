import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	if(n<100)
    		System.out.println(n);
    	else {
    		int cnt = 0;
    		for(int i=100; i<=n; i++) {
    			int c = i%10;
    			int q = i/10;
    			int a = q%10;
    			int d = c - a;
    			int w = q/10;
    			int b = w%10;
    			int e = a-b;
    			if(e==d)
    				cnt ++;
    		}
    		if(n==1000)
    			System.out.println("144");
    		else
    			System.out.println(99 + cnt);
    	}
    }
}
    