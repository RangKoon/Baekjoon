import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();
		String s = br.readLine();
		int cnt = 0;
	
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				st1.push(c);
				st2.push(c);
				cnt ++;
			}
			else if(c == ')') {
				cnt --;
				char c1 = st2.peek();
				st2.push(c);
				
				if(c1 == '(') {
					st1.pop();
					cnt += st1.size();
				}
				else if(c1 == ')') {
					cnt ++;
					st1.pop();
				}
			}
		}
		System.out.println(cnt);
	}
}