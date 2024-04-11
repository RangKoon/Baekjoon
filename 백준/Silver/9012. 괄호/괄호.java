import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
        	Stack <Character> st = new Stack <>();
        	String s = sc.next();
        	char arr[] = new char[s.length()];
        	
        	for(int j=0; j<s.length(); j++) {
        		arr[j] = s.charAt(j);
        		
        		if(arr[j]=='(')
        			st.push(arr[j]);
        		
        		else {
        			if(st.empty()) {
	        			st.push(arr[j]);
	        			break;
        			}
        			else 
        				st.pop();
        		}
        	}
        	
        	if(st.empty())
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        	
        }
    }
}