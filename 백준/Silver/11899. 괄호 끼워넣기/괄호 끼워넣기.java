import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		st1.push(s.charAt(i));
        	}
        	else {
        		if(st1.size() == 0) {
        			st2.push(s.charAt(i));
        		}
        		else {
        			if(st1.peek() == '(') {
        				st1.pop();
        			}
        		}
        	}
        }
        System.out.println(st1.size() + st2.size());
        
    }
}