import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long[] arr = new long[101];
    	arr[1] = 1;
    	arr[2] = 1;
    	arr[3] = 1;
    	arr[4] = 2;
    	arr[5] = 2;
    	arr[6] = 3;
    	for(int j=7; j<=100; j++) {
    		arr[j] = arr[j-5] + arr[j-1];
    	}
        for(int i=0; i<t; i++) {
        	int n = Integer.parseInt(br.readLine());
        	
        	sb.append(arr[n] + "\n");
        }
        System.out.println(sb);
    }   
}          