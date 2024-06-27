import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n+1];
        String[] swich = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
        	arr[i+1] = Integer.parseInt(swich[i]);
        }
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
        	String[] input = br.readLine().split(" ");
        	int a = Integer.parseInt(input[0]);
        	int b = Integer.parseInt(input[1]);
        	if(a == 1) { // 남학생인 경우
        		for(int j=b; j<n+1; j+=b)
        			if(arr[j]==1)
        				arr[j] = 0;
        			else
        				arr[j] = 1;
        	}
        	
        	else { // 여학생인 경우
        		int cnt = 1;
        		if(arr[b] == 1)
        			arr[b] = 0;
        		else
        			arr[b] = 1;
        		
        		while(b - cnt > 0 && b + cnt < n+1) {
        			if(arr[b-cnt] == arr[b+cnt]) {
        				if(arr[b-cnt] == 1)
        					arr[b-cnt] = 0;
        				else
        					arr[b-cnt] =1;
        				if(arr[b+cnt] == 1)
        					arr[b+cnt] = 0;
        				else
        					arr[b+cnt] = 1;
        				
        				cnt ++;
        			}
        			else
        				break;
        		}
        		
        	}
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<n+1; i++) {
        	
        	if(i % 20 == 0)
        		sb.append(arr[i] + "\n");
        	else
        		sb.append(arr[i] + " ");
        	
        }
        System.out.println(sb);
    }
}