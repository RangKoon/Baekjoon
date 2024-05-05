import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	Queue <Integer> q = new LinkedList<> ();
    	int t = Integer.parseInt(br.readLine());
    	for(int i=0; i<t; i++) {
    		String[] input = br.readLine().split(" ");
    		if(input[0].equals("push")) {
    			q.add(Integer.parseInt(input[1]));
    		}
    		else if(input[0].equals("pop")) {
    			if(q.size()==0)
    				sb.append("-1\n");
    			else 
    				sb.append(q.poll() + "\n");
    		}
    		else if(input[0].equals("size")) {
    			sb.append(q.size() + "\n");
    		}
    		else if(input[0].equals("empty")) {
    			if(q.size()==0)
    				sb.append("1\n" );
    			else
    				sb.append("0\n");
    		}
    		else if(input[0].equals("front")){
    			if(q.size()==0)
    				sb.append("-1\n");
    			else
    				sb.append(q.peek() + "\n");
    		}
    		else {
    			if(q.size()==0)
    				sb.append("-1\n");
    			else {
    				int size = q.size();
    				for(int j=0; j<size-1; j++) {
    					q.add(q.remove());
    				}
    				sb.append(q.peek() + "\n");
    				q.add(q.remove());
    			}
    		}
    	}
    	System.out.println(sb);
    }
}