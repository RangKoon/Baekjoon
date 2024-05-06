import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	boolean[] prime = new boolean[2_000_000];
    	for(int i=2; i<prime.length; i++) {
    		prime[i] = true;
    	}
    	for(int i=2; i<prime.length; i++) {
    		if(prime[i]) {
    			for(int j=i*2; j<prime.length; j+=i) {
    				prime[j] = false;
    			}
    		}
    	}

    	boolean isPrime = false;
		boolean isPel = false;

    	while(true) {
    		isPrime = false;
    		isPel = false;    		
    		
    		if(prime[n]) {
    			String s1 = Integer.toString(n);
    			String s2 = "";
    			for(int i=s1.length()-1; i>=0; i--) {
    				s2 += s1.charAt(i);
    			}
    			if(s1.equals(s2))
    				isPel = true; // 팰린드롬 검사
    			
    			isPrime = true; // n이 소수이면 isPrime은 true;
    		}
    		if(isPrime && isPel) {
    			System.out.println(n);
    			break;
    		}
    		n++;
    		
    	}
    }
}