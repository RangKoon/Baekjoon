import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        HashMap<String,String> map = new HashMap<>();
        
        for(int i=1; i<=n; i++) {
        	String s1 = Integer.toString(i);
        	String s2 = br.readLine();
        	map.put(s1, s2);
        	map.put(s2, s1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++) {
        	String str = br.readLine();
        	sb.append(map.get(str) + "\n");
        }
        System.out.println(sb);
    }   
}          