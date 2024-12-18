import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int t = Integer.parseInt(br.readLine());
    	int[] cnt = new int[12];
    	cnt[1] = 1;
    	cnt[2] = 2;
    	cnt[3] = 4;
    	cnt[4] = 7;
    	for(int i=5; i<=11; i++) {
    		cnt[i] = cnt[i-1] + cnt[i-2] + cnt[i-3];
    	}
    	
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0; i<t; i++) {
    		int n = Integer.parseInt(br.readLine());
    		sb.append(cnt[n] + "\n");
    	}
    	
    	System.out.println(sb);
    }
}   