import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	while(true) {
    		Stack<Character> st = new Stack<>();
    		String s = br.readLine();
    		if(s.equals("."))
    			break;
    		else {
	    		for(int i=0; i<s.length(); i++) {
	    
	    			if(s.charAt(i)=='(')
	    				st.push(s.charAt(i));
	    			else if(s.charAt(i)==')') {
	    				if(st.size()==0) {
	    					st.push(s.charAt(i));
	    					break;
	    				}
	    				else if(st.peek()=='(')
	    					st.pop();
	    				else {
	    					break;
	    				}
	    			}
	    			else if(s.charAt(i)=='[')
	    				st.push(s.charAt(i));
	    			else if(s.charAt(i)==']') {
	    				if(st.size()==0) {
	    					st.push(s.charAt(i));
	    					break;
	    				}
	    				else if(st.peek()=='[')
	    					st.pop();
	    				else {
	    					break;
	    				}
	    			}
	    		} // s char 반복 종료
	    		if(st.size()==0)
	    			sb.append("yes\n"); 
	    		else 
	    			sb.append("no\n");
    		}
    	} // while 종료
    	
    	System.out.println(sb);
    }
}