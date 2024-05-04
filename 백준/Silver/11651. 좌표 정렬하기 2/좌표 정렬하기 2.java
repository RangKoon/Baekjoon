import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
    	int[][] arr = new int[n][2];
    	for(int i=0; i<n; i++) {
    		String[] input = br.readLine().split(" ");
    		arr[i][1] = Integer.parseInt(input[0]);
    		arr[i][0] = Integer.parseInt(input[1]);
    	}
    	Arrays.sort(arr,(e1,e2) -> {
    		if(e1[0]==e2[0]) {
    			return e1[1]-e2[1];
    		}
    		else {
    			return e1[0]-e2[0];
    		}
    		
    	});
    	
    	for(int i=0; i<n; i++) {
    		sb.append(arr[i][1] + " " + arr[i][0]+"\n");
    	}
    	System.out.println(sb);
    }
}
    