import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length(); i++) {
        	if(str.charAt(i) >= 'a') {
        		sb.append((char)(str.charAt(i) - 32));
        	}
        	else
        		sb.append((char)(str.charAt(i) + 32));
        }
        System.out.println(sb);
    }
}