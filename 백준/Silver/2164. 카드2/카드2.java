import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++) {
        	q.add(i);
        }
        while(q.size() != 1) {
        	q.poll();
        	int tmp = q.poll();
        	q.add(tmp);
        }
        System.out.println(q.peek());
    }   
}          