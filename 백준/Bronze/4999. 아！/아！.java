import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String s1 = br.readLine();
        String s2 = br.readLine();
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i=0; i<s1.length(); i++) {
        	if(s1.charAt(i) == 'a') {
        		cnt1 ++;
        	}
        }
        for(int i=0; i<s2.length(); i++) {
        	if(s2.charAt(i) == 'a') {
        		cnt2 ++;
        	}
        }
        
        if(cnt1 >= cnt2)
        	sb.append("go");
        else
        	sb.append("no");
        
        System.out.println(sb);
    }
}
