import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
    	String[] input1 = br.readLine().split(" ");
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++) { // n개의 정수 입력
    		arr[i] = Integer.parseInt(input1[i]);
    	}
    	
    	Arrays.sort(arr);
    	
    	int m = Integer.parseInt(br.readLine());
    	String[] input2 = br.readLine().split(" ");
    	for(int i=0; i<m; i++) { // 정수 확인 m번
    		boolean b = false;
    		int target = Integer.parseInt(input2[i]);
    		int lo = -1;
    		int hi = n;
    		int mid = hi / 2;
    		
    		while(lo+1 < hi) {
    			if(target < arr[mid]) {
    					hi = mid;
    					mid = (lo+hi) / 2;
    			}
    			else if(target > arr[mid]) {
    				lo = mid;
    				mid = (lo+hi) / 2;
    			}
    			else {
    				break;
    			}
    		}
    		if(target == arr[mid])
    			b = true;
    		
    		if(b)
    			sb.append("1\n");
    		else
    			sb.append("0\n");

    	}
    	
    	System.out.println(sb);
    
    }
}