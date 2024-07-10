import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=1; i<=n; i++) {
        	q.add(i);
        }
        int cnt = 0;
        while(q.size() > 0) {
        	int tmp = q.poll();
        	cnt ++;
        	if (cnt % k == 0 && q.size()>0) {
        		sb.append(tmp + ", ");
        	}
        	else if (cnt % k == 0 && q.size() == 0) {
        		sb.append(tmp);
        	}
        	else {
        		q.add(tmp);
        	}
        }
        sb.append(">");
        System.out.println(sb);
    }   
}          