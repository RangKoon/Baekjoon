import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++) {
        	int x = Integer.parseInt(br.readLine());
        	if(x == 0) {
        		if(pq.size()==0) {
        			sb.append("0\n");
        		}
        		else {
        			sb.append(pq.poll() + "\n");
        		}
        	}
        	else {
        		pq.add(x);
        	}
        }
        System.out.println(sb);
    }   
}          