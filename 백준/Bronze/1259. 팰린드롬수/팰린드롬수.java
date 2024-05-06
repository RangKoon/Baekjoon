import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	while(true) {
    		Stack<Character> st = new Stack<>();
    		String s = br.readLine();
    		if(s.equals("0"))
    			break;
    		if(s.length()%2==1) {
    			for(int i=0; i<s.length()/2; i++) {
    				st.push(s.charAt(i));
    			}
    			for(int i=s.length()/2+1; i<s.length(); i++) {
    				if(s.charAt(i)==st.peek())
    					st.pop();
    			}
    		}
    		else {
    			for(int i=0; i<s.length()/2; i++) {
    				st.push(s.charAt(i));
    			}for(int i=s.length()/2; i<s.length(); i++) {
    				if(s.charAt(i)==st.peek())
    					st.pop();
    			}
    		}
    		if(st.size()==0)
    			 sb.append("yes\n");
    		else
    			sb.append("no\n");
    	}
    	System.out.println(sb);
    }
}