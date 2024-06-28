import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        if(n==1)
        	System.out.println("0");
        else {
	        int[] arr = new int[n-1];
	        for(int i=0; i<n-1; i++) {
	        	arr[i] = Integer.parseInt(br.readLine());
	        }
	        int cnt = 0;
	        Arrays.sort(arr);
	        while(true) {
	        	if(m<=arr[n-2]) {
	        		m ++;
	        		arr[n-2] --;
	        		cnt ++;
	        	}
	        	Arrays.sort(arr);
	        	if(m>arr[n-2])
	        		break;
	        }
	        System.out.println(cnt);
        }
    }
}