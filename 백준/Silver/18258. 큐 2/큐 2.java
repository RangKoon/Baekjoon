import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int tmp = 0;
        for(int i=0; i<n; i++) {
        	
        	String[] input = br.readLine().split(" ");
        	String s = input[0];
        	
        	if(s.equals("push")) {
        		q.add(Integer.parseInt(input[1]));	
        		tmp = Integer.parseInt(input[1]);
        	}
        	else if(s.equals("pop")) {
        		if(q.size()==0)
        			sb.append("-1\n");
        		else
        			sb.append(q.poll() + "\n");
        	}
        	else if(s.equals("size"))
        		sb.append(q.size() + "\n");
        	else if(s.equals("empty")) {
        		if(q.size()==0)
        			sb.append("1\n");
        		else
        			sb.append("0\n");
        	}
        	else if(s.equals("front")) {
        		if(q.size()==0)
        			sb.append("-1\n");
        		else
        			sb.append(q.peek() + "\n");
        	}
        	else {
        		if(q.size()==0)
        			sb.append("-1\n");
        		else {
        			sb.append(tmp + "\n");
        			
        		}
        	}       		        	
        }
        
        System.out.println(sb);
    }
}
