import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=1; i<=n; i++) {
        	q.add(i);
        }
        while(q.size()>1) {
        	int tmp = q.peek();
        	q.remove();
        	cnt ++;
        	if(cnt%k == 0) {
        		sb.append(tmp + ", ");
        	}
        	else {
        		q.add(tmp);
        	}
        }
        sb.append(q.peek() + ">");
        System.out.println(sb);
    }   
}          