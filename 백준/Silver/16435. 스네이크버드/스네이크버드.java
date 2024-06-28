import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int l = Integer.parseInt(input1[1]);
        int[] arr = new int[n];
        String[] input2 = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
        	arr[i] = Integer.parseInt(input2[i]);
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<n; i++) {
        	if(l >= arr[i])
        		l ++;
        	else
        		break;
        }
        
        System.out.println(l);
    }
}