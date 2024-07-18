import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
        	String s = br.readLine();
        	if(s.equals("ENTER")) {
        		set.clear();
        	}
        	else {
        		if(set.contains(s)) {
        			continue;
        		}
        		else {
        			set.add(s);
        			cnt ++;
        		}
        	}
        }
        System.out.println(cnt);
    }   
}          