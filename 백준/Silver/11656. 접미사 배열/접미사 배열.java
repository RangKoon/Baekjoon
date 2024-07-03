import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = new String[s.length()];
        for(int i=0; i<s.length(); i++) {
        	arr[i] = s.substring(i);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
        	sb.append(arr[i] + "\n");
        }
        System.out.println(sb);
    }
}