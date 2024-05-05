import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	Deque<Integer> d = new ArrayDeque<>();
    	int t = Integer.parseInt(br.readLine());
    	for(int i=0; i<t; i++) {
    		String[] input = br.readLine().split(" ");
    		if(input[0].equals("push_front")) {
    			d.addFirst(Integer.parseInt(input[1]));
    		}
    		else if(input[0].equals("push_back")) {
    			d.addLast(Integer.parseInt(input[1]));
    		}
    		else if(input[0].equals("pop_front")) {
    			if(d.size()==0)
    				sb.append("-1\n");
    			else {
    				sb.append(d.getFirst() + "\n");
    				d.removeFirst();
    			}
    		}
    		else if(input[0].equals("pop_back")) {
    			if(d.size()==0)
    				sb.append("-1\n");
    			else {
    				sb.append(d.getLast() + "\n");
    				d.removeLast();
    			}
    		}
    		else if(input[0].equals("size")) {
    			sb.append(d.size() + "\n");
    		}
    		else if(input[0].equals("empty")) {
    			if(d.size()==0)
    				sb.append("1\n" );
    			else
    				sb.append("0\n");
    		}
    		else if(input[0].equals("front")){
    			if(d.size()==0)
    				sb.append("-1\n");
    			else
    				sb.append(d.getFirst() + "\n");
    		}
    		else {
    			if(d.size()==0)
    				sb.append("-1\n");
    			else {
    				sb.append(d.getLast() + "\n");
    			}
    		}
    	}
    	System.out.println(sb);
    }
}