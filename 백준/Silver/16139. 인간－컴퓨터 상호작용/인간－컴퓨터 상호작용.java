import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	int n = Integer.parseInt(br.readLine());
    	for(int i=0; i<n; i++) {
    		int cnt = 0;
    		String[] input = br.readLine().split(" ");
    		char c = input[0].charAt(0);
    		int a = Integer.parseInt(input[1]);
    		int b = Integer.parseInt(input[2]);
    		for(int j=a; j<=b; j++) {
    			if(s.charAt(j)==c)
    				cnt ++;
    		}
    		System.out.println(cnt);
    	}
    }
}