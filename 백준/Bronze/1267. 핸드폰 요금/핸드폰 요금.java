import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int arr[] = new int[n];
        int Y = 0;
        int M = 0;
        for(int i=0; i<n; i++) {
        	arr[i] = Integer.parseInt(input[i]);
        	Y += 10 + (arr[i] / 30) * 10;
        	M += 15 + (arr[i] / 60) * 15;
        	
        }
        if(Y>M)
        	System.out.println("M " + M);
        else if(Y<M)
        	System.out.println("Y " + Y);
        else
        	System.out.println("Y M " + M);
        
    }
}