import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	StringBuilder sb = new StringBuilder();
    	
    	// 홀수번째는 작은 순서, 짝수번째는 큰 순서
    	
    	if(n%2==0) { // n이 짝수일 때
    		int[] odd = new int[n/2];
    		int[] even = new int[n/2];
    		
    		for(int i=0; i<n/2; i++) {
    			odd[i] = i + n/2 + 1;
    		}
    		
    		for(int i=0; i<n/2; i++) {
    			even[i] = n/2 - i;
    		}
    		for(int i=0; i<n/2; i++) {
    			sb.append(odd[i] + " " + even[i] + " ");
    		}
    	
    	}
    	
    	else { // n이 홀수일 때
    		int[] odd = new int[n/2 + 1];
    		int[] even = new int[n/2];
    		
    		for(int i=0; i<n/2 + 1; i++) {
        		odd[i] = i + n/2 + 1;
        	}
    		for(int i=0; i<n/2; i++) {
    			even[i] = n/2 -i;
    		}
    		for(int i=0; i<n/2; i++) {
    			sb.append(odd[i] + " " + even[i] + " ");
    		}
    		sb.append(odd[n/2]);
    	}
    	
    	System.out.println(sb);
    }   
}   