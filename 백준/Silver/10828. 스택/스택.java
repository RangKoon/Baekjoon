import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	Stack <Integer> st = new Stack ();
    	int t = Integer.parseInt(br.readLine());
    	for(int i=0; i<t; i++) {
    		String[] input = br.readLine().split(" ");
    		if(input[0].equals("push")) {
    			st.push(Integer.parseInt(input[1]));
    		}
    		else if(input[0].equals("pop")) {
    			if(st.size()==0)
    				sb.append("-1\n");
    			else 
    				sb.append(st.pop() + "\n");
    		}
    		else if(input[0].equals("size")) {
    			sb.append(st.size() + "\n");
    		}
    		else if(input[0].equals("empty")) {
    			if(st.size()==0)
    				sb.append("1\n" );
    			else
    				sb.append("0\n");
    		}
    		else {
    			if(st.size()==0)
    				sb.append("-1\n");
    			else
    				sb.append(st.peek() + "\n");
    		}
    	}
    	System.out.println(sb);
    }
}