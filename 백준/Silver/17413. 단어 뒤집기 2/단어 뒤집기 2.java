import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
        	char c = s.charAt(i);
        	if(c=='<') {
        		while(st1.size() > 0)
        			sb.append(st1.pop());
        		st2.add(c);
       
        	}
        	if(st2.size()==0) {
        		if(c == ' ') {
        			while(st1.size() > 0) {
        				sb.append(st1.pop());
        			}
        			sb.append(c);
        		}
        		else
        			st1.add(c);
        	}
        	if(st2.size() > 0 && st2.peek() == '<') { //괄호 안에 있으면 그대로 출력
        		sb.append(c);
        	}
        	if(c=='>') { // 닫히면 열린거 삭제하고 그대로 출력
        		st2.pop();
        	}
        	
        }
        while(st1.size() > 0) {
        	sb.append(st1.pop());
        }
        System.out.println(sb);
    }   
}          