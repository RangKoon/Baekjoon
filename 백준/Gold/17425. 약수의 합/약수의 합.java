import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int t = Integer.parseInt(br.readLine());
    	long[] num = new long[1_000_001];
    	long[] sum = new long[1_000_001];
    	for(int i=2; i<num.length; i++) {
    		for(int j=1; i*j<num.length; j++) {
    			num[i*j] += i;
    		}
    	}
    	for(int i=1; i<num.length; i++) {
    		num[i]+=1;
    		sum[i] = sum[i-1] + num[i];
    	}
    	for(int i=0; i<t; i++) {
    		int input = Integer.parseInt(br.readLine());
    		sb.append(sum[input] + "\n");
    	}
    	System.out.println(sb);
    }
}