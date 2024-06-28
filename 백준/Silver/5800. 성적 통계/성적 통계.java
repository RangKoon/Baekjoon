import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        for(int i=1; i<=k; i++) {
        	String[] input = br.readLine().split(" ");
        	int n = Integer.parseInt(input[0]);
        	int[] arr = new int[n];
        	for(int j=0; j<n; j++) {
        		arr[j] = Integer.parseInt(input[j+1]);
        	}
        	Arrays.sort(arr);
        	int gap = 0;
        	for(int j=1; j<n; j++) {
        		if(arr[j]-arr[j-1] > gap)
        			gap = arr[j]-arr[j-1];
        	}
        	System.out.println("Class " + i);
        	System.out.println("Max " + arr[n-1] + ", Min " + arr[0] + ", Largest gap " + gap);
        	
        }
    }
}