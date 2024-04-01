import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		Stack <Integer> st = new Stack<>();
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a>0)
				st.push(a);
			else if(a==0)
				st.pop();
		}
		
		while(!st.empty()) {
			sum += st.pop();
		}
		
		System.out.println(sum);
	}
}