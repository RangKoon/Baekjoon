import java.util.*;
import java.io.*;
import java.math.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
        	int tmp = Integer.parseInt(br.readLine());
        	pq.add(tmp);
        }
        long sum = 0;
        while(pq.size()>1) {
       		int tmp1 = pq.poll();
       		int tmp2 = pq.poll();
           	pq.add(tmp1 + tmp2);   
           	sum += tmp1 + tmp2;
        }
        System.out.println(sum);
    }   
}   