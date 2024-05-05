import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	String[] input1 = br.readLine().split(" ");
    	int n = Integer.parseInt(input1[0]);
    	int s = Integer.parseInt(input1[1]);
    	String[] input2 = br.readLine().split(" ");
    	int[] num = new int[n+1];
    	int[] sum = new int[n+1];
    	int cnt = 0;
    	for(int i=1; i<n+1; i++) {
    		num[i] = Integer.parseInt(input2[i-1]);
    		sum[i] = sum[i-1] + num[i];
    	}
    	int left = 0;
    	int right = n;
    	
    	while(left < right) {
    		
    		if(right - left == 1) {
    			if(sum[right] - sum[left] == s ) {
        			cnt ++;
        		}
    			left = 0;
    			right --;
    		}
    			
    		if(sum[right] - sum[left] == s ) {
    			cnt ++;
    		}
    		
    		left ++;
    	
    	}
    	System.out.println(cnt);
    }
}